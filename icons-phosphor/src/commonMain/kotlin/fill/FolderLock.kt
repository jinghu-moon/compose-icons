package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorFillIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.LineTo(112.56f, 216.0f),
                    PathNode.CurveTo(116.97828f, 216.0f, 120.56f, 212.41827f, 120.56f, 208.0f),
                    PathNode.CurveTo(120.56f, 203.58173f, 116.97828f, 200.0f, 112.56f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 108.41828f, 219.58173f, 112.0f, 224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(92.69f, 56.0f),
                    PathNode.LineTo(108.69f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(216.0f, 140.53603f, 203.46397f, 128.0f, 188.0f, 128.0f),
                    PathNode.CurveTo(172.53603f, 128.0f, 160.0f, 140.53603f, 160.0f, 156.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(147.58173f, 160.0f, 144.0f, 163.58173f, 144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 212.41827f, 147.58173f, 216.0f, 152.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 163.58173f, 228.41827f, 160.0f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 156.0f),
                    PathNode.CurveTo(176.0f, 149.37259f, 181.37259f, 144.0f, 188.0f, 144.0f),
                    PathNode.CurveTo(194.62741f, 144.0f, 200.0f, 149.37259f, 200.0f, 156.0f),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
