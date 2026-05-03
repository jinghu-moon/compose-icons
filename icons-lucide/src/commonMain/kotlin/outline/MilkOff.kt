package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MilkOff: ImageVector
    get() {
        if (_milkOff != null) return _milkOff!!
        _milkOff = lucideOutlineIcon(
            name = "MilkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 2.0f),
                    PathNode.LineTo(16.0f, 2.0f)
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
                    PathNode.MoveTo(9.0f, 2.0f),
                    PathNode.LineTo(9.0f, 3.343f),
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.LineTo(15.0f, 4.789f),
                    PathNode.CurveTo(15.00002f, 5.578789f, 15.233845f, 6.350896f, 15.672f, 7.008f),
                    PathNode.LineTo(16.328f, 7.992f),
                    PathNode.CurveTo(16.766344f, 8.649387f, 17.000177f, 9.421871f, 17.0f, 10.212f),
                    PathNode.LineTo(17.0f, 11.343f),
                    PathNode.MoveTo(7.8f, 7.8f),
                    PathNode.LineTo(7.672f, 7.992f),
                    PathNode.CurveTo(7.233656f, 8.649387f, 6.999823f, 9.421871f, 7.0f, 10.212f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 21.10457f, 7.895431f, 22.0f, 9.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.CurveTo(16.10457f, 22.0f, 17.0f, 21.10457f, 17.0f, 20.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.CurveTo(8.599328f, 14.329983f, 10.400672f, 14.329983f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.084245f, 15.454273f, 14.271743f, 15.604655f, 15.435f, 15.435f)
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
        return _milkOff!!
    }

private var _milkOff: ImageVector? = null
