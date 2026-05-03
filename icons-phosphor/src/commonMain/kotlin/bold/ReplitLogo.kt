package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorBoldIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.LineTo(156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 28.954306f, 147.0457f, 20.0f, 136.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(60.954304f, 20.0f, 52.0f, 28.954306f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 99.04569f, 60.954304f, 108.0f, 72.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 148.0f),
                    PathNode.LineTo(72.0f, 148.0f),
                    PathNode.CurveTo(60.954304f, 148.0f, 52.0f, 156.9543f, 52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 227.0457f, 60.954304f, 236.0f, 72.0f, 236.0f),
                    PathNode.LineTo(136.0f, 236.0f),
                    PathNode.CurveTo(147.0457f, 236.0f, 156.0f, 227.0457f, 156.0f, 216.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(227.0457f, 172.0f, 236.0f, 163.0457f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 92.95431f, 227.0457f, 84.0f, 216.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(212.0f, 108.0f),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
