package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorLightIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 219.3137f, 219.3137f, 222.0f, 216.0f, 222.0f),
                    PathNode.LineTo(72.0f, 222.0f),
                    PathNode.CurveTo(68.686295f, 222.0f, 66.0f, 219.3137f, 66.0f, 216.0f),
                    PathNode.CurveTo(66.0f, 212.6863f, 68.686295f, 210.0f, 72.0f, 210.0f),
                    PathNode.LineTo(216.0f, 210.0f),
                    PathNode.CurveTo(219.3137f, 210.0f, 222.0f, 212.6863f, 222.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 136.0f),
                    PathNode.LineTo(246.0f, 160.0f),
                    PathNode.CurveTo(246.0f, 163.3137f, 243.3137f, 166.0f, 240.0f, 166.0f),
                    PathNode.LineTo(61.07f, 166.0f),
                    PathNode.CurveTo(44.262974f, 166.07753f, 29.426744f, 155.04004f, 24.67f, 138.92f),
                    PathNode.LineTo(10.6f, 92.0f),
                    PathNode.CurveTo(9.337599f, 87.765785f, 10.148111f, 83.18412f, 12.78653f, 79.63997f),
                    PathNode.CurveTo(15.424949f, 76.095825f, 19.581608f, 74.00518f, 24.0f, 74.0f),
                    PathNode.LineTo(32.0f, 74.0f),
                    PathNode.CurveTo(33.590763f, 74.0014f, 35.11586f, 74.63446f, 36.24f, 75.76f),
                    PathNode.LineTo(58.49f, 98.0f),
                    PathNode.LineTo(84.59f, 98.0f),
                    PathNode.LineTo(74.73f, 68.43f),
                    PathNode.CurveTo(73.306435f, 64.16231f, 74.02051f, 59.47051f, 76.64926f, 55.81957f),
                    PathNode.CurveTo(79.27802f, 52.16863f, 83.501144f, 50.003414f, 88.0f, 50.0f),
                    PathNode.LineTo(96.0f, 50.0f),
                    PathNode.CurveTo(97.59423f, 49.998745f, 99.12341f, 50.632008f, 100.25f, 51.76f),
                    PathNode.LineTo(146.49f, 98.0f),
                    PathNode.LineTo(208.0f, 98.0f),
                    PathNode.CurveTo(228.98682f, 98.0f, 246.0f, 115.013176f, 246.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 136.0f),
                    PathNode.CurveTo(234.0f, 121.640594f, 222.3594f, 110.0f, 208.0f, 110.0f),
                    PathNode.LineTo(144.0f, 110.0f),
                    PathNode.CurveTo(142.40924f, 109.9986f, 140.88414f, 109.36554f, 139.76f, 108.24f),
                    PathNode.LineTo(93.52f, 62.0f),
                    PathNode.LineTo(88.0f, 62.0f),
                    PathNode.CurveTo(87.35725f, 61.999416f, 86.75339f, 62.30778f, 86.37698f, 62.828793f),
                    PathNode.CurveTo(86.00059f, 63.349804f, 85.89753f, 64.01997f, 86.1f, 64.63f),
                    PathNode.LineTo(98.6f, 102.1f),
                    PathNode.CurveTo(99.21083f, 103.929665f, 98.90475f, 105.94143f, 97.7774f, 107.50664f),
                    PathNode.CurveTo(96.650055f, 109.071846f, 94.838936f, 109.99961f, 92.91f, 110.0f),
                    PathNode.LineTo(56.0f, 110.0f),
                    PathNode.CurveTo(54.409237f, 109.9986f, 52.88414f, 109.36554f, 51.76f, 108.24f),
                    PathNode.LineTo(29.52f, 86.0f),
                    PathNode.LineTo(24.0f, 86.0f),
                    PathNode.CurveTo(23.36599f, 85.990776f, 22.767895f, 86.29356f, 22.4f, 86.81f),
                    PathNode.CurveTo(22.011656f, 87.309166f, 21.895576f, 87.96819f, 22.09f, 88.57f),
                    PathNode.LineTo(36.15f, 135.47f),
                    PathNode.CurveTo(39.410576f, 146.50188f, 49.566483f, 154.0536f, 61.07f, 154.0f),
                    PathNode.LineTo(234.0f, 154.0f),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
