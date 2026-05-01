package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Road: ImageVector
    get() {
        if (_road != null) return _road!!
        _road = lucideOutlineIcon(
            name = "Road",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.0f),
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
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(2.077f, 18.449f),
                    PathNode.CurveTo(1.904004f, 19.052635f, 2.02455f, 19.702475f, 2.402537f, 20.203903f),
                    PathNode.CurveTo(2.780524f, 20.70533f, 3.372064f, 21.000124f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.627878f, 21.00035f, 21.219477f, 20.70582f, 21.597649f, 20.204603f),
                    PathNode.CurveTo(21.97582f, 19.703386f, 22.096666f, 19.05367f, 21.924f, 18.45f),
                    PathNode.LineTo(17.924f, 4.45f),
                    PathNode.CurveTo(17.67838f, 3.591279f, 16.893158f, 2.999504f, 16.0f, 3.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(7.106843f, 2.999504f, 6.321618f, 3.591279f, 6.076f, 4.45f),
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
        return _road!!
    }

private var _road: ImageVector? = null
