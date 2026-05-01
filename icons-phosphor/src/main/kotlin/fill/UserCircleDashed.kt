package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorFillIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.CurveTo(47.190712f, 90.07571f, 54.76052f, 76.96962f, 65.2f, 66.34f),
                    PathNode.CurveTo(68.0928f, 63.159023f, 67.95388f, 58.260387f, 64.885475f, 55.248455f),
                    PathNode.CurveTo(61.817066f, 52.23652f, 56.9167f, 52.18862f, 53.79f, 55.14f),
                    PathNode.CurveTo(41.45643f, 67.69925f, 32.51072f, 83.18221f, 27.79f, 100.14f),
                    PathNode.CurveTo(27.21863f, 102.184845f, 27.483555f, 104.372955f, 28.526424f, 106.22236f),
                    PathNode.CurveTo(29.569292f, 108.07176f, 31.304558f, 109.430756f, 33.35f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.79f, 104.44f),
                    PathNode.CurveTo(213.9719f, 108.69811f, 218.38188f, 111.19189f, 222.64f, 110.01f),
                    PathNode.CurveTo(226.89812f, 108.82811f, 229.39189f, 104.41811f, 228.21f, 100.16f),
                    PathNode.CurveTo(223.49132f, 83.20136f, 214.54532f, 67.71792f, 202.21f, 55.16f),
                    PathNode.CurveTo(199.11168f, 52.009216f, 194.04579f, 51.966682f, 190.895f, 55.065f),
                    PathNode.CurveTo(187.74422f, 58.16332f, 187.70168f, 63.229214f, 190.8f, 66.38f),
                    PathNode.CurveTo(201.23294f, 77.0051f, 208.79906f, 90.103874f, 212.79f, 104.45f),
                    PathNode.Close,
                    PathNode.MoveTo(222.66f, 146.0f),
                    PathNode.CurveTo(220.61382f, 145.43239f, 218.42592f, 145.70155f, 216.57832f, 146.74821f),
                    PathNode.CurveTo(214.73074f, 147.79486f, 213.37508f, 149.53311f, 212.81f, 151.58f),
                    PathNode.CurveTo(209.22345f, 164.49017f, 202.72346f, 176.40569f, 193.81f, 186.41f),
                    PathNode.CurveTo(187.9773f, 177.9736f, 180.57202f, 170.74149f, 172.0f, 165.11f),
                    PathNode.CurveTo(170.50304f, 164.11708f, 168.52776f, 164.24385f, 167.17f, 165.42f),
                    PathNode.CurveTo(144.7016f, 184.86096f, 111.36839f, 184.86096f, 88.9f, 165.42f),
                    PathNode.CurveTo(87.540436f, 164.23885f, 85.55915f, 164.11195f, 84.06f, 165.11f),
                    PathNode.CurveTo(75.43275f, 170.66469f, 67.96205f, 177.83656f, 62.06f, 186.23f),
                    PathNode.CurveTo(53.231567f, 176.2535f, 46.79197f, 164.39684f, 43.23f, 151.56f),
                    PathNode.CurveTo(42.04811f, 147.30186f, 37.638115f, 144.8081f, 33.38f, 145.99f),
                    PathNode.CurveTo(29.121885f, 147.17189f, 26.62811f, 151.58188f, 27.81f, 155.84f),
                    PathNode.CurveTo(40.37581f, 200.80643f, 81.35083f, 231.90086f, 128.04f, 231.90086f),
                    PathNode.CurveTo(174.72917f, 231.90086f, 215.7042f, 200.80643f, 228.27f, 155.84f),
                    PathNode.CurveTo(228.83351f, 153.79112f, 228.55873f, 151.60223f, 227.50629f, 149.75623f),
                    PathNode.CurveTo(226.45383f, 147.9102f, 224.71017f, 146.55875f, 222.66f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(152.30052f, 164.0f, 172.0f, 144.30052f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 95.69947f, 152.30052f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(103.69947f, 76.0f, 84.0f, 95.69947f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.02756f, 144.28911f, 103.71089f, 163.97244f, 128.0f, 164.0f),
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
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
