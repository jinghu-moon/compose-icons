package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClosedCaptioningAiLine: ImageVector
    get() {
        if (_closedCaptioningAiLine != null) return _closedCaptioningAiLine!!
        _closedCaptioningAiLine = remixIcon(
            name = "ClosedCaptioningAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM3 3h11v2h-10v14h16v-8h2v9c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM9 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C10.053 10.224 9.553 10 9 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C11.104 15.552 10.104 16 9 16 6.792 16 5 14.208 5 12 5 9.792 6.792 8 9 8ZM16 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C17.053 10.224 16.553 10 16 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C18.104 15.552 17.104 16 16 16c-2.208 0-4-1.792-4-4C12 9.792 13.792 8 16 8Z"),
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
        return _closedCaptioningAiLine!!
    }

private var _closedCaptioningAiLine: ImageVector? = null
