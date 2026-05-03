package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorLightIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(168.0f, 34.0f),
                    PathNode.CurveTo(164.6863f, 34.0f, 162.0f, 36.68629f, 162.0f, 40.0f),
                    PathNode.CurveTo(162.0f, 43.31371f, 164.6863f, 46.0f, 168.0f, 46.0f),
                    PathNode.LineTo(201.52f, 46.0f),
                    PathNode.LineTo(168.0f, 79.52f),
                    PathNode.LineTo(148.24f, 59.76f),
                    PathNode.CurveTo(146.72757f, 58.2246f, 144.50783f, 57.618332f, 142.42488f, 58.171734f),
                    PathNode.CurveTo(140.34193f, 58.725124f, 138.71582f, 60.353165f, 138.16487f, 62.43676f),
                    PathNode.CurveTo(137.61394f, 64.520355f, 138.22284f, 66.73937f, 139.76f, 68.25f),
                    PathNode.LineTo(159.52f, 88.0f),
                    PathNode.LineTo(141.06f, 106.46f),
                    PathNode.CurveTo(112.38371f, 82.35927f, 69.810425f, 85.13075f, 44.50079f, 112.7459f),
                    PathNode.CurveTo(19.191153f, 140.36105f, 20.13231f, 183.01407f, 46.635406f, 209.48595f),
                    PathNode.CurveTo(73.1385f, 235.95782f, 115.7926f, 236.84872f, 143.3779f, 211.50655f),
                    PathNode.CurveTo(170.96321f, 186.16438f, 173.68451f, 143.58786f, 149.55f, 114.94f),
                    PathNode.LineTo(168.0f, 96.5f),
                    PathNode.LineTo(187.76f, 116.26f),
                    PathNode.CurveTo(190.10991f, 118.56931f, 193.88234f, 118.55177f, 196.21066f, 116.2207f),
                    PathNode.CurveTo(198.53899f, 113.889626f, 198.55208f, 110.11717f, 196.24f, 107.77f),
                    PathNode.LineTo(176.48f, 88.0f),
                    PathNode.LineTo(210.0f, 54.49f),
                    PathNode.LineTo(210.0f, 88.0f),
                    PathNode.CurveTo(210.0f, 91.313705f, 212.6863f, 94.0f, 216.0f, 94.0f),
                    PathNode.CurveTo(219.3137f, 94.0f, 222.0f, 91.313705f, 222.0f, 88.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(137.0f, 201.0f),
                    PathNode.CurveTo(117.42784f, 220.56052f, 86.76364f, 223.571f, 63.76111f, 208.19028f),
                    PathNode.CurveTo(40.758575f, 192.80956f, 31.824562f, 163.3216f, 42.422962f, 137.76074f),
                    PathNode.CurveTo(53.021362f, 112.19989f, 80.200226f, 97.68556f, 107.33741f, 103.09448f),
                    PathNode.CurveTo(134.4746f, 108.503395f, 154.01164f, 132.32903f, 154.0f, 160.0f),
                    PathNode.CurveTo(153.99353f, 175.38008f, 147.8786f, 190.12787f, 137.0f, 201.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
