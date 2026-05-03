package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) return _dollarSign!!
        _dollarSign = lucideOutlineIcon(
            name = "DollarSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(9.5f, 5.0f),
                    PathNode.CurveTo(7.567004f, 5.0f, 6.0f, 6.567004f, 6.0f, 8.5f),
                    PathNode.CurveTo(6.0f, 10.432997f, 7.567004f, 12.0f, 9.5f, 12.0f),
                    PathNode.LineTo(14.5f, 12.0f),
                    PathNode.CurveTo(16.432997f, 12.0f, 18.0f, 13.567003f, 18.0f, 15.5f),
                    PathNode.CurveTo(18.0f, 17.432997f, 16.432997f, 19.0f, 14.5f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f)
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
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
