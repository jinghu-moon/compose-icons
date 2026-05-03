package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorBoldIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 128.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 204.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(92.0f, 128.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.CurveTo(188.0f, 109.37258f, 182.62741f, 104.0f, 176.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(73.37258f, 104.0f, 68.0f, 109.37258f, 68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 76.0f),
                    PathNode.CurveTo(100.0f, 69.37258f, 105.37258f, 64.0f, 112.0f, 64.0f),
                    PathNode.LineTo(144.0f, 64.0f),
                    PathNode.CurveTo(150.62741f, 64.0f, 156.0f, 69.37258f, 156.0f, 76.0f),
                    PathNode.CurveTo(156.0f, 82.62742f, 150.62741f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(105.37258f, 88.0f, 100.0f, 82.62742f, 100.0f, 76.0f),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
