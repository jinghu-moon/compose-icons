package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorLightIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 57.930 59.800 C 42.443 77.597 33.940 100.408 34.000 124.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 132.000 222.000 C 152.367 221.976 172.222 215.623 188.820 203.820 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 132.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 124.000 C 45.961 103.805 53.075 84.250 66.080 68.800 L 180.700 194.880 C 166.399 204.791 149.399 210.069 132.000 210.000 ZM 230.000 124.000 C 230.013 141.836 225.151 159.337 215.940 174.610 C 214.852 176.414 212.897 177.515 210.790 177.510 C 208.629 177.504 206.638 176.336 205.578 174.452 C 204.518 172.569 204.553 170.260 205.670 168.410 C 225.362 135.851 221.316 94.221 195.724 66.062 C 170.132 37.904 129.077 29.910 94.790 46.410 C 92.850 47.408 90.520 47.275 88.707 46.061 C 86.894 44.847 85.883 42.745 86.066 40.570 C 86.250 38.396 87.599 36.493 89.590 35.600 C 102.819 29.235 117.319 25.952 132.000 26.000 C 186.099 26.061 229.939 69.901 230.000 124.000 Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
