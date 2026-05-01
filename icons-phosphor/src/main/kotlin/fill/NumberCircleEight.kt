package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorFillIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 163.0457f, 139.0457f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(116.95431f, 172.0f, 108.0f, 163.0457f, 108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 140.9543f, 116.95431f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(139.0457f, 132.0f, 148.0f, 140.9543f, 148.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(136.83656f, 116.0f, 144.0f, 108.836555f, 144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 91.163445f, 136.83656f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(119.163445f, 84.0f, 112.0f, 91.163445f, 112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 108.836555f, 119.163445f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
