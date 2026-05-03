package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ComponentInstance: ImageVector
    get() {
        if (_componentInstance != null) return _componentInstance!!
        _componentInstance = radixIcon(
            name = "ComponentInstance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.224 1.425 C 7.418 1.297 7.683 1.319 7.854 1.490 L 13.510 7.147 L 13.575 7.224 C 13.703 7.418 13.681 7.683 13.510 7.854 L 7.854 13.510 C 7.659 13.705 7.342 13.705 7.147 13.510 L 1.490 7.854 C 1.294 7.659 1.295 7.342 1.490 7.147 L 7.147 1.490 L 7.224 1.425 ZM 2.550 7.500 L 7.500 12.450 L 12.450 7.500 L 7.500 2.550 L 2.550 7.500 Z"),
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
        return _componentInstance!!
    }

private var _componentInstance: ImageVector? = null
