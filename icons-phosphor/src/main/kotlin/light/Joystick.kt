package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorLightIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 146.0f),
                    PathNode.LineTo(134.0f, 146.0f),
                    PathNode.LineTo(134.0f, 93.52f),
                    PathNode.CurveTo(153.57114f, 90.39056f, 167.45029f, 72.74472f, 165.88065f, 52.98722f),
                    PathNode.CurveTo(164.31099f, 33.22972f, 147.81975f, 17.996674f, 128.0f, 17.996674f),
                    PathNode.CurveTo(108.180244f, 17.996674f, 91.689f, 33.22972f, 90.119354f, 52.98722f),
                    PathNode.CurveTo(88.549706f, 72.74472f, 102.42887f, 90.39056f, 122.0f, 93.52f),
                    PathNode.LineTo(122.0f, 146.0f),
                    PathNode.LineTo(48.0f, 146.0f),
                    PathNode.CurveTo(40.268013f, 146.0f, 34.0f, 152.26802f, 34.0f, 160.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 152.26802f, 215.73198f, 146.0f, 208.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 56.0f),
                    PathNode.CurveTo(102.0f, 41.6406f, 113.640594f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(142.3594f, 30.0f, 154.0f, 41.6406f, 154.0f, 56.0f),
                    PathNode.CurveTo(154.0f, 70.359406f, 142.3594f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(113.640594f, 82.0f, 102.0f, 70.359406f, 102.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 160.0f),
                    PathNode.CurveTo(46.0f, 158.89543f, 46.89543f, 158.0f, 48.0f, 158.0f),
                    PathNode.LineTo(208.0f, 158.0f),
                    PathNode.CurveTo(209.10457f, 158.0f, 210.0f, 158.89543f, 210.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 114.0f),
                    PathNode.LineTo(200.0f, 114.0f),
                    PathNode.CurveTo(203.3137f, 114.0f, 206.0f, 116.686295f, 206.0f, 120.0f),
                    PathNode.CurveTo(206.0f, 123.313705f, 203.3137f, 126.0f, 200.0f, 126.0f),
                    PathNode.LineTo(168.0f, 126.0f),
                    PathNode.CurveTo(164.6863f, 126.0f, 162.0f, 123.313705f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 116.686295f, 164.6863f, 114.0f, 168.0f, 114.0f),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
