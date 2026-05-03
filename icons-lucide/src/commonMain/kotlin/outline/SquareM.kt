package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareM: ImageVector
    get() {
        if (_squareM != null) return _squareM!!
        _squareM = lucideOutlineIcon(
            name = "SquareM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 8.5f),
                    PathNode.CurveTo(8.0f, 8.284786f, 8.137716f, 8.093716f, 8.341887f, 8.025659f),
                    PathNode.CurveTo(8.546057f, 7.957602f, 8.770871f, 8.027828f, 8.9f, 8.2f),
                    PathNode.LineTo(11.6f, 11.799f),
                    PathNode.CurveTo(11.694427f, 11.924903f, 11.842622f, 11.999f, 12.0f, 11.999f),
                    PathNode.CurveTo(12.157378f, 11.999f, 12.305573f, 11.924903f, 12.4f, 11.799f),
                    PathNode.LineTo(15.1f, 8.199001f),
                    PathNode.CurveTo(15.229129f, 8.026828f, 15.453943f, 7.956601f, 15.658113f, 8.024658f),
                    PathNode.CurveTo(15.862285f, 8.092716f, 16.0f, 8.283785f, 16.0f, 8.499f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
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
        }
        return _squareM!!
    }

private var _squareM: ImageVector? = null
