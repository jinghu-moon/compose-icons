package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorFillIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 124.000 104.000 C 144.492 104.001 162.271 118.147 166.874 138.116 C 171.478 158.084 161.687 178.586 143.264 187.558 C 124.840 196.531 102.662 191.597 89.780 175.660 C 87.071 172.221 87.630 167.243 91.035 164.490 C 94.439 161.737 99.423 162.232 102.220 165.600 C 109.646 174.791 122.042 178.330 133.202 174.447 C 144.361 170.563 151.881 160.093 151.998 148.277 C 152.114 136.462 144.800 125.846 133.719 121.744 C 122.639 117.642 110.175 120.937 102.570 129.980 C 100.261 132.673 96.454 133.524 93.218 132.071 C 89.982 130.617 88.090 127.205 88.570 123.690 L 96.120 70.870 C 96.680 66.943 100.033 64.020 104.000 64.000 L 160.000 64.000 C 164.418 64.000 168.000 67.582 168.000 72.000 C 168.000 76.418 164.418 80.000 160.000 80.000 L 110.940 80.000 L 107.000 107.400 C 112.385 105.150 118.164 103.995 124.000 104.000 Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
