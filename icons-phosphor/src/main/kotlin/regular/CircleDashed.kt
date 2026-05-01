package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorRegularIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.26f, 37.05f),
                    PathNode.CurveTo(95.725136f, 34.994495f, 96.029625f, 32.810665f, 97.106346f, 30.979858f),
                    PathNode.CurveTo(98.18307f, 29.149054f, 99.94364f, 27.821568f, 102.0f, 27.29f),
                    PathNode.CurveTo(119.0543f, 22.891562f, 136.9457f, 22.891562f, 154.0f, 27.29f),
                    PathNode.CurveTo(157.90855f, 28.290716f, 160.46027f, 32.045303f, 159.95201f, 36.047794f),
                    PathNode.CurveTo(159.44377f, 40.05029f, 156.03462f, 43.047943f, 152.0f, 43.04f),
                    PathNode.CurveTo(151.32513f, 43.036472f, 150.65334f, 42.94914f, 150.0f, 42.78f),
                    PathNode.CurveTo(135.56946f, 39.05811f, 120.43054f, 39.05811f, 106.0f, 42.78f),
                    PathNode.CurveTo(101.72885f, 43.881798f, 97.371796f, 41.318558f, 96.26f, 37.05f),
                    PathNode.Close,
                    PathNode.MoveTo(53.79f, 55.14f),
                    PathNode.CurveTo(41.45643f, 67.69925f, 32.51072f, 83.18221f, 27.79f, 100.14f),
                    PathNode.CurveTo(26.610872f, 104.39812f, 29.106884f, 108.80587f, 33.365f, 109.985f),
                    PathNode.CurveTo(37.623116f, 111.16413f, 42.030872f, 108.66811f, 43.21f, 104.41f),
                    PathNode.CurveTo(47.20071f, 90.05571f, 54.77052f, 76.949615f, 65.21f, 66.32f),
                    PathNode.CurveTo(68.04625f, 63.12962f, 67.877914f, 58.274403f, 64.82752f, 55.288113f),
                    PathNode.CurveTo(61.777126f, 52.301823f, 56.91943f, 52.236637f, 53.79f, 55.14f),
                    PathNode.Close,
                    PathNode.MoveTo(43.21f, 151.55f),
                    PathNode.CurveTo(42.02811f, 147.29189f, 37.618114f, 144.79811f, 33.36f, 145.98f),
                    PathNode.CurveTo(29.101885f, 147.16188f, 26.60811f, 151.57188f, 27.79f, 155.83f),
                    PathNode.CurveTo(32.513554f, 172.78659f, 41.458878f, 188.26889f, 53.79f, 200.83f),
                    PathNode.CurveTo(56.888317f, 203.98079f, 61.954216f, 204.02332f, 65.105f, 200.925f),
                    PathNode.CurveTo(68.25578f, 197.82668f, 68.29832f, 192.76079f, 65.2f, 189.61f),
                    PathNode.CurveTo(54.773403f, 178.98401f, 47.208153f, 165.89017f, 43.21f, 151.55f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 213.22f),
                    PathNode.CurveTo(135.56996f, 216.94583f, 120.430046f, 216.94583f, 106.0f, 213.22f),
                    PathNode.CurveTo(103.21578f, 212.45541f, 100.235596f, 213.25041f, 98.20213f, 215.30017f),
                    PathNode.CurveTo(96.16867f, 217.34991f, 95.39748f, 220.33635f, 96.184265f, 223.11438f),
                    PathNode.CurveTo(96.97104f, 225.89241f, 99.193695f, 228.03094f, 102.0f, 228.71f),
                    PathNode.CurveTo(119.0543f, 233.10844f, 136.9457f, 233.10844f, 154.0f, 228.71f),
                    PathNode.CurveTo(158.21454f, 227.55263f, 160.7202f, 223.2271f, 159.62743f, 218.99536f),
                    PathNode.CurveTo(158.53465f, 214.76361f, 154.24797f, 212.1921f, 150.0f, 213.22f),
                    PathNode.Close,
                    PathNode.MoveTo(222.65f, 146.0f),
                    PathNode.CurveTo(220.60382f, 145.43239f, 218.41591f, 145.70155f, 216.56833f, 146.74821f),
                    PathNode.CurveTo(214.72075f, 147.79486f, 213.36508f, 149.53311f, 212.8f, 151.58f),
                    PathNode.CurveTo(208.8114f, 165.93225f, 201.24118f, 179.0356f, 190.8f, 189.66f),
                    PathNode.CurveTo(187.70444f, 192.81355f, 187.75145f, 197.87944f, 190.905f, 200.975f),
                    PathNode.CurveTo(194.05855f, 204.07056f, 199.12445f, 204.02356f, 202.22f, 200.87f),
                    PathNode.CurveTo(214.55533f, 188.3121f, 223.50131f, 172.82864f, 228.22f, 155.87f),
                    PathNode.CurveTo(228.79405f, 153.82243f, 228.52927f, 151.63057f, 227.48413f, 149.7786f),
                    PathNode.CurveTo(226.43901f, 147.92664f, 224.69954f, 146.56699f, 222.65f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.79f, 104.46f),
                    PathNode.CurveTo(213.9719f, 108.71812f, 218.38188f, 111.21189f, 222.64f, 110.03f),
                    PathNode.CurveTo(226.89812f, 108.848114f, 229.39189f, 104.43812f, 228.21f, 100.18f),
                    PathNode.CurveTo(223.49132f, 83.22136f, 214.54532f, 67.737915f, 202.21f, 55.18f),
                    PathNode.CurveTo(199.11168f, 52.029217f, 194.04579f, 51.986683f, 190.895f, 55.085f),
                    PathNode.CurveTo(187.74422f, 58.18332f, 187.70168f, 63.249214f, 190.8f, 66.4f),
                    PathNode.CurveTo(201.23004f, 77.019455f, 208.79596f, 90.11102f, 212.79f, 104.45f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
