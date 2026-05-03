package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorBoldIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 93.650 C 222.697 61.452 196.224 36.017 164.000 36.000 C 152.954 36.000 144.000 44.954 144.000 56.000 L 144.000 172.000 L 128.000 172.000 L 128.000 72.000 C 128.000 65.373 122.627 60.000 116.000 60.000 L 20.000 60.000 C 8.954 60.000 0.000 68.954 0.000 80.000 L 0.000 184.000 C 0.013 198.191 8.361 211.050 21.318 216.837 C 34.275 222.625 49.423 220.260 60.000 210.800 C 68.944 218.804 81.288 221.825 92.918 218.854 C 104.547 215.884 113.931 207.313 117.940 196.000 L 186.060 196.000 C 191.906 212.529 208.808 222.443 226.088 219.478 C 243.367 216.514 255.998 201.532 256.000 184.000 L 256.000 136.000 C 255.981 116.323 242.923 99.042 224.000 93.650 ZM 168.000 60.220 C 186.209 62.283 199.974 77.675 200.000 96.000 L 200.000 104.000 C 200.000 110.627 205.373 116.000 212.000 116.000 C 223.046 116.000 232.000 124.954 232.000 136.000 L 232.000 150.060 C 213.255 143.433 192.688 153.256 186.060 172.000 L 168.000 172.000 ZM 104.000 84.000 L 104.000 154.080 C 90.347 144.932 72.226 146.217 60.000 157.200 C 50.212 148.408 36.402 145.669 24.000 150.060 L 24.000 84.000 ZM 36.000 196.000 C 29.373 196.000 24.000 190.627 24.000 184.000 C 24.000 177.373 29.373 172.000 36.000 172.000 C 42.627 172.000 48.000 177.373 48.000 184.000 C 48.000 190.627 42.627 196.000 36.000 196.000 ZM 84.000 196.000 C 77.373 196.000 72.000 190.627 72.000 184.000 C 72.000 177.373 77.373 172.000 84.000 172.000 C 90.627 172.000 96.000 177.373 96.000 184.000 C 96.000 190.627 90.627 196.000 84.000 196.000 ZM 220.000 196.000 C 213.373 196.000 208.000 190.627 208.000 184.000 C 208.000 177.373 213.373 172.000 220.000 172.000 C 226.627 172.000 232.000 177.373 232.000 184.000 C 232.000 190.627 226.627 196.000 220.000 196.000 Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
