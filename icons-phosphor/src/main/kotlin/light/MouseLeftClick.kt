package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorLightIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 18.0f),
                    PathNode.LineTo(112.0f, 18.0f),
                    PathNode.CurveTo(77.77434f, 18.038576f, 50.03858f, 45.774338f, 50.0f, 80.0f),
                    PathNode.LineTo(50.0f, 176.0f),
                    PathNode.CurveTo(50.03858f, 210.22566f, 77.77434f, 237.96143f, 112.0f, 238.0f),
                    PathNode.LineTo(144.0f, 238.0f),
                    PathNode.CurveTo(178.22566f, 237.96143f, 205.96143f, 210.22566f, 206.0f, 176.0f),
                    PathNode.LineTo(206.0f, 80.0f),
                    PathNode.CurveTo(205.96143f, 45.774338f, 178.22566f, 18.038576f, 144.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 80.0f),
                    PathNode.LineTo(194.0f, 106.0f),
                    PathNode.LineTo(134.0f, 106.0f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(144.0f, 30.0f),
                    PathNode.CurveTo(171.60052f, 30.033062f, 193.96693f, 52.399467f, 194.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 30.0f),
                    PathNode.LineTo(122.0f, 65.51f),
                    PathNode.LineTo(91.09f, 34.6f),
                    PathNode.CurveTo(97.64345f, 31.566984f, 104.778725f, 29.997292f, 112.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.62f, 41.11f),
                    PathNode.LineTo(122.0f, 82.49f),
                    PathNode.LineTo(122.0f, 106.0f),
                    PathNode.LineTo(114.49f, 106.0f),
                    PathNode.LineTo(66.9f, 58.42f),
                    PathNode.CurveTo(70.13433f, 51.70474f, 74.82063f, 45.7922f, 80.62f, 41.11f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 80.0f),
                    PathNode.CurveTo(62.004826f, 77.072815f, 62.26582f, 74.15167f, 62.78f, 71.27f),
                    PathNode.LineTo(97.51f, 106.0f),
                    PathNode.LineTo(62.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 226.0f),
                    PathNode.LineTo(112.0f, 226.0f),
                    PathNode.CurveTo(84.39947f, 225.96693f, 62.03306f, 203.60052f, 62.0f, 176.0f),
                    PathNode.LineTo(62.0f, 118.0f),
                    PathNode.LineTo(194.0f, 118.0f),
                    PathNode.LineTo(194.0f, 176.0f),
                    PathNode.CurveTo(193.96693f, 203.60052f, 171.60052f, 225.96693f, 144.0f, 226.0f),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
