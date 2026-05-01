package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorBoldIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 28.954306f, 211.0457f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 71.163445f, 83.163445f, 64.0f, 92.0f, 64.0f),
                    PathNode.CurveTo(100.836555f, 64.0f, 108.0f, 71.163445f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 88.836555f, 100.836555f, 96.0f, 92.0f, 96.0f),
                    PathNode.CurveTo(83.163445f, 96.0f, 76.0f, 88.836555f, 76.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 176.0f),
                    PathNode.CurveTo(76.0f, 167.16344f, 83.163445f, 160.0f, 92.0f, 160.0f),
                    PathNode.CurveTo(100.836555f, 160.0f, 108.0f, 167.16344f, 108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 184.83656f, 100.836555f, 192.0f, 92.0f, 192.0f),
                    PathNode.CurveTo(83.163445f, 192.0f, 76.0f, 184.83656f, 76.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 119.163445f, 83.163445f, 112.0f, 92.0f, 112.0f),
                    PathNode.CurveTo(100.836555f, 112.0f, 108.0f, 119.163445f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 136.83656f, 100.836555f, 144.0f, 92.0f, 144.0f),
                    PathNode.CurveTo(83.163445f, 144.0f, 76.0f, 136.83656f, 76.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
