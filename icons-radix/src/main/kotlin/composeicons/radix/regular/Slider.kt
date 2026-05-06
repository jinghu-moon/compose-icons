package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Slider: ImageVector
    get() {
        if (_slider != null) return _slider!!
        _slider = radixIcon(
            name = "Slider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.78 4.764c1.221 .124 2.205 1.046 2.424 2.236h3.296l.101 .01c.228 .047 .399 .249 .399 .49-0 .242-.172 .444-.399 .49l-.101 .01h-3.297c-.235 1.28-1.355 2.25-2.703 2.25l-.281-.015C6.998 10.112 6.015 9.19 5.796 8h-5.296C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h5.297C6.032 5.72 7.152 4.75 8.5 4.749l.28 .015ZM8.5 5.7C7.506 5.7 6.699 6.506 6.699 7.5c0 .994 .807 1.8 1.801 1.8 .994-0 1.8-.806 1.8-1.8 0-.994-.806-1.801-1.8-1.801Z"),
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
        return _slider!!
    }

private var _slider: ImageVector? = null
