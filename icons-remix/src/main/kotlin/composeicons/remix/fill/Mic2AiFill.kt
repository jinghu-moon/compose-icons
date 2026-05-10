package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Mic2AiFill: ImageVector
    get() {
        if (_mic2AiFill != null) return _mic2AiFill!!
        _mic2AiFill = remixIcon(
            name = "Mic2AiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 7.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 2.807 21.156 1.974 20.724 .931L20.471 .32c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM14.387 5.339c.274 .434 .649 .754 1.124 .962l.565 .246c.38 .166 .688 .399 .924 .699v4.755c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12v-6c0-2.761 2.239-5 5-5 1.124 0 2.161 .371 2.996 .997-.24 .18-.443 .401-.61 .664C14.129 3.069 14 3.516 14 4c0 .484 .129 .931 .387 1.339ZM2.192 13.962l1.962-.392C4.883 17.236 8.119 20 12 20c3.881 0 7.117-2.764 7.846-6.431l1.962 .392C20.896 18.545 16.852 22 12 22 7.149 22 3.104 18.545 2.192 13.962Z"),
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
        return _mic2AiFill!!
    }

private var _mic2AiFill: ImageVector? = null
