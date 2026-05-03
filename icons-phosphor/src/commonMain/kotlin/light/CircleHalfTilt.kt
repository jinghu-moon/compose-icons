package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorLightIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.88f),
                    PathNode.CurveTo(174.42325f, 29.763079f, 136.69305f, 19.43484f, 101.277214f, 28.822836f),
                    PathNode.CurveTo(65.86137f, 38.21083f, 38.201523f, 65.87259f, 28.815983f, 101.289085f),
                    PathNode.CurveTo(19.430443f, 136.70558f, 29.761297f, 174.43506f, 55.88f, 200.13f),
                    PathNode.CurveTo(81.57675f, 226.24692f, 119.30694f, 236.57516f, 154.7228f, 227.18716f),
                    PathNode.CurveTo(190.13864f, 217.79916f, 217.79848f, 190.1374f, 227.18402f, 154.72092f),
                    PathNode.CurveTo(236.56955f, 119.30441f, 226.23871f, 81.57494f, 200.12f, 55.88f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 209.62f),
                    PathNode.CurveTo(82.300415f, 206.02025f, 75.15212f, 201.3434f, 68.77f, 195.73f),
                    PathNode.LineTo(90.0f, 174.49f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 217.78f),
                    PathNode.CurveTo(115.219574f, 217.34541f, 108.51016f, 216.14442f, 102.0f, 214.2f),
                    PathNode.LineTo(102.0f, 162.49f),
                    PathNode.LineTo(122.0f, 142.49f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 214.2f),
                    PathNode.CurveTo(147.49023f, 216.1461f, 140.78064f, 217.34712f, 134.0f, 217.78f),
                    PathNode.LineTo(134.0f, 130.49f),
                    PathNode.LineTo(154.0f, 110.49f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 196.8f),
                    PathNode.CurveTo(179.93355f, 201.94704f, 173.20755f, 206.26176f, 166.0f, 209.63f),
                    PathNode.LineTo(166.0f, 98.49f),
                    PathNode.LineTo(186.0f, 78.49f),
                    PathNode.Close,
                    PathNode.MoveTo(60.27f, 187.24f),
                    PathNode.CurveTo(29.05032f, 151.58322f, 30.83172f, 97.82521f, 64.34347f, 64.31346f),
                    PathNode.CurveTo(97.85521f, 30.80172f, 151.61322f, 29.020317f, 187.27f, 60.24f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 184.57f),
                    PathNode.LineTo(198.0f, 71.43f),
                    PathNode.CurveTo(224.66824f, 104.428856f, 224.66824f, 151.57115f, 198.0f, 184.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
