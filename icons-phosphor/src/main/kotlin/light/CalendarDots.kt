package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorLightIcon(
            name = "CalendarDots",
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
                    PathNode.MoveTo(138.0f, 132.0f),
                    PathNode.CurveTo(138.0f, 137.52284f, 133.52284f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(122.47715f, 142.0f, 118.0f, 137.52284f, 118.0f, 132.0f),
                    PathNode.CurveTo(118.0f, 126.47715f, 122.47715f, 122.0f, 128.0f, 122.0f),
                    PathNode.CurveTo(133.52284f, 122.0f, 138.0f, 126.47715f, 138.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 132.0f),
                    PathNode.CurveTo(182.0f, 137.52284f, 177.52284f, 142.0f, 172.0f, 142.0f),
                    PathNode.CurveTo(166.47716f, 142.0f, 162.0f, 137.52284f, 162.0f, 132.0f),
                    PathNode.CurveTo(162.0f, 126.47715f, 166.47716f, 122.0f, 172.0f, 122.0f),
                    PathNode.CurveTo(177.52284f, 122.0f, 182.0f, 126.47715f, 182.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 172.0f),
                    PathNode.CurveTo(94.0f, 177.52284f, 89.52285f, 182.0f, 84.0f, 182.0f),
                    PathNode.CurveTo(78.47715f, 182.0f, 74.0f, 177.52284f, 74.0f, 172.0f),
                    PathNode.CurveTo(74.0f, 166.47716f, 78.47715f, 162.0f, 84.0f, 162.0f),
                    PathNode.CurveTo(89.52285f, 162.0f, 94.0f, 166.47716f, 94.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 172.0f),
                    PathNode.CurveTo(138.0f, 177.52284f, 133.52284f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(122.47715f, 182.0f, 118.0f, 177.52284f, 118.0f, 172.0f),
                    PathNode.CurveTo(118.0f, 166.47716f, 122.47715f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(133.52284f, 162.0f, 138.0f, 166.47716f, 138.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 172.0f),
                    PathNode.CurveTo(182.0f, 177.52284f, 177.52284f, 182.0f, 172.0f, 182.0f),
                    PathNode.CurveTo(166.47716f, 182.0f, 162.0f, 177.52284f, 162.0f, 172.0f),
                    PathNode.CurveTo(162.0f, 166.47716f, 166.47716f, 162.0f, 172.0f, 162.0f),
                    PathNode.CurveTo(177.52284f, 162.0f, 182.0f, 166.47716f, 182.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendarDots!!
    }

private var _calendarDots: ImageVector? = null
