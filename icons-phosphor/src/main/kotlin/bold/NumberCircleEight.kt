package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorBoldIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 155.600 123.090 C 167.838 108.477 166.564 86.858 152.696 73.783 C 138.828 60.708 117.172 60.708 103.304 73.783 C 89.436 86.858 88.162 108.477 100.400 123.090 C 88.564 134.373 84.788 151.725 90.864 166.907 C 96.941 182.089 111.647 192.042 128.000 192.042 C 144.353 192.042 159.059 182.089 165.136 166.907 C 171.212 151.725 167.436 134.373 155.600 123.090 ZM 116.000 100.000 C 116.000 93.373 121.373 88.000 128.000 88.000 C 134.627 88.000 140.000 93.373 140.000 100.000 C 140.000 106.627 134.627 112.000 128.000 112.000 C 121.373 112.000 116.000 106.627 116.000 100.000 ZM 128.000 168.000 C 119.163 168.000 112.000 160.837 112.000 152.000 C 112.000 143.163 119.163 136.000 128.000 136.000 C 136.837 136.000 144.000 143.163 144.000 152.000 C 144.000 160.837 136.837 168.000 128.000 168.000 Z"),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
