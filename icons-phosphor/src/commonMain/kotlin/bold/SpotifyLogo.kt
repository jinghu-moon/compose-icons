package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorBoldIcon(
            name = "SpotifyLogo",
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
                    PathNode.MoveTo(194.59f, 127.64f),
                    PathNode.CurveTo(193.09038f, 130.4475f, 190.5368f, 132.54419f, 187.49115f, 133.46877f),
                    PathNode.CurveTo(184.4455f, 134.39334f, 181.15729f, 134.07004f, 178.35f, 132.57f),
                    PathNode.CurveTo(146.89436f, 115.73427f, 109.10563f, 115.73427f, 77.65f, 132.57f),
                    PathNode.CurveTo(75.91539f, 133.51039f, 73.973114f, 134.00197f, 72.0f, 134.0f),
                    PathNode.CurveTo(66.49731f, 133.99887f, 61.70052f, 130.25526f, 60.362583f, 124.9177f),
                    PathNode.CurveTo(59.024647f, 119.58015f, 61.488457f, 114.01657f, 66.34f, 111.42f),
                    PathNode.CurveTo(104.853546f, 90.79929f, 151.12645f, 90.79929f, 189.64f, 111.42f),
                    PathNode.CurveTo(195.48201f, 114.53536f, 197.69705f, 121.79358f, 194.59f, 127.64f),
                    PathNode.Close,
                    PathNode.MoveTo(178.59f, 163.64f),
                    PathNode.CurveTo(177.1025f, 166.45695f, 174.55597f, 168.56686f, 171.51158f, 169.50475f),
                    PathNode.CurveTo(168.4672f, 170.44264f, 165.17482f, 170.13153f, 162.36f, 168.64f),
                    PathNode.CurveTo(140.88567f, 157.184f, 115.114334f, 157.184f, 93.64f, 168.64f),
                    PathNode.CurveTo(87.80932f, 171.61816f, 80.667625f, 169.37294f, 77.58997f, 163.59415f),
                    PathNode.CurveTo(74.51232f, 157.81537f, 76.63481f, 150.63625f, 82.36f, 147.46f),
                    PathNode.CurveTo(110.885666f, 132.24933f, 145.11433f, 132.24933f, 173.64f, 147.46f),
                    PathNode.CurveTo(179.45856f, 150.57452f, 181.67003f, 157.8031f, 178.59f, 163.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
