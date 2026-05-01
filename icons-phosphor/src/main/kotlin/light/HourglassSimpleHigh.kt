package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) return _hourglassSimpleHigh!!
        _hourglassSimpleHigh = phosphorLightIcon(
            name = "HourglassSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.8f, 198.0f),
                    PathNode.LineTo(136.68f, 128.0f),
                    PathNode.LineTo(209.8f, 58.0f),
                    PathNode.LineTo(209.89f, 57.91f),
                    PathNode.CurveTo(213.90027f, 53.908237f, 215.10344f, 47.88401f, 212.93799f, 42.648827f),
                    PathNode.CurveTo(210.77252f, 37.413643f, 205.66536f, 33.999588f, 200.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(50.337215f, 33.99959f, 45.231846f, 37.410587f, 43.06473f, 42.642296f),
                    PathNode.CurveTo(40.897625f, 47.874004f, 42.0956f, 53.89601f, 46.1f, 57.9f),
                    PathNode.LineTo(46.19f, 57.99f),
                    PathNode.LineTo(119.31f, 127.99f),
                    PathNode.LineTo(46.2f, 198.0f),
                    PathNode.LineTo(46.11f, 198.09f),
                    PathNode.CurveTo(42.09973f, 202.09177f, 40.896564f, 208.11598f, 43.06202f, 213.35117f),
                    PathNode.CurveTo(45.22747f, 218.58635f, 50.334637f, 222.00041f, 56.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(205.66278f, 222.00041f, 210.76816f, 218.58942f, 212.93529f, 213.35771f),
                    PathNode.CurveTo(215.10237f, 208.12598f, 213.9044f, 202.10399f, 209.9f, 198.1f),
                    PathNode.Close,
                    PathNode.MoveTo(84.45f, 78.0f),
                    PathNode.LineTo(171.55f, 78.0f),
                    PathNode.LineTo(128.0f, 119.69f),
                    PathNode.Close,
                    PathNode.MoveTo(54.16f, 47.23f),
                    PathNode.CurveTo(54.449085f, 46.47021f, 55.18741f, 45.976658f, 56.0f, 46.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(200.80066f, 45.999046f, 201.52473f, 46.475693f, 201.8404f, 47.211506f),
                    PathNode.CurveTo(202.15605f, 47.947315f, 202.00246f, 48.800472f, 201.45f, 49.38f),
                    PathNode.LineTo(184.08f, 66.0f),
                    PathNode.LineTo(71.92f, 66.0f),
                    PathNode.LineTo(54.56f, 49.38f),
                    PathNode.CurveTo(53.98898f, 48.818134f, 53.82926f, 47.959637f, 54.16f, 47.23f),
                    PathNode.Close,
                    PathNode.MoveTo(201.84f, 208.77f),
                    PathNode.CurveTo(201.55092f, 209.52979f, 200.81259f, 210.02335f, 200.0f, 210.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(55.199337f, 210.00096f, 54.47527f, 209.5243f, 54.159607f, 208.7885f),
                    PathNode.CurveTo(53.84395f, 208.05269f, 53.997543f, 207.19952f, 54.55f, 206.62f),
                    PathNode.LineTo(128.0f, 136.31f),
                    PathNode.LineTo(201.44f, 206.62f),
                    PathNode.CurveTo(202.01102f, 207.18187f, 202.17075f, 208.04036f, 201.84f, 208.77f),
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
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null
