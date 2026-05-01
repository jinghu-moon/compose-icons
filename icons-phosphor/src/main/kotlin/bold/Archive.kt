package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorBoldIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 88.0f),
                    PathNode.CurveTo(11.99806f, 97.50537f, 18.686674f, 105.69893f, 28.0f, 107.6f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(219.0457f, 212.0f, 228.0f, 203.0457f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 107.6f),
                    PathNode.CurveTo(237.31332f, 105.69893f, 244.00194f, 97.50537f, 244.0f, 88.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.LineTo(220.0f, 84.0f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 142.62741f, 158.62741f, 148.0f, 152.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.CurveTo(97.37258f, 148.0f, 92.0f, 142.62741f, 92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 129.37259f, 97.37258f, 124.0f, 104.0f, 124.0f),
                    PathNode.LineTo(152.0f, 124.0f),
                    PathNode.CurveTo(158.62741f, 124.0f, 164.0f, 129.37259f, 164.0f, 136.0f),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
