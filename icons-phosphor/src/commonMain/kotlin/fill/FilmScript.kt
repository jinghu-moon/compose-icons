package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorFillIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 188.0f),
                    PathNode.CurveTo(69.37258f, 188.0f, 64.0f, 182.62741f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 169.37259f, 69.37258f, 164.0f, 76.0f, 164.0f),
                    PathNode.CurveTo(82.62742f, 164.0f, 88.0f, 169.37259f, 88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 182.62741f, 82.62742f, 188.0f, 76.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 140.0f),
                    PathNode.CurveTo(69.37258f, 140.0f, 64.0f, 134.62741f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 121.37258f, 69.37258f, 116.0f, 76.0f, 116.0f),
                    PathNode.CurveTo(82.62742f, 116.0f, 88.0f, 121.37258f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 134.62741f, 82.62742f, 140.0f, 76.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 92.0f),
                    PathNode.CurveTo(69.37258f, 92.0f, 64.0f, 86.62742f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 73.37258f, 69.37258f, 68.0f, 76.0f, 68.0f),
                    PathNode.CurveTo(82.62742f, 68.0f, 88.0f, 73.37258f, 88.0f, 80.0f),
                    PathNode.CurveTo(88.0f, 86.62742f, 82.62742f, 92.0f, 76.0f, 92.0f),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
