package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowLeft: ImageVector
    get() {
        if (_doubleArrowLeft != null) return _doubleArrowLeft!!
        _doubleArrowLeft = radixIcon(
            name = "DoubleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.225 3.082 C 6.419 2.954 6.683 2.976 6.853 3.147 C 7.024 3.318 7.046 3.582 6.918 3.776 L 6.853 3.854 L 3.207 7.500 L 6.853 11.147 L 6.918 11.225 C 7.046 11.419 7.024 11.683 6.853 11.854 C 6.683 12.025 6.419 12.046 6.225 11.918 L 6.146 11.854 L 2.146 7.854 C 1.951 7.658 1.951 7.342 2.146 7.147 L 6.146 3.147 L 6.225 3.082 ZM 12.225 3.082 C 12.419 2.954 12.683 2.976 12.854 3.147 C 13.024 3.318 13.046 3.582 12.918 3.776 L 12.854 3.854 L 9.207 7.500 L 12.854 11.147 L 12.918 11.225 C 13.046 11.419 13.024 11.683 12.854 11.854 C 12.683 12.025 12.419 12.046 12.225 11.918 L 12.146 11.854 L 8.146 7.854 C 7.951 7.658 7.951 7.342 8.146 7.147 L 12.146 3.147 L 12.225 3.082 Z"),
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
        return _doubleArrowLeft!!
    }

private var _doubleArrowLeft: ImageVector? = null
