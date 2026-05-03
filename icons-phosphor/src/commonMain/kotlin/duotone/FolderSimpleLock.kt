package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorDuotoneIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(152.0f, 168.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(147.58173f, 216.0f, 144.0f, 212.41827f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 163.58173f, 147.58173f, 160.0f, 152.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(160.0f, 140.53603f, 172.53603f, 128.0f, 188.0f, 128.0f),
                    PathNode.CurveTo(203.46397f, 128.0f, 216.0f, 140.53603f, 216.0f, 156.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(228.41827f, 160.0f, 232.0f, 163.58173f, 232.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 156.0f),
                    PathNode.CurveTo(200.0f, 149.37259f, 194.62741f, 144.0f, 188.0f, 144.0f),
                    PathNode.CurveTo(181.37259f, 144.0f, 176.0f, 149.37259f, 176.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
