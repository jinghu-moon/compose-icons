package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Container: ImageVector
    get() {
        if (_container != null) return _container!!
        _container = lucideOutlineIcon(
            name = "Container",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 7.7f),
                    PathNode.CurveTo(22.0f, 7.1f, 21.6f, 6.5f, 21.2f, 6.2f),
                    PathNode.LineTo(14.9f, 2.3f),
                    PathNode.CurveTo(14.372936f, 2.00039f, 13.727064f, 2.00039f, 13.2f, 2.3f),
                    PathNode.LineTo(2.9f, 8.3f),
                    PathNode.CurveTo(2.4f, 8.5f, 2.0f, 9.1f, 2.0f, 9.7f),
                    PathNode.LineTo(2.0f, 16.3f),
                    PathNode.CurveTo(2.0f, 16.8f, 2.4f, 17.5f, 2.8f, 17.8f),
                    PathNode.LineTo(9.1f, 21.7f),
                    PathNode.CurveTo(9.627064f, 21.999607f, 10.272936f, 21.999607f, 10.8f, 21.7f),
                    PathNode.LineTo(21.1f, 15.7f),
                    PathNode.CurveTo(21.6f, 15.4f, 22.0f, 14.7f, 22.0f, 14.2f),
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
                    PathNode.MoveTo(10.0f, 21.9f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(2.1f, 9.1f)
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
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.LineTo(21.9f, 7.1f)
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
                    PathNode.MoveTo(14.0f, 19.8f),
                    PathNode.LineTo(14.0f, 11.7f)
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
                    PathNode.MoveTo(18.0f, 17.5f),
                    PathNode.LineTo(18.0f, 9.4f)
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
        return _container!!
    }

private var _container: ImageVector? = null
