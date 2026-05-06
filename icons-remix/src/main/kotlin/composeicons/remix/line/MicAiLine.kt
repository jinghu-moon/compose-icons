package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicAiLine: ImageVector
    get() {
        if (_micAiLine != null) return _micAiLine!!
        _micAiLine = remixIcon(
            name = "MicAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 7.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 2.807 21.156 1.974 20.724 .931L20.471 .32c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM3.055 11h2.016c.485 3.392 3.403 6 6.929 6 3.526 0 6.444-2.608 6.929-6h2.016c-.461 4.172-3.773 7.484-7.945 7.945v4.055h-2v-4.055C6.828 18.484 3.516 15.172 3.055 11ZM12 1C9.239 1 7 3.239 7 6v4c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-3h-2v3c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10v-4C9 4.343 10.343 3 12 3c.597 0 1.151 .173 1.617 .472L14.697 1.789C13.918 1.29 12.991 1 12 1Z"),
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
        return _micAiLine!!
    }

private var _micAiLine: ImageVector? = null
