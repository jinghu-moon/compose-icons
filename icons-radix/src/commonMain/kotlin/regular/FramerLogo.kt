package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = radixIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.601 1.007 C 11.828 1.054 12.000 1.256 12.000 1.497 L 12.000 5.500 C 12.000 5.776 11.776 6.000 11.500 6.000 L 8.636 6.000 L 11.529 9.162 L 11.574 9.220 C 11.670 9.361 11.687 9.543 11.617 9.701 C 11.537 9.883 11.358 10.000 11.160 10.000 L 8.000 10.000 L 8.000 13.500 C 8.000 13.702 7.878 13.885 7.691 13.962 C 7.505 14.040 7.289 13.997 7.146 13.854 L 3.146 9.854 C 3.053 9.760 3.000 9.633 3.000 9.500 L 3.000 5.500 L 3.010 5.400 C 3.056 5.172 3.258 5.000 3.500 5.000 L 6.365 5.000 L 3.471 1.834 C 3.337 1.688 3.303 1.477 3.383 1.296 C 3.463 1.115 3.642 0.997 3.840 0.997 L 11.500 0.997 L 11.601 1.007 ZM 7.000 12.293 L 7.000 10.000 L 4.707 10.000 L 7.000 12.293 ZM 4.000 9.000 L 10.025 9.000 L 7.280 6.000 L 4.000 6.000 L 4.000 9.000 ZM 7.721 5.000 L 11.000 5.000 L 11.000 1.997 L 4.975 1.997 L 7.721 5.000 Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
