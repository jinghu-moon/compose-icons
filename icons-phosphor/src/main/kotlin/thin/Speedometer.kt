package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorThinIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(117.17f, 157.17f),
                    PathNode.LineTo(213.17f, 61.17f),
                    PathNode.CurveTo(214.73297f, 59.607033f, 217.26703f, 59.607033f, 218.83f, 61.17f),
                    PathNode.CurveTo(220.39296f, 62.732967f, 220.39296f, 65.26704f, 218.83f, 66.83f),
                    PathNode.LineTo(122.83f, 162.83f),
                    PathNode.CurveTo(121.26704f, 164.39296f, 118.73296f, 164.39296f, 117.17f, 162.83f),
                    PathNode.CurveTo(115.60703f, 161.26703f, 115.60703f, 158.73297f, 117.17f, 157.17f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(135.38426f, 83.991806f, 142.72049f, 85.187485f, 149.72f, 87.54f),
                    PathNode.CurveTo(151.10857f, 88.17138f, 152.73537f, 87.958046f, 153.91418f, 86.98999f),
                    PathNode.CurveTo(155.09302f, 86.02194f, 155.61865f, 84.467705f, 155.2694f, 82.98285f),
                    PathNode.CurveTo(154.92014f, 81.498f, 153.75674f, 80.34105f, 152.27f, 80.0f),
                    PathNode.CurveTo(129.08118f, 72.18567f, 103.54828f, 76.01469f, 83.6717f, 90.287285f),
                    PathNode.CurveTo(63.795116f, 104.55989f, 52.006634f, 127.52991f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.003124f, 154.81952f, 52.156677f, 157.63687f, 52.46f, 160.44f),
                    PathNode.CurveTo(52.68526f, 162.47574f, 54.411873f, 164.01242f, 56.46f, 164.0f),
                    PathNode.LineTo(56.91f, 164.0f),
                    PathNode.CurveTo(57.96603f, 163.88438f, 58.932693f, 163.35344f, 59.596786f, 162.52426f),
                    PathNode.CurveTo(60.260883f, 161.69508f, 60.567856f, 160.63579f, 60.45f, 159.58f),
                    PathNode.CurveTo(58.29305f, 140.35062f, 64.43048f, 121.11303f, 77.325066f, 106.6856f),
                    PathNode.CurveTo(90.21965f, 92.25817f, 108.65004f, 84.007454f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.17f, 102.82f),
                    PathNode.CurveTo(223.56902f, 101.46505f, 222.26804f, 100.55351f, 220.7893f, 100.451324f),
                    PathNode.CurveTo(219.31058f, 100.34914f, 217.89658f, 101.07304f, 217.11491f, 102.33244f),
                    PathNode.CurveTo(216.33327f, 103.59185f, 216.31213f, 105.180244f, 217.06f, 106.46f),
                    PathNode.CurveTo(229.52248f, 130.9145f, 231.4234f, 159.40668f, 222.32f, 185.3f),
                    PathNode.CurveTo(221.76402f, 186.91786f, 220.24072f, 188.00305f, 218.53f, 188.0f),
                    PathNode.LineTo(37.46f, 188.0f),
                    PathNode.CurveTo(35.741962f, 187.9803f, 34.221348f, 186.88387f, 33.66f, 185.26f),
                    PathNode.CurveTo(20.072294f, 146.65555f, 31.366262f, 103.667885f, 62.174328f, 76.72735f),
                    PathNode.CurveTo(92.98239f, 49.786808f, 137.09216f, 44.32591f, 173.54f, 62.94f),
                    PathNode.CurveTo(174.81737f, 63.641445f, 176.37512f, 63.592705f, 177.60614f, 62.81277f),
                    PathNode.CurveTo(178.83714f, 62.032837f, 179.54659f, 60.645138f, 179.45795f, 59.19055f),
                    PathNode.CurveTo(179.36931f, 57.735966f, 178.49661f, 56.444683f, 177.18f, 55.82f),
                    PathNode.CurveTo(162.26773f, 48.160027f, 145.7642f, 44.111214f, 129.0f, 44.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(92.95987f, 44.018276f, 60.103886f, 61.02573f, 39.85846f, 89.62528f),
                    PathNode.CurveTo(19.613033f, 118.22482f, 14.491832f, 154.86554f, 26.12f, 187.92f),
                    PathNode.CurveTo(27.808905f, 192.74196f, 32.350864f, 195.97821f, 37.46f, 196.0f),
                    PathNode.LineTo(218.53f, 196.0f),
                    PathNode.CurveTo(223.62505f, 196.01115f, 228.17166f, 192.80367f, 229.87f, 188.0f),
                    PathNode.CurveTo(239.70044f, 160.03569f, 237.64035f, 129.26436f, 224.17f, 102.86f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
