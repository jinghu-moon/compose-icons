package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorLightIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(40.268013f, 42.0f, 34.0f, 48.268013f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 163.94f, 59.12f, 195.4f, 80.2f, 212.64f),
                    PathNode.CurveTo(102.93f, 231.24f, 125.47f, 237.53f, 126.42f, 237.79f),
                    PathNode.CurveTo(127.454414f, 238.07236f, 128.5456f, 238.07236f, 129.58f, 237.79f),
                    PathNode.CurveTo(130.53f, 237.53f, 153.07f, 231.24f, 175.8f, 212.64f),
                    PathNode.CurveTo(196.88f, 195.4f, 222.0f, 163.94f, 222.0f, 112.0f),
                    PathNode.LineTo(222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 48.268013f, 215.73198f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 56.0f),
                    PathNode.LineTo(210.0f, 112.0f),
                    PathNode.CurveTo(210.0f, 115.39f, 209.88f, 118.72f, 209.66f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(209.10457f, 54.0f, 210.0f, 54.89543f, 210.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 54.89543f, 46.89543f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(122.0f, 54.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(46.34f, 122.0f),
                    PathNode.CurveTo(46.12f, 118.72f, 46.0f, 115.39f, 46.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(47.71f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 223.52f),
                    PathNode.CurveTo(109.51164f, 218.4869f, 97.85908f, 211.58841f, 87.44f, 203.06f),
                    PathNode.CurveTo(65.5f, 185.0f, 52.2f, 161.8f, 47.71f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.56f, 203.06f),
                    PathNode.CurveTo(158.14091f, 211.58841f, 146.48836f, 218.4869f, 134.0f, 223.52f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(208.29f, 134.0f),
                    PathNode.CurveTo(203.8f, 161.8f, 190.5f, 185.0f, 168.56f, 203.06f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
