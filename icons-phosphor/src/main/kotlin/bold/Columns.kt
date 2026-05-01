package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorBoldIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(52.954304f, 28.0f, 44.0f, 36.954304f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 219.0457f, 52.954304f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(100.0f, 228.0f),
                    PathNode.CurveTo(111.04569f, 228.0f, 120.0f, 219.0457f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 36.954304f, 111.04569f, 28.0f, 100.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.LineTo(156.0f, 28.0f),
                    PathNode.CurveTo(144.9543f, 28.0f, 136.0f, 36.954304f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 219.0457f, 144.9543f, 228.0f, 156.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(203.0457f, 228.0f, 212.0f, 219.0457f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 36.954304f, 203.0457f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 204.0f),
                    PathNode.LineTo(160.0f, 204.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
