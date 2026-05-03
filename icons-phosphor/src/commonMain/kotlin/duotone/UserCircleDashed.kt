package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorDuotoneIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.02905f, 155.22916f, 212.46487f, 181.1831f, 192.2f, 199.37f),
                    PathNode.CurveTo(179.91637f, 175.20868f, 155.10455f, 159.99309f, 128.0f, 160.0f),
                    PathNode.CurveTo(150.09138f, 160.0f, 168.0f, 142.09138f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 97.90861f, 150.09138f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(105.90861f, 80.0f, 88.0f, 97.90861f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 142.09138f, 105.90861f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(100.89545f, 159.99309f, 76.08363f, 175.20868f, 63.8f, 199.37f),
                    PathNode.LineTo(63.8f, 199.37f),
                    PathNode.CurveTo(31.026604f, 169.89107f, 22.540434f, 121.88109f, 43.2224f, 82.95347f),
                    PathNode.CurveTo(63.904366f, 44.02586f, 108.43899f, 24.18544f, 151.2117f, 34.843636f),
                    PathNode.CurveTo(193.98442f, 45.501827f, 224.0022f, 83.919365f, 224.0f, 128.0f),
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
                    PathNode.CurveTo(135.56996f, 39.054176f, 120.430046f, 39.054176f, 106.0f, 42.78f),
                    PathNode.CurveTo(103.9418f, 43.30752f, 101.75831f, 42.994614f, 99.9311f, 41.910297f),
                    PathNode.CurveTo(98.10389f, 40.825977f, 96.78308f, 39.059326f, 96.26f, 37.0f),
                    PathNode.Close,
                    PathNode.MoveTo(33.35f, 110.0f),
                    PathNode.CurveTo(35.39483f, 110.56798f, 37.581547f, 110.30017f, 39.428886f, 109.25554f),
                    PathNode.CurveTo(41.27623f, 108.2109f, 42.63278f, 106.47504f, 43.2f, 104.43f),
                    PathNode.CurveTo(47.18583f, 90.07366f, 54.756306f, 76.96641f, 65.2f, 66.34f),
                    PathNode.CurveTo(68.0928f, 63.159023f, 67.95388f, 58.260387f, 64.885475f, 55.248455f),
                    PathNode.CurveTo(61.817066f, 52.23652f, 56.9167f, 52.18862f, 53.79f, 55.14f),
                    PathNode.CurveTo(41.454678f, 67.69792f, 32.50869f, 83.18136f, 27.79f, 100.14f),
                    PathNode.CurveTo(27.21863f, 102.184845f, 27.483555f, 104.372955f, 28.526424f, 106.22236f),
                    PathNode.CurveTo(29.569292f, 108.07176f, 31.304558f, 109.430756f, 33.35f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 213.22f),
                    PathNode.CurveTo(135.56996f, 216.94583f, 120.430046f, 216.94583f, 106.0f, 213.22f),
                    PathNode.CurveTo(101.75204f, 212.1921f, 97.46535f, 214.76361f, 96.37258f, 218.99536f),
                    PathNode.CurveTo(95.27981f, 223.2271f, 97.78546f, 227.55263f, 102.0f, 228.71f),
                    PathNode.CurveTo(119.0543f, 233.10844f, 136.9457f, 233.10844f, 154.0f, 228.71f),
                    PathNode.CurveTo(158.21454f, 227.55263f, 160.7202f, 223.2271f, 159.62743f, 218.99536f),
                    PathNode.CurveTo(158.53465f, 214.76361f, 154.24797f, 212.1921f, 150.0f, 213.22f),
                    PathNode.Close,
                    PathNode.MoveTo(212.8f, 104.45f),
                    PathNode.CurveTo(213.98189f, 108.708115f, 218.39189f, 111.20189f, 222.65f, 110.02f),
                    PathNode.CurveTo(226.90811f, 108.83811f, 229.40189f, 104.42811f, 228.22f, 100.17f),
                    PathNode.CurveTo(223.50131f, 83.21136f, 214.55533f, 67.72792f, 202.22f, 55.17f),
                    PathNode.CurveTo(200.23518f, 53.050213f, 197.25752f, 52.172455f, 194.44023f, 52.876682f),
                    PathNode.CurveTo(191.62296f, 53.58091f, 189.40854f, 55.75652f, 188.6546f, 58.560905f),
                    PathNode.CurveTo(187.90067f, 61.36529f, 188.72563f, 64.35802f, 190.81f, 66.38f),
                    PathNode.CurveTo(201.23442f, 77.009926f, 208.79626f, 90.10727f, 212.79f, 104.45f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 155.84f),
                    PathNode.CurveTo(222.94731f, 174.92143f, 212.30098f, 192.08813f, 197.56f, 205.31f),
                    PathNode.CurveTo(195.71199f, 206.97803f, 193.19278f, 207.69069f, 190.74481f, 207.23795f),
                    PathNode.CurveTo(188.29686f, 206.7852f, 186.19917f, 205.21866f, 185.07f, 203.0f),
                    PathNode.CurveTo(174.16138f, 181.50719f, 152.10268f, 167.96576f, 128.0f, 167.96576f),
                    PathNode.CurveTo(103.89732f, 167.96576f, 81.83863f, 181.50719f, 70.93f, 203.0f),
                    PathNode.CurveTo(69.799934f, 205.21442f, 67.70459f, 206.7776f, 65.26f, 207.23f),
                    PathNode.CurveTo(64.778564f, 207.32066f, 64.289894f, 207.36752f, 63.8f, 207.37f),
                    PathNode.CurveTo(61.82474f, 207.37057f, 59.919098f, 206.64038f, 58.45f, 205.32f),
                    PathNode.CurveTo(43.7084f, 192.09053f, 33.062313f, 174.9173f, 27.77f, 155.83f),
                    PathNode.CurveTo(26.590872f, 151.57188f, 29.086885f, 147.16412f, 33.345f, 145.985f),
                    PathNode.CurveTo(37.603115f, 144.80588f, 42.01087f, 147.30186f, 43.19f, 151.56f),
                    PathNode.CurveTo(46.768505f, 164.48833f, 53.268997f, 176.42186f, 62.19f, 186.44f),
                    PathNode.CurveTo(71.116066f, 173.49348f, 83.67814f, 163.4821f, 98.29f, 157.67f),
                    PathNode.CurveTo(82.218f, 145.01817f, 75.92914f, 123.57128f, 82.62379f, 104.2436f),
                    PathNode.CurveTo(89.318436f, 84.91592f, 107.52572f, 71.9539f, 127.98f, 71.9539f),
                    PathNode.CurveTo(148.43428f, 71.9539f, 166.64157f, 84.91592f, 173.33621f, 104.2436f),
                    PathNode.CurveTo(180.03087f, 123.57128f, 173.74199f, 145.01817f, 157.67f, 157.67f),
                    PathNode.CurveTo(172.28186f, 163.4821f, 184.84393f, 173.49348f, 193.77f, 186.44f),
                    PathNode.CurveTo(202.69101f, 176.42186f, 209.1915f, 164.48833f, 212.77f, 151.56f),
                    PathNode.CurveTo(213.95189f, 147.30186f, 218.36188f, 144.8081f, 222.62f, 145.99f),
                    PathNode.CurveTo(226.87811f, 147.17189f, 229.37189f, 151.58188f, 228.19f, 155.84f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(145.67311f, 152.0f, 160.0f, 137.67311f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 102.32689f, 145.67311f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(110.32689f, 88.0f, 96.0f, 102.32689f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 137.67311f, 110.32689f, 152.0f, 128.0f, 152.0f),
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
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
