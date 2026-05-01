package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = tablerOutlineIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.828f, 9.172f),
                    PathNode.CurveTo(8.684103f, 8.027758f, 6.963537f, 7.685313f, 5.468691f, 8.304366f),
                    PathNode.CurveTo(3.973845f, 8.92342f, 2.999146f, 10.382041f, 2.999146f, 12.0f),
                    PathNode.CurveTo(2.999146f, 13.617959f, 3.973845f, 15.07658f, 5.468691f, 15.695634f),
                    PathNode.CurveTo(6.963537f, 16.314688f, 8.684103f, 15.972242f, 9.828f, 14.828f),
                    PathNode.CurveTo(10.71558f, 14.023072f, 11.451274f, 13.06518f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.548726f, 10.93482f, 13.28442f, 9.976928f, 14.172f, 9.172f),
                    PathNode.CurveTo(15.315897f, 8.027758f, 17.036463f, 7.685313f, 18.53131f, 8.304366f),
                    PathNode.CurveTo(20.026155f, 8.92342f, 21.000854f, 10.382041f, 21.000854f, 12.0f),
                    PathNode.CurveTo(21.000854f, 13.617959f, 20.026155f, 15.07658f, 18.53131f, 15.695634f),
                    PathNode.CurveTo(17.036463f, 16.314688f, 15.315897f, 15.972242f, 14.172f, 14.828f),
                    PathNode.CurveTo(13.28442f, 14.023072f, 12.548726f, 13.06518f, 12.0f, 12.0f),
                    PathNode.CurveTo(11.451274f, 10.93482f, 10.71558f, 9.976928f, 9.828f, 9.172f)
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
