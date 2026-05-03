package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorRegularIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.81f, 123.39f),
                    PathNode.CurveTo(159.43253f, 114.42756f, 162.59264f, 100.49079f, 157.77686f, 88.25452f),
                    PathNode.CurveTo(152.96106f, 76.018234f, 141.14984f, 67.97369f, 128.0f, 67.97369f),
                    PathNode.CurveTo(114.85016f, 67.97369f, 103.03893f, 76.018234f, 98.223145f, 88.25452f),
                    PathNode.CurveTo(93.40736f, 100.49079f, 96.567474f, 114.42756f, 106.19f, 123.39f),
                    PathNode.CurveTo(93.90045f, 132.74835f, 88.95091f, 148.90385f, 93.88925f, 163.54028f),
                    PathNode.CurveTo(98.82758f, 178.1767f, 112.55293f, 188.0313f, 128.0f, 188.0313f),
                    PathNode.CurveTo(143.44707f, 188.0313f, 157.17244f, 178.1767f, 162.11075f, 163.54028f),
                    PathNode.CurveTo(167.04909f, 148.90385f, 162.09956f, 132.74835f, 149.81f, 123.39f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 91.163445f, 119.163445f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(136.83656f, 84.0f, 144.0f, 91.163445f, 144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 108.836555f, 136.83656f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(119.163445f, 116.0f, 112.0f, 108.836555f, 112.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(116.95431f, 172.0f, 108.0f, 163.0457f, 108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 140.9543f, 116.95431f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(139.0457f, 132.0f, 148.0f, 140.9543f, 148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 163.0457f, 139.0457f, 172.0f, 128.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
