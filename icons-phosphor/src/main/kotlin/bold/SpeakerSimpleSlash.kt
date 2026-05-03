package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorBoldIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 88.000 L 248.000 168.000 C 248.000 174.627 242.627 180.000 236.000 180.000 C 229.373 180.000 224.000 174.627 224.000 168.000 L 224.000 88.000 C 224.000 81.373 229.373 76.000 236.000 76.000 C 242.627 76.000 248.000 81.373 248.000 88.000 ZM 224.880 207.930 C 227.825 211.093 228.841 215.595 227.541 219.716 C 226.241 223.838 222.825 226.942 218.599 227.843 C 214.372 228.744 209.988 227.303 207.120 224.070 L 172.000 185.440 L 172.000 224.000 C 172.000 228.584 169.389 232.767 165.271 234.780 C 161.153 236.794 156.247 236.285 152.630 233.470 L 83.880 180.000 L 40.000 180.000 C 28.954 180.000 20.000 171.046 20.000 160.000 L 20.000 96.000 C 20.000 84.954 28.954 76.000 40.000 76.000 L 72.510 76.000 L 47.120 48.070 C 42.759 43.154 43.163 35.645 48.026 31.226 C 52.889 26.806 60.402 27.120 64.880 31.930 ZM 148.000 159.000 L 94.330 100.000 L 44.000 100.000 L 44.000 156.000 L 88.000 156.000 C 90.670 156.000 93.263 156.890 95.370 158.530 L 148.000 199.460 ZM 133.850 67.500 L 148.000 56.500 L 148.000 94.900 C 148.000 101.527 153.373 106.900 160.000 106.900 C 166.627 106.900 172.000 101.527 172.000 94.900 L 172.000 32.000 C 172.000 27.416 169.389 23.233 165.271 21.220 C 161.153 19.206 156.247 19.715 152.630 22.530 L 119.120 48.600 C 115.624 51.193 113.805 55.476 114.368 59.792 C 114.932 64.108 117.788 67.781 121.833 69.390 C 125.878 70.998 130.476 70.290 133.850 67.540 ZM 200.000 150.940 C 206.627 150.940 212.000 145.567 212.000 138.940 L 212.000 104.000 C 212.000 97.373 206.627 92.000 200.000 92.000 C 193.373 92.000 188.000 97.373 188.000 104.000 L 188.000 138.940 C 188.000 145.567 193.373 150.940 200.000 150.940 Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
