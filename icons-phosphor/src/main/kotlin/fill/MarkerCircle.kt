package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorFillIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 206.370 C 142.879 219.210 113.121 219.210 88.000 206.370 L 88.000 176.000 L 168.000 176.000 ZM 104.000 160.000 L 104.000 144.000 L 152.000 144.000 L 152.000 160.000 ZM 184.000 195.830 L 184.000 176.000 C 184.000 167.163 176.837 160.000 168.000 160.000 L 168.000 144.000 C 167.990 136.094 162.207 129.381 154.390 128.200 L 143.660 76.740 C 142.107 69.329 135.572 64.021 128.000 64.021 C 120.428 64.021 113.893 69.329 112.340 76.740 L 101.610 128.200 C 93.793 129.381 88.010 136.094 88.000 144.000 L 88.000 160.000 C 79.163 160.000 72.000 167.163 72.000 176.000 L 72.000 195.830 C 43.358 172.202 32.629 133.139 45.182 98.196 C 57.735 63.252 90.870 39.948 128.000 39.948 C 165.130 39.948 198.265 63.252 210.818 98.196 C 223.371 133.139 212.642 172.202 184.000 195.830 Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
