package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gpu: ImageVector
    get() {
        if (_gpu != null) return _gpu!!
        _gpu = lucideOutlineIcon(
            name = "Gpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(21.10457f, 17.0f, 22.0f, 16.10457f, 22.0f, 15.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.895431f, 21.10457f, 5.0f, 20.0f, 5.0f),
                    PathNode.LineTo(2.0f, 5.0f)
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 3.0f)
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
                    PathNode.MoveTo(7.0f, 17.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 20.552284f, 7.447716f, 21.0f, 8.0f, 21.0f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(13.552285f, 21.0f, 14.0f, 20.552284f, 14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 17.0f)
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
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 12.104569f, 17.10457f, 13.0f, 16.0f, 13.0f),
                    PathNode.CurveTo(14.895431f, 13.0f, 14.0f, 12.104569f, 14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 9.895431f, 14.895431f, 9.0f, 16.0f, 9.0f),
                    PathNode.CurveTo(17.10457f, 9.0f, 18.0f, 9.895431f, 18.0f, 11.0f),
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
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 12.104569f, 9.104569f, 13.0f, 8.0f, 13.0f),
                    PathNode.CurveTo(6.895431f, 13.0f, 6.0f, 12.104569f, 6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 9.895431f, 6.895431f, 9.0f, 8.0f, 9.0f),
                    PathNode.CurveTo(9.104569f, 9.0f, 10.0f, 9.895431f, 10.0f, 11.0f),
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
        return _gpu!!
    }

private var _gpu: ImageVector? = null
