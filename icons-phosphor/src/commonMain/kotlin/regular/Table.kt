package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorRegularIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 51.581722f, 228.41827f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 192.0f),
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
        return _table!!
    }

private var _table: ImageVector? = null
