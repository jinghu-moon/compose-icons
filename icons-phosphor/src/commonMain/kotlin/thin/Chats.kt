package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorThinIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 84.0f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 41.37258f, 174.62741f, 36.0f, 168.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(33.37258f, 36.0f, 28.0f, 41.37258f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 178.20914f, 29.790861f, 180.0f, 32.0f, 180.0f),
                    PathNode.CurveTo(32.913765f, 179.99873f, 33.79955f, 179.68465f, 34.51f, 179.11f),
                    PathNode.LineTo(73.0f, 148.0f),
                    PathNode.LineTo(76.0f, 148.0f),
                    PathNode.LineTo(76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 190.62741f, 81.37258f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(183.0f, 196.0f),
                    PathNode.LineTo(221.49f, 227.11f),
                    PathNode.CurveTo(222.20045f, 227.68465f, 223.08624f, 227.99873f, 224.0f, 228.0f),
                    PathNode.CurveTo(226.20914f, 228.0f, 228.0f, 226.20914f, 228.0f, 224.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 89.37258f, 222.62741f, 84.0f, 216.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.58f, 140.0f),
                    PathNode.CurveTo(70.66624f, 140.00127f, 69.78045f, 140.31535f, 69.07f, 140.89f),
                    PathNode.LineTo(36.0f, 167.62f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 45.79086f, 37.79086f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(170.20914f, 44.0f, 172.0f, 45.79086f, 172.0f, 48.0f),
                    PathNode.LineTo(172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 138.20914f, 170.20914f, 140.0f, 168.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 215.62f),
                    PathNode.LineTo(186.93f, 188.89f),
                    PathNode.CurveTo(186.21954f, 188.31535f, 185.33377f, 188.00127f, 184.42f, 188.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.CurveTo(85.79086f, 188.0f, 84.0f, 186.20914f, 84.0f, 184.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.CurveTo(174.62741f, 148.0f, 180.0f, 142.62741f, 180.0f, 136.0f),
                    PathNode.LineTo(180.0f, 92.0f),
                    PathNode.LineTo(216.0f, 92.0f),
                    PathNode.CurveTo(218.20914f, 92.0f, 220.0f, 93.79086f, 220.0f, 96.0f),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
