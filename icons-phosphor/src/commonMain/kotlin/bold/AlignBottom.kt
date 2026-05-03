package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorBoldIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 222.62741f, 222.62741f, 228.0f, 216.0f, 228.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(33.37258f, 228.0f, 28.0f, 222.62741f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 209.37259f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 209.37259f, 228.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 68.95431f, 144.9543f, 60.0f, 156.0f, 60.0f),
                    PathNode.LineTo(192.0f, 60.0f),
                    PathNode.CurveTo(203.0457f, 60.0f, 212.0f, 68.95431f, 212.0f, 80.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 179.0457f, 203.0457f, 188.0f, 192.0f, 188.0f),
                    PathNode.LineTo(156.0f, 188.0f),
                    PathNode.CurveTo(144.9543f, 188.0f, 136.0f, 179.0457f, 136.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 164.0f),
                    PathNode.LineTo(188.0f, 164.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 28.954306f, 52.954304f, 20.0f, 64.0f, 20.0f),
                    PathNode.LineTo(100.0f, 20.0f),
                    PathNode.CurveTo(111.04569f, 20.0f, 120.0f, 28.954306f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(120.0f, 179.0457f, 111.04569f, 188.0f, 100.0f, 188.0f),
                    PathNode.LineTo(64.0f, 188.0f),
                    PathNode.CurveTo(52.954304f, 188.0f, 44.0f, 179.0457f, 44.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 164.0f),
                    PathNode.LineTo(96.0f, 164.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.LineTo(68.0f, 44.0f),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
