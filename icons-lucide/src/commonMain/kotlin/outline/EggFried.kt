package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = lucideOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.5f),
                    PathNode.CurveTo(15.0f, 14.432997f, 13.432997f, 16.0f, 11.5f, 16.0f),
                    PathNode.CurveTo(9.567003f, 16.0f, 8.0f, 14.432997f, 8.0f, 12.5f),
                    PathNode.CurveTo(8.0f, 10.567003f, 9.567003f, 9.0f, 11.5f, 9.0f),
                    PathNode.CurveTo(13.432997f, 9.0f, 15.0f, 10.567003f, 15.0f, 12.5f),
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
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 4.5f, 5.5f, 2.0f, 9.5f, 2.0f),
                    PathNode.CurveTo(14.5f, 2.0f, 14.33f, 5.0f, 17.0f, 7.0f),
                    PathNode.CurveTo(19.67f, 9.0f, 22.0f, 9.0f, 22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 17.5f, 19.5f, 19.5f, 15.0f, 19.5f),
                    PathNode.CurveTo(12.5f, 19.5f, 12.5f, 22.0f, 9.0f, 22.0f),
                    PathNode.CurveTo(5.5f, 22.0f, 2.0f, 20.0f, 2.0f, 16.5f),
                    PathNode.CurveTo(2.0f, 13.5f, 3.5f, 13.5f, 3.5f, 11.5f),
                    PathNode.CurveTo(3.5f, 10.0f, 3.0f, 9.0f, 3.0f, 8.0f),
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
