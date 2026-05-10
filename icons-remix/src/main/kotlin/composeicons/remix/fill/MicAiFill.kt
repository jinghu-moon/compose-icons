package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicAiFill: ImageVector
    get() {
        if (_micAiFill != null) return _micAiFill!!
        _micAiFill = remixIcon(
            name = "MicAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 7.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 2.807 21.156 1.974 20.724 .931L20.471 .32c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM14.387 5.339c.274 .434 .649 .754 1.124 .962l.565 .246c.38 .166 .688 .398 .923 .698v2.755c0 2.761-2.239 5-5 5C9.238 15 7 12.761 7 10v-4c0-2.761 2.239-5 5-5 1.124 0 2.161 .371 2.997 .997-.24 .18-.443 .401-.609 .664C14.129 3.069 14 3.516 14 4c0 .484 .129 .931 .387 1.339ZM3.055 11h2.016c.485 3.392 3.403 6 6.929 6 3.526 0 6.444-2.608 6.929-6h2.016c-.461 4.172-3.773 7.484-7.945 7.945v4.055h-2v-4.055C6.828 18.484 3.516 15.172 3.055 11Z"),
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
        return _micAiFill!!
    }

private var _micAiFill: ImageVector? = null
