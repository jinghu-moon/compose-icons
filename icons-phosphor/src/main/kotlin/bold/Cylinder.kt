package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorBoldIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 179.140 24.080 C 165.280 16.290 147.120 12.000 128.000 12.000 C 108.880 12.000 90.720 16.290 76.860 24.080 C 60.830 33.100 52.000 45.860 52.000 60.000 L 52.000 196.000 C 52.000 210.140 60.830 222.900 76.860 231.920 C 90.720 239.710 108.880 244.000 128.000 244.000 C 147.120 244.000 165.280 239.710 179.140 231.920 C 195.140 222.920 204.000 210.140 204.000 196.000 L 204.000 60.000 C 204.000 45.860 195.170 33.100 179.140 24.080 ZM 88.630 45.000 C 98.800 39.280 113.150 36.000 128.000 36.000 C 142.850 36.000 157.200 39.280 167.370 45.000 C 175.370 49.520 180.000 55.000 180.000 60.000 C 180.000 65.000 175.400 70.480 167.370 75.000 C 157.200 80.720 142.850 84.000 128.000 84.000 C 113.150 84.000 98.800 80.720 88.630 75.000 C 80.600 70.480 76.000 65.000 76.000 60.000 C 76.000 55.000 80.600 49.520 88.630 45.000 ZM 167.370 211.000 C 157.200 216.720 142.850 220.000 128.000 220.000 C 113.150 220.000 98.800 216.720 88.630 211.000 C 80.600 206.480 76.000 201.000 76.000 196.000 L 76.000 95.400 L 76.860 95.920 C 90.720 103.710 108.880 108.000 128.000 108.000 C 147.120 108.000 165.280 103.710 179.140 95.920 L 180.000 95.400 L 180.000 196.000 C 180.000 201.000 175.400 206.480 167.370 211.000 Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
