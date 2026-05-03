package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorThinIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.830 125.170 C 207.581 125.920 208.003 126.938 208.003 128.000 C 208.003 129.062 207.581 130.080 206.830 130.830 L 124.770 212.830 C 104.460 233.138 71.533 233.135 51.225 212.825 C 30.917 192.515 30.920 159.588 51.230 139.280 L 150.520 38.550 C 164.576 24.483 187.373 24.474 201.440 38.530 C 215.507 52.586 215.516 75.383 201.460 89.450 L 102.160 190.140 C 94.353 197.955 81.690 197.962 73.875 190.155 C 66.060 182.348 66.053 169.685 73.860 161.870 L 157.150 77.190 C 158.143 76.130 159.633 75.692 161.041 76.046 C 162.450 76.399 163.556 77.488 163.932 78.891 C 164.308 80.294 163.894 81.790 162.850 82.800 L 79.540 167.500 C 74.846 172.181 74.834 179.781 79.515 184.475 C 84.196 189.169 91.796 189.181 96.490 184.500 L 195.780 83.810 C 206.724 72.880 206.735 55.149 195.805 44.205 C 184.875 33.261 167.144 33.250 156.200 44.180 L 56.910 144.870 C 39.717 162.049 39.706 189.912 56.885 207.105 C 74.064 224.298 101.927 224.309 119.120 207.130 L 201.120 125.130 C 201.878 124.369 202.909 123.944 203.983 123.952 C 205.057 123.959 206.083 124.398 206.830 125.170 Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
