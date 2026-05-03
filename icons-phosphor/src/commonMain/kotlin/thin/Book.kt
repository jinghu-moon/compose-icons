package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorThinIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(56.53603f, 28.0f, 44.0f, 40.53603f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 224.0f),
                    PathNode.CurveTo(44.0f, 226.20914f, 45.79086f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(194.20914f, 228.0f, 196.0f, 226.20914f, 196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 221.79086f, 194.20914f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(52.0f, 220.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 204.9543f, 60.954304f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(210.20914f, 196.0f, 212.0f, 194.20914f, 212.0f, 192.0f),
                    PathNode.LineTo(212.0f, 32.0f),
                    PathNode.CurveTo(212.0f, 29.790861f, 210.20914f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.CurveTo(64.47118f, 187.99739f, 57.259933f, 191.03333f, 52.0f, 196.42f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 44.954304f, 60.954304f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(204.0f, 36.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _book!!
    }

private var _book: ImageVector? = null
