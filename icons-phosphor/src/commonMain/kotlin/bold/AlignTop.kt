package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorBoldIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 46.62742f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 46.62742f, 28.0f, 40.0f),
                    PathNode.CurveTo(28.0f, 33.37258f, 33.37258f, 28.0f, 40.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 187.0457f, 203.0457f, 196.0f, 192.0f, 196.0f),
                    PathNode.LineTo(156.0f, 196.0f),
                    PathNode.CurveTo(144.9543f, 196.0f, 136.0f, 187.0457f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 76.95431f, 144.9543f, 68.0f, 156.0f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(203.0457f, 68.0f, 212.0f, 76.95431f, 212.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.LineTo(188.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 227.0457f, 111.04569f, 236.0f, 100.0f, 236.0f),
                    PathNode.LineTo(64.0f, 236.0f),
                    PathNode.CurveTo(52.954304f, 236.0f, 44.0f, 227.0457f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 76.95431f, 52.954304f, 68.0f, 64.0f, 68.0f),
                    PathNode.LineTo(100.0f, 68.0f),
                    PathNode.CurveTo(111.04569f, 68.0f, 120.0f, 76.95431f, 120.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 92.0f),
                    PathNode.LineTo(68.0f, 92.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
