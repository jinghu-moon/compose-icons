package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) return _cloudUpload!!
        _cloudUpload = lucideOutlineIcon(
            name = "CloudUpload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(4.0f, 14.899f),
                    PathNode.CurveTo(1.964943f, 12.819778f, 1.428153f, 9.698528f, 2.651668f, 7.058901f),
                    PathNode.CurveTo(3.875182f, 4.419273f, 6.603894f, 2.811641f, 9.505769f, 3.020776f),
                    PathNode.CurveTo(12.407645f, 3.22991f, 14.877634f, 5.212208f, 15.71f, 8.0f),
                    PathNode.LineTo(17.5f, 8.0f),
                    PathNode.CurveTo(19.482355f, 7.999774f, 21.231361f, 9.296799f, 21.80677f, 11.193807f),
                    PathNode.CurveTo(22.38218f, 13.090815f, 21.64844f, 15.140917f, 20.0f, 16.242f)
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(16.0f, 17.0f)
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
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
