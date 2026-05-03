package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorThinIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 ZM 97.080 147.730 C 78.050 127.350 68.000 103.930 68.000 80.000 C 68.000 46.863 94.863 20.000 128.000 20.000 C 161.137 20.000 188.000 46.863 188.000 80.000 C 188.000 103.930 177.950 127.350 158.920 147.730 C 150.415 156.933 140.684 164.921 130.000 171.470 C 128.762 172.185 127.238 172.185 126.000 171.470 C 115.316 164.921 105.585 156.933 97.080 147.730 ZM 76.000 80.000 C 76.000 127.090 118.250 157.000 128.000 163.300 C 137.750 157.020 180.000 127.090 180.000 80.000 C 180.000 51.281 156.719 28.000 128.000 28.000 C 99.281 28.000 76.000 51.281 76.000 80.000 ZM 201.380 151.380 C 199.306 150.618 197.007 151.681 196.245 153.755 C 195.483 155.829 196.546 158.128 198.620 158.890 C 217.290 165.780 228.000 174.890 228.000 184.000 C 228.000 201.390 187.820 220.000 128.000 220.000 C 68.180 220.000 28.000 201.390 28.000 184.000 C 28.000 174.930 38.710 165.780 57.380 158.890 C 59.454 158.128 60.517 155.829 59.755 153.755 C 58.993 151.681 56.694 150.618 54.620 151.380 C 32.290 159.620 20.000 171.210 20.000 184.000 C 20.000 196.460 31.730 207.830 53.000 216.000 C 73.090 223.730 99.720 228.000 128.000 228.000 C 156.280 228.000 182.890 223.750 203.000 216.000 C 224.290 207.810 236.000 196.440 236.000 184.000 C 236.000 171.210 223.710 159.620 201.380 151.380 Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
