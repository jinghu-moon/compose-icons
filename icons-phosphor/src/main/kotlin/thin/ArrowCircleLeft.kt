package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) return _arrowCircleLeft!!
        _arrowCircleLeft = phosphorThinIcon(
            name = "ArrowCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 172.000 128.000 C 172.000 130.209 170.209 132.000 168.000 132.000 L 97.660 132.000 L 122.830 157.170 C 124.393 158.733 124.393 161.267 122.830 162.830 C 121.267 164.393 118.733 164.393 117.170 162.830 L 85.170 130.830 C 84.419 130.080 83.997 129.062 83.997 128.000 C 83.997 126.938 84.419 125.920 85.170 125.170 L 117.170 93.170 C 118.733 91.607 121.267 91.607 122.830 93.170 C 124.393 94.733 124.393 97.267 122.830 98.830 L 97.660 124.000 L 168.000 124.000 C 170.209 124.000 172.000 125.791 172.000 128.000 Z"),
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
