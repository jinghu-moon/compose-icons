package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorBoldIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 24.536028f, 167.46397f, 12.0f, 152.0f, 12.0f),
                    PathNode.LineTo(104.0f, 12.0f),
                    PathNode.CurveTo(88.536026f, 12.0f, 76.0f, 24.536028f, 76.0f, 40.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(28.954306f, 48.0f, 20.0f, 56.954304f, 20.0f, 68.0f),
                    PathNode.LineTo(20.0f, 196.0f),
                    PathNode.CurveTo(20.0f, 207.0457f, 28.954306f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(227.0457f, 216.0f, 236.0f, 207.0457f, 236.0f, 196.0f),
                    PathNode.LineTo(236.0f, 68.0f),
                    PathNode.CurveTo(236.0f, 56.954304f, 227.0457f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 37.79086f, 101.79086f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(154.20914f, 36.0f, 156.0f, 37.79086f, 156.0f, 40.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 72.0f),
                    PathNode.LineTo(156.0f, 192.0f),
                    PathNode.LineTo(100.0f, 192.0f),
                    PathNode.LineTo(100.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 72.0f),
                    PathNode.LineTo(76.0f, 72.0f),
                    PathNode.LineTo(76.0f, 192.0f),
                    PathNode.LineTo(44.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.LineTo(180.0f, 192.0f),
                    PathNode.LineTo(180.0f, 72.0f),
                    PathNode.LineTo(212.0f, 72.0f),
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
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
