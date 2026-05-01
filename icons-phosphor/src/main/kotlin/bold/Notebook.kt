package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorBoldIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 101.37258f, 113.37258f, 96.0f, 120.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(182.62741f, 96.0f, 188.0f, 101.37258f, 188.0f, 108.0f),
                    PathNode.CurveTo(188.0f, 114.62742f, 182.62741f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(113.37258f, 120.0f, 108.0f, 114.62742f, 108.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(113.37258f, 136.0f, 108.0f, 141.37259f, 108.0f, 148.0f),
                    PathNode.CurveTo(108.0f, 154.62741f, 113.37258f, 160.0f, 120.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(182.62741f, 160.0f, 188.0f, 154.62741f, 188.0f, 148.0f),
                    PathNode.CurveTo(188.0f, 141.37259f, 182.62741f, 136.0f, 176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
