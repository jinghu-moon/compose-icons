package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorRegularIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 107.180 24.330 C 99.711 22.758 92.181 26.728 89.260 33.780 L 89.200 33.920 L 25.200 193.850 C 23.142 198.793 23.693 204.437 26.667 208.889 C 29.642 213.341 34.646 216.010 40.000 216.000 L 104.000 216.000 C 112.837 216.000 120.000 208.837 120.000 200.000 L 120.000 40.000 C 120.054 32.372 114.667 25.788 107.180 24.330 ZM 104.000 200.000 L 40.000 200.000 L 40.060 199.850 L 104.000 40.000 ZM 230.770 193.850 L 166.770 33.920 L 166.710 33.780 C 163.727 26.807 156.257 22.887 148.824 24.392 C 141.390 25.898 136.035 32.416 136.000 40.000 L 136.000 200.000 C 136.000 208.837 143.163 216.000 152.000 216.000 L 216.000 216.000 C 221.351 216.003 226.348 213.331 229.318 208.881 C 232.288 204.430 232.837 198.789 230.780 193.850 ZM 152.000 200.000 L 152.000 40.000 L 215.930 199.840 L 215.990 199.990 Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
