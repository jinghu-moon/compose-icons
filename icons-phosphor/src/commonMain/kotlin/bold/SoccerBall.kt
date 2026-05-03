package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorBoldIcon(
            name = "SoccerBall",
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
                    PathNode.MoveTo(199.88f, 171.42f),
                    PathNode.LineTo(175.88f, 171.42f),
                    PathNode.LineTo(166.1f, 158.0f),
                    PathNode.LineTo(177.4f, 125.06f),
                    PathNode.LineTo(193.15f, 120.0f),
                    PathNode.LineTo(211.75f, 134.26f),
                    PathNode.CurveTo(210.78584f, 147.4107f, 206.71796f, 160.14555f, 199.88f, 171.42f),
                    PathNode.Close,
                    PathNode.MoveTo(44.25f, 134.21f),
                    PathNode.LineTo(62.85f, 120.0f),
                    PathNode.LineTo(78.6f, 125.11f),
                    PathNode.LineTo(89.9f, 158.0f),
                    PathNode.LineTo(80.15f, 171.42f),
                    PathNode.LineTo(56.15f, 171.42f),
                    PathNode.CurveTo(49.294f, 160.13342f, 45.2155f, 147.3804f, 44.25f, 134.21f),
                    PathNode.Close,
                    PathNode.MoveTo(111.85f, 148.0f),
                    PathNode.LineTo(102.31f, 120.23f),
                    PathNode.LineTo(128.0f, 102.56f),
                    PathNode.LineTo(153.69f, 120.23f),
                    PathNode.LineTo(144.15f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.51f, 74.27f),
                    PathNode.LineTo(185.73f, 97.12f),
                    PathNode.LineTo(169.92f, 102.26f),
                    PathNode.LineTo(140.0f, 81.69f),
                    PathNode.LineTo(140.0f, 65.46f),
                    PathNode.LineTo(161.22f, 50.87f),
                    PathNode.CurveTo(173.33919f, 56.110943f, 184.05725f, 64.12637f, 192.51f, 74.27f),
                    PathNode.Close,
                    PathNode.MoveTo(94.78f, 50.87f),
                    PathNode.LineTo(116.0f, 65.46f),
                    PathNode.LineTo(116.0f, 81.69f),
                    PathNode.LineTo(86.08f, 102.26f),
                    PathNode.LineTo(70.27f, 97.12f),
                    PathNode.LineTo(63.49f, 74.27f),
                    PathNode.CurveTo(71.94275f, 64.12637f, 82.66081f, 56.110943f, 94.78f, 50.87f),
                    PathNode.Close,
                    PathNode.MoveTo(108.36f, 209.66f),
                    PathNode.LineTo(99.74f, 185.29f),
                    PathNode.LineTo(109.39f, 172.0f),
                    PathNode.LineTo(146.61f, 172.0f),
                    PathNode.LineTo(156.26f, 185.29f),
                    PathNode.LineTo(147.64f, 209.66f),
                    PathNode.CurveTo(134.73253f, 212.78003f, 121.26746f, 212.78003f, 108.36f, 209.66f),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
