package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Delete: ImageVector
    get() {
        if (_delete != null) return _delete!!
        _delete = lucideOutlineIcon(
            name = "Delete",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.CurveTo(9.503081f, 5.000028f, 9.023969f, 5.185043f, 8.656f, 5.519f),
                    PathNode.LineTo(2.328f, 11.259f),
                    PathNode.CurveTo(2.119153f, 11.448544f, 2.000056f, 11.717465f, 2.000056f, 11.9995f),
                    PathNode.CurveTo(2.000056f, 12.281535f, 2.119153f, 12.550457f, 2.328f, 12.74f),
                    PathNode.LineTo(8.656f, 18.481f),
                    PathNode.CurveTo(9.023969f, 18.814957f, 9.503081f, 18.999971f, 10.0f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(21.10457f, 19.0f, 22.0f, 18.10457f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.895431f, 21.10457f, 5.0f, 20.0f, 5.0f),
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(18.0f, 15.0f)
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
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
        return _delete!!
    }

private var _delete: ImageVector? = null
