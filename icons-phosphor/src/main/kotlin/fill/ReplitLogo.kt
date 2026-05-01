package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorFillIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 224.83656f, 136.83656f, 232.0f, 128.0f, 232.0f),
                    PathNode.LineTo(72.0f, 232.0f),
                    PathNode.CurveTo(63.163445f, 232.0f, 56.0f, 224.83656f, 56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 167.16344f, 63.163445f, 160.0f, 72.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 88.836555f, 63.163445f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(144.0f, 31.163445f, 136.83656f, 24.0f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(224.83656f, 160.0f, 232.0f, 152.83656f, 232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 103.163445f, 224.83656f, 96.0f, 216.0f, 96.0f),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
