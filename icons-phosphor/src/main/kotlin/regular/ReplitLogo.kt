package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorRegularIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 31.163445f, 144.83656f, 24.0f, 136.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 96.836555f, 63.163445f, 104.0f, 72.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.CurveTo(63.163445f, 152.0f, 56.0f, 159.16344f, 56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 224.83656f, 63.163445f, 232.0f, 72.0f, 232.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(144.83656f, 232.0f, 152.0f, 224.83656f, 152.0f, 216.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(224.83656f, 168.0f, 232.0f, 160.83656f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 95.163445f, 224.83656f, 88.0f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
