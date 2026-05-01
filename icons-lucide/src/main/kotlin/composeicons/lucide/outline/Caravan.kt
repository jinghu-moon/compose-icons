package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = lucideOutlineIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 6.790861f, 16.209139f, 5.0f, 14.0f, 5.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(3.790861f, 5.0f, 2.0f, 6.790861f, 2.0f, 9.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 18.10457f, 2.895431f, 19.0f, 4.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f)
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
                    PathNode.MoveTo(2.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.552285f, 9.0f, 6.0f, 9.447715f, 6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 5.552285f, 13.0f, 5.0f, 13.0f),
                    PathNode.LineTo(2.0f, 13.0f)
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
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 18.552284f, 21.552284f, 19.0f, 21.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 9.447715f, 10.447715f, 9.0f, 11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.552285f, 9.0f, 14.0f, 9.447715f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 19.0f)
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
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.10457f, 9.104569f, 21.0f, 8.0f, 21.0f),
                    PathNode.CurveTo(6.895431f, 21.0f, 6.0f, 20.10457f, 6.0f, 19.0f),
                    PathNode.CurveTo(6.0f, 17.89543f, 6.895431f, 17.0f, 8.0f, 17.0f),
                    PathNode.CurveTo(9.104569f, 17.0f, 10.0f, 17.89543f, 10.0f, 19.0f),
                    PathNode.Close
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
