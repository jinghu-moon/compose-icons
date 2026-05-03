package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PointerOff: ImageVector
    get() {
        if (_pointerOff != null) return _pointerOff!!
        _pointerOff = lucideOutlineIcon(
            name = "PointerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 4.5f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.999843f, 3.39773f, 9.728286f, 2.827597f, 9.260749f, 2.447941f),
                    PathNode.CurveTo(8.793211f, 2.068285f, 8.17948f, 1.919535f, 7.59f, 2.043f)
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
                    PathNode.MoveTo(13.9f, 8.4f),
                    PathNode.CurveTo(13.710034f, 7.792405f, 13.242164f, 7.311538f, 12.64f, 7.105f)
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
                    PathNode.MoveTo(21.7f, 16.2f),
                    PathNode.CurveTo(21.901775f, 15.484177f, 22.002747f, 14.743713f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 9.895431f, 21.10457f, 9.0f, 20.0f, 9.0f),
                    PathNode.CurveTo(18.89543f, 9.0f, 18.0f, 9.895431f, 18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(17.9996f, 9.129938f, 17.436745f, 8.359954f, 16.607838f, 8.095526f),
                    PathNode.CurveTo(15.778931f, 7.831098f, 14.874166f, 8.1329f, 14.37f, 8.842f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(5.2f, 13.2f),
                    PathNode.CurveTo(4.401207f, 12.491793f, 3.187017f, 12.535782f, 2.441565f, 13.299936f),
                    PathNode.CurveTo(1.696114f, 14.064091f, 1.68222f, 15.278997f, 2.41f, 16.06f),
                    PathNode.LineTo(6.0f, 19.7f),
                    PathNode.CurveTo(7.572237f, 21.299866f, 9.761209f, 22.138971f, 12.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.CurveTo(16.121761f, 22.000078f, 18.156649f, 21.157274f, 19.657f, 19.657f)
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
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 14.0f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _pointerOff!!
    }

private var _pointerOff: ImageVector? = null
