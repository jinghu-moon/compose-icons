package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ExcludeSquare: ImageVector
    get() {
        if (_excludeSquare != null) return _excludeSquare!!
        _excludeSquare = phosphorBoldIcon(
            name = "ExcludeSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 89.37258f, 222.62741f, 84.0f, 216.0f, 84.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 33.37258f, 166.62741f, 28.0f, 160.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 166.62741f, 33.37258f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 222.62741f, 89.37258f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.0f, 204.0f),
                    PathNode.LineTo(133.0f, 172.0f),
                    PathNode.LineTo(155.0f, 172.0f),
                    PathNode.LineTo(187.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 69.0f),
                    PathNode.LineTo(84.0f, 101.0f),
                    PathNode.LineTo(84.0f, 123.0f),
                    PathNode.LineTo(52.0f, 91.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.0f, 52.0f),
                    PathNode.LineTo(123.0f, 84.0f),
                    PathNode.LineTo(101.0f, 84.0f),
                    PathNode.LineTo(69.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 148.0f),
                    PathNode.LineTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 155.0f),
                    PathNode.LineTo(172.0f, 133.0f),
                    PathNode.LineTo(204.0f, 165.0f),
                    PathNode.LineTo(204.0f, 187.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 131.0f),
                    PathNode.LineTo(181.0f, 108.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 75.0f),
                    PathNode.LineTo(125.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 125.0f),
                    PathNode.LineTo(75.0f, 148.0f),
                    PathNode.LineTo(52.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 181.0f),
                    PathNode.LineTo(131.0f, 204.0f),
                    PathNode.LineTo(108.0f, 204.0f),
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
        return _excludeSquare!!
    }

private var _excludeSquare: ImageVector? = null
