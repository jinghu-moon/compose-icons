package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiamondFill: ImageVector
    get() {
        if (_diamondFill != null) return _diamondFill!!
        _diamondFill = remixIcon(
            name = "DiamondFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C20.962 3.807 20.156 2.974 19.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM13.387 6.339c.274 .434 .649 .754 1.124 .962l.565 .246c.57 .249 .978 .648 1.222 1.198l.338 .76c.728 1.637 2.892 1.895 4.073 .774l.091 .121c.287 .382 .263 .914-.057 1.269L11.743 21.669C11.554 21.88 11.283 22 11 22c-.283 0-.554-.12-.743-.331L1.257 11.669C.937 11.314 .913 10.782 1.2 10.4L4.2 6.4C4.389 6.148 4.685 6 5 6h8.206c.051 .116 .111 .229 .181 .339Z"),
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
        return _diamondFill!!
    }

private var _diamondFill: ImageVector? = null
