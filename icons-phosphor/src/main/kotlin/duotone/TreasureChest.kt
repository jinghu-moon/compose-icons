package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorDuotoneIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 196.41827f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 196.41827f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 112.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(41.085766f, 40.03307f, 16.03307f, 65.08576f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(239.96693f, 65.08576f, 214.91423f, 40.03307f, 184.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 56.8f),
                    PathNode.CurveTo(210.61176f, 60.62676f, 223.97679f, 76.99892f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(148.41827f, 152.0f, 152.0f, 148.41827f, 152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 148.41827f, 107.58172f, 152.0f, 112.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(152.0f, 91.58172f, 148.41827f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(107.58172f, 88.0f, 104.0f, 91.58172f, 104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 56.8f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.023216f, 76.99892f, 45.38824f, 60.62676f, 64.0f, 56.8f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 192.0f),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
