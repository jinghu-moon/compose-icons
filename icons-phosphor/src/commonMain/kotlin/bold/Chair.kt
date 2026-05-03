package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorBoldIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.LineTo(180.0f, 128.0f),
                    PathNode.LineTo(180.0f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(203.0457f, 108.0f, 212.0f, 99.04569f, 212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 28.954306f, 203.0457f, 20.0f, 192.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(52.954304f, 20.0f, 44.0f, 28.954306f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 99.04569f, 52.954304f, 108.0f, 64.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(76.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(36.954304f, 128.0f, 28.0f, 136.9543f, 28.0f, 148.0f),
                    PathNode.LineTo(28.0f, 172.0f),
                    PathNode.CurveTo(28.0f, 183.0457f, 36.954304f, 192.0f, 48.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 230.62741f, 61.37258f, 236.0f, 68.0f, 236.0f),
                    PathNode.CurveTo(74.62742f, 236.0f, 80.0f, 230.62741f, 80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(176.0f, 230.62741f, 181.37259f, 236.0f, 188.0f, 236.0f),
                    PathNode.CurveTo(194.62741f, 236.0f, 200.0f, 230.62741f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(219.0457f, 192.0f, 228.0f, 183.0457f, 228.0f, 172.0f),
                    PathNode.LineTo(228.0f, 148.0f),
                    PathNode.CurveTo(228.0f, 136.9543f, 219.0457f, 128.0f, 208.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.LineTo(68.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 108.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(156.0f, 128.0f),
                    PathNode.LineTo(100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 168.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 152.0f),
                    PathNode.LineTo(204.0f, 152.0f),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
