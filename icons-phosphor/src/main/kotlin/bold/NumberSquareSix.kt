package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorBoldIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 128.000 188.000 C 149.081 187.965 166.516 171.574 167.853 150.535 C 169.189 129.497 153.967 111.032 133.060 108.330 L 146.300 86.150 C 148.626 82.465 148.770 77.808 146.679 73.985 C 144.587 70.163 140.587 67.774 136.229 67.746 C 131.872 67.718 127.841 70.055 125.700 73.850 L 93.460 127.850 C 86.247 140.220 86.196 155.501 93.326 167.919 C 100.457 180.336 113.681 187.995 128.000 188.000 ZM 128.000 132.000 C 136.837 132.000 144.000 139.163 144.000 148.000 C 144.000 156.837 136.837 164.000 128.000 164.000 C 119.163 164.000 112.000 156.837 112.000 148.000 C 112.000 139.163 119.163 132.000 128.000 132.000 Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
