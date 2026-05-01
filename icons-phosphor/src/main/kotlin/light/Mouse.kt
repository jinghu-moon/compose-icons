package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = phosphorLightIcon(
            name = "Mouse",
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
