package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorThinIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.83f, 130.83f),
                    PathNode.LineTo(226.83f, 154.83f),
                    PathNode.CurveTo(226.07973f, 155.58112f, 225.06163f, 156.00314f, 224.0f, 156.00314f),
                    PathNode.CurveTo(222.93837f, 156.00314f, 221.92027f, 155.58112f, 221.17f, 154.83f),
                    PathNode.LineTo(197.17f, 130.83f),
                    PathNode.CurveTo(195.60704f, 129.26703f, 195.60704f, 126.73296f, 197.17f, 125.17f),
                    PathNode.CurveTo(198.73297f, 123.60703f, 201.26703f, 123.60703f, 202.83f, 125.17f),
                    PathNode.LineTo(220.0f, 142.34f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.01198f, 88.03721f, 194.22386f, 52.637012f, 156.18225f, 40.395256f),
                    PathNode.CurveTo(118.14065f, 28.1535f, 76.54675f, 41.87023f, 53.25f, 74.34f),
                    PathNode.CurveTo(51.957653f, 76.134926f, 49.454926f, 76.54234f, 47.66f, 75.25f),
                    PathNode.CurveTo(45.865074f, 73.95766f, 45.457653f, 71.454926f, 46.75f, 69.66f),
                    PathNode.CurveTo(72.07405f, 34.364685f, 117.28842f, 19.455742f, 158.63951f, 32.765663f),
                    PathNode.CurveTo(199.9906f, 46.07558f, 228.01907f, 84.559616f, 228.0f, 128.0f),
                    PathNode.LineTo(228.0f, 142.34f),
                    PathNode.LineTo(245.17f, 125.17f),
                    PathNode.CurveTo(246.73297f, 123.60703f, 249.26703f, 123.60703f, 250.83f, 125.17f),
                    PathNode.CurveTo(252.39296f, 126.73296f, 252.39296f, 129.26703f, 250.83f, 130.83f),
                    PathNode.Close,
                    PathNode.MoveTo(209.23f, 186.34f),
                    PathNode.CurveTo(183.90053f, 221.61731f, 138.69719f, 236.51321f, 97.35743f, 223.20547f),
                    PathNode.CurveTo(56.017677f, 209.89774f, 27.993044f, 171.42892f, 28.0f, 128.0f),
                    PathNode.LineTo(28.0f, 113.66f),
                    PathNode.LineTo(10.83f, 130.83f),
                    PathNode.CurveTo(9.267035f, 132.39296f, 6.732966f, 132.39296f, 5.17f, 130.83f),
                    PathNode.CurveTo(3.607034f, 129.26703f, 3.607034f, 126.73296f, 5.17f, 125.17f),
                    PathNode.LineTo(29.17f, 101.17f),
                    PathNode.CurveTo(29.920273f, 100.418884f, 30.938362f, 99.99686f, 32.0f, 99.99686f),
                    PathNode.CurveTo(33.061638f, 99.99686f, 34.079727f, 100.418884f, 34.83f, 101.17f),
                    PathNode.LineTo(58.83f, 125.17f),
                    PathNode.CurveTo(60.392967f, 126.73296f, 60.392967f, 129.26703f, 58.83f, 130.83f),
                    PathNode.CurveTo(57.267033f, 132.39296f, 54.732967f, 132.39296f, 53.17f, 130.83f),
                    PathNode.LineTo(36.0f, 113.66f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(35.983883f, 152.32631f, 45.635426f, 175.66197f, 62.83f, 192.87f),
                    PathNode.CurveTo(72.767075f, 176.25659f, 88.69788f, 164.08748f, 107.34f, 158.87f),
                    PathNode.CurveTo(89.50537f, 149.38524f, 80.41982f, 128.97533f, 85.307434f, 109.37569f),
                    PathNode.CurveTo(90.195045f, 89.77605f, 107.80013f, 76.02203f, 128.0f, 76.02203f),
                    PathNode.CurveTo(148.19986f, 76.02203f, 165.80496f, 89.77605f, 170.69257f, 109.37569f),
                    PathNode.CurveTo(175.58017f, 128.97533f, 166.49463f, 149.38524f, 148.66f, 158.87f),
                    PathNode.CurveTo(167.31932f, 164.0986f, 183.2571f, 176.29535f, 193.18f, 192.94f),
                    PathNode.CurveTo(196.66458f, 189.45729f, 199.86168f, 185.69835f, 202.74f, 181.7f),
                    PathNode.CurveTo(204.03235f, 179.90784f, 206.53284f, 179.50266f, 208.325f, 180.795f),
                    PathNode.CurveTo(210.11716f, 182.08734f, 210.52234f, 184.58783f, 209.23f, 186.38f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(147.88223f, 156.0f, 164.0f, 139.88223f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 100.11775f, 147.88223f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(108.11775f, 84.0f, 92.0f, 100.11775f, 92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 139.88223f, 108.11775f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(149.63295f, 219.96828f, 170.56639f, 212.33327f, 187.14f, 198.43f),
                    PathNode.CurveTo(175.05891f, 177.14966f, 152.47551f, 164.00159f, 128.005f, 164.00159f),
                    PathNode.CurveTo(103.534485f, 164.00159f, 80.95109f, 177.14966f, 68.87f, 198.43f),
                    PathNode.CurveTo(85.41173f, 212.3816f, 106.36032f, 220.02344f, 128.0f, 220.0f),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
