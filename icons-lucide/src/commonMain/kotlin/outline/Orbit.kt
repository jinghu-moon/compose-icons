package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Orbit: ImageVector
    get() {
        if (_orbit != null) return _orbit!!
        _orbit = lucideOutlineIcon(
            name = "Orbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.341f, 6.484f),
                    PathNode.CurveTo(22.546066f, 9.816975f, 22.555002f, 14.142773f, 20.363722f, 17.484829f),
                    PathNode.CurveTo(18.172441f, 20.826883f, 14.201768f, 22.543377f, 10.266f, 21.85f)
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
                    PathNode.MoveTo(3.659f, 17.516f),
                    PathNode.CurveTo(1.453948f, 14.182122f, 1.446007f, 9.855405f, 3.638808f, 6.513456f),
                    PathNode.CurveTo(5.831608f, 3.171507f, 9.803872f, 1.456378f, 13.74f, 2.152f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 13.656855f, 13.656855f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.343145f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 10.343145f, 15.0f, 12.0f),
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
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.10457f, 20.10457f, 7.0f, 19.0f, 7.0f),
                    PathNode.CurveTo(17.89543f, 7.0f, 17.0f, 6.10457f, 17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 3.895431f, 17.89543f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
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
                    PathNode.MoveTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 20.10457f, 6.10457f, 21.0f, 5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 17.89543f, 3.895431f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(6.10457f, 17.0f, 7.0f, 17.89543f, 7.0f, 19.0f),
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
        return _orbit!!
    }

private var _orbit: ImageVector? = null
