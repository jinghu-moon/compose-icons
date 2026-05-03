package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorRegularIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 69.120 94.150 L 28.500 128.000 L 69.120 161.850 C 71.380 163.660 72.487 166.549 72.012 169.406 C 71.538 172.262 69.557 174.639 66.834 175.621 C 64.110 176.603 61.068 176.037 58.880 174.140 L 10.880 134.140 C 9.057 132.620 8.002 130.369 8.002 127.995 C 8.002 125.621 9.057 123.370 10.880 121.850 L 58.880 81.850 C 62.277 79.022 67.322 79.483 70.150 82.880 C 72.978 86.277 72.517 91.322 69.120 94.150 ZM 245.120 121.850 L 197.120 81.850 C 193.723 79.022 188.678 79.483 185.850 82.880 C 183.022 86.277 183.483 91.322 186.880 94.150 L 227.500 128.000 L 186.880 161.850 C 184.620 163.660 183.513 166.549 183.988 169.406 C 184.462 172.262 186.443 174.639 189.166 175.621 C 191.890 176.603 194.932 176.037 197.120 174.140 L 245.120 134.140 C 246.943 132.620 247.998 130.369 247.998 127.995 C 247.998 125.621 246.943 123.370 245.120 121.850 ZM 162.730 32.480 C 160.736 31.756 158.535 31.854 156.613 32.752 C 154.691 33.650 153.204 35.276 152.480 37.270 L 88.480 213.270 C 87.753 215.266 87.849 217.469 88.748 219.393 C 89.646 221.318 91.273 222.806 93.270 223.530 C 94.146 223.841 95.070 224.000 96.000 224.000 C 99.366 224.000 102.371 221.894 103.520 218.730 L 167.520 42.730 C 168.244 40.736 168.146 38.535 167.248 36.613 C 166.350 34.691 164.724 33.204 162.730 32.480 Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
