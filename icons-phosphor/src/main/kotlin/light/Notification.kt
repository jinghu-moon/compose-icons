package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorLightIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 128.0f),
                    PathNode.LineTo(214.0f, 208.0f),
                    PathNode.CurveTo(214.0f, 215.73198f, 207.73198f, 222.0f, 200.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 48.268013f, 40.268013f, 42.0f, 48.0f, 42.0f),
                    PathNode.LineTo(128.0f, 42.0f),
                    PathNode.CurveTo(131.3137f, 42.0f, 134.0f, 44.68629f, 134.0f, 48.0f),
                    PathNode.CurveTo(134.0f, 51.31371f, 131.3137f, 54.0f, 128.0f, 54.0f),
                    PathNode.LineTo(48.0f, 54.0f),
                    PathNode.CurveTo(46.89543f, 54.0f, 46.0f, 54.89543f, 46.0f, 56.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.LineTo(200.0f, 210.0f),
                    PathNode.CurveTo(201.10457f, 210.0f, 202.0f, 209.10457f, 202.0f, 208.0f),
                    PathNode.LineTo(202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 124.686295f, 204.6863f, 122.0f, 208.0f, 122.0f),
                    PathNode.CurveTo(211.3137f, 122.0f, 214.0f, 124.686295f, 214.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 60.0f),
                    PathNode.CurveTo(230.0f, 78.77768f, 214.77768f, 94.0f, 196.0f, 94.0f),
                    PathNode.CurveTo(177.22232f, 94.0f, 162.0f, 78.77768f, 162.0f, 60.0f),
                    PathNode.CurveTo(162.0f, 41.222317f, 177.22232f, 26.0f, 196.0f, 26.0f),
                    PathNode.CurveTo(214.77768f, 26.0f, 230.0f, 41.222317f, 230.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 60.0f),
                    PathNode.CurveTo(218.0f, 47.849735f, 208.15027f, 38.0f, 196.0f, 38.0f),
                    PathNode.CurveTo(183.84973f, 38.0f, 174.0f, 47.849735f, 174.0f, 60.0f),
                    PathNode.CurveTo(174.0f, 72.15026f, 183.84973f, 82.0f, 196.0f, 82.0f),
                    PathNode.CurveTo(208.15027f, 82.0f, 218.0f, 72.15026f, 218.0f, 60.0f),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
