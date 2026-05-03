package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorDuotoneIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 56.0f, 16.0f, 128.0f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 128.0f, 48.0f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 200.0f, 240.0f, 128.0f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 128.0f, 208.0f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(61.32f, 66.55f),
                    PathNode.CurveTo(25.0f, 88.84f, 9.38f, 123.2f, 8.69f, 124.76f),
                    PathNode.CurveTo(7.770128f, 126.82903f, 7.770128f, 129.19096f, 8.69f, 131.26f),
                    PathNode.CurveTo(9.04f, 132.05f, 17.51f, 150.83f, 36.34f, 169.66f),
                    PathNode.CurveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(145.92616f, 208.10213f, 163.6712f, 204.41136f, 180.07f, 197.17f),
                    PathNode.LineTo(202.07f, 221.38f),
                    PathNode.CurveTo(203.9819f, 223.53516f, 206.90494f, 224.49586f, 209.7226f, 223.89514f),
                    PathNode.CurveTo(212.54025f, 223.29443f, 214.81729f, 221.2251f, 215.68394f, 218.47755f),
                    PathNode.CurveTo(216.55061f, 215.73003f, 215.87303f, 212.7287f, 213.91f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(101.25f, 110.46f),
                    PathNode.LineTo(142.92f, 156.31f),
                    PathNode.CurveTo(130.01344f, 163.0999f, 114.148674f, 160.30446f, 104.340195f, 149.51207f),
                    PathNode.CurveTo(94.531715f, 138.71968f, 93.26097f, 122.660706f, 101.25f, 110.46f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(97.22f, 192.0f, 70.33f, 180.81f, 48.07f, 158.75f),
                    PathNode.CurveTo(38.933155f, 149.66982f, 31.162195f, 139.3119f, 25.0f, 128.0f),
                    PathNode.CurveTo(29.69f, 119.21f, 44.66f, 94.61f, 72.35f, 78.62f),
                    PathNode.LineTo(90.35f, 98.37f),
                    PathNode.CurveTo(75.96236f, 116.796906f, 76.94306f, 142.9093f, 92.672356f, 160.2051f),
                    PathNode.CurveTo(108.40164f, 177.5009f, 134.30397f, 180.94885f, 154.01f, 168.37f),
                    PathNode.LineTo(168.74f, 184.57f),
                    PathNode.CurveTo(155.73991f, 189.55756f, 141.9238f, 192.0773f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 96.57f),
                    PathNode.CurveTo(129.65904f, 95.74157f, 126.81158f, 91.55096f, 127.64f, 87.21f),
                    PathNode.CurveTo(128.46843f, 82.86904f, 132.65904f, 80.021576f, 137.0f, 80.85f),
                    PathNode.CurveTo(157.93991f, 84.90956f, 173.7151f, 102.25942f, 175.77f, 123.49f),
                    PathNode.CurveTo(176.18134f, 127.88891f, 172.94888f, 131.78842f, 168.55f, 132.2f),
                    PathNode.CurveTo(168.30022f, 132.21469f, 168.04979f, 132.21469f, 167.8f, 132.2f),
                    PathNode.CurveTo(163.65529f, 132.21777f, 160.18335f, 129.06699f, 159.8f, 124.94f),
                    PathNode.CurveTo(158.41718f, 110.81971f, 147.92595f, 99.283424f, 134.0f, 96.57f),
                    PathNode.Close,
                    PathNode.MoveTo(247.28f, 131.26f),
                    PathNode.CurveTo(246.86f, 132.2f, 236.73f, 154.63f, 213.92f, 175.06f),
                    PathNode.CurveTo(211.79874f, 177.02045f, 208.7854f, 177.68518f, 206.03622f, 176.79915f),
                    PathNode.CurveTo(203.28706f, 175.91312f, 201.22896f, 173.61392f, 200.65166f, 170.78375f),
                    PathNode.CurveTo(200.07436f, 167.9536f, 201.06749f, 165.03201f, 203.25f, 163.14f),
                    PathNode.CurveTo(214.44052f, 153.0862f, 223.84102f, 141.20369f, 231.05f, 128.0f),
                    PathNode.CurveTo(224.8742f, 116.67775f, 217.0862f, 106.312836f, 207.93f, 97.23f),
                    PathNode.CurveTo(185.67f, 75.19f, 158.78f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(121.51456f, 63.992085f, 115.03943f, 64.51719f, 108.64f, 65.57f),
                    PathNode.CurveTo(105.80814f, 66.0708f, 102.92539f, 65.01311f, 101.0894f, 62.79966f),
                    PathNode.CurveTo(99.25341f, 60.586212f, 98.746735f, 57.55764f, 99.76228f, 54.86713f),
                    PathNode.CurveTo(100.77784f, 52.176617f, 103.15935f, 50.238213f, 106.0f, 49.79f),
                    PathNode.CurveTo(113.27163f, 48.58934f, 120.62992f, 47.990643f, 128.0f, 48.0f),
                    PathNode.CurveTo(162.88f, 48.0f, 194.57f, 61.26f, 219.66f, 86.35f),
                    PathNode.CurveTo(238.49f, 105.18f, 246.96f, 123.97f, 247.31f, 124.76f),
                    PathNode.CurveTo(248.22987f, 126.82903f, 248.22987f, 129.19096f, 247.31f, 131.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
