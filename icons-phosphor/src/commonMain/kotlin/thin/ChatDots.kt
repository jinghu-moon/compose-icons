package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorThinIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 120.0f),
                    PathNode.CurveTo(79.58172f, 120.0f, 76.0f, 123.58172f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 132.41827f, 79.58172f, 136.0f, 84.0f, 136.0f),
                    PathNode.CurveTo(88.41828f, 136.0f, 92.0f, 132.41827f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 123.58172f, 88.41828f, 120.0f, 84.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 120.0f),
                    PathNode.CurveTo(167.58173f, 120.0f, 164.0f, 123.58172f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 132.41827f, 167.58173f, 136.0f, 172.0f, 136.0f),
                    PathNode.CurveTo(176.41827f, 136.0f, 180.0f, 132.41827f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 123.58172f, 176.41827f, 120.0f, 172.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 198.62741f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(81.49f, 204.0f),
                    PathNode.LineTo(47.76f, 233.13f),
                    PathNode.LineTo(47.76f, 233.13f),
                    PathNode.CurveTo(45.60033f, 234.98482f, 42.84684f, 236.00317f, 40.0f, 236.0f),
                    PathNode.CurveTo(38.237507f, 235.99379f, 36.497395f, 235.60481f, 34.9f, 234.86f),
                    PathNode.CurveTo(30.670816f, 232.90463f, 27.973475f, 228.65924f, 28.0f, 224.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 61.79086f, 218.20914f, 60.0f, 216.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(37.79086f, 60.0f, 36.0f, 61.79086f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 224.0f),
                    PathNode.CurveTo(35.997475f, 225.55307f, 36.894165f, 226.96724f, 38.299995f, 227.62727f),
                    PathNode.CurveTo(39.70583f, 228.28734f, 41.366657f, 228.07397f, 42.56f, 227.08f),
                    PathNode.LineTo(77.38f, 197.0f),
                    PathNode.CurveTo(78.10404f, 196.36142f, 79.03461f, 196.00624f, 80.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
