package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = lucideOutlineIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.8f, 19.6f),
                    PathNode.CurveTo(13.496147f, 20.12211f, 14.449999f, 20.13418f, 15.159133f, 19.62985f),
                    PathNode.CurveTo(15.868268f, 19.12552f, 16.169926f, 18.220545f, 15.905216f, 17.3916f),
                    PathNode.CurveTo(15.640507f, 16.562656f, 14.870184f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(2.0f, 16.0f)
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
                    PathNode.MoveTo(17.5f, 8.0f),
                    PathNode.CurveTo(18.20539f, 7.059479f, 19.47079f, 6.737519f, 20.539906f, 7.226546f),
                    PathNode.CurveTo(21.609022f, 7.715572f, 22.192957f, 8.88344f, 21.942707f, 10.032148f),
                    PathNode.CurveTo(21.69246f, 11.180857f, 20.675652f, 12.0f, 19.5f, 12.0f),
                    PathNode.LineTo(2.0f, 12.0f)
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
                    PathNode.MoveTo(9.8f, 4.4f),
                    PathNode.CurveTo(10.496147f, 3.87789f, 11.449999f, 3.865821f, 12.159133f, 4.37015f),
                    PathNode.CurveTo(12.868268f, 4.87448f, 13.169927f, 5.779455f, 12.905216f, 6.6084f),
                    PathNode.CurveTo(12.640507f, 7.437345f, 11.870184f, 8.0f, 11.0f, 8.0f),
                    PathNode.LineTo(2.0f, 8.0f)
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
        return _wind!!
    }

private var _wind: ImageVector? = null
