package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorFillIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 108.41828f, 228.41827f, 112.0f, 224.0f, 112.0f),
                    PathNode.CurveTo(219.58173f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(130.67f, 88.0f),
                    PathNode.CurveTo(127.20947f, 87.99142f, 123.84357f, 86.869446f, 121.07f, 84.8f),
                    PathNode.LineTo(93.33f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.CurveTo(116.41828f, 200.0f, 120.0f, 203.58173f, 120.0f, 208.0f),
                    PathNode.CurveTo(120.0f, 212.41827f, 116.41828f, 216.0f, 112.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(93.33f, 48.0f),
                    PathNode.CurveTo(96.79053f, 48.008583f, 100.15643f, 49.13055f, 102.93f, 51.2f),
                    PathNode.LineTo(130.67f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(224.83656f, 72.0f, 232.0f, 79.163445f, 232.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
