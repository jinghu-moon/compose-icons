package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorLightIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 131.3137f, 163.3137f, 134.0f, 160.0f, 134.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 163.3137f, 131.3137f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(124.686295f, 166.0f, 122.0f, 163.3137f, 122.0f, 160.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(96.0f, 134.0f),
                    PathNode.CurveTo(92.686295f, 134.0f, 90.0f, 131.3137f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 124.686295f, 92.686295f, 122.0f, 96.0f, 122.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(122.0f, 96.0f),
                    PathNode.CurveTo(122.0f, 92.686295f, 124.686295f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(131.3137f, 90.0f, 134.0f, 92.686295f, 134.0f, 96.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(160.0f, 122.0f),
                    PathNode.CurveTo(163.3137f, 122.0f, 166.0f, 124.686295f, 166.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 56.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 163.94f, 196.88f, 195.4f, 175.8f, 212.64f),
                    PathNode.CurveTo(153.07f, 231.24f, 130.53f, 237.53f, 129.58f, 237.79f),
                    PathNode.CurveTo(128.5456f, 238.07236f, 127.454414f, 238.07236f, 126.42f, 237.79f),
                    PathNode.CurveTo(125.42f, 237.53f, 102.93f, 231.24f, 80.2f, 212.64f),
                    PathNode.CurveTo(59.12f, 195.4f, 34.0f, 163.94f, 34.0f, 112.0f),
                    PathNode.LineTo(34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 48.268013f, 40.268013f, 42.0f, 48.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(215.73198f, 42.0f, 222.0f, 48.268013f, 222.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 56.0f),
                    PathNode.CurveTo(210.0f, 54.89543f, 209.10457f, 54.0f, 208.0f, 54.0f),
                    PathNode.LineTo(48.0f, 54.0f),
                    PathNode.CurveTo(46.89543f, 54.0f, 46.0f, 54.89543f, 46.0f, 56.0f),
                    PathNode.LineTo(46.0f, 112.0f),
                    PathNode.CurveTo(46.0f, 149.75f, 59.94f, 180.39f, 87.44f, 203.06f),
                    PathNode.CurveTo(99.4998f, 212.97269f, 113.23636f, 220.647f, 128.0f, 225.72f),
                    PathNode.CurveTo(142.76161f, 220.64249f, 156.4974f, 212.9686f, 168.56f, 203.06f),
                    PathNode.CurveTo(196.06f, 180.39f, 210.0f, 149.75f, 210.0f, 112.0f),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
