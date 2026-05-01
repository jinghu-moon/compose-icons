package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorFillIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 91.163445f, 119.163445f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(136.83656f, 84.0f, 144.0f, 91.163445f, 144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 108.836555f, 136.83656f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(119.163445f, 116.0f, 112.0f, 108.836555f, 112.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(116.95431f, 132.0f, 108.0f, 140.9543f, 108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 163.0457f, 116.95431f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(139.0457f, 172.0f, 148.0f, 163.0457f, 148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 140.9543f, 139.0457f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.00107f, 140.76979f, 158.75122f, 130.18501f, 149.81f, 123.39f),
                    PathNode.CurveTo(159.43253f, 114.42756f, 162.59264f, 100.49079f, 157.77686f, 88.25452f),
                    PathNode.CurveTo(152.96106f, 76.018234f, 141.14984f, 67.97369f, 128.0f, 67.97369f),
                    PathNode.CurveTo(114.85016f, 67.97369f, 103.03893f, 76.018234f, 98.223145f, 88.25452f),
                    PathNode.CurveTo(93.40736f, 100.49079f, 96.567474f, 114.42756f, 106.19f, 123.39f),
                    PathNode.CurveTo(92.74419f, 133.62883f, 88.23083f, 151.84238f, 95.34004f, 167.1748f),
                    PathNode.CurveTo(102.44925f, 182.50722f, 119.26686f, 190.83022f, 135.76903f, 187.183f),
                    PathNode.CurveTo(152.2712f, 183.53578f, 164.0147f, 168.90039f, 164.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
