package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorThinIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.560 52.930 C 163.481 40.423 147.135 29.527 129.790 20.420 C 128.663 19.856 127.337 19.856 126.210 20.420 C 108.865 29.527 92.519 40.423 77.440 52.930 C 45.100 79.880 28.000 108.610 28.000 136.000 C 27.999 154.264 37.580 171.189 53.240 180.588 C 68.900 189.987 88.343 190.481 104.460 181.890 L 92.170 222.890 C 91.822 224.096 92.060 225.395 92.812 226.399 C 93.565 227.403 94.745 227.996 96.000 228.000 L 160.000 228.000 C 161.264 228.000 162.454 227.402 163.209 226.387 C 163.963 225.372 164.193 224.061 163.830 222.850 L 151.540 181.850 C 167.651 190.438 187.085 189.947 202.743 180.558 C 218.400 171.169 227.987 154.257 228.000 136.000 C 228.000 108.610 210.900 79.880 178.560 52.930 ZM 176.000 180.000 C 165.367 180.000 155.094 176.149 147.080 169.160 C 145.736 167.987 143.778 167.845 142.280 168.812 C 140.781 169.780 140.104 171.622 140.620 173.330 L 154.620 220.000 L 101.380 220.000 L 115.380 173.330 C 115.896 171.622 115.219 169.780 113.720 168.812 C 112.222 167.845 110.264 167.987 108.920 169.160 C 95.918 180.499 77.490 183.194 61.786 176.052 C 46.082 168.911 36.000 153.251 36.000 136.000 C 36.000 79.940 115.000 35.440 128.000 28.510 C 141.000 35.440 220.000 79.890 220.000 136.000 C 219.972 160.289 200.289 179.972 176.000 180.000 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
