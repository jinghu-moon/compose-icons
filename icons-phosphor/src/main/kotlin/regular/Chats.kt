package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorRegularIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(184.0f, 39.163445f, 176.83656f, 32.0f, 168.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(31.163445f, 32.0f, 24.0f, 39.163445f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.009584f, 179.07129f, 25.776623f, 181.86595f, 28.547138f, 183.19154f),
                    PathNode.CurveTo(31.317654f, 184.51714f, 34.602474f, 184.13959f, 37.0f, 182.22f),
                    PathNode.LineTo(72.0f, 154.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(72.0f, 192.83656f, 79.163445f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(181.59f, 200.0f),
                    PathNode.LineTo(219.0f, 230.22f),
                    PathNode.CurveTo(220.41556f, 231.365f, 222.17934f, 231.9929f, 224.0f, 232.0f),
                    PathNode.CurveTo(228.41827f, 232.0f, 232.0f, 228.41827f, 232.0f, 224.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 87.163445f, 224.83656f, 80.0f, 216.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.55f, 137.78f),
                    PathNode.LineTo(40.0f, 159.25f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.LineTo(71.58f, 136.0f),
                    PathNode.CurveTo(69.74904f, 136.00024f, 67.97357f, 136.62854f, 66.55f, 137.78f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 207.25f),
                    PathNode.LineTo(189.45f, 185.78f),
                    PathNode.CurveTo(188.03444f, 184.635f, 186.27066f, 184.0071f, 184.45f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(176.83656f, 152.0f, 184.0f, 144.83656f, 184.0f, 136.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
