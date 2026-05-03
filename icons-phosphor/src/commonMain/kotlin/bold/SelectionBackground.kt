package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorBoldIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(36.954304f, 80.0f, 28.0f, 88.95431f, 28.0f, 100.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(156.0f, 228.0f),
                    PathNode.CurveTo(167.0457f, 228.0f, 176.0f, 219.0457f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 100.0f),
                    PathNode.CurveTo(176.0f, 88.95431f, 167.0457f, 80.0f, 156.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 33.37258f, 137.37259f, 28.0f, 144.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(166.62741f, 28.0f, 172.0f, 33.37258f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 46.62742f, 166.62741f, 52.0f, 160.0f, 52.0f),
                    PathNode.LineTo(144.0f, 52.0f),
                    PathNode.CurveTo(137.37259f, 52.0f, 132.0f, 46.62742f, 132.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 62.62742f, 222.62741f, 68.0f, 216.0f, 68.0f),
                    PathNode.CurveTo(209.37259f, 68.0f, 204.0f, 62.62742f, 204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(193.37259f, 52.0f, 188.0f, 46.62742f, 188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 33.37258f, 193.37259f, 28.0f, 200.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 118.62742f, 222.62741f, 124.0f, 216.0f, 124.0f),
                    PathNode.CurveTo(209.37259f, 124.0f, 204.0f, 118.62742f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 89.37258f, 209.37259f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(222.62741f, 84.0f, 228.0f, 89.37258f, 228.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 171.0457f, 219.0457f, 180.0f, 208.0f, 180.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(193.37259f, 180.0f, 188.0f, 174.62741f, 188.0f, 168.0f),
                    PathNode.CurveTo(188.0f, 161.37259f, 193.37259f, 156.0f, 200.0f, 156.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(204.0f, 152.0f),
                    PathNode.CurveTo(204.0f, 145.37259f, 209.37259f, 140.0f, 216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 145.37259f, 228.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 36.954304f, 84.95431f, 28.0f, 96.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(110.62742f, 28.0f, 116.0f, 33.37258f, 116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 46.62742f, 110.62742f, 52.0f, 104.0f, 52.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 62.62742f, 94.62742f, 68.0f, 88.0f, 68.0f),
                    PathNode.CurveTo(81.37258f, 68.0f, 76.0f, 62.62742f, 76.0f, 56.0f),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
