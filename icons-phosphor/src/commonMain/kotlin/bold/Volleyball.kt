package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorBoldIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.83f, 50.0f),
                    PathNode.CurveTo(102.5984f, 47.670925f, 108.60905f, 45.99385f, 114.75f, 45.0f),
                    PathNode.CurveTo(141.94946f, 58.517452f, 159.73314f, 85.665184f, 161.26f, 116.0f),
                    PathNode.LineTo(134.93f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.93f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(210.243f, 146.15616f, 208.66988f, 152.19373f, 206.44f, 158.0f),
                    PathNode.CurveTo(181.14615f, 174.76149f, 148.78271f, 176.59216f, 121.76f, 162.79f),
                    PathNode.Close,
                    PathNode.MoveTo(211.13f, 116.0f),
                    PathNode.LineTo(185.29f, 116.0f),
                    PathNode.CurveTo(184.6126f, 98.50412f, 179.66916f, 81.43896f, 170.89f, 66.29f),
                    PathNode.CurveTo(167.59103f, 60.575478f, 163.77863f, 55.17318f, 159.5f, 50.15f),
                    PathNode.CurveTo(187.16951f, 61.39143f, 206.81483f, 86.447495f, 211.13f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.07f, 62.05f),
                    PathNode.LineTo(89.0f, 84.39f),
                    PathNode.CurveTo(74.18782f, 93.7233f, 61.880848f, 106.534904f, 53.15f, 121.71f),
                    PathNode.CurveTo(49.848785f, 127.44594f, 47.077316f, 133.47087f, 44.87f, 139.71f),
                    PathNode.CurveTo(40.64157f, 110.10747f, 52.536716f, 80.49923f, 76.07f, 62.05f),
                    PathNode.Close,
                    PathNode.MoveTo(62.79f, 180.87f),
                    PathNode.CurveTo(60.932167f, 150.59828f, 75.53675f, 121.67578f, 101.0f, 105.2f),
                    PathNode.LineTo(114.14f, 128.0f),
                    PathNode.LineTo(76.07f, 194.0f),
                    PathNode.CurveTo(71.17279f, 190.12633f, 66.71905f, 185.7229f, 62.79f, 180.87f),
                    PathNode.Close,
                    PathNode.MoveTo(96.79f, 205.98f),
                    PathNode.LineTo(109.71f, 183.61f),
                    PathNode.CurveTo(125.211716f, 191.78036f, 142.47697f, 196.03403f, 160.0f, 196.0f),
                    PathNode.CurveTo(166.5703f, 195.9983f, 173.127f, 195.40254f, 179.59f, 194.22f),
                    PathNode.CurveTo(156.07774f, 212.62372f, 124.54354f, 217.11227f, 96.83f, 206.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
