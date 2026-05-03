package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorLightIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 170.0f),
                    PathNode.CurveTo(185.74886f, 170.01645f, 173.4692f, 180.04065f, 170.6f, 194.0f),
                    PathNode.LineTo(72.0f, 194.0f),
                    PathNode.CurveTo(53.222317f, 194.0f, 38.0f, 178.77768f, 38.0f, 160.0f),
                    PathNode.CurveTo(38.0f, 141.22232f, 53.222317f, 126.0f, 72.0f, 126.0f),
                    PathNode.LineTo(168.0f, 126.0f),
                    PathNode.CurveTo(188.98682f, 126.0f, 206.0f, 108.986824f, 206.0f, 88.0f),
                    PathNode.CurveTo(206.0f, 67.013176f, 188.98682f, 50.0f, 168.0f, 50.0f),
                    PathNode.LineTo(72.0f, 50.0f),
                    PathNode.CurveTo(68.686295f, 50.0f, 66.0f, 52.68629f, 66.0f, 56.0f),
                    PathNode.CurveTo(66.0f, 59.31371f, 68.686295f, 62.0f, 72.0f, 62.0f),
                    PathNode.LineTo(168.0f, 62.0f),
                    PathNode.CurveTo(182.3594f, 62.0f, 194.0f, 73.640594f, 194.0f, 88.0f),
                    PathNode.CurveTo(194.0f, 102.359406f, 182.3594f, 114.0f, 168.0f, 114.0f),
                    PathNode.LineTo(72.0f, 114.0f),
                    PathNode.CurveTo(46.594906f, 114.0f, 26.0f, 134.5949f, 26.0f, 160.0f),
                    PathNode.CurveTo(26.0f, 185.4051f, 46.594906f, 206.0f, 72.0f, 206.0f),
                    PathNode.LineTo(170.6f, 206.0f),
                    PathNode.CurveTo(173.75735f, 221.4678f, 188.36205f, 231.84215f, 204.00693f, 229.73038f),
                    PathNode.CurveTo(219.65181f, 227.6186f, 230.98326f, 213.74336f, 229.9266f, 197.992f),
                    PathNode.CurveTo(228.86995f, 182.24065f, 215.78676f, 170.00322f, 200.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 218.0f),
                    PathNode.CurveTo(190.05887f, 218.0f, 182.0f, 209.94113f, 182.0f, 200.0f),
                    PathNode.CurveTo(182.0f, 190.05887f, 190.05887f, 182.0f, 200.0f, 182.0f),
                    PathNode.CurveTo(209.94113f, 182.0f, 218.0f, 190.05887f, 218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 209.94113f, 209.94113f, 218.0f, 200.0f, 218.0f),
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
        return _path!!
    }

private var _path: ImageVector? = null
