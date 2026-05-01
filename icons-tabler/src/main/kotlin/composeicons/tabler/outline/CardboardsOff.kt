package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CardboardsOff: ImageVector
    get() {
        if (_cardboardsOff != null) return _cardboardsOff!!
        _cardboardsOff = tablerOutlineIcon(
            name = "CardboardsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.96f, 16.953f),
                    PathNode.CurveTo(20.986f, 16.806f, 21.0f, 16.655f, 21.0f, 16.5f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 6.895431f, 20.10457f, 6.0f, 19.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(3.895431f, 6.0f, 3.0f, 6.895431f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.5f),
                    PathNode.CurveTo(3.0f, 17.880713f, 4.119288f, 19.0f, 5.5f, 19.0f),
                    PathNode.LineTo(6.56f, 19.0f),
                    PathNode.CurveTo(7.471126f, 18.998217f, 8.332066f, 18.582462f, 8.9f, 17.87f),
                    PathNode.LineTo(10.44f, 15.95f),
                    PathNode.CurveTo(10.819593f, 15.476857f, 11.393407f, 15.201559f, 12.0f, 15.201559f),
                    PathNode.CurveTo(12.606593f, 15.201559f, 13.180407f, 15.476857f, 13.56f, 15.95f),
                    PathNode.LineTo(15.1f, 17.87f),
                    PathNode.CurveTo(15.667934f, 18.582462f, 16.528873f, 18.998217f, 17.44f, 19.0f),
                    PathNode.LineTo(18.5f, 19.0f),
                    PathNode.CurveTo(18.655f, 19.0f, 18.807f, 18.986f, 18.954f, 18.959f)
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
                    PathNode.CurveTo(7.0f, 12.552285f, 7.447716f, 13.0f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.552285f, 13.0f, 9.0f, 12.552285f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 11.447715f, 8.552285f, 11.0f, 8.0f, 11.0f),
                    PathNode.CurveTo(7.447716f, 11.0f, 7.0f, 11.447715f, 7.0f, 12.0f)
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
                    PathNode.MoveTo(16.714f, 12.7f),
                    PathNode.CurveTo(17.092224f, 12.30683f, 17.085522f, 11.683067f, 16.698935f, 11.298117f),
                    PathNode.CurveTo(16.312347f, 10.913166f, 15.68856f, 10.90911f, 15.297f, 11.289f),
                    PathNode.LineTo(16.714f, 12.699f)
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
        return _cardboardsOff!!
    }

private var _cardboardsOff: ImageVector? = null
