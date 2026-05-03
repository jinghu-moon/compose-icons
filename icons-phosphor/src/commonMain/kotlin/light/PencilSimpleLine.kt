package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorLightIcon(
            name = "PencilSimpleLine",
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
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 212.6863f, 219.3137f, 210.0f, 216.0f, 210.0f),
                    PathNode.LineTo(110.49f, 210.0f),
                    PathNode.LineTo(225.91f, 94.59f),
                    PathNode.CurveTo(228.53581f, 91.96445f, 230.01102f, 88.40328f, 230.01102f, 84.69f),
                    PathNode.CurveTo(230.01102f, 80.97672f, 228.53581f, 77.41555f, 225.91f, 74.79f),
                    PathNode.Close,
                    PathNode.MoveTo(93.52f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 163.31f),
                    PathNode.CurveTo(46.00223f, 162.78043f, 46.214413f, 162.27335f, 46.59f, 161.9f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
