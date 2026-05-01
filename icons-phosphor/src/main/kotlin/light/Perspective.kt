package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorLightIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 122.0f),
                    PathNode.LineTo(222.0f, 122.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(221.9985f, 43.850327f, 220.15623f, 39.915127f, 216.97028f, 37.25629f),
                    PathNode.CurveTo(213.7843f, 34.597458f, 209.58298f, 33.488987f, 205.5f, 34.23f),
                    PathNode.LineTo(45.5f, 63.32f),
                    PathNode.CurveTo(38.842934f, 64.52818f, 34.002407f, 70.32419f, 34.0f, 77.09f),
                    PathNode.LineTo(34.0f, 122.0f),
                    PathNode.LineTo(16.0f, 122.0f),
                    PathNode.CurveTo(12.686292f, 122.0f, 10.0f, 124.686295f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 131.3137f, 12.686292f, 134.0f, 16.0f, 134.0f),
                    PathNode.LineTo(34.0f, 134.0f),
                    PathNode.LineTo(34.0f, 178.91f),
                    PathNode.CurveTo(34.002407f, 185.67581f, 38.842934f, 191.47182f, 45.5f, 192.68f),
                    PathNode.LineTo(205.5f, 221.77f),
                    PathNode.CurveTo(206.3249f, 221.92033f, 207.16151f, 221.9973f, 208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 134.0f),
                    PathNode.LineTo(240.0f, 134.0f),
                    PathNode.CurveTo(243.3137f, 134.0f, 246.0f, 131.3137f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 124.686295f, 243.3137f, 122.0f, 240.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 77.09f),
                    PathNode.CurveTo(45.984047f, 76.11199f, 46.677814f, 75.26594f, 47.64f, 75.09f),
                    PathNode.LineTo(207.64f, 45.99f),
                    PathNode.LineTo(208.01f, 45.99f),
                    PathNode.CurveTo(209.11456f, 45.99f, 210.01f, 46.88543f, 210.01f, 47.99f),
                    PathNode.LineTo(210.01f, 121.99f),
                    PathNode.LineTo(46.0f, 121.99f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(209.998f, 208.59137f, 209.73439f, 209.15154f, 209.28f, 209.53f),
                    PathNode.CurveTo(208.82582f, 209.91296f, 208.22488f, 210.07419f, 207.64f, 209.97f),
                    PathNode.LineTo(47.64f, 180.87f),
                    PathNode.CurveTo(46.677814f, 180.69406f, 45.984047f, 179.848f, 46.0f, 178.87f),
                    PathNode.LineTo(46.0f, 134.0f),
                    PathNode.LineTo(210.0f, 134.0f),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
