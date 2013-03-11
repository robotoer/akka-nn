package nn;

import akka.actor.Actor;
import akka.event.Logging;

class Perceptron extends Actor {
  val log = Logging(context.system, this);

  def receive = {
    case _ => log.info("received unknown message");
  };
}
