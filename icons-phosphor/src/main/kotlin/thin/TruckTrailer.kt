package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorThinIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 100.220 L 220.000 96.000 C 219.967 67.295 196.705 44.033 168.000 44.000 L 160.000 44.000 C 153.373 44.000 148.000 49.373 148.000 56.000 L 148.000 180.000 L 124.000 180.000 L 124.000 72.000 C 124.000 69.791 122.209 68.000 120.000 68.000 L 16.000 68.000 C 9.373 68.000 4.000 73.373 4.000 80.000 L 4.000 184.000 C 4.005 196.580 12.400 207.611 24.523 210.971 C 36.645 214.330 49.520 209.193 56.000 198.410 C 62.098 208.557 73.919 213.772 85.525 211.436 C 97.131 209.099 106.013 199.716 107.710 188.000 L 196.290 188.000 C 198.397 202.526 211.365 212.960 226.005 211.909 C 240.646 210.857 251.990 198.678 252.000 184.000 L 252.000 136.000 C 251.974 117.675 238.209 102.283 220.000 100.220 ZM 12.000 80.000 C 12.000 77.791 13.791 76.000 16.000 76.000 L 116.000 76.000 L 116.000 180.000 L 107.710 180.000 C 106.013 168.284 97.131 158.901 85.525 156.564 C 73.919 154.228 62.098 159.443 56.000 169.590 C 51.532 162.161 43.876 157.221 35.266 156.211 C 26.657 155.202 18.065 158.237 12.000 164.430 ZM 32.000 204.000 C 20.954 204.000 12.000 195.046 12.000 184.000 C 12.000 172.954 20.954 164.000 32.000 164.000 C 43.046 164.000 52.000 172.954 52.000 184.000 C 52.000 195.046 43.046 204.000 32.000 204.000 ZM 80.000 204.000 C 68.954 204.000 60.000 195.046 60.000 184.000 C 60.000 172.954 68.954 164.000 80.000 164.000 C 91.046 164.000 100.000 172.954 100.000 184.000 C 100.000 195.046 91.046 204.000 80.000 204.000 ZM 224.000 204.000 C 212.954 204.000 204.000 195.046 204.000 184.000 C 204.000 172.954 212.954 164.000 224.000 164.000 C 235.046 164.000 244.000 172.954 244.000 184.000 C 244.000 195.046 235.046 204.000 224.000 204.000 ZM 224.000 156.000 C 210.082 156.001 198.278 166.225 196.290 180.000 L 156.000 180.000 L 156.000 56.000 C 156.000 53.791 157.791 52.000 160.000 52.000 L 168.000 52.000 C 192.289 52.028 211.972 71.711 212.000 96.000 L 212.000 104.000 C 212.000 106.209 213.791 108.000 216.000 108.000 C 231.464 108.000 244.000 120.536 244.000 136.000 L 244.000 164.430 C 238.744 159.036 231.531 155.995 224.000 156.000 Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
