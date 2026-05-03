package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorThinIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.66f, 55.46f),
                    PathNode.CurveTo(105.81066f, 52.60454f, 101.69923f, 51.404045f, 97.761055f, 52.27762f),
                    PathNode.CurveTo(93.82287f, 53.15119f, 90.60469f, 55.97756f, 89.23f, 59.77f),
                    PathNode.LineTo(36.73f, 204.15f),
                    PathNode.CurveTo(35.41757f, 207.75471f, 35.93776f, 211.77231f, 38.124985f, 214.9239f),
                    PathNode.CurveTo(40.312206f, 218.0755f, 43.893925f, 219.96838f, 47.73f, 220.0f),
                    PathNode.CurveTo(49.12227f, 219.99762f, 50.503284f, 219.75053f, 51.81f, 219.27f),
                    PathNode.LineTo(196.19f, 166.77f),
                    PathNode.CurveTo(199.98244f, 165.39531f, 202.8088f, 162.17712f, 203.68239f, 158.23895f),
                    PathNode.CurveTo(204.55595f, 154.30077f, 203.35545f, 150.18933f, 200.5f, 147.34f),
                    PathNode.Close,
                    PathNode.MoveTo(102.13f, 192.46f),
                    PathNode.LineTo(63.52f, 153.87f),
                    PathNode.LineTo(79.71f, 109.36f),
                    PathNode.LineTo(146.63f, 176.29f),
                    PathNode.Close,
                    PathNode.MoveTo(49.13f, 211.74f),
                    PathNode.CurveTo(47.743233f, 212.23563f, 46.195007f, 211.88766f, 45.15367f, 210.84633f),
                    PathNode.CurveTo(44.11233f, 209.805f, 43.764374f, 208.25677f, 44.26f, 206.87f),
                    PathNode.LineTo(60.53f, 162.15f),
                    PathNode.LineTo(93.85f, 195.47f),
                    PathNode.Close,
                    PathNode.MoveTo(195.93f, 156.49f),
                    PathNode.CurveTo(195.64973f, 157.7595f, 194.73515f, 158.79503f, 193.51f, 159.23f),
                    PathNode.LineTo(154.95f, 173.23f),
                    PathNode.LineTo(82.72f, 101.07f),
                    PathNode.LineTo(96.72f, 62.51f),
                    PathNode.CurveTo(97.154976f, 61.28485f, 98.1905f, 60.370262f, 99.46f, 60.09f),
                    PathNode.CurveTo(99.73966f, 60.031975f, 100.02439f, 60.001827f, 100.31f, 60.0f),
                    PathNode.CurveTo(101.323265f, 59.983715f, 102.29769f, 60.389423f, 103.0f, 61.12f),
                    PathNode.LineTo(194.88f, 153.0f),
                    PathNode.CurveTo(195.80429f, 153.9149f, 196.19334f, 155.24072f, 195.91f, 156.51f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 24.0f),
                    PathNode.CurveTo(220.0f, 33.68f, 214.15f, 52.0f, 192.0f, 52.0f),
                    PathNode.CurveTo(183.69f, 52.0f, 177.82f, 55.29f, 174.58f, 61.79f),
                    PathNode.CurveTo(173.03575f, 64.98287f, 172.1579f, 68.4568f, 172.0f, 72.0f),
                    PathNode.CurveTo(172.0f, 74.20914f, 170.20914f, 76.0f, 168.0f, 76.0f),
                    PathNode.CurveTo(165.79086f, 76.0f, 164.0f, 74.20914f, 164.0f, 72.0f),
                    PathNode.CurveTo(164.15793f, 67.21403f, 165.32327f, 62.515144f, 167.42f, 58.21f),
                    PathNode.CurveTo(170.66f, 51.73f, 177.56f, 44.0f, 192.0f, 44.0f),
                    PathNode.CurveTo(211.29f, 44.0f, 212.0f, 26.0f, 212.0f, 24.0f),
                    PathNode.CurveTo(212.0f, 21.790861f, 213.79086f, 20.0f, 216.0f, 20.0f),
                    PathNode.LineTo(216.0f, 20.0f),
                    PathNode.CurveTo(218.20914f, 20.0f, 220.0f, 21.790861f, 220.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(140.0f, 13.790861f, 141.79086f, 12.0f, 144.0f, 12.0f),
                    PathNode.CurveTo(146.20914f, 12.0f, 148.0f, 13.790861f, 148.0f, 16.0f),
                    PathNode.LineTo(148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 42.20914f, 146.20914f, 44.0f, 144.0f, 44.0f),
                    PathNode.CurveTo(141.79086f, 44.0f, 140.0f, 42.20914f, 140.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 125.17f),
                    PathNode.CurveTo(236.39296f, 126.73296f, 236.39296f, 129.26703f, 234.83f, 130.83f),
                    PathNode.CurveTo(233.26703f, 132.39296f, 230.73297f, 132.39296f, 229.17f, 130.83f),
                    PathNode.LineTo(213.17f, 114.83f),
                    PathNode.CurveTo(211.60704f, 113.26704f, 211.60704f, 110.73296f, 213.17f, 109.17f),
                    PathNode.CurveTo(214.73297f, 107.60703f, 217.26703f, 107.60703f, 218.83f, 109.17f),
                    PathNode.Close,
                    PathNode.MoveTo(241.26f, 75.8f),
                    PathNode.LineTo(217.26f, 83.8f),
                    PathNode.CurveTo(216.85341f, 83.93365f, 216.428f, 84.001175f, 216.0f, 84.0f),
                    PathNode.CurveTo(214.0427f, 83.9956f, 212.37605f, 82.57544f, 212.06111f, 80.64363f),
                    PathNode.CurveTo(211.74617f, 78.71182f, 212.87544f, 76.835846f, 214.73f, 76.21f),
                    PathNode.LineTo(238.73f, 68.21f),
                    PathNode.CurveTo(240.82591f, 67.51136f, 243.09135f, 68.64408f, 243.79f, 70.74f),
                    PathNode.CurveTo(244.48865f, 72.83592f, 243.35593f, 75.10136f, 241.26f, 75.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _confetti!!
    }

private var _confetti: ImageVector? = null
