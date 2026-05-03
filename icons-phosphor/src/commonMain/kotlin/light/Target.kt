package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorLightIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.06f, 84.0f),
                    PathNode.CurveTo(242.69649f, 131.29736f, 225.80919f, 188.05234f, 180.99777f, 215.28076f),
                    PathNode.CurveTo(136.18636f, 242.50917f, 78.03318f, 231.35046f, 46.48284f, 189.46936f),
                    PathNode.CurveTo(14.932502f, 147.58826f, 20.251999f, 88.613594f, 58.787445f, 53.054214f),
                    PathNode.CurveTo(97.32289f, 17.494831f, 156.53421f, 16.922352f, 195.75f, 51.73f),
                    PathNode.LineTo(219.75f, 27.73f),
                    PathNode.CurveTo(222.0999f, 25.420685f, 225.87233f, 25.438229f, 228.20065f, 27.7693f),
                    PathNode.CurveTo(230.52899f, 30.100372f, 230.54208f, 33.872814f, 228.23f, 36.22f),
                    PathNode.LineTo(132.23f, 132.22f),
                    PathNode.CurveTo(130.71756f, 133.7554f, 128.49783f, 134.36166f, 126.41489f, 133.80827f),
                    PathNode.CurveTo(124.33194f, 133.25487f, 122.70582f, 131.62683f, 122.15488f, 129.54324f),
                    PathNode.CurveTo(121.603935f, 127.45964f, 122.21282f, 125.24062f, 123.75f, 123.73f),
                    PathNode.LineTo(153.14f, 94.33f),
                    PathNode.CurveTo(137.3652f, 82.53436f, 115.512276f, 83.28598f, 100.585205f, 96.13759f),
                    PathNode.CurveTo(85.658134f, 108.9892f, 81.66754f, 130.48782f, 90.98811f, 147.8403f),
                    PathNode.CurveTo(100.30868f, 165.19276f, 120.43614f, 173.73682f, 139.39328f, 168.38814f),
                    PathNode.CurveTo(158.35042f, 163.03947f, 171.04381f, 145.23515f, 169.92f, 125.57f),
                    PathNode.CurveTo(169.73222f, 122.256294f, 172.2663f, 119.41778f, 175.58f, 119.23f),
                    PathNode.CurveTo(178.8937f, 119.04222f, 181.73222f, 121.576294f, 181.92f, 124.89f),
                    PathNode.CurveTo(183.40363f, 150.3376f, 166.88985f, 173.35686f, 142.30872f, 180.10588f),
                    PathNode.CurveTo(117.72757f, 186.85489f, 91.77471f, 175.49527f, 80.05608f, 152.8578f),
                    PathNode.CurveTo(68.337456f, 130.22034f, 74.04508f, 102.4712f, 93.74686f, 86.29648f),
                    PathNode.CurveTo(113.44864f, 70.121765f, 141.77802f, 69.927284f, 161.7f, 85.83f),
                    PathNode.LineTo(187.24f, 60.28f),
                    PathNode.CurveTo(152.47961f, 29.969646f, 100.42221f, 30.875603f, 66.73755f, 62.37711f),
                    PathNode.CurveTo(33.05288f, 93.87862f, 28.66593f, 145.75876f, 56.58264f, 182.46922f),
                    PathNode.CurveTo(84.49935f, 219.1797f, 135.66547f, 228.81416f, 175.02194f, 204.77109f),
                    PathNode.CurveTo(214.3784f, 180.728f, 229.1607f, 130.80528f, 209.24f, 89.21f),
                    PathNode.CurveTo(207.8013f, 86.22214f, 209.05716f, 82.633705f, 212.045f, 81.195f),
                    PathNode.CurveTo(215.03287f, 79.7563f, 218.62129f, 81.01214f, 220.06f, 84.0f),
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
        return _target!!
    }

private var _target: ImageVector? = null
