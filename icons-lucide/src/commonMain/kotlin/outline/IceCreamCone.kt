package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamCone: ImageVector
    get() {
        if (_iceCreamCone != null) return _iceCreamCone!!
        _iceCreamCone = lucideOutlineIcon(
            name = "IceCreamCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(11.08f, 21.35f),
                    PathNode.CurveTo(11.237088f, 21.718754f, 11.599181f, 21.958082f, 12.0f, 21.958082f),
                    PathNode.CurveTo(12.400819f, 21.958082f, 12.762912f, 21.718754f, 12.92f, 21.35f),
                    PathNode.LineTo(17.0f, 11.0f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 4.238577f, 14.761424f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(9.238576f, 2.0f, 7.0f, 4.238577f, 7.0f, 7.0f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.CurveTo(18.10457f, 7.0f, 19.0f, 7.895431f, 19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 10.104569f, 18.10457f, 11.0f, 17.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(5.895431f, 11.0f, 5.0f, 10.104569f, 5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 7.895431f, 5.895431f, 7.0f, 7.0f, 7.0f)
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
        return _iceCreamCone!!
    }

private var _iceCreamCone: ImageVector? = null
