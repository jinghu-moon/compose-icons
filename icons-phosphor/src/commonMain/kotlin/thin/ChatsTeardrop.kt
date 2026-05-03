package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorThinIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.76f, 76.32f),
                    PathNode.CurveTo(153.43353f, 42.315678f, 117.80385f, 22.598892f, 81.91418f, 29.367945f),
                    PathNode.CurveTo(46.024506f, 36.136997f, 20.024609f, 67.47757f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 174.62741f, 25.372583f, 180.0f, 32.0f, 180.0f),
                    PathNode.LineTo(89.33f, 180.0f),
                    PathNode.CurveTo(100.84361f, 208.9549f, 128.83995f, 227.97038f, 160.0f, 228.0f),
                    PathNode.LineTo(224.0f, 228.0f),
                    PathNode.CurveTo(230.62741f, 228.0f, 236.0f, 222.62741f, 236.0f, 216.0f),
                    PathNode.LineTo(236.0f, 152.0f),
                    PathNode.CurveTo(235.9903f, 112.65327f, 205.95078f, 79.819786f, 166.76f, 76.32f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 168.0f),
                    PathNode.LineTo(28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 66.44463f, 58.444637f, 36.0f, 96.0f, 36.0f),
                    PathNode.CurveTo(133.55536f, 36.0f, 164.0f, 66.44463f, 164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 141.55536f, 133.55536f, 172.0f, 96.0f, 172.0f),
                    PathNode.LineTo(32.0f, 172.0f),
                    PathNode.CurveTo(29.790861f, 172.0f, 28.0f, 170.20914f, 28.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 218.20914f, 226.20914f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(133.27937f, 219.97218f, 109.0395f, 204.33356f, 98.0f, 180.0f),
                    PathNode.CurveTo(121.21247f, 179.39082f, 142.87285f, 168.20331f, 156.80544f, 149.62718f),
                    PathNode.CurveTo(170.73802f, 131.05104f, 175.41394f, 107.12474f, 169.5f, 84.67f),
                    PathNode.CurveTo(203.0515f, 89.40376f, 227.99844f, 118.11621f, 228.0f, 152.0f),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
