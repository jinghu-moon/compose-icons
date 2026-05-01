package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorBoldIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 32.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(64.95431f, 32.0f, 56.0f, 40.954304f, 56.0f, 52.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(24.954306f, 72.0f, 16.0f, 80.95431f, 16.0f, 92.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(16.0f, 215.0457f, 24.954306f, 224.0f, 36.0f, 224.0f),
                    PathNode.LineTo(180.0f, 224.0f),
                    PathNode.CurveTo(191.0457f, 224.0f, 200.0f, 215.0457f, 200.0f, 204.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(231.0457f, 184.0f, 240.0f, 175.0457f, 240.0f, 164.0f),
                    PathNode.LineTo(240.0f, 52.0f),
                    PathNode.CurveTo(240.0f, 40.954304f, 231.0457f, 32.0f, 220.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 96.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(200.0f, 80.95431f, 191.0457f, 72.0f, 180.0f, 72.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
