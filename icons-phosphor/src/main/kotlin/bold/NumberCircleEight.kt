package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorBoldIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.6f, 123.09f),
                    PathNode.CurveTo(167.83752f, 108.47717f, 166.56436f, 86.858376f, 152.69624f, 73.78294f),
                    PathNode.CurveTo(138.82812f, 60.707508f, 117.171875f, 60.707508f, 103.30376f, 73.78294f),
                    PathNode.CurveTo(89.43564f, 86.858376f, 88.16248f, 108.47717f, 100.4f, 123.09f),
                    PathNode.CurveTo(88.56376f, 134.37337f, 84.78761f, 151.72519f, 90.86447f, 166.90685f),
                    PathNode.CurveTo(96.94133f, 182.08852f, 111.64729f, 192.04237f, 128.0f, 192.04237f),
                    PathNode.CurveTo(144.3527f, 192.04237f, 159.05867f, 182.08852f, 165.13553f, 166.90685f),
                    PathNode.CurveTo(171.21239f, 151.72519f, 167.43625f, 134.37337f, 155.6f, 123.09f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 93.37258f, 121.37258f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(134.62741f, 88.0f, 140.0f, 93.37258f, 140.0f, 100.0f),
                    PathNode.CurveTo(140.0f, 106.62742f, 134.62741f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(121.37258f, 112.0f, 116.0f, 106.62742f, 116.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(119.163445f, 168.0f, 112.0f, 160.83656f, 112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 143.16344f, 119.163445f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(136.83656f, 136.0f, 144.0f, 143.16344f, 144.0f, 152.0f),
                    PathNode.CurveTo(144.0f, 160.83656f, 136.83656f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
