package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorFillIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(131.31f, 72.0f),
                    PathNode.LineTo(104.0f, 44.69f),
                    PathNode.CurveTo(101.00848f, 41.677708f, 96.93535f, 39.988674f, 92.69f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.62f),
                    PathNode.CurveTo(24.016523f, 209.11119f, 30.898802f, 215.989f, 39.39f, 216.0f),
                    PathNode.LineTo(216.89f, 216.0f),
                    PathNode.CurveTo(225.23045f, 215.98898f, 231.98898f, 209.23045f, 232.0f, 200.89f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(92.69f, 56.0f),
                    PathNode.LineTo(108.69f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.CurveTo(99.58172f, 152.0f, 96.0f, 148.41827f, 96.0f, 144.0f),
                    PathNode.CurveTo(96.0f, 139.58173f, 99.58172f, 136.0f, 104.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(156.41827f, 136.0f, 160.0f, 139.58173f, 160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 148.41827f, 156.41827f, 152.0f, 152.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
