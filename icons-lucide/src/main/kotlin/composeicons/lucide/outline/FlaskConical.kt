package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlaskConical: ImageVector
    get() {
        if (_flaskConical != null) return _flaskConical!!
        _flaskConical = lucideOutlineIcon(
            name = "FlaskConical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.999858f, 8.335484f, 14.08411f, 8.665613f, 14.245f, 8.96f),
                    PathNode.LineTo(19.755f, 19.04f),
                    PathNode.CurveTo(20.094084f, 19.659723f, 20.081087f, 20.412357f, 19.72081f, 21.020002f),
                    PathNode.CurveTo(19.360533f, 21.62765f, 18.706423f, 22.000164f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(5.293577f, 22.000164f, 4.639467f, 21.62765f, 4.27919f, 21.020002f),
                    PathNode.CurveTo(3.918913f, 20.412357f, 3.905917f, 19.659723f, 4.245f, 19.04f),
                    PathNode.LineTo(9.755f, 8.96f),
                    PathNode.CurveTo(9.91589f, 8.665613f, 10.000142f, 8.335484f, 10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 2.0f)
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
                    PathNode.MoveTo(6.453f, 15.0f),
                    PathNode.LineTo(17.547f, 15.0f)
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
                    PathNode.MoveTo(8.5f, 2.0f),
                    PathNode.LineTo(15.5f, 2.0f)
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
        return _flaskConical!!
    }

private var _flaskConical: ImageVector? = null
