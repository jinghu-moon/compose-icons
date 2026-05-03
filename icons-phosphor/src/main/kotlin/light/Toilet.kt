package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorLightIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 118.000 64.000 C 118.000 67.314 115.314 70.000 112.000 70.000 L 96.000 70.000 C 92.686 70.000 90.000 67.314 90.000 64.000 C 90.000 60.686 92.686 58.000 96.000 58.000 L 112.000 58.000 C 115.314 58.000 118.000 60.686 118.000 64.000 ZM 170.140 196.000 L 173.860 222.000 C 174.440 226.021 173.245 230.096 170.585 233.167 C 167.925 236.237 164.063 238.001 160.000 238.000 L 96.000 238.000 C 91.937 238.001 88.075 236.237 85.415 233.167 C 82.755 230.096 81.560 226.021 82.140 222.000 L 85.860 196.000 C 54.095 180.043 34.033 147.548 34.000 112.000 C 34.000 108.686 36.686 106.000 40.000 106.000 L 58.000 106.000 L 58.000 40.000 C 58.000 32.268 64.268 26.000 72.000 26.000 L 184.000 26.000 C 191.732 26.000 198.000 32.268 198.000 40.000 L 198.000 106.000 L 216.000 106.000 C 219.314 106.000 222.000 108.686 222.000 112.000 C 221.967 147.548 201.905 180.043 170.140 196.000 ZM 70.000 106.000 L 186.000 106.000 L 186.000 40.000 C 186.000 38.895 185.105 38.000 184.000 38.000 L 72.000 38.000 C 70.895 38.000 70.000 38.895 70.000 40.000 ZM 158.710 200.840 C 138.814 207.717 117.186 207.717 97.290 200.840 L 94.000 223.720 C 93.919 224.293 94.091 224.873 94.470 225.310 C 94.854 225.753 95.413 226.005 96.000 226.000 L 160.000 226.000 C 160.580 226.000 161.130 225.748 161.510 225.310 C 161.889 224.873 162.061 224.293 161.980 223.720 ZM 209.780 118.000 L 46.220 118.000 C 49.365 160.843 85.042 193.997 128.000 193.997 C 170.958 193.997 206.635 160.843 209.780 118.000 Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
