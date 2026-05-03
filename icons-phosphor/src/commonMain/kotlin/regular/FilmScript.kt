package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorRegularIcon(
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
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 76.0f),
                    PathNode.CurveTo(96.0f, 82.62742f, 90.62742f, 88.0f, 84.0f, 88.0f),
                    PathNode.CurveTo(77.37258f, 88.0f, 72.0f, 82.62742f, 72.0f, 76.0f),
                    PathNode.CurveTo(72.0f, 69.37258f, 77.37258f, 64.0f, 84.0f, 64.0f),
                    PathNode.CurveTo(90.62742f, 64.0f, 96.0f, 69.37258f, 96.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 180.0f),
                    PathNode.CurveTo(96.0f, 186.62741f, 90.62742f, 192.0f, 84.0f, 192.0f),
                    PathNode.CurveTo(77.37258f, 192.0f, 72.0f, 186.62741f, 72.0f, 180.0f),
                    PathNode.CurveTo(72.0f, 173.37259f, 77.37258f, 168.0f, 84.0f, 168.0f),
                    PathNode.CurveTo(90.62742f, 168.0f, 96.0f, 173.37259f, 96.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 134.62741f, 90.62742f, 140.0f, 84.0f, 140.0f),
                    PathNode.CurveTo(77.37258f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 77.37258f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(90.62742f, 116.0f, 96.0f, 121.37258f, 96.0f, 128.0f),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
