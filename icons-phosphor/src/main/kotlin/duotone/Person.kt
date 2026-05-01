package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorDuotoneIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 26.745167f, 114.74516f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(141.25484f, 16.0f, 152.0f, 26.745167f, 152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 53.254833f, 141.25484f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(114.74516f, 64.0f, 104.0f, 53.254833f, 104.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.49f, 139.51f),
                    PathNode.LineTo(167.17f, 88.13f),
                    PathNode.CurveTo(162.61484f, 82.96232f, 156.05873f, 80.001144f, 149.17f, 80.0f),
                    PathNode.LineTo(106.83f, 80.0f),
                    PathNode.CurveTo(99.94128f, 80.001144f, 93.38517f, 82.96232f, 88.83f, 88.13f),
                    PathNode.LineTo(43.51f, 139.51f),
                    PathNode.CurveTo(38.81558f, 144.20442f, 38.81558f, 151.81558f, 43.51f, 156.51f),
                    PathNode.CurveTo(48.20442f, 161.20442f, 55.81558f, 161.20442f, 60.51f, 156.51f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.LineTo(73.13f, 214.93f),
                    PathNode.CurveTo(70.443275f, 220.91508f, 73.06099f, 227.94843f, 79.00703f, 230.7205f),
                    PathNode.CurveTo(84.95306f, 233.4926f, 92.02313f, 230.97577f, 94.88f, 225.07f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.LineTo(161.12f, 225.07f),
                    PathNode.CurveTo(163.97687f, 230.97577f, 171.04695f, 233.4926f, 176.99298f, 230.7205f),
                    PathNode.CurveTo(182.93901f, 227.94843f, 185.55673f, 220.91508f, 182.87f, 214.93f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.LineTo(195.51f, 156.49f),
                    PathNode.CurveTo(200.20442f, 161.18442f, 207.81558f, 161.18442f, 212.51f, 156.49f),
                    PathNode.CurveTo(217.20442f, 151.79558f, 217.20442f, 144.18442f, 212.51f, 139.49f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 22.326887f, 145.67311f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(110.32689f, 8.0f, 96.0f, 22.326887f, 96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 57.67311f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 57.67311f, 160.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(119.163445f, 56.0f, 112.0f, 48.836555f, 112.0f, 40.0f),
                    PathNode.CurveTo(112.0f, 31.163445f, 119.163445f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(136.83656f, 24.0f, 144.0f, 31.163445f, 144.0f, 40.0f),
                    PathNode.CurveTo(144.0f, 48.836555f, 136.83656f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.34f, 134.05f),
                    PathNode.LineTo(173.17f, 82.83f),
                    PathNode.CurveTo(167.09462f, 75.94347f, 158.3534f, 71.99899f, 149.17f, 72.0f),
                    PathNode.LineTo(106.83f, 72.0f),
                    PathNode.CurveTo(97.64661f, 71.99899f, 88.90538f, 75.94347f, 82.83f, 82.83f),
                    PathNode.LineTo(37.66f, 134.05f),
                    PathNode.CurveTo(30.028057f, 141.85558f, 30.065144f, 154.33905f, 37.743332f, 162.09914f),
                    PathNode.CurveTo(45.42152f, 169.8592f, 57.903923f, 170.02872f, 65.79f, 162.48f),
                    PathNode.LineTo(82.09f, 149.4f),
                    PathNode.LineTo(65.55f, 212.28f),
                    PathNode.CurveTo(60.98813f, 222.34538f, 65.44961f, 234.20312f, 75.515f, 238.765f),
                    PathNode.CurveTo(85.58039f, 243.32687f, 97.438126f, 238.86539f, 102.0f, 228.8f),
                    PathNode.LineTo(128.0f, 183.93f),
                    PathNode.LineTo(154.0f, 228.8f),
                    PathNode.CurveTo(158.75816f, 238.51228f, 170.3752f, 242.68257f, 180.22404f, 238.21394f),
                    PathNode.CurveTo(190.0729f, 233.7453f, 194.58519f, 222.25679f, 190.41f, 212.28f),
                    PathNode.LineTo(173.91f, 149.4f),
                    PathNode.LineTo(190.21f, 162.48f),
                    PathNode.CurveTo(198.09608f, 170.02872f, 210.57848f, 169.8592f, 218.25667f, 162.09914f),
                    PathNode.CurveTo(225.93486f, 154.33905f, 225.97194f, 141.85558f, 218.34f, 134.05f),
                    PathNode.Close,
                    PathNode.MoveTo(206.83f, 150.82f),
                    PathNode.CurveTo(206.07973f, 151.5711f, 205.06163f, 151.99315f, 204.0f, 151.99315f),
                    PathNode.CurveTo(202.93837f, 151.99315f, 201.92027f, 151.5711f, 201.17f, 150.82f),
                    PathNode.CurveTo(200.96f, 150.62f, 200.75f, 150.42f, 200.52f, 150.24f),
                    PathNode.LineTo(165.0f, 121.76f),
                    PathNode.CurveTo(162.31174f, 119.614105f, 158.55267f, 119.42682f, 155.66443f, 121.29489f),
                    PathNode.CurveTo(152.7762f, 123.16296f, 151.40536f, 126.66815f, 152.26f, 130.0f),
                    PathNode.LineTo(175.14f, 217.0f),
                    PathNode.CurveTo(175.2578f, 217.46391f, 175.4185f, 217.91583f, 175.62f, 218.35f),
                    PathNode.CurveTo(176.24825f, 219.64873f, 176.12846f, 221.18513f, 175.3065f, 222.37079f),
                    PathNode.CurveTo(174.48456f, 223.55646f, 173.08781f, 224.20763f, 171.65123f, 224.0749f),
                    PathNode.CurveTo(170.21465f, 223.94218f, 168.96083f, 223.04617f, 168.37f, 221.73f),
                    PathNode.CurveTo(168.27205f, 221.5139f, 168.16187f, 221.30357f, 168.04f, 221.1f),
                    PathNode.LineTo(134.92f, 164.0f),
                    PathNode.CurveTo(133.48882f, 161.53276f, 130.85228f, 160.01418f, 128.0f, 160.01418f),
                    PathNode.CurveTo(125.14773f, 160.01418f, 122.51119f, 161.53276f, 121.08f, 164.0f),
                    PathNode.LineTo(88.0f, 221.05f),
                    PathNode.CurveTo(87.87813f, 221.25357f, 87.76795f, 221.46391f, 87.67f, 221.68f),
                    PathNode.CurveTo(87.22136f, 222.64267f, 86.40827f, 223.3874f, 85.41f, 223.75f),
                    PathNode.CurveTo(83.8887f, 224.3076f, 82.18129f, 223.89238f, 81.08594f, 222.69844f),
                    PathNode.CurveTo(79.990585f, 221.50452f, 79.72368f, 219.76773f, 80.41f, 218.3f),
                    PathNode.CurveTo(80.6115f, 217.86586f, 80.772194f, 217.41391f, 80.89f, 216.95f),
                    PathNode.LineTo(103.74f, 130.0f),
                    PathNode.CurveTo(104.59464f, 126.66815f, 103.223816f, 123.16296f, 100.33556f, 121.29489f),
                    PathNode.CurveTo(97.44732f, 119.42682f, 93.68826f, 119.614105f, 91.0f, 121.76f),
                    PathNode.LineTo(55.48f, 150.24f),
                    PathNode.CurveTo(55.25f, 150.42f, 55.04f, 150.62f, 54.83f, 150.82f),
                    PathNode.CurveTo(53.829807f, 151.8746f, 52.336254f, 152.30367f, 50.928837f, 151.94072f),
                    PathNode.CurveTo(49.52141f, 151.57776f, 48.421627f, 150.47992f, 48.056187f, 149.07314f),
                    PathNode.CurveTo(47.690746f, 147.66637f, 48.11717f, 146.17206f, 49.17f, 145.17f),
                    PathNode.CurveTo(49.29f, 145.05f, 49.4f, 144.93f, 49.51f, 144.8f),
                    PathNode.LineTo(94.83f, 93.41f),
                    PathNode.CurveTo(97.86861f, 89.96859f, 102.23909f, 87.99823f, 106.83f, 88.0f),
                    PathNode.LineTo(149.17f, 88.0f),
                    PathNode.CurveTo(153.76091f, 87.99823f, 158.1314f, 89.96859f, 161.17f, 93.41f),
                    PathNode.LineTo(206.49f, 144.8f),
                    PathNode.CurveTo(206.6f, 144.93f, 206.71f, 145.05f, 206.83f, 145.17f),
                    PathNode.CurveTo(208.38753f, 146.73131f, 208.38753f, 149.2587f, 206.83f, 150.82f),
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
        return _person!!
    }

private var _person: ImageVector? = null
