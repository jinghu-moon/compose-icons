package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorThinIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 204.500 L 196.000 232.000 C 196.000 234.209 194.209 236.000 192.000 236.000 C 189.791 236.000 188.000 234.209 188.000 232.000 L 188.000 204.500 C 188.089 178.718 173.510 155.130 150.410 143.680 L 102.000 119.480 C 76.183 106.672 59.894 80.299 60.000 51.480 L 60.000 24.000 C 60.000 21.791 61.791 20.000 64.000 20.000 C 66.209 20.000 68.000 21.791 68.000 24.000 L 68.000 51.500 C 67.911 77.282 82.490 100.870 105.590 112.320 L 153.990 136.520 C 179.804 149.322 196.096 175.686 196.000 204.500 ZM 160.000 204.000 L 68.000 204.000 C 68.063 195.788 69.618 187.656 72.590 180.000 L 148.100 180.000 C 150.309 180.000 152.100 178.209 152.100 176.000 C 152.100 173.791 150.309 172.000 148.100 172.000 L 76.300 172.000 C 81.064 163.224 87.705 155.606 95.750 149.690 C 97.531 148.378 97.912 145.871 96.600 144.090 C 95.288 142.309 92.781 141.928 91.000 143.240 C 71.539 157.591 60.037 180.320 60.000 204.500 L 60.000 232.000 C 60.000 234.209 61.791 236.000 64.000 236.000 C 66.209 236.000 68.000 234.209 68.000 232.000 L 68.000 212.000 L 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 C 164.000 205.791 162.209 204.000 160.000 204.000 ZM 192.000 20.000 C 189.791 20.000 188.000 21.791 188.000 24.000 L 188.000 44.000 L 96.000 44.000 C 93.791 44.000 92.000 45.791 92.000 48.000 C 92.000 50.209 93.791 52.000 96.000 52.000 L 188.000 52.000 C 187.937 60.212 186.382 68.344 183.410 76.000 L 107.890 76.000 C 105.681 76.000 103.890 77.791 103.890 80.000 C 103.890 82.209 105.681 84.000 107.890 84.000 L 179.700 84.000 C 174.936 92.776 168.295 100.394 160.250 106.310 C 158.469 107.619 158.086 110.124 159.395 111.905 C 160.704 113.686 163.209 114.069 164.990 112.760 C 184.455 98.411 195.961 75.682 196.000 51.500 L 196.000 24.000 C 196.000 21.791 194.209 20.000 192.000 20.000 Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
