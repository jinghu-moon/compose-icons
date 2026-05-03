package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorDuotoneIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(92.69f, 48.0f),
                    PathNode.CurveTo(94.80891f, 48.00098f, 96.84087f, 48.84254f, 98.34f, 50.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(131.31f, 72.0f),
                    PathNode.LineTo(104.0f, 44.69f),
                    PathNode.CurveTo(101.00975f, 41.67581f, 96.93579f, 39.986435f, 92.69f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.62f),
                    PathNode.CurveTo(24.011019f, 209.10957f, 30.890429f, 215.98898f, 39.38f, 216.0f),
                    PathNode.LineTo(216.89f, 216.0f),
                    PathNode.CurveTo(225.23045f, 215.98898f, 231.98898f, 209.23045f, 232.0f, 200.89f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.69f, 56.0f),
                    PathNode.LineTo(108.69f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(156.41827f, 136.0f, 160.0f, 139.58173f, 160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 148.41827f, 156.41827f, 152.0f, 152.0f, 152.0f),
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
