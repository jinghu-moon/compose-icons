package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresUnite: ImageVector
    get() {
        if (_squaresUnite != null) return _squaresUnite!!
        _squaresUnite = lucideOutlineIcon(
            name = "SquaresUnite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.CurveTo(2.895431f, 16.0f, 2.0f, 15.104569f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(16.0f, 7.552285f, 16.447716f, 8.0f, 17.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(21.10457f, 8.0f, 22.0f, 8.895431f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.895431f, 22.0f, 8.0f, 21.10457f, 8.0f, 20.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 16.447716f, 7.552285f, 16.0f, 7.0f, 16.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _squaresUnite!!
    }

private var _squaresUnite: ImageVector? = null
