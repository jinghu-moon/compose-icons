package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) return _folderSimple!!
        _folderSimple = phosphorDuotoneIcon(
            name = "FolderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 200.89f),
                    PathNode.CurveTo(224.0f, 204.81674f, 220.81674f, 208.0f, 216.89f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(93.33f, 56.0f),
                    PathNode.CurveTo(95.06096f, 56.0f, 96.74523f, 56.561424f, 98.13f, 57.6f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(220.41827f, 80.0f, 224.0f, 83.58172f, 224.0f, 88.0f),
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
                    PathNode.LineTo(130.67f, 72.0f),
                    PathNode.LineTo(102.93f, 51.2f),
                    PathNode.CurveTo(100.15643f, 49.13055f, 96.79053f, 48.008583f, 93.33f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.89f, 216.0f),
                    PathNode.CurveTo(225.23045f, 215.98898f, 231.98898f, 209.23045f, 232.0f, 200.89f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(93.33f, 64.0f),
                    PathNode.LineTo(123.2f, 86.4f),
                    PathNode.CurveTo(124.58477f, 87.438576f, 126.269035f, 88.0f, 128.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
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
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
