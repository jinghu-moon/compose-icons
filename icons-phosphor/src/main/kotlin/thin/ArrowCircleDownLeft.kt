package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorThinIcon(
            name = "ArrowCircleDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 162.830 93.170 C 163.581 93.920 164.003 94.938 164.003 96.000 C 164.003 97.062 163.581 98.080 162.830 98.830 L 105.660 156.000 L 144.000 156.000 C 146.209 156.000 148.000 157.791 148.000 160.000 C 148.000 162.209 146.209 164.000 144.000 164.000 L 96.000 164.000 C 93.791 164.000 92.000 162.209 92.000 160.000 L 92.000 112.000 C 92.000 109.791 93.791 108.000 96.000 108.000 C 98.209 108.000 100.000 109.791 100.000 112.000 L 100.000 150.340 L 157.170 93.170 C 157.920 92.419 158.938 91.997 160.000 91.997 C 161.062 91.997 162.080 92.419 162.830 93.170 Z"),
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
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
