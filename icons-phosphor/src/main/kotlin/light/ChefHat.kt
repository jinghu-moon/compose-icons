package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorLightIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 112.000 C 237.967 82.190 213.810 58.033 184.000 58.000 C 181.821 58.003 179.643 58.137 177.480 58.400 C 168.896 38.711 149.459 25.981 127.980 25.981 C 106.501 25.981 87.064 38.711 78.480 58.400 C 76.330 58.138 74.166 58.005 72.000 58.000 C 46.524 58.016 24.525 75.835 19.219 100.752 C 13.912 125.669 26.742 150.905 50.000 161.300 L 50.000 208.000 C 50.000 215.732 56.268 222.000 64.000 222.000 L 192.000 222.000 C 199.732 222.000 206.000 215.732 206.000 208.000 L 206.000 161.300 C 225.447 152.605 237.976 133.302 238.000 112.000 ZM 194.000 208.000 C 194.000 209.105 193.105 210.000 192.000 210.000 L 64.000 210.000 C 62.895 210.000 62.000 209.105 62.000 208.000 L 62.000 165.060 C 65.297 165.683 68.645 165.998 72.000 166.000 L 184.000 166.000 C 187.355 165.998 190.703 165.683 194.000 165.060 ZM 184.000 154.000 L 167.690 154.000 L 173.820 129.460 C 174.626 126.246 172.674 122.986 169.460 122.180 C 166.246 121.374 162.986 123.326 162.180 126.540 L 155.310 154.000 L 134.000 154.000 L 134.000 128.000 C 134.000 124.686 131.314 122.000 128.000 122.000 C 124.686 122.000 122.000 124.686 122.000 128.000 L 122.000 154.000 L 100.690 154.000 L 93.820 126.540 C 93.014 123.326 89.754 121.374 86.540 122.180 C 83.326 122.986 81.374 126.246 82.180 129.460 L 88.310 154.000 L 72.000 154.000 C 48.804 154.000 30.000 135.196 30.000 112.000 C 30.000 88.804 48.804 70.000 72.000 70.000 C 73.000 70.000 74.000 70.000 74.920 70.110 C 74.314 73.372 74.006 76.682 74.000 80.000 C 74.000 83.314 76.686 86.000 80.000 86.000 C 83.314 86.000 86.000 83.314 86.000 80.000 C 86.000 56.804 104.804 38.000 128.000 38.000 C 151.196 38.000 170.000 56.804 170.000 80.000 C 170.000 83.314 172.686 86.000 176.000 86.000 C 179.314 86.000 182.000 83.314 182.000 80.000 C 181.994 76.682 181.686 73.372 181.080 70.110 C 182.080 70.050 183.020 70.000 184.000 70.000 C 207.196 70.000 226.000 88.804 226.000 112.000 C 226.000 135.196 207.196 154.000 184.000 154.000 Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
