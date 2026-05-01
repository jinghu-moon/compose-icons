package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorBoldIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(148.9543f, 28.0f, 140.0f, 36.954304f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 219.0457f, 148.9543f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(211.0457f, 228.0f, 220.0f, 219.0457f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 36.954304f, 211.0457f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(107.04569f, 228.0f, 116.0f, 219.0457f, 116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 36.954304f, 107.04569f, 28.0f, 96.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(92.0f, 52.0f),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
