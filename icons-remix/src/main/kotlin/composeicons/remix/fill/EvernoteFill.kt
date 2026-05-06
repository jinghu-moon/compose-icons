package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EvernoteFill: ImageVector
    get() {
        if (_evernoteFill != null) return _evernoteFill!!
        _evernoteFill = remixIcon(
            name = "EvernoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.63 7.754c-.215 .201-.545 .216-.742 .216h-2.111c-.61 0-.974 0-1.22 .033-.133 .017-.297 .084-.38 .117-.033 .016-.033 0-.017-.017L8.976 3.165c.017-.017 .033-.017 .017 .017-.033 .083-.099 .249-.115 .382-.033 .249-.033 .615-.033 1.23v2.212c0 .201-.017 .533-.214 .749ZM13.313 21.938c-.56-.366-.857-.848-.973-1.147-.119-.29-.18-.601-.181-.915 .001-1.385 1.122-2.507 2.507-2.51 .412 0 .742 .333 .742 .748 .002 .269-.144 .518-.379 .648-.083 .05-.198 .083-.281 .1-.082 .017-.395 .05-.543 .182-.165 .134-.297 .349-.297 .583 0 .249 .099 .482 .264 .648 .297 .299 .693 .465 1.121 .465 .54-.002 1.057-.219 1.438-.602 .38-.383 .593-.903 .59-1.443 0-1.014-.676-1.913-1.567-2.311-.132-.067-.346-.117-.544-.167-.164-.034-.329-.061-.495-.083-.693-.084-2.424-.632-2.54-2.178 0 0-.511 2.327-1.533 2.959-.099 .05-.231 .1-.379 .134-.148 .033-.313 .05-.363 .05C8.234 17.199 6.469 16.667 5.249 15.404c0 0-.825-.682-1.253-2.594-.099-.466-.297-1.298-.412-2.079-.05-.282-.067-.499-.083-.698 0-.815 .495-1.363 1.121-1.446h3.364c.577 0 .907-.15 1.121-.35 .281-.266 .347-.648 .347-1.097v-3.409-.099c.081-.616 .627-1.131 1.434-1.131h.396c.165 0 .363 .017 .544 .033 .132 .017 .247 .05 .445 .1 1.006 .249 1.22 1.28 1.22 1.28 0 0 1.897 .333 2.854 .499 .907 .166 3.15 .316 3.578 2.594 1.006 5.421 .396 10.675 .347 10.675-.709 5.122-4.931 4.872-4.931 4.872-.724 .015-1.435-.201-2.029-.615ZM15.935 11.629c-.033 .084-.066 .183-.049 .232 .017 .05 .05 .067 .083 .083 .198 .1 .527 .15 1.006 .2 .478 .05 .808 .084 1.022 .05 .034 0 .067-.017 .1-.067 .033-.05 .017-.15 .017-.233-.05-.449-.462-.781-1.006-.848-.545-.05-1.006 .167-1.172 .582Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _evernoteFill!!
    }

private var _evernoteFill: ImageVector? = null
