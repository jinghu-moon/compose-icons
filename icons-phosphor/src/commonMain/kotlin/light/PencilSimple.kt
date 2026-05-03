package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorLightIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.9f, 74.78f),
                    PathNode.LineTo(181.21f, 30.09f),
                    PathNode.CurveTo(178.58444f, 27.464182f, 175.02328f, 25.98899f, 171.31f, 25.98899f),
                    PathNode.CurveTo(167.59673f, 25.98899f, 164.03555f, 27.464182f, 161.41f, 30.09f),
                    PathNode.LineTo(38.1f, 153.41f),
                    PathNode.CurveTo(35.468937f, 156.03197f, 33.993107f, 159.59555f, 34.0f, 163.31f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(92.69f, 222.0f),
                    PathNode.CurveTo(96.40445f, 222.0069f, 99.96804f, 220.53107f, 102.59f, 217.9f),
                    PathNode.LineTo(225.9f, 94.58f),
                    PathNode.CurveTo(228.52582f, 91.95445f, 230.001f, 88.39328f, 230.001f, 84.68f),
                    PathNode.CurveTo(230.001f, 80.96672f, 228.52582f, 77.405556f, 225.9f, 74.78f),
                    PathNode.Close,
                    PathNode.MoveTo(94.1f, 209.41f),
                    PathNode.CurveTo(93.72665f, 209.78558f, 93.219574f, 209.99777f, 92.69f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 163.31f),
                    PathNode.CurveTo(46.00223f, 162.78043f, 46.214413f, 162.27335f, 46.59f, 161.9f),
                    PathNode.LineTo(136.0f, 72.48f),
                    PathNode.LineTo(183.51f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.41f, 86.1f),
                    PathNode.LineTo(192.0f, 111.51f),
                    PathNode.LineTo(144.49f, 64.0f),
                    PathNode.LineTo(169.9f, 38.58f),
                    PathNode.CurveTo(170.27513f, 38.204445f, 170.78418f, 37.993427f, 171.315f, 37.993427f),
                    PathNode.CurveTo(171.84583f, 37.993427f, 172.35486f, 38.204445f, 172.73f, 38.58f),
                    PathNode.LineTo(217.41f, 83.27f),
                    PathNode.CurveTo(217.78555f, 83.645134f, 217.99657f, 84.15418f, 217.99657f, 84.685f),
                    PathNode.CurveTo(217.99657f, 85.21582f, 217.78555f, 85.72486f, 217.41f, 86.1f),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
