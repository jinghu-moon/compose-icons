package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorFillIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 131.66f),
                    PathNode.CurveTo(184.81f, 146.66f, 172.66f, 151.95f, 161.63f, 151.95f),
                    PathNode.CurveTo(146.69f, 151.95f, 133.82f, 142.34f, 123.2f, 134.41f),
                    PathNode.CurveTo(104.0f, 120.07f, 91.31f, 110.6f, 70.0f, 134.89f),
                    PathNode.CurveTo(68.16561f, 137.21034f, 65.200615f, 138.32918f, 62.290634f, 137.7991f),
                    PathNode.CurveTo(59.380653f, 137.26904f, 57.00061f, 135.17659f, 56.102215f, 132.35846f),
                    PathNode.CurveTo(55.203823f, 129.54033f, 55.933704f, 126.45645f, 58.0f, 124.34f),
                    PathNode.CurveTo(89.05f, 88.93f, 114.34f, 107.81f, 132.8f, 121.59f),
                    PathNode.CurveTo(152.0f, 135.93f, 164.69f, 145.4f, 186.0f, 121.11f),
                    PathNode.CurveTo(187.83438f, 118.78966f, 190.79938f, 117.67083f, 193.70937f, 118.20089f),
                    PathNode.CurveTo(196.61934f, 118.73096f, 198.99939f, 120.82342f, 199.89778f, 123.64154f),
                    PathNode.CurveTo(200.79617f, 126.45967f, 200.0663f, 129.54355f, 198.0f, 131.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _tilde!!
    }

private var _tilde: ImageVector? = null
