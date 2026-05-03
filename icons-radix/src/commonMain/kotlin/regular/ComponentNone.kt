package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ComponentNone: ImageVector
    get() {
        if (_componentNone != null) return _componentNone!!
        _componentNone = radixIcon(
            name = "ComponentNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.224 1.425 C 7.418 1.297 7.683 1.319 7.854 1.490 L 10.328 3.964 L 12.647 1.647 C 12.842 1.452 13.159 1.452 13.354 1.647 C 13.549 1.842 13.549 2.159 13.354 2.354 L 11.036 4.671 L 13.510 7.147 L 13.575 7.224 C 13.703 7.418 13.681 7.683 13.510 7.854 L 7.854 13.510 C 7.659 13.705 7.342 13.705 7.147 13.510 L 4.671 11.035 L 2.354 13.354 C 2.159 13.549 1.842 13.549 1.647 13.354 C 1.452 13.159 1.452 12.842 1.647 12.647 L 3.964 10.328 L 1.490 7.854 C 1.294 7.659 1.295 7.342 1.490 7.147 L 7.147 1.490 L 7.224 1.425 ZM 5.378 10.328 L 7.500 12.450 L 12.450 7.500 L 10.328 5.378 L 5.378 10.328 ZM 2.550 7.500 L 4.671 9.621 L 9.622 4.671 L 7.500 2.550 L 2.550 7.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _componentNone!!
    }

private var _componentNone: ImageVector? = null
