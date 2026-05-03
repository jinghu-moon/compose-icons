package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorLightIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.000 41.000 C 194.976 20.988 162.524 20.988 142.500 41.000 L 41.000 142.500 C 20.980 162.518 20.977 194.975 40.995 214.995 C 61.013 235.015 93.470 235.018 113.490 215.000 L 215.000 113.500 C 234.996 93.469 234.996 61.031 215.000 41.000 ZM 105.000 206.500 C 89.585 221.292 65.171 221.042 50.062 205.938 C 34.952 190.834 34.694 166.421 49.480 151.000 L 96.000 104.490 L 151.520 160.000 ZM 206.520 105.000 L 160.000 151.510 L 104.480 96.000 L 151.000 49.500 C 166.415 34.708 190.829 34.958 205.938 50.062 C 221.048 65.166 221.306 89.579 206.520 105.000 ZM 188.260 83.760 C 190.600 86.103 190.600 89.897 188.260 92.240 L 164.260 116.240 C 161.913 118.552 158.140 118.539 155.809 116.211 C 153.478 113.882 153.461 110.110 155.770 107.760 L 179.770 83.760 C 180.895 82.633 182.423 82.000 184.015 82.000 C 185.607 82.000 187.135 82.633 188.260 83.760 Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
