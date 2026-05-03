package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorBoldIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(227.0457f, 212.0f, 236.0f, 203.0457f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 52.954304f, 227.0457f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 140.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.LineTo(148.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 164.0f),
                    PathNode.LineTo(148.0f, 188.0f),
                    PathNode.LineTo(108.0f, 188.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(44.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 92.0f),
                    PathNode.LineTo(108.0f, 68.0f),
                    PathNode.LineTo(148.0f, 68.0f),
                    PathNode.LineTo(148.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(212.0f, 140.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 92.0f),
                    PathNode.LineTo(172.0f, 92.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(212.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 68.0f),
                    PathNode.LineTo(84.0f, 92.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 164.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 188.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 188.0f),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
