package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorThinIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 174.210 76.420 L 110.210 108.420 C 109.439 108.812 108.812 109.439 108.420 110.210 L 76.420 174.210 C 75.799 175.450 75.866 176.924 76.595 178.104 C 77.324 179.283 78.613 180.001 80.000 180.000 C 80.621 179.999 81.233 179.855 81.790 179.580 L 145.790 147.580 C 146.561 147.188 147.188 146.561 147.580 145.790 L 179.580 81.790 C 180.354 80.249 180.054 78.385 178.834 77.166 C 177.615 75.946 175.751 75.646 174.210 76.420 ZM 141.000 141.000 L 88.920 167.000 L 115.000 115.000 L 167.080 89.000 Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
