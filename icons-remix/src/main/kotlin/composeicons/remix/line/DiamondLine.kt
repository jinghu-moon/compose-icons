package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiamondLine: ImageVector
    get() {
        if (_diamondLine != null) return _diamondLine!!
        _diamondLine = remixIcon(
            name = "DiamondLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C20.962 3.807 20.156 2.974 19.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM5 6c-.315 0-.611 .148-.8 .4L1.2 10.4c-.287 .382-.263 .914 .057 1.269l9 10c.19 .211 .46 .331 .743 .331 .283 0 .554-.12 .743-.331L20.743 11.669 19.257 10.331 11 19.505 3.293 10.942 5.5 8h8.5v-2h-9Z"),
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
        return _diamondLine!!
    }

private var _diamondLine: ImageVector? = null
