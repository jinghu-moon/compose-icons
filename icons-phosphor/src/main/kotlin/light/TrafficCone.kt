package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorLightIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 210.0f),
                    PathNode.LineTo(212.27f, 210.0f),
                    PathNode.LineTo(151.54f, 35.4f),
                    PathNode.CurveTo(149.5812f, 29.769411f, 144.27156f, 25.996895f, 138.31f, 26.0f),
                    PathNode.LineTo(117.69f, 26.0f),
                    PathNode.CurveTo(111.728424f, 25.996895f, 106.4188f, 29.769411f, 104.46f, 35.4f),
                    PathNode.LineTo(43.73f, 210.0f),
                    PathNode.LineTo(24.0f, 210.0f),
                    PathNode.CurveTo(20.68629f, 210.0f, 18.0f, 212.6863f, 18.0f, 216.0f),
                    PathNode.CurveTo(18.0f, 219.3137f, 20.68629f, 222.0f, 24.0f, 222.0f),
                    PathNode.LineTo(232.0f, 222.0f),
                    PathNode.CurveTo(235.3137f, 222.0f, 238.0f, 219.3137f, 238.0f, 216.0f),
                    PathNode.CurveTo(238.0f, 212.6863f, 235.3137f, 210.0f, 232.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 102.0f),
                    PathNode.LineTo(162.0f, 102.0f),
                    PathNode.LineTo(180.08f, 154.0f),
                    PathNode.LineTo(75.92f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.8f, 39.34f),
                    PathNode.CurveTo(116.0808f, 38.53676f, 116.83909f, 37.999138f, 117.69f, 38.0f),
                    PathNode.LineTo(138.31f, 38.0f),
                    PathNode.CurveTo(139.16089f, 37.999138f, 139.9192f, 38.53676f, 140.2f, 39.34f),
                    PathNode.LineTo(157.82f, 90.0f),
                    PathNode.LineTo(98.18f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.74f, 166.0f),
                    PathNode.LineTo(184.26f, 166.0f),
                    PathNode.LineTo(199.56f, 210.0f),
                    PathNode.LineTo(56.44f, 210.0f),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
