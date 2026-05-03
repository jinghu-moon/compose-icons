package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorBoldIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 200.000 C 240.000 206.627 234.627 212.000 228.000 212.000 L 188.000 212.000 C 181.373 212.000 176.000 206.627 176.000 200.000 C 176.000 193.373 181.373 188.000 188.000 188.000 L 228.000 188.000 C 234.627 188.000 240.000 193.373 240.000 200.000 ZM 218.000 117.630 L 128.000 170.110 L 38.050 117.630 C 32.349 114.569 25.248 116.579 21.998 122.174 C 18.747 127.769 20.518 134.933 26.000 138.370 L 122.000 194.370 C 125.738 196.552 130.362 196.552 134.100 194.370 L 230.100 138.370 C 235.827 135.029 237.761 127.677 234.420 121.950 C 231.079 116.223 223.727 114.289 218.000 117.630 ZM 20.000 80.000 C 20.008 75.721 22.294 71.770 26.000 69.630 L 122.000 13.630 C 125.742 11.460 130.358 11.460 134.100 13.630 L 230.100 69.630 C 233.791 71.779 236.062 75.729 236.062 80.000 C 236.062 84.271 233.791 88.221 230.100 90.370 L 134.100 146.370 C 130.362 148.552 125.738 148.552 122.000 146.370 L 26.000 90.370 C 22.294 88.230 20.008 84.279 20.000 80.000 ZM 55.820 80.000 L 128.000 122.110 L 200.180 80.000 L 128.000 37.890 ZM 138.000 212.300 L 128.000 218.110 L 38.050 165.630 C 32.349 162.569 25.248 164.579 21.998 170.174 C 18.747 175.769 20.518 182.933 26.000 186.370 L 122.000 242.370 C 125.738 244.552 130.362 244.552 134.100 242.370 L 150.100 233.030 C 155.824 229.689 157.756 222.339 154.415 216.615 C 151.074 210.891 143.724 208.959 138.000 212.300 Z"),
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
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null
