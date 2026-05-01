package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorFillIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 206.37f),
                    PathNode.CurveTo(142.87889f, 219.2098f, 113.1211f, 219.2098f, 88.0f, 206.37f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 160.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 195.83f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 167.16344f, 176.83656f, 160.0f, 168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(167.98987f, 136.09418f, 162.20714f, 129.38092f, 154.39f, 128.2f),
                    PathNode.LineTo(143.66f, 76.74f),
                    PathNode.CurveTo(142.1073f, 69.32886f, 135.57205f, 64.02091f, 128.0f, 64.02091f),
                    PathNode.CurveTo(120.427956f, 64.02091f, 113.8927f, 69.32886f, 112.34f, 76.74f),
                    PathNode.LineTo(101.61f, 128.2f),
                    PathNode.CurveTo(93.79287f, 129.38092f, 88.010124f, 136.09418f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(79.163445f, 160.0f, 72.0f, 167.16344f, 72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 195.83f),
                    PathNode.CurveTo(43.358433f, 172.20192f, 32.62875f, 133.13916f, 45.182014f, 98.195755f),
                    PathNode.CurveTo(57.735275f, 63.252354f, 90.87015f, 39.947754f, 128.0f, 39.947754f),
                    PathNode.CurveTo(165.12985f, 39.947754f, 198.26472f, 63.252354f, 210.818f, 98.195755f),
                    PathNode.CurveTo(223.37125f, 133.13916f, 212.64157f, 172.20192f, 184.0f, 195.83f),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
