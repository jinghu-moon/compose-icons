package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorDuotoneIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(96.26f, 37.0f),
                    PathNode.CurveTo(95.177864f, 32.735622f, 97.742195f, 28.397709f, 102.0f, 27.29f),
                    PathNode.CurveTo(119.0543f, 22.891562f, 136.9457f, 22.891562f, 154.0f, 27.29f),
                    PathNode.CurveTo(157.90855f, 28.290716f, 160.46027f, 32.045303f, 159.95201f, 36.047794f),
                    PathNode.CurveTo(159.44377f, 40.05029f, 156.03462f, 43.047943f, 152.0f, 43.04f),
                    PathNode.CurveTo(151.32513f, 43.036472f, 150.65334f, 42.94914f, 150.0f, 42.78f),
                    PathNode.CurveTo(135.56946f, 39.05811f, 120.43054f, 39.05811f, 106.0f, 42.78f),
                    PathNode.CurveTo(103.9418f, 43.30752f, 101.75831f, 42.994614f, 99.9311f, 41.910297f),
                    PathNode.CurveTo(98.10389f, 40.825977f, 96.78308f, 39.059326f, 96.26f, 37.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.79f, 55.14f),
                    PathNode.CurveTo(41.454678f, 67.69792f, 32.50869f, 83.18136f, 27.79f, 100.14f),
                    PathNode.CurveTo(26.972263f, 102.91292f, 27.71419f, 105.9113f, 29.73067f, 107.98292f),
                    PathNode.CurveTo(31.74715f, 110.054535f, 34.724434f, 110.87705f, 37.5184f, 110.13439f),
                    PathNode.CurveTo(40.312363f, 109.39173f, 42.48829f, 107.19945f, 43.21f, 104.4f),
                    PathNode.CurveTo(47.198605f, 90.047745f, 54.768818f, 76.9444f, 65.21f, 66.32f),
                    PathNode.CurveTo(68.04625f, 63.12962f, 67.877914f, 58.274403f, 64.82752f, 55.288113f),
                    PathNode.CurveTo(61.777126f, 52.301823f, 56.91943f, 52.236637f, 53.79f, 55.14f),
                    PathNode.Close,
                    PathNode.MoveTo(43.21f, 151.55f),
                    PathNode.CurveTo(42.02811f, 147.29189f, 37.618114f, 144.79811f, 33.36f, 145.98f),
                    PathNode.CurveTo(29.101885f, 147.16188f, 26.60811f, 151.57188f, 27.79f, 155.83f),
                    PathNode.CurveTo(32.50869f, 172.78864f, 41.454678f, 188.27208f, 53.79f, 200.83f),
                    PathNode.CurveTo(55.774815f, 202.94978f, 58.752483f, 203.82755f, 61.56976f, 203.12332f),
                    PathNode.CurveTo(64.38704f, 202.4191f, 66.60146f, 200.24348f, 67.3554f, 197.4391f),
                    PathNode.CurveTo(68.10933f, 194.6347f, 67.28436f, 191.64198f, 65.2f, 189.62f),
                    PathNode.CurveTo(54.771954f, 178.99118f, 47.206608f, 165.89374f, 43.21f, 151.55f),
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
                    PathNode.CurveTo(220.60516f, 145.43202f, 218.41846f, 145.69983f, 216.5711f, 146.74446f),
                    PathNode.CurveTo(214.72377f, 147.78911f, 213.36722f, 149.52496f, 212.8f, 151.57f),
                    PathNode.CurveTo(208.81416f, 165.92635f, 201.2437f, 179.03358f, 190.8f, 189.66f),
                    PathNode.CurveTo(187.70444f, 192.81355f, 187.75145f, 197.87944f, 190.905f, 200.975f),
                    PathNode.CurveTo(194.05855f, 204.07056f, 199.12445f, 204.02356f, 202.22f, 200.87f),
                    PathNode.CurveTo(214.55357f, 188.31075f, 223.49928f, 172.82779f, 228.22f, 155.87f),
                    PathNode.CurveTo(228.79405f, 153.82243f, 228.52927f, 151.63057f, 227.48413f, 149.7786f),
                    PathNode.CurveTo(226.43901f, 147.92664f, 224.69954f, 146.56699f, 222.65f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.79f, 104.46f),
                    PathNode.CurveTo(213.9719f, 108.71812f, 218.38188f, 111.21189f, 222.64f, 110.03f),
                    PathNode.CurveTo(226.89812f, 108.848114f, 229.39189f, 104.43812f, 228.21f, 100.18f),
                    PathNode.CurveTo(223.49132f, 83.22136f, 214.54532f, 67.737915f, 202.21f, 55.18f),
                    PathNode.CurveTo(200.22519f, 53.06021f, 197.24751f, 52.182453f, 194.43024f, 52.88668f),
                    PathNode.CurveTo(191.61296f, 53.590908f, 189.39853f, 55.766518f, 188.6446f, 58.570904f),
                    PathNode.CurveTo(187.89067f, 61.375286f, 188.71564f, 64.36801f, 190.8f, 66.39f),
                    PathNode.CurveTo(201.2266f, 77.016f, 208.79184f, 90.10983f, 212.79f, 104.45f),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
