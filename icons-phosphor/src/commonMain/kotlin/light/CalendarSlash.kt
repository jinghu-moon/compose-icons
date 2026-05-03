package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorLightIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(51.30923f, 34.73571f, 49.696167f, 34.009106f, 48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(210.36029f, 221.98738f, 212.4939f, 220.59212f, 213.45172f, 218.43488f),
                    PathNode.CurveTo(214.40953f, 216.27763f, 214.01358f, 213.75925f, 212.44f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.26f, 47.0f),
                    PathNode.LineTo(78.07f, 82.0f),
                    PathNode.LineTo(46.0f, 82.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.000305f, 47.649994f, 46.089787f, 47.305832f, 46.26f, 47.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 94.0f),
                    PathNode.LineTo(89.0f, 94.0f),
                    PathNode.LineTo(194.44f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 177.23f),
                    PathNode.CurveTo(222.0f, 180.5437f, 219.3137f, 183.23f, 216.0f, 183.23f),
                    PathNode.CurveTo(212.6863f, 183.23f, 210.0f, 180.5437f, 210.0f, 177.23f),
                    PathNode.LineTo(210.0f, 94.0f),
                    PathNode.LineTo(134.88f, 94.0f),
                    PathNode.CurveTo(131.56628f, 94.0f, 128.88f, 91.313705f, 128.88f, 88.0f),
                    PathNode.CurveTo(128.88f, 84.686295f, 131.56628f, 82.0f, 134.88f, 82.0f),
                    PathNode.LineTo(210.0f, 82.0f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(182.0f, 46.0f),
                    PathNode.LineTo(182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 59.31371f, 179.3137f, 62.0f, 176.0f, 62.0f),
                    PathNode.CurveTo(172.6863f, 62.0f, 170.0f, 59.31371f, 170.0f, 56.0f),
                    PathNode.LineTo(170.0f, 46.0f),
                    PathNode.LineTo(91.25f, 46.0f),
                    PathNode.CurveTo(87.936295f, 46.0f, 85.25f, 43.31371f, 85.25f, 40.0f),
                    PathNode.CurveTo(85.25f, 36.68629f, 87.936295f, 34.0f, 91.25f, 34.0f),
                    PathNode.LineTo(170.0f, 34.0f),
                    PathNode.LineTo(170.0f, 24.0f),
                    PathNode.CurveTo(170.0f, 20.68629f, 172.6863f, 18.0f, 176.0f, 18.0f),
                    PathNode.CurveTo(179.3137f, 18.0f, 182.0f, 20.68629f, 182.0f, 24.0f),
                    PathNode.LineTo(182.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
