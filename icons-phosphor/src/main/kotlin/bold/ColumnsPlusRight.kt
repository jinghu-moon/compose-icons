package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorBoldIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(91.04569f, 228.0f, 100.0f, 219.0457f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 36.954304f, 91.04569f, 28.0f, 80.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 28.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.CurveTo(120.95431f, 28.0f, 112.0f, 36.954304f, 112.0f, 48.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 219.0457f, 120.95431f, 228.0f, 132.0f, 228.0f),
                    PathNode.LineTo(156.0f, 228.0f),
                    PathNode.CurveTo(167.0457f, 228.0f, 176.0f, 219.0457f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 36.954304f, 167.0457f, 28.0f, 156.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 204.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.LineTo(136.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 134.62741f, 246.62741f, 140.0f, 240.0f, 140.0f),
                    PathNode.LineTo(232.0f, 140.0f),
                    PathNode.LineTo(232.0f, 148.0f),
                    PathNode.CurveTo(232.0f, 154.62741f, 226.62741f, 160.0f, 220.0f, 160.0f),
                    PathNode.CurveTo(213.37259f, 160.0f, 208.0f, 154.62741f, 208.0f, 148.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.CurveTo(193.37259f, 140.0f, 188.0f, 134.62741f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 121.37258f, 193.37259f, 116.0f, 200.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.LineTo(208.0f, 108.0f),
                    PathNode.CurveTo(208.0f, 101.37258f, 213.37259f, 96.0f, 220.0f, 96.0f),
                    PathNode.CurveTo(226.62741f, 96.0f, 232.0f, 101.37258f, 232.0f, 108.0f),
                    PathNode.LineTo(232.0f, 116.0f),
                    PathNode.LineTo(240.0f, 116.0f),
                    PathNode.CurveTo(246.62741f, 116.0f, 252.0f, 121.37258f, 252.0f, 128.0f),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
