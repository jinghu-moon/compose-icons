package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = lucideOutlineIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 4.895431f, 13.104569f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(2.895431f, 4.0f, 2.0f, 4.895431f, 2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 17.552284f, 2.447715f, 18.0f, 3.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f)
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
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.552284f, 18.0f, 22.0f, 17.552284f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 13.35f),
                    PathNode.CurveTo(21.999596f, 13.123062f, 21.922014f, 12.903011f, 21.78f, 12.726f),
                    PathNode.LineTo(18.3f, 8.376001f),
                    PathNode.CurveTo(18.110556f, 8.138763f, 17.823595f, 8.000433f, 17.52f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f)
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
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 19.10457f, 18.10457f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(15.895431f, 20.0f, 15.0f, 19.10457f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 16.89543f, 15.895431f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(18.10457f, 16.0f, 19.0f, 16.89543f, 19.0f, 18.0f),
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 19.10457f, 8.10457f, 20.0f, 7.0f, 20.0f),
                    PathNode.CurveTo(5.895431f, 20.0f, 5.0f, 19.10457f, 5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 16.89543f, 5.895431f, 16.0f, 7.0f, 16.0f),
                    PathNode.CurveTo(8.10457f, 16.0f, 9.0f, 16.89543f, 9.0f, 18.0f),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
