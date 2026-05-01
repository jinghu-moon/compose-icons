package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiscOff: ImageVector
    get() {
        if (_discOff != null) return _discOff!!
        _discOff = tablerOutlineIcon(
            name = "DiscOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.044f, 16.04f),
                    PathNode.CurveTo(21.787657f, 12.572654f, 21.11219f, 8.378078f, 18.368189f, 5.633395f),
                    PathNode.CurveTo(15.624187f, 2.888712f, 11.429779f, 2.212204f, 7.962f, 3.955f),
                    PathNode.MoveTo(5.629f, 5.643f),
                    PathNode.CurveTo(3.059087f, 8.218539f, 2.292696f, 12.088074f, 3.686899f, 15.448735f),
                    PathNode.CurveTo(5.081102f, 18.809397f, 8.361615f, 21.000034f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.491f, 21.0f, 16.73f, 20.0f, 18.36f, 18.369f)
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
                    PathNode.MoveTo(11.298f, 11.288f),
                    PathNode.CurveTo(10.903945f, 11.675152f, 10.898349f, 12.308445f, 11.2855f, 12.7025f),
                    PathNode.CurveTo(11.672651f, 13.096555f, 12.305944f, 13.102152f, 12.7f, 12.715f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 10.62f, 7.559f, 9.371f, 8.462f, 8.466f),
                    PathNode.MoveTo(11.069f, 7.086f),
                    PathNode.CurveTo(11.371f, 7.03f, 11.682f, 7.0f, 12.0f, 7.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(13.334014f, 17.001673f, 14.613043f, 16.468596f, 15.551f, 15.52f),
                    PathNode.MoveTo(16.913f, 12.933f),
                    PathNode.CurveTo(16.97f, 12.631f, 17.0f, 12.319f, 17.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _discOff!!
    }

private var _discOff: ImageVector? = null
