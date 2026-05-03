package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorLightIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 98.000 136.000 C 98.000 132.686 100.686 130.000 104.000 130.000 L 168.000 130.000 C 171.314 130.000 174.000 132.686 174.000 136.000 C 174.000 139.314 171.314 142.000 168.000 142.000 L 104.000 142.000 C 100.686 142.000 98.000 139.314 98.000 136.000 ZM 104.000 110.000 L 168.000 110.000 C 171.314 110.000 174.000 107.314 174.000 104.000 C 174.000 100.686 171.314 98.000 168.000 98.000 L 104.000 98.000 C 100.686 98.000 98.000 100.686 98.000 104.000 C 98.000 107.314 100.686 110.000 104.000 110.000 ZM 230.000 192.000 C 230.000 208.569 216.569 222.000 200.000 222.000 L 88.000 222.000 C 71.431 222.000 58.000 208.569 58.000 192.000 L 58.000 64.000 C 58.000 54.059 49.941 46.000 40.000 46.000 C 30.059 46.000 22.000 54.059 22.000 64.000 C 22.000 70.760 27.580 75.190 27.640 75.230 C 30.283 77.229 30.804 80.992 28.805 83.635 C 26.806 86.278 23.043 86.799 20.400 84.800 C 20.000 84.480 10.000 76.850 10.000 64.000 C 10.000 47.431 23.431 34.000 40.000 34.000 L 176.000 34.000 C 192.569 34.000 206.000 47.431 206.000 64.000 L 206.000 170.000 L 216.000 170.000 C 217.298 170.000 218.561 170.421 219.600 171.200 C 220.000 171.520 230.000 179.150 230.000 192.000 ZM 106.000 192.000 C 106.000 185.240 100.410 180.810 100.360 180.770 C 98.314 179.209 97.492 176.517 98.316 174.079 C 99.140 171.641 101.427 170.000 104.000 170.000 L 194.000 170.000 L 194.000 64.000 C 194.000 54.059 185.941 46.000 176.000 46.000 L 64.000 46.000 C 67.906 51.187 70.013 57.507 70.000 64.000 L 70.000 192.000 C 70.000 201.941 78.059 210.000 88.000 210.000 C 97.941 210.000 106.000 201.941 106.000 192.000 ZM 218.000 192.000 C 217.864 188.239 216.315 184.668 213.660 182.000 L 115.880 182.000 C 117.273 185.150 117.995 188.556 118.000 192.000 C 118.009 198.493 115.903 204.812 112.000 210.000 L 200.000 210.000 C 209.941 210.000 218.000 201.941 218.000 192.000 Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
