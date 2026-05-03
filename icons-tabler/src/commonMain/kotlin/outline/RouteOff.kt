package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteOff: ImageVector
    get() {
        if (_routeOff != null) return _routeOff!!
        _routeOff = tablerOutlineIcon(
            name = "RouteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 20.10457f, 4.895431f, 21.0f, 6.0f, 21.0f),
                    PathNode.CurveTo(7.10457f, 21.0f, 8.0f, 20.10457f, 8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 17.89543f, 7.10457f, 17.0f, 6.0f, 17.0f),
                    PathNode.CurveTo(4.895431f, 17.0f, 4.0f, 17.89543f, 4.0f, 19.0f)
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
                    PathNode.CurveTo(16.0f, 6.10457f, 16.89543f, 7.0f, 18.0f, 7.0f),
                    PathNode.CurveTo(19.10457f, 7.0f, 20.0f, 6.10457f, 20.0f, 5.0f),
                    PathNode.CurveTo(20.0f, 3.895431f, 19.10457f, 3.0f, 18.0f, 3.0f),
                    PathNode.CurveTo(16.89543f, 3.0f, 16.0f, 3.895431f, 16.0f, 5.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(16.5f, 19.0f),
                    PathNode.CurveTo(17.21f, 19.0f, 17.872f, 18.788f, 18.424f, 18.424f),
                    PathNode.MoveTo(19.969f, 15.965f),
                    PathNode.CurveTo(20.103098f, 14.964603f, 19.798786f, 13.955019f, 19.134169f, 13.195375f),
                    PathNode.CurveTo(18.469551f, 12.435731f, 17.509344f, 11.999992f, 16.5f, 12.0f),
                    PathNode.LineTo(16.001f, 12.0f),
                    PathNode.MoveTo(12.001f, 12.0f),
                    PathNode.LineTo(8.5f, 12.0f),
                    PathNode.CurveTo(7.085257f, 11.9997f, 5.809819f, 11.14772f, 5.267801f, 9.840924f),
                    PathNode.CurveTo(4.725783f, 8.534129f, 5.023787f, 7.029535f, 6.023f, 6.028f),
                    PathNode.MoveTo(8.5f, 5.0f),
                    PathNode.LineTo(12.0f, 5.0f)
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
        return _routeOff!!
    }

private var _routeOff: ImageVector? = null
