package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pipette: ImageVector
    get() {
        if (_pipette != null) return _pipette!!
        _pipette = lucideOutlineIcon(
            name = "Pipette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(3.586f, 17.414f),
                    PathNode.CurveTo(3.210901f, 17.788986f, 3.000113f, 18.297611f, 3.0f, 18.828f),
                    PathNode.LineTo(3.0f, 20.172f),
                    PathNode.CurveTo(2.999887f, 20.702389f, 2.789099f, 21.211014f, 2.414f, 21.586f),
                    PathNode.CurveTo(2.788986f, 21.210901f, 3.29761f, 21.000113f, 3.828f, 21.0f),
                    PathNode.LineTo(5.172f, 21.0f),
                    PathNode.CurveTo(5.70239f, 20.999887f, 6.211015f, 20.789099f, 6.586f, 20.414f),
                    PathNode.LineTo(15.0f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.LineTo(18.4f, 9.4f),
                    PathNode.CurveTo(19.228428f, 10.228427f, 19.228428f, 11.571573f, 18.4f, 12.4f),
                    PathNode.CurveTo(17.571573f, 13.228427f, 16.228428f, 13.228427f, 15.4f, 12.4f),
                    PathNode.LineTo(11.6f, 8.6f),
                    PathNode.CurveTo(10.771573f, 7.771573f, 10.771573f, 6.428427f, 11.6f, 5.6f),
                    PathNode.CurveTo(12.428427f, 4.771573f, 13.771573f, 4.771573f, 14.6f, 5.6f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(18.4f, 2.6f),
                    PathNode.CurveTo(19.228428f, 1.771573f, 20.571573f, 1.771573f, 21.4f, 2.6f),
                    PathNode.CurveTo(22.228428f, 3.428427f, 22.228428f, 4.771573f, 21.4f, 5.6f),
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
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.LineTo(2.414f, 21.586f)
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
        return _pipette!!
    }

private var _pipette: ImageVector? = null
