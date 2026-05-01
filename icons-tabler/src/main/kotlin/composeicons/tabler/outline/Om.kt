package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Om: ImageVector
    get() {
        if (_om != null) return _om!!
        _om = tablerOutlineIcon(
            name = "Om",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(9.21f, 12.0f, 11.0f, 10.433f, 11.0f, 8.5f),
                    PathNode.CurveTo(11.0f, 6.567f, 9.21f, 5.0f, 7.0f, 5.0f),
                    PathNode.CurveTo(5.406f, 5.0f, 4.03f, 5.816f, 3.387f, 7.0f)
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
                    PathNode.MoveTo(3.423f, 14.483f),
                    PathNode.CurveTo(3.141881f, 15.118155f, 2.99775f, 15.805417f, 3.0f, 16.5f),
                    PathNode.CurveTo(3.0f, 18.985f, 4.79f, 21.0f, 7.0f, 21.0f),
                    PathNode.CurveTo(9.21f, 21.0f, 11.0f, 18.985f, 11.0f, 16.5f),
                    PathNode.CurveTo(11.0f, 14.015f, 9.21f, 12.0f, 7.0f, 12.0f)
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
                    PathNode.MoveTo(14.071f, 17.01f),
                    PathNode.CurveTo(14.398f, 19.287f, 15.81f, 21.0f, 17.5f, 21.0f),
                    PathNode.CurveTo(19.433f, 21.0f, 21.0f, 18.761f, 21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 13.239f, 19.433f, 11.0f, 17.5f, 11.0f),
                    PathNode.CurveTo(16.54f, 11.0f, 15.632f, 11.606f, 15.0f, 12.5f),
                    PathNode.CurveTo(14.283f, 13.549f, 13.24f, 14.2f, 12.064f, 14.2f),
                    PathNode.CurveTo(11.144f, 14.2f, 10.298f, 13.794f, 9.63f, 13.113f)
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
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.LineTo(19.0f, 5.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.667f, 6.667f, 16.667f, 8.333f, 21.0f, 8.0f)
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
        return _om!!
    }

private var _om: ImageVector? = null
