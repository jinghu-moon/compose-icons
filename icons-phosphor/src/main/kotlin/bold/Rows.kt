package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorBoldIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(36.954304f, 136.0f, 28.0f, 144.9543f, 28.0f, 156.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(219.0457f, 212.0f, 228.0f, 203.0457f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 156.0f),
                    PathNode.CurveTo(228.0f, 144.9543f, 219.0457f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.LineTo(204.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(36.954304f, 44.0f, 28.0f, 52.954304f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 100.0f),
                    PathNode.CurveTo(28.0f, 111.04569f, 36.954304f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(219.0457f, 120.0f, 228.0f, 111.04569f, 228.0f, 100.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 52.954304f, 219.0457f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.LineTo(52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
