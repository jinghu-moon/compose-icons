package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorLightIcon(
            name = "MouseMiddleClick",
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
                    PathNode.LineTo(150.0f, 106.0f),
                    PathNode.LineTo(150.0f, 88.0f),
                    PathNode.CurveTo(150.0f, 80.26801f, 143.73198f, 74.0f, 136.0f, 74.0f),
                    PathNode.LineTo(134.0f, 74.0f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(144.0f, 30.0f),
                    PathNode.CurveTo(171.60052f, 30.033062f, 193.96693f, 52.399467f, 194.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 88.0f),
                    PathNode.CurveTo(118.0f, 86.89543f, 118.89543f, 86.0f, 120.0f, 86.0f),
                    PathNode.LineTo(136.0f, 86.0f),
                    PathNode.CurveTo(137.10457f, 86.0f, 138.0f, 86.89543f, 138.0f, 88.0f),
                    PathNode.LineTo(138.0f, 136.0f),
                    PathNode.CurveTo(138.0f, 137.10457f, 137.10457f, 138.0f, 136.0f, 138.0f),
                    PathNode.LineTo(120.0f, 138.0f),
                    PathNode.CurveTo(118.89543f, 138.0f, 118.0f, 137.10457f, 118.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 30.0f),
                    PathNode.LineTo(122.0f, 30.0f),
                    PathNode.LineTo(122.0f, 74.0f),
                    PathNode.LineTo(120.0f, 74.0f),
                    PathNode.CurveTo(112.26801f, 74.0f, 106.0f, 80.26801f, 106.0f, 88.0f),
                    PathNode.LineTo(106.0f, 106.0f),
                    PathNode.LineTo(62.0f, 106.0f),
                    PathNode.LineTo(62.0f, 80.0f),
                    PathNode.CurveTo(62.03306f, 52.399467f, 84.39947f, 30.033062f, 112.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 226.0f),
                    PathNode.LineTo(112.0f, 226.0f),
                    PathNode.CurveTo(84.39947f, 225.96693f, 62.03306f, 203.60052f, 62.0f, 176.0f),
                    PathNode.LineTo(62.0f, 118.0f),
                    PathNode.LineTo(106.0f, 118.0f),
                    PathNode.LineTo(106.0f, 136.0f),
                    PathNode.CurveTo(106.0f, 143.73198f, 112.26801f, 150.0f, 120.0f, 150.0f),
                    PathNode.LineTo(136.0f, 150.0f),
                    PathNode.CurveTo(143.73198f, 150.0f, 150.0f, 143.73198f, 150.0f, 136.0f),
                    PathNode.LineTo(150.0f, 118.0f),
                    PathNode.LineTo(194.0f, 118.0f),
                    PathNode.LineTo(194.0f, 176.0f),
                    PathNode.CurveTo(193.96693f, 203.60052f, 171.60052f, 225.96693f, 144.0f, 226.0f),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
