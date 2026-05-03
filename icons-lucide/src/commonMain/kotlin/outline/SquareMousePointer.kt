package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareMousePointer: ImageVector
    get() {
        if (_squareMousePointer != null) return _squareMousePointer!!
        _squareMousePointer = lucideOutlineIcon(
            name = "SquareMousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.034f, 12.681f),
                    PathNode.CurveTo(11.960317f, 12.496148f, 12.003753f, 12.285176f, 12.144464f, 12.144464f),
                    PathNode.CurveTo(12.285176f, 12.003753f, 12.496148f, 11.960317f, 12.681f, 12.034f),
                    PathNode.LineTo(21.681f, 15.534f),
                    PathNode.CurveTo(21.878756f, 15.611273f, 22.006145f, 15.80501f, 21.998718f, 16.017197f),
                    PathNode.CurveTo(21.991293f, 16.229382f, 21.850674f, 16.41374f, 21.648f, 16.477f),
                    PathNode.LineTo(18.204f, 17.545f),
                    PathNode.CurveTo(17.888527f, 17.642538f, 17.641537f, 17.889524f, 17.544f, 18.205f),
                    PathNode.LineTo(16.477f, 21.648f),
                    PathNode.CurveTo(16.41374f, 21.850674f, 16.229382f, 21.991293f, 16.017197f, 21.998718f),
                    PathNode.CurveTo(15.80501f, 22.006145f, 15.611273f, 21.878756f, 15.534f, 21.681f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _squareMousePointer!!
    }

private var _squareMousePointer: ImageVector? = null
