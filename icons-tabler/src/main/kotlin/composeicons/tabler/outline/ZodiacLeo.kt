package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) return _zodiacLeo!!
        _zodiacLeo = tablerOutlineIcon(
            name = "ZodiacLeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 19.209139f, 14.790861f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(19.209139f, 21.0f, 21.0f, 19.209139f, 21.0f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.656855f, 4.343146f, 19.0f, 6.0f, 19.0f),
                    PathNode.CurveTo(7.656854f, 19.0f, 9.0f, 17.656855f, 9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 14.343145f, 7.656854f, 13.0f, 6.0f, 13.0f),
                    PathNode.CurveTo(4.343146f, 13.0f, 3.0f, 14.343145f, 3.0f, 16.0f)
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
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 9.209139f, 8.790861f, 11.0f, 11.0f, 11.0f),
                    PathNode.CurveTo(13.209139f, 11.0f, 15.0f, 9.209139f, 15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 4.790861f, 13.209139f, 3.0f, 11.0f, 3.0f),
                    PathNode.CurveTo(8.790861f, 3.0f, 7.0f, 4.790861f, 7.0f, 7.0f)
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
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 10.0f, 9.0f, 12.0f, 9.0f, 16.0f)
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
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 11.0f, 13.0f, 13.0f, 13.0f, 17.0f)
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
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
