package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorBoldIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(80.0f, 204.0f),
                    PathNode.CurveTo(86.62742f, 204.0f, 92.0f, 209.37259f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 222.62741f, 86.62742f, 228.0f, 80.0f, 228.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(33.37258f, 228.0f, 28.0f, 222.62741f, 28.0f, 216.0f),
                    PathNode.LineTo(28.0f, 40.0f),
                    PathNode.CurveTo(28.0f, 33.37258f, 33.37258f, 28.0f, 40.0f, 28.0f),
                    PathNode.LineTo(80.0f, 28.0f),
                    PathNode.CurveTo(86.62742f, 28.0f, 92.0f, 33.37258f, 92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 46.62742f, 86.62742f, 52.0f, 80.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(176.0f, 28.0f),
                    PathNode.CurveTo(169.37259f, 28.0f, 164.0f, 33.37258f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 46.62742f, 169.37259f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(169.37259f, 204.0f, 164.0f, 209.37259f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 222.62741f, 169.37259f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
