package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) return _mouseRightClick!!
        _mouseRightClick = phosphorLightIcon(
            name = "MouseRightClick",
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
                    PathNode.LineTo(158.49f, 106.0f),
                    PathNode.LineTo(193.22f, 71.27f),
                    PathNode.CurveTo(193.73418f, 74.15167f, 193.99518f, 77.072815f, 194.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.1f, 58.42f),
                    PathNode.LineTo(141.51f, 106.0f),
                    PathNode.LineTo(134.0f, 106.0f),
                    PathNode.LineTo(134.0f, 82.49f),
                    PathNode.LineTo(175.38f, 41.11f),
                    PathNode.CurveTo(181.17937f, 45.7922f, 185.86568f, 51.70474f, 189.1f, 58.42f),
                    PathNode.Close,
                    PathNode.MoveTo(164.91f, 34.6f),
                    PathNode.LineTo(134.0f, 65.51f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(144.0f, 30.0f),
                    PathNode.CurveTo(151.22128f, 29.997292f, 158.35657f, 31.566984f, 164.91f, 34.6f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 30.0f),
                    PathNode.LineTo(122.0f, 30.0f),
                    PathNode.LineTo(122.0f, 106.0f),
                    PathNode.LineTo(62.0f, 106.0f),
                    PathNode.LineTo(62.0f, 80.0f),
                    PathNode.CurveTo(62.03306f, 52.399467f, 84.39947f, 30.033062f, 112.0f, 30.0f),
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
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null
