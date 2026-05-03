package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorLightIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.910 118.140 L 137.910 22.140 C 135.297 19.521 131.749 18.050 128.050 18.050 C 124.351 18.050 120.803 19.521 118.190 22.140 L 22.190 118.190 C 19.571 120.803 18.100 124.351 18.100 128.050 C 18.100 131.749 19.571 135.297 22.190 137.910 L 118.240 233.910 C 120.853 236.529 124.401 238.000 128.100 238.000 C 131.799 238.000 135.347 236.529 137.960 233.910 L 233.960 137.910 C 236.579 135.297 238.050 131.749 238.050 128.050 C 238.050 124.351 236.579 120.803 233.960 118.190 ZM 126.620 30.570 C 127.393 29.833 128.607 29.833 129.380 30.570 L 188.810 90.000 L 160.000 90.000 C 158.409 90.001 156.884 90.634 155.760 91.760 L 128.000 119.520 L 100.240 91.760 C 99.116 90.634 97.591 90.001 96.000 90.000 L 67.190 90.000 ZM 30.000 128.000 C 29.998 127.482 30.204 126.986 30.570 126.620 L 55.190 102.000 L 93.510 102.000 L 119.510 128.000 L 93.510 154.000 L 55.190 154.000 L 30.570 129.380 C 30.204 129.014 29.998 128.518 30.000 128.000 ZM 129.380 225.430 C 128.607 226.167 127.393 226.167 126.620 225.430 L 67.190 166.000 L 96.000 166.000 C 97.591 165.999 99.116 165.366 100.240 164.240 L 128.000 136.480 L 155.760 164.240 C 156.884 165.366 158.409 165.999 160.000 166.000 L 188.810 166.000 ZM 225.430 129.380 L 200.810 154.000 L 162.490 154.000 L 136.490 128.000 L 162.490 102.000 L 200.810 102.000 L 225.430 126.620 C 226.167 127.393 226.167 128.607 225.430 129.380 Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
