package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorRegularIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 88.000 206.370 L 88.000 176.000 L 168.000 176.000 L 168.000 206.370 C 142.860 219.130 113.140 219.130 88.000 206.370 ZM 104.000 144.000 L 152.000 144.000 L 152.000 160.000 L 104.000 160.000 ZM 118.000 128.000 L 128.000 80.000 L 128.000 80.000 L 138.000 128.000 ZM 190.220 190.230 C 188.220 192.230 186.140 194.100 184.000 195.870 L 184.000 176.000 C 184.000 167.163 176.837 160.000 168.000 160.000 L 168.000 144.000 C 167.990 136.094 162.207 129.381 154.390 128.200 L 143.660 76.740 C 142.107 69.329 135.572 64.021 128.000 64.021 C 120.428 64.021 113.893 69.329 112.340 76.740 L 101.610 128.200 C 93.793 129.381 88.010 136.094 88.000 144.000 L 88.000 160.000 C 79.163 160.000 72.000 167.163 72.000 176.000 L 72.000 195.870 C 69.860 194.100 67.780 192.230 65.780 190.230 C 40.609 165.063 33.077 127.212 46.697 94.327 C 60.317 61.441 92.406 39.999 128.000 39.999 C 163.594 39.999 195.683 61.441 209.303 94.327 C 222.923 127.212 215.391 165.063 190.220 190.230 Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
