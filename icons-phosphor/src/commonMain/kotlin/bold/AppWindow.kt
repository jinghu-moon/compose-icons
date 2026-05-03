package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorBoldIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 92.0f),
                    PathNode.CurveTo(60.0f, 83.163445f, 67.163445f, 76.0f, 76.0f, 76.0f),
                    PathNode.CurveTo(84.836555f, 76.0f, 92.0f, 83.163445f, 92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 100.836555f, 84.836555f, 108.0f, 76.0f, 108.0f),
                    PathNode.CurveTo(67.163445f, 108.0f, 60.0f, 100.836555f, 60.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 92.0f),
                    PathNode.CurveTo(108.0f, 83.163445f, 115.163445f, 76.0f, 124.0f, 76.0f),
                    PathNode.CurveTo(132.83656f, 76.0f, 140.0f, 83.163445f, 140.0f, 92.0f),
                    PathNode.CurveTo(140.0f, 100.836555f, 132.83656f, 108.0f, 124.0f, 108.0f),
                    PathNode.CurveTo(115.163445f, 108.0f, 108.0f, 100.836555f, 108.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
