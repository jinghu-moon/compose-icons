package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Repeat: ImageVector
    get() {
        if (_repeat != null) return _repeat!!
        _repeat = phosphorBoldIcon(
            name = "Repeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 128.000 C 20.044 86.045 54.045 52.044 96.000 52.000 L 195.000 52.000 L 191.480 48.490 C 186.786 43.796 186.786 36.184 191.480 31.490 C 196.174 26.796 203.786 26.796 208.480 31.490 L 232.480 55.490 C 234.739 57.742 236.009 60.800 236.009 63.990 C 236.009 67.180 234.739 70.238 232.480 72.490 L 208.480 96.490 C 203.786 101.184 196.174 101.184 191.480 96.490 C 186.786 91.796 186.786 84.184 191.480 79.490 L 195.000 76.000 L 96.000 76.000 C 67.295 76.033 44.033 99.295 44.000 128.000 C 44.000 134.627 38.627 140.000 32.000 140.000 C 25.373 140.000 20.000 134.627 20.000 128.000 ZM 224.000 116.000 C 217.373 116.000 212.000 121.373 212.000 128.000 C 211.967 156.705 188.705 179.967 160.000 180.000 L 61.000 180.000 L 64.520 176.490 C 69.214 171.796 69.214 164.184 64.520 159.490 C 59.826 154.796 52.214 154.796 47.520 159.490 L 23.520 183.490 C 21.261 185.742 19.991 188.800 19.991 191.990 C 19.991 195.180 21.261 198.238 23.520 200.490 L 47.520 224.490 C 52.214 229.184 59.826 229.184 64.520 224.490 C 69.214 219.796 69.214 212.184 64.520 207.490 L 61.000 204.000 L 160.000 204.000 C 201.955 203.956 235.956 169.955 236.000 128.000 C 236.000 121.373 230.627 116.000 224.000 116.000 Z"),
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
        return _repeat!!
    }

private var _repeat: ImageVector? = null
