package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorLightIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 174.0f),
                    PathNode.CurveTo(153.39139f, 173.96695f, 173.96695f, 153.39139f, 174.0f, 128.0f),
                    PathNode.LineTo(174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 38.594906f, 153.4051f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(102.5949f, 18.0f, 82.0f, 38.594906f, 82.0f, 64.0f),
                    PathNode.LineTo(82.0f, 128.0f),
                    PathNode.CurveTo(82.03306f, 153.39139f, 102.608604f, 173.96695f, 128.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 64.0f),
                    PathNode.CurveTo(94.0f, 45.222317f, 109.22232f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(146.77768f, 30.0f, 162.0f, 45.222317f, 162.0f, 64.0f),
                    PathNode.LineTo(162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 205.75f),
                    PathNode.LineTo(134.0f, 240.0f),
                    PathNode.CurveTo(134.0f, 243.3137f, 131.3137f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(124.686295f, 246.0f, 122.0f, 243.3137f, 122.0f, 240.0f),
                    PathNode.LineTo(122.0f, 205.75f),
                    PathNode.CurveTo(81.397285f, 202.57388f, 50.053288f, 168.72672f, 50.0f, 128.0f),
                    PathNode.CurveTo(50.0f, 124.686295f, 52.68629f, 122.0f, 56.0f, 122.0f),
                    PathNode.CurveTo(59.31371f, 122.0f, 62.0f, 124.686295f, 62.0f, 128.0f),
                    PathNode.CurveTo(62.0f, 164.45079f, 91.54921f, 194.0f, 128.0f, 194.0f),
                    PathNode.CurveTo(164.45079f, 194.0f, 194.0f, 164.45079f, 194.0f, 128.0f),
                    PathNode.CurveTo(194.0f, 124.686295f, 196.6863f, 122.0f, 200.0f, 122.0f),
                    PathNode.CurveTo(203.3137f, 122.0f, 206.0f, 124.686295f, 206.0f, 128.0f),
                    PathNode.CurveTo(205.94672f, 168.72672f, 174.60272f, 202.57388f, 134.0f, 205.75f),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
