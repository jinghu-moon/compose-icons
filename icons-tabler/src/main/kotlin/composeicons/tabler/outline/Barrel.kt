package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Barrel: ImageVector
    get() {
        if (_barrel != null) return _barrel!!
        _barrel = tablerOutlineIcon(
            name = "Barrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.278f, 4.0f),
                    PathNode.LineTo(16.722f, 4.0f),
                    PathNode.CurveTo(17.524923f, 4.000253f, 18.249859f, 4.480656f, 18.563f, 5.22f),
                    PathNode.CurveTo(19.521f, 7.48f, 20.0f, 9.74f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 14.26f, 19.521f, 16.52f, 18.563f, 18.78f),
                    PathNode.CurveTo(18.249859f, 19.519344f, 17.524923f, 19.999746f, 16.722f, 20.0f),
                    PathNode.LineTo(7.278f, 20.0f),
                    PathNode.CurveTo(6.475076f, 19.999746f, 5.75014f, 19.519344f, 5.437f, 18.78f),
                    PathNode.CurveTo(4.479f, 16.52f, 4.0f, 14.26f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 9.74f, 4.479f, 7.48f, 5.437f, 5.22f),
                    PathNode.CurveTo(5.75014f, 4.480656f, 6.475076f, 4.000253f, 7.278f, 4.0f)
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
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.667f, 6.667f, 15.0f, 9.333f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 14.667f, 14.667f, 17.333f, 14.0f, 20.0f)
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
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.333f, 6.667f, 9.0f, 9.333f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 14.667f, 9.333f, 17.333f, 10.0f, 20.0f)
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
                    PathNode.MoveTo(4.5f, 16.0f),
                    PathNode.LineTo(19.5f, 16.0f)
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
                    PathNode.MoveTo(19.5f, 8.0f),
                    PathNode.LineTo(4.5f, 8.0f)
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
        return _barrel!!
    }

private var _barrel: ImageVector? = null
