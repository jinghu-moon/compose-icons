package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmartHomeOff: ImageVector
    get() {
        if (_smartHomeOff != null) return _smartHomeOff!!
        _smartHomeOff = tablerOutlineIcon(
            name = "SmartHomeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.097f, 7.125f),
                    PathNode.LineTo(5.06f, 8.71f),
                    PathNode.CurveTo(4.410404f, 9.215167f, 4.030612f, 9.992097f, 4.031f, 10.815f),
                    PathNode.LineTo(4.031f, 18.015f),
                    PathNode.CurveTo(4.031f, 19.11957f, 4.926431f, 20.015f, 6.031f, 20.015f),
                    PathNode.LineTo(18.031f, 20.015f),
                    PathNode.CurveTo(18.59f, 20.015f, 19.095f, 19.786f, 19.458f, 19.417f),
                    PathNode.MoveTo(20.03f, 16.0f),
                    PathNode.LineTo(20.03f, 10.815f),
                    PathNode.CurveTo(20.03f, 9.992f, 19.65f, 9.215f, 19.0f, 8.71f),
                    PathNode.LineTo(13.667f, 4.562f),
                    PathNode.CurveTo(12.704188f, 3.812974f, 11.355812f, 3.812974f, 10.393f, 4.562f),
                    PathNode.LineTo(9.364f, 5.362f)
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
                    PathNode.MoveTo(15.332f, 15.345f),
                    PathNode.CurveTo(13.119f, 16.321f, 9.997f, 16.205f, 8.0f, 15.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
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
        }
        return _smartHomeOff!!
    }

private var _smartHomeOff: ImageVector? = null
