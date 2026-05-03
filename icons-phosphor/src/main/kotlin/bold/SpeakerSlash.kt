package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorBoldIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 64.510 76.000 L 32.000 76.000 C 20.954 76.000 12.000 84.954 12.000 96.000 L 12.000 160.000 C 12.000 171.046 20.954 180.000 32.000 180.000 L 75.880 180.000 L 144.630 233.470 C 148.247 236.285 153.153 236.794 157.271 234.780 C 161.389 232.767 164.000 228.584 164.000 224.000 L 164.000 185.440 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 36.000 100.000 L 68.000 100.000 L 68.000 156.000 L 36.000 156.000 ZM 140.000 199.460 L 92.000 162.130 L 92.000 106.240 L 140.000 159.000 ZM 109.000 65.460 C 107.046 62.947 106.171 59.761 106.567 56.603 C 106.963 53.445 108.597 50.573 111.110 48.620 L 144.620 22.550 C 148.235 19.731 153.139 19.217 157.259 21.226 C 161.380 23.235 163.995 27.416 164.000 32.000 L 164.000 94.940 C 164.000 101.567 158.627 106.940 152.000 106.940 C 145.373 106.940 140.000 101.567 140.000 94.940 L 140.000 56.540 L 125.850 67.540 C 123.338 69.498 120.150 70.376 116.990 69.983 C 113.829 69.589 110.955 67.954 109.000 65.440 ZM 183.000 114.810 C 178.914 109.811 179.516 102.476 184.361 98.210 C 189.206 93.943 196.558 94.275 201.000 98.960 C 213.230 112.862 215.449 132.933 206.550 149.170 C 203.184 154.592 196.163 156.431 190.572 153.356 C 184.980 150.280 182.773 143.366 185.550 137.620 C 187.176 134.676 188.019 131.363 188.000 128.000 C 187.995 123.135 186.218 118.439 183.000 114.790 ZM 252.000 128.000 C 251.987 147.457 245.234 166.310 232.890 181.350 C 230.183 184.717 225.876 186.370 221.612 185.676 C 217.347 184.983 213.785 182.051 212.284 178.000 C 210.784 173.949 211.576 169.404 214.360 166.100 C 233.159 143.230 232.467 110.066 212.730 88.000 C 209.753 84.824 208.730 80.285 210.056 76.138 C 211.382 71.992 214.850 68.889 219.117 68.030 C 223.385 67.171 227.783 68.690 230.610 72.000 C 244.395 87.394 252.012 107.336 252.000 128.000 Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
