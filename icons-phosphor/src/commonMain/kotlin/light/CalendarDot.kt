package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarDot: ImageVector
    get() {
        if (_calendarDot != null) return _calendarDot!!
        _calendarDot = phosphorLightIcon(
            name = "CalendarDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(182.0f, 34.0f),
                    PathNode.LineTo(182.0f, 24.0f),
                    PathNode.CurveTo(182.0f, 20.68629f, 179.3137f, 18.0f, 176.0f, 18.0f),
                    PathNode.CurveTo(172.6863f, 18.0f, 170.0f, 20.68629f, 170.0f, 24.0f),
                    PathNode.LineTo(170.0f, 34.0f),
                    PathNode.LineTo(86.0f, 34.0f),
                    PathNode.LineTo(86.0f, 24.0f),
                    PathNode.CurveTo(86.0f, 20.68629f, 83.313705f, 18.0f, 80.0f, 18.0f),
                    PathNode.CurveTo(76.686295f, 18.0f, 74.0f, 20.68629f, 74.0f, 24.0f),
                    PathNode.LineTo(74.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 46.0f),
                    PathNode.LineTo(74.0f, 46.0f),
                    PathNode.LineTo(74.0f, 56.0f),
                    PathNode.CurveTo(74.0f, 59.31371f, 76.686295f, 62.0f, 80.0f, 62.0f),
                    PathNode.CurveTo(83.313705f, 62.0f, 86.0f, 59.31371f, 86.0f, 56.0f),
                    PathNode.LineTo(86.0f, 46.0f),
                    PathNode.LineTo(170.0f, 46.0f),
                    PathNode.LineTo(170.0f, 56.0f),
                    PathNode.CurveTo(170.0f, 59.31371f, 172.6863f, 62.0f, 176.0f, 62.0f),
                    PathNode.CurveTo(179.3137f, 62.0f, 182.0f, 59.31371f, 182.0f, 56.0f),
                    PathNode.LineTo(182.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 82.0f),
                    PathNode.LineTo(46.0f, 82.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 94.0f),
                    PathNode.LineTo(210.0f, 94.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 152.0f),
                    PathNode.CurveTo(142.0f, 159.73198f, 135.73198f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(120.26801f, 166.0f, 114.0f, 159.73198f, 114.0f, 152.0f),
                    PathNode.CurveTo(114.0f, 144.26802f, 120.26801f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(135.73198f, 138.0f, 142.0f, 144.26802f, 142.0f, 152.0f),
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
        return _calendarDot!!
    }

private var _calendarDot: ImageVector? = null
