package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorLightIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 109.000 148.670 C 107.888 146.994 106.011 145.987 104.000 145.987 C 101.989 145.987 100.112 146.994 99.000 148.670 L 76.460 182.500 L 65.050 164.760 C 63.947 163.040 62.044 162.000 60.000 162.000 C 57.956 162.000 56.053 163.040 54.950 164.760 L 18.950 220.760 C 17.765 222.607 17.683 224.952 18.735 226.878 C 19.787 228.803 21.806 230.000 24.000 230.000 L 152.000 230.000 C 154.215 230.003 156.251 228.786 157.297 226.834 C 158.344 224.882 158.229 222.512 157.000 220.670 ZM 35.000 218.000 L 60.000 179.100 L 71.320 196.700 C 72.418 198.385 74.287 199.407 76.299 199.424 C 78.310 199.440 80.195 198.447 81.320 196.780 L 103.960 162.780 L 140.790 218.000 ZM 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 128.000 C 42.000 131.314 44.686 134.000 48.000 134.000 C 51.314 134.000 54.000 131.314 54.000 128.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 192.000 218.000 C 188.686 218.000 186.000 220.686 186.000 224.000 C 186.000 227.314 188.686 230.000 192.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
