package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPins: ImageVector
    get() {
        if (_mapPins != null) return _mapPins!!
        _mapPins = tablerOutlineIcon(
            name = "MapPins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.828f, 9.828f),
                    PathNode.CurveTo(11.972242f, 8.684103f, 12.314687f, 6.963537f, 11.695634f, 5.468691f),
                    PathNode.CurveTo(11.07658f, 3.973845f, 9.617959f, 2.999146f, 8.0f, 2.999146f),
                    PathNode.CurveTo(6.382041f, 2.999146f, 4.92342f, 3.973845f, 4.304366f, 5.468691f),
                    PathNode.CurveTo(3.685313f, 6.963537f, 4.027758f, 8.684103f, 5.172f, 9.828f),
                    PathNode.LineTo(8.0f, 12.657f),
                    PathNode.LineTo(10.828f, 9.828f)
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
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.LineTo(8.0f, 7.01f)
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
                    PathNode.MoveTo(18.828f, 17.828f),
                    PathNode.CurveTo(19.972242f, 16.684103f, 20.314688f, 14.963537f, 19.695633f, 13.468691f),
                    PathNode.CurveTo(19.07658f, 11.973845f, 17.617958f, 10.999146f, 16.0f, 10.999146f),
                    PathNode.CurveTo(14.382041f, 10.999146f, 12.92342f, 11.973845f, 12.304366f, 13.468691f),
                    PathNode.CurveTo(11.685313f, 14.963537f, 12.027758f, 16.684103f, 13.172f, 17.828f),
                    PathNode.LineTo(16.0f, 20.657f),
                    PathNode.LineTo(18.828f, 17.828f)
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
                    PathNode.MoveTo(16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 15.01f)
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
        return _mapPins!!
    }

private var _mapPins: ImageVector? = null
