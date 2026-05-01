package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorLightIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.24f, 67.76f),
                    PathNode.CurveTo(185.89746f, 65.42037f, 182.10254f, 65.42037f, 179.76f, 67.76f),
                    PathNode.LineTo(149.52f, 98.0f),
                    PathNode.LineTo(106.52f, 98.0f),
                    PathNode.LineTo(76.24f, 67.76f),
                    PathNode.CurveTo(73.87592f, 65.55713f, 70.191925f, 65.62213f, 67.90703f, 67.90703f),
                    PathNode.CurveTo(65.62213f, 70.191925f, 65.55713f, 73.87592f, 67.76f, 76.24f),
                    PathNode.LineTo(98.0f, 106.48f),
                    PathNode.LineTo(98.0f, 149.48f),
                    PathNode.LineTo(67.76f, 179.76f),
                    PathNode.CurveTo(66.15478f, 181.25575f, 65.494f, 183.50844f, 66.03692f, 185.63431f),
                    PathNode.CurveTo(66.57983f, 187.76018f, 68.23982f, 189.42018f, 70.3657f, 189.96309f),
                    PathNode.CurveTo(72.491554f, 190.506f, 74.74423f, 189.84523f, 76.24f, 188.24f),
                    PathNode.LineTo(106.48f, 158.0f),
                    PathNode.LineTo(149.48f, 158.0f),
                    PathNode.LineTo(179.72f, 188.24f),
                    PathNode.CurveTo(182.08408f, 190.44287f, 185.76808f, 190.37787f, 188.05298f, 188.09297f),
                    PathNode.CurveTo(190.33788f, 185.80807f, 190.40288f, 182.12408f, 188.2f, 179.76f),
                    PathNode.LineTo(158.0f, 149.52f),
                    PathNode.LineTo(158.0f, 106.52f),
                    PathNode.LineTo(188.24f, 76.28f),
                    PathNode.CurveTo(189.37587f, 75.1534f, 190.01479f, 73.61983f, 190.01479f, 72.02f),
                    PathNode.CurveTo(190.01479f, 70.42017f, 189.37587f, 68.8866f, 188.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 110.0f),
                    PathNode.LineTo(146.0f, 110.0f),
                    PathNode.LineTo(146.0f, 146.0f),
                    PathNode.LineTo(110.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.39f, 62.0f),
                    PathNode.CurveTo(146.91747f, 43.565098f, 165.30475f, 32.074894f, 184.73547f, 34.288532f),
                    PathNode.CurveTo(204.16621f, 36.50217f, 219.49783f, 51.83379f, 221.71147f, 71.26452f),
                    PathNode.CurveTo(223.92511f, 90.69524f, 212.4349f, 109.082535f, 194.0f, 115.61f),
                    PathNode.CurveTo(193.35703f, 115.83436f, 192.68098f, 115.94929f, 192.0f, 115.95f),
                    PathNode.CurveTo(189.07431f, 115.95436f, 186.57204f, 113.84794f, 186.07742f, 110.964355f),
                    PathNode.CurveTo(185.58281f, 108.080765f, 187.24008f, 105.26087f, 190.0f, 104.29f),
                    PathNode.CurveTo(203.16962f, 99.6292f, 211.37909f, 86.49497f, 209.79851f, 72.61465f),
                    PathNode.CurveTo(208.21793f, 58.73431f, 197.26569f, 47.78207f, 183.38536f, 46.201496f),
                    PathNode.CurveTo(169.50502f, 44.620914f, 156.3708f, 52.830383f, 151.71f, 66.0f),
                    PathNode.CurveTo(150.60542f, 69.12593f, 147.17593f, 70.76458f, 144.05f, 69.66f),
                    PathNode.CurveTo(140.92409f, 68.55543f, 139.28543f, 65.12593f, 140.39f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 180.0f),
                    PathNode.CurveTo(222.01662f, 200.46878f, 207.27538f, 217.96858f, 187.10127f, 221.4294f),
                    PathNode.CurveTo(166.92719f, 224.89021f, 147.19632f, 213.30403f, 140.39f, 194.0f),
                    PathNode.CurveTo(139.28543f, 190.87407f, 140.92409f, 187.44456f, 144.05f, 186.34f),
                    PathNode.CurveTo(147.17593f, 185.23543f, 150.60542f, 186.87407f, 151.71f, 190.0f),
                    PathNode.CurveTo(156.3708f, 203.16962f, 169.50502f, 211.37909f, 183.38536f, 209.79851f),
                    PathNode.CurveTo(197.26569f, 208.21793f, 208.21793f, 197.26569f, 209.79851f, 183.38536f),
                    PathNode.CurveTo(211.37909f, 169.50502f, 203.16962f, 156.3708f, 190.0f, 151.71f),
                    PathNode.CurveTo(186.87407f, 150.60542f, 185.23543f, 147.17593f, 186.34f, 144.05f),
                    PathNode.CurveTo(187.44456f, 140.92409f, 190.87407f, 139.28543f, 194.0f, 140.39f),
                    PathNode.CurveTo(210.77185f, 146.34195f, 221.98416f, 162.20335f, 222.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.61f, 194.0f),
                    PathNode.CurveTo(109.082535f, 212.4349f, 90.69524f, 223.92511f, 71.26452f, 221.71147f),
                    PathNode.CurveTo(51.83379f, 219.49783f, 36.50217f, 204.16621f, 34.288532f, 184.73547f),
                    PathNode.CurveTo(32.074894f, 165.30475f, 43.565098f, 146.91747f, 62.0f, 140.39f),
                    PathNode.CurveTo(65.12593f, 139.28543f, 68.55543f, 140.92409f, 69.66f, 144.05f),
                    PathNode.CurveTo(70.76458f, 147.17593f, 69.12593f, 150.60542f, 66.0f, 151.71f),
                    PathNode.CurveTo(52.830383f, 156.3708f, 44.620914f, 169.50502f, 46.201496f, 183.38536f),
                    PathNode.CurveTo(47.78207f, 197.26569f, 58.73431f, 208.21793f, 72.61465f, 209.79851f),
                    PathNode.CurveTo(86.49497f, 211.37909f, 99.6292f, 203.16962f, 104.29f, 190.0f),
                    PathNode.CurveTo(105.39457f, 186.87407f, 108.824066f, 185.23543f, 111.95f, 186.34f),
                    PathNode.CurveTo(115.075935f, 187.44456f, 116.71457f, 190.87407f, 115.61f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(34.0f, 76.0f),
                    PathNode.CurveTo(33.98339f, 55.531216f, 48.72462f, 38.03142f, 68.89872f, 34.570602f),
                    PathNode.CurveTo(89.072815f, 31.109783f, 108.80368f, 42.695972f, 115.61f, 62.0f),
                    PathNode.CurveTo(116.71457f, 65.12593f, 115.075935f, 68.55543f, 111.95f, 69.66f),
                    PathNode.CurveTo(108.824066f, 70.76458f, 105.39457f, 69.12593f, 104.29f, 66.0f),
                    PathNode.CurveTo(99.6292f, 52.830383f, 86.49497f, 44.620914f, 72.61465f, 46.201496f),
                    PathNode.CurveTo(58.73431f, 47.78207f, 47.78207f, 58.73431f, 46.201496f, 72.61465f),
                    PathNode.CurveTo(44.620914f, 86.49497f, 52.830383f, 99.6292f, 66.0f, 104.29f),
                    PathNode.CurveTo(68.842926f, 105.20367f, 70.58127f, 108.06887f, 70.07854f, 111.01238f),
                    PathNode.CurveTo(69.575806f, 113.955894f, 66.985016f, 116.08171f, 64.0f, 116.0f),
                    PathNode.CurveTo(63.31901f, 115.99928f, 62.642967f, 115.88435f, 62.0f, 115.66f),
                    PathNode.CurveTo(45.210865f, 109.70191f, 33.994686f, 93.81499f, 34.0f, 76.0f),
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
        return _drone!!
    }

private var _drone: ImageVector? = null
