package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorRegularIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.63f, 81.35f),
                    PathNode.CurveTo(167.24251f, 41.63174f, 131.40164f, 13.654274f, 91.07808f, 16.129156f),
                    PathNode.CurveTo(50.75451f, 18.604038f, 18.604038f, 50.75451f, 16.129156f, 91.07808f),
                    PathNode.CurveTo(13.654274f, 131.40164f, 41.63174f, 167.24251f, 81.35f, 174.63f),
                    PathNode.CurveTo(88.737495f, 214.34827f, 124.578354f, 242.32573f, 164.90192f, 239.85085f),
                    PathNode.CurveTo(205.2255f, 237.37596f, 237.37596f, 205.2255f, 239.85085f, 164.90192f),
                    PathNode.CurveTo(242.32573f, 124.578354f, 214.34827f, 88.737495f, 174.63f, 81.35f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 161.52f, 223.93f, 163.0f, 223.82f, 164.51f),
                    PathNode.LineTo(173.82f, 114.51f),
                    PathNode.CurveTo(175.11806f, 109.097305f, 175.84866f, 103.56411f, 176.0f, 98.0f),
                    PathNode.CurveTo(204.308f, 105.23939f, 224.08221f, 130.78108f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.6f, 157.91f),
                    PathNode.LineTo(199.21f, 210.53f),
                    PathNode.CurveTo(194.2827f, 214.3607f, 188.82155f, 217.45007f, 183.0f, 219.7f),
                    PathNode.LineTo(131.14f, 167.84f),
                    PathNode.CurveTo(136.65544f, 165.1309f, 141.84256f, 161.79921f, 146.6f, 157.91f),
                    PathNode.Close,
                    PathNode.MoveTo(157.91f, 146.6f),
                    PathNode.CurveTo(161.79791f, 141.84882f, 165.12958f, 136.66849f, 167.84f, 131.16f),
                    PathNode.LineTo(219.7f, 183.0f),
                    PathNode.CurveTo(217.44832f, 188.81456f, 214.35901f, 194.26884f, 210.53f, 199.19f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 60.653774f, 60.653774f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(131.34622f, 32.0f, 160.0f, 60.653774f, 160.0f, 96.0f),
                    PathNode.CurveTo(160.0f, 131.34622f, 131.34622f, 160.0f, 96.0f, 160.0f),
                    PathNode.CurveTo(60.66977f, 159.96143f, 32.038578f, 131.33023f, 32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 176.0f),
                    PathNode.CurveTo(103.559006f, 175.86436f, 109.08879f, 175.15051f, 114.5f, 173.87f),
                    PathNode.LineTo(164.5f, 223.87f),
                    PathNode.CurveTo(163.01f, 223.98f, 161.5f, 224.05f, 159.99f, 224.05f),
                    PathNode.CurveTo(130.76033f, 224.12183f, 105.21917f, 204.32423f, 98.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subtract!!
    }

private var _subtract: ImageVector? = null
