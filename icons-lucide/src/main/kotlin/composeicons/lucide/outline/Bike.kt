package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = lucideOutlineIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 17.5f),
                    PathNode.CurveTo(22.0f, 19.432997f, 20.432997f, 21.0f, 18.5f, 21.0f),
                    PathNode.CurveTo(16.567003f, 21.0f, 15.0f, 19.432997f, 15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 15.567003f, 16.567003f, 14.0f, 18.5f, 14.0f),
                    PathNode.CurveTo(20.432997f, 14.0f, 22.0f, 15.567003f, 22.0f, 17.5f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 17.5f),
                    PathNode.CurveTo(9.0f, 19.432997f, 7.432997f, 21.0f, 5.5f, 21.0f),
                    PathNode.CurveTo(3.567004f, 21.0f, 2.0f, 19.432997f, 2.0f, 17.5f),
                    PathNode.CurveTo(2.0f, 15.567003f, 3.567004f, 14.0f, 5.5f, 14.0f),
                    PathNode.CurveTo(7.432997f, 14.0f, 9.0f, 15.567003f, 9.0f, 17.5f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 5.552285f, 15.552285f, 6.0f, 15.0f, 6.0f),
                    PathNode.CurveTo(14.447715f, 6.0f, 14.0f, 5.552285f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 4.447716f, 14.447715f, 4.0f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.552285f, 4.0f, 16.0f, 4.447716f, 16.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.5f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f)
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
        return _bike!!
    }

private var _bike: ImageVector? = null
