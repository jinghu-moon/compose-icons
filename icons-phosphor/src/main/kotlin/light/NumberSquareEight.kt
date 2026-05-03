package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorLightIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 146.570 123.540 C 156.608 115.629 160.531 102.227 156.345 90.151 C 152.158 78.076 140.781 69.978 128.000 69.978 C 115.219 69.978 103.842 78.076 99.655 90.151 C 95.469 102.227 99.392 115.629 109.430 123.540 C 96.826 131.758 91.122 147.284 95.409 161.707 C 99.696 176.131 112.953 186.021 128.000 186.021 C 143.047 186.021 156.304 176.131 160.591 161.707 C 164.878 147.284 159.174 131.758 146.570 123.540 ZM 110.000 100.000 C 110.000 90.059 118.059 82.000 128.000 82.000 C 137.941 82.000 146.000 90.059 146.000 100.000 C 146.000 109.941 137.941 118.000 128.000 118.000 C 118.059 118.000 110.000 109.941 110.000 100.000 ZM 128.000 174.000 C 115.850 174.000 106.000 164.150 106.000 152.000 C 106.000 139.850 115.850 130.000 128.000 130.000 C 140.150 130.000 150.000 139.850 150.000 152.000 C 150.000 164.150 140.150 174.000 128.000 174.000 Z"),
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
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
