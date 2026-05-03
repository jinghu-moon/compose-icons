package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Weight: ImageVector
    get() {
        if (_weight != null) return _weight!!
        _weight = lucideOutlineIcon(
            name = "Weight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 6.656854f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 6.656854f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.343146f, 10.343145f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.656855f, 2.0f, 15.0f, 3.343146f, 15.0f, 5.0f),
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
                    PathNode.MoveTo(6.5f, 8.0f),
                    PathNode.CurveTo(5.611099f, 8.009223f, 4.834969f, 8.604053f, 4.595f, 9.46f),
                    PathNode.LineTo(2.1f, 18.5f),
                    PathNode.CurveTo(1.946838f, 19.092777f, 2.073623f, 19.723051f, 2.444082f, 20.210499f),
                    PathNode.CurveTo(2.814541f, 20.697943f, 3.387857f, 20.988855f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.625729f, 20.999775f, 21.21529f, 20.706709f, 21.593237f, 20.208017f),
                    PathNode.CurveTo(21.97118f, 19.709326f, 22.093946f, 19.062489f, 21.925f, 18.46f),
                    PathNode.LineTo(19.4f, 9.5f),
                    PathNode.CurveTo(19.173561f, 8.622877f, 18.385847f, 8.007478f, 17.48f, 8.0f),
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
        return _weight!!
    }

private var _weight: ImageVector? = null
