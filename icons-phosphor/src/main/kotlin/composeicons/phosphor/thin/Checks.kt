package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorThinIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.8 82.85 57.2 170.85c-1.555 1.525-4.045 1.525-5.6 0L13.2 133.14c-1.514-1.557-1.509-4.039 .012-5.589 1.521-1.551 4.002-1.604 5.588-.121l35.6 35L141.2 77.19c1.593-1.42 4.02-1.34 5.515 .182 1.495 1.522 1.533 3.95 .085 5.518ZM242.8 77.2c-1.561-1.558-4.089-1.558-5.65 0l-86.8 85.24L128.72 141.2c-1.01-1.044-2.506-1.458-3.909-1.082-1.403 .376-2.492 1.482-2.845 2.891-.353 1.409 .085 2.898 1.144 3.891l24.44 24c1.555 1.525 4.045 1.525 5.6 0L242.75 82.9c.777-.738 1.225-1.758 1.244-2.829 .019-1.072-.393-2.106-1.144-2.871Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
