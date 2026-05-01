package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorBoldIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.LineTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 222.62741f, 222.62741f, 228.0f, 216.0f, 228.0f),
                    PathNode.CurveTo(209.37259f, 228.0f, 204.0f, 222.62741f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 209.37259f, 28.0f, 216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 100.0f),
                    PathNode.CurveTo(188.0f, 111.04569f, 179.0457f, 120.0f, 168.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(68.95431f, 120.0f, 60.0f, 111.04569f, 60.0f, 100.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 52.954304f, 68.95431f, 44.0f, 80.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(179.0457f, 44.0f, 188.0f, 52.954304f, 188.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 68.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(84.0f, 96.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 156.0f),
                    PathNode.LineTo(188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 203.0457f, 179.0457f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(28.954306f, 212.0f, 20.0f, 203.0457f, 20.0f, 192.0f),
                    PathNode.LineTo(20.0f, 156.0f),
                    PathNode.CurveTo(20.0f, 144.9543f, 28.954306f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(179.0457f, 136.0f, 188.0f, 144.9543f, 188.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 160.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(164.0f, 188.0f),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
