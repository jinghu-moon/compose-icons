package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorLightIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.91f, 74.79f),
                    PathNode.LineTo(181.22f, 30.1f),
                    PathNode.CurveTo(178.59445f, 27.474182f, 175.03328f, 25.99899f, 171.32f, 25.99899f),
                    PathNode.CurveTo(167.60672f, 25.99899f, 164.04555f, 27.474182f, 161.42f, 30.1f),
                    PathNode.LineTo(38.1f, 153.41f),
                    PathNode.CurveTo(35.468937f, 156.03197f, 33.993107f, 159.59555f, 34.0f, 163.31f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(92.69f, 222.0f),
                    PathNode.CurveTo(96.40445f, 222.0069f, 99.96804f, 220.53107f, 102.59f, 217.9f),
                    PathNode.LineTo(188.75f, 131.74f),
                    PathNode.LineTo(193.36f, 150.16f),
                    PathNode.LineTo(155.76f, 187.76f),
                    PathNode.CurveTo(154.22461f, 189.27243f, 153.61833f, 191.49217f, 154.17172f, 193.57512f),
                    PathNode.CurveTo(154.72514f, 195.65807f, 156.35316f, 197.28418f, 158.43677f, 197.83513f),
                    PathNode.CurveTo(160.52036f, 198.38606f, 162.73938f, 197.77716f, 164.25f, 196.24f),
                    PathNode.LineTo(204.25f, 156.24f),
                    PathNode.CurveTo(205.74167f, 154.74963f, 206.34152f, 152.58563f, 205.83f, 150.54f),
                    PathNode.LineTo(198.65f, 121.84f),
                    PathNode.LineTo(225.91f, 94.59f),
                    PathNode.CurveTo(228.53581f, 91.96445f, 230.01102f, 88.40328f, 230.01102f, 84.69f),
                    PathNode.CurveTo(230.01102f, 80.97672f, 228.53581f, 77.41555f, 225.91f, 74.79f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 174.49f),
                    PathNode.LineTo(81.52f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 207.51f),
                    PathNode.LineTo(48.48f, 160.0f),
                    PathNode.LineTo(136.0f, 72.49f),
                    PathNode.LineTo(183.52f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.42f, 86.1f),
                    PathNode.LineTo(192.0f, 111.52f),
                    PathNode.LineTo(144.49f, 64.0f),
                    PathNode.LineTo(169.9f, 38.59f),
                    PathNode.CurveTo(170.27513f, 38.214447f, 170.78418f, 38.003426f, 171.315f, 38.003426f),
                    PathNode.CurveTo(171.84583f, 38.003426f, 172.35486f, 38.214447f, 172.73f, 38.59f),
                    PathNode.LineTo(217.42f, 83.27f),
                    PathNode.CurveTo(217.79555f, 83.645134f, 218.00658f, 84.15418f, 218.00658f, 84.685f),
                    PathNode.CurveTo(218.00658f, 85.21582f, 217.79555f, 85.72486f, 217.42f, 86.1f),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
