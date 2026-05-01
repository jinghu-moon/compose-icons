package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorLightIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.0f, 42.0f),
                    PathNode.LineTo(49.0f, 42.0f),
                    PathNode.CurveTo(40.71573f, 42.0f, 34.0f, 48.71573f, 34.0f, 57.0f),
                    PathNode.LineTo(34.0f, 106.21f),
                    PathNode.CurveTo(34.00163f, 112.08947f, 37.438053f, 117.425896f, 42.79f, 119.86f),
                    PathNode.LineTo(109.19f, 150.0f),
                    PathNode.CurveTo(89.388336f, 158.87288f, 78.479935f, 180.37679f, 83.01664f, 201.59593f),
                    PathNode.CurveTo(87.553345f, 222.81508f, 106.30129f, 237.97838f, 128.0f, 237.97838f),
                    PathNode.CurveTo(149.69872f, 237.97838f, 168.44666f, 222.81508f, 172.98335f, 201.59593f),
                    PathNode.CurveTo(177.52007f, 180.37679f, 166.61166f, 158.87288f, 146.81f, 150.0f),
                    PathNode.LineTo(213.21f, 119.82f),
                    PathNode.CurveTo(218.54878f, 117.391914f, 221.98273f, 112.07498f, 222.0f, 106.21f),
                    PathNode.LineTo(222.0f, 57.0f),
                    PathNode.CurveTo(222.0f, 48.71573f, 215.28427f, 42.0f, 207.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 54.0f),
                    PathNode.LineTo(162.0f, 130.0f),
                    PathNode.LineTo(128.0f, 145.45f),
                    PathNode.LineTo(94.0f, 130.0f),
                    PathNode.LineTo(94.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 106.21f),
                    PathNode.LineTo(46.0f, 57.0f),
                    PathNode.CurveTo(46.0f, 55.343147f, 47.343147f, 54.0f, 49.0f, 54.0f),
                    PathNode.LineTo(82.0f, 54.0f),
                    PathNode.LineTo(82.0f, 124.5f),
                    PathNode.LineTo(47.76f, 108.94f),
                    PathNode.CurveTo(46.688828f, 108.45377f, 46.000683f, 107.38636f, 46.0f, 106.21f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 192.0f),
                    PathNode.CurveTo(162.0f, 210.77768f, 146.77768f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(109.22232f, 226.0f, 94.0f, 210.77768f, 94.0f, 192.0f),
                    PathNode.CurveTo(94.0f, 173.22232f, 109.22232f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(146.77768f, 158.0f, 162.0f, 173.22232f, 162.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 106.21f),
                    PathNode.CurveTo(209.99931f, 107.38636f, 209.31117f, 108.45377f, 208.24f, 108.94f),
                    PathNode.LineTo(174.0f, 124.5f),
                    PathNode.LineTo(174.0f, 54.0f),
                    PathNode.LineTo(207.0f, 54.0f),
                    PathNode.CurveTo(208.65686f, 54.0f, 210.0f, 55.343147f, 210.0f, 57.0f),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
