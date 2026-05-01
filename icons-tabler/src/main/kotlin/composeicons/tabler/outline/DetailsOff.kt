package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DetailsOff: ImageVector
    get() {
        if (_detailsOff != null) return _detailsOff!!
        _detailsOff = tablerOutlineIcon(
            name = "DetailsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.LineTo(19.0f, 19.0f)
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
                    PathNode.MoveTo(20.986f, 16.984f),
                    PathNode.CurveTo(20.98395f, 16.732327f, 20.934418f, 16.483301f, 20.84f, 16.25f),
                    PathNode.LineTo(13.74f, 4.0f),
                    PathNode.CurveTo(13.387762f, 3.363368f, 12.717579f, 2.968246f, 11.99f, 2.968246f),
                    PathNode.CurveTo(11.262421f, 2.968246f, 10.592237f, 3.363368f, 10.24f, 4.0f),
                    PathNode.LineTo(9.419f, 5.417f),
                    PathNode.MoveTo(7.95f, 7.951f),
                    PathNode.LineTo(3.14f, 16.25f),
                    PathNode.CurveTo(2.896396f, 16.849735f, 2.958121f, 17.530281f, 3.305652f, 18.076405f),
                    PathNode.CurveTo(3.653182f, 18.622524f, 4.243538f, 18.96667f, 4.89f, 19.0f)
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
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 19.0f)
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
        return _detailsOff!!
    }

private var _detailsOff: ImageVector? = null
