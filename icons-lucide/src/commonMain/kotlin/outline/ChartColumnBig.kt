package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartColumnBig: ImageVector
    get() {
        if (_chartColumnBig != null) return _chartColumnBig!!
        _chartColumnBig = lucideOutlineIcon(
            name = "ChartColumnBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.552284f, 5.0f, 19.0f, 5.447716f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 16.552284f, 18.552284f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(15.447715f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 5.447716f, 15.447715f, 5.0f, 16.0f, 5.0f),
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(10.552285f, 8.0f, 11.0f, 8.447715f, 11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.552284f, 10.552285f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.447716f, 17.0f, 7.0f, 16.552284f, 7.0f, 16.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 8.447715f, 7.447716f, 8.0f, 8.0f, 8.0f),
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
        return _chartColumnBig!!
    }

private var _chartColumnBig: ImageVector? = null
