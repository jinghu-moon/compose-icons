package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorLightIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 38.2f),
                    PathNode.CurveTo(140.7825f, 38.649666f, 147.49208f, 39.86745f, 154.0f, 41.83f),
                    PathNode.LineTo(154.0f, 214.17f),
                    PathNode.CurveTo(147.49208f, 216.13255f, 140.7825f, 217.35034f, 134.0f, 217.8f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 46.43f),
                    PathNode.CurveTo(173.20058f, 49.80266f, 179.92516f, 54.10976f, 186.0f, 59.24f),
                    PathNode.LineTo(186.0f, 196.76f),
                    PathNode.CurveTo(179.92516f, 201.89024f, 173.20058f, 206.19734f, 166.0f, 209.57f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(38.05883f, 80.64659f, 74.75587f, 41.41571f, 122.0f, 38.2f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(74.75587f, 214.58429f, 38.05883f, 175.35341f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 184.5f),
                    PathNode.LineTo(198.0f, 71.5f),
                    PathNode.CurveTo(224.66524f, 104.44741f, 224.66524f, 151.5526f, 198.0f, 184.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
