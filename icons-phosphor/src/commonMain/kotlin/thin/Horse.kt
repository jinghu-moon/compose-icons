package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorThinIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 100.0f),
                    PathNode.CurveTo(132.0f, 104.41828f, 128.41827f, 108.0f, 124.0f, 108.0f),
                    PathNode.CurveTo(119.58172f, 108.0f, 116.0f, 104.41828f, 116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 95.58172f, 119.58172f, 92.0f, 124.0f, 92.0f),
                    PathNode.CurveTo(128.41827f, 92.0f, 132.0f, 95.58172f, 132.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 129.42f),
                    PathNode.CurveTo(227.09572f, 183.2607f, 183.83443f, 226.77803f, 130.0f, 228.0f),
                    PathNode.LineTo(127.91f, 228.0f),
                    PathNode.CurveTo(103.38558f, 228.1708f, 79.66429f, 219.2664f, 61.31f, 203.0f),
                    PathNode.CurveTo(59.653145f, 201.5254f, 59.505398f, 198.98685f, 60.98f, 197.33f),
                    PathNode.CurveTo(62.4546f, 195.67314f, 64.99315f, 195.5254f, 66.65f, 197.0f),
                    PathNode.CurveTo(73.79915f, 203.39339f, 81.93387f, 208.59029f, 90.74f, 212.39f),
                    PathNode.LineTo(122.09f, 169.28f),
                    PathNode.CurveTo(96.93f, 156.28f, 68.14f, 161.18f, 53.95f, 163.58f),
                    PathNode.CurveTo(43.410553f, 165.41913f, 32.74923f, 161.05823f, 26.52f, 152.36f),
                    PathNode.CurveTo(26.47f, 152.29f, 26.42f, 152.22f, 26.38f, 152.15f),
                    PathNode.LineTo(12.59f, 130.15f),
                    PathNode.CurveTo(12.028533f, 129.25722f, 11.848432f, 128.17662f, 12.09f, 127.15f),
                    PathNode.CurveTo(12.329758f, 126.111465f, 12.974085f, 125.21156f, 13.88f, 124.65f),
                    PathNode.LineTo(116.0f, 61.76f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(116.0f, 29.790861f, 117.79086f, 28.0f, 120.0f, 28.0f),
                    PathNode.LineTo(128.0f, 28.0f),
                    PathNode.CurveTo(154.76952f, 27.997301f, 180.4225f, 38.727688f, 199.2175f, 57.789574f),
                    PathNode.CurveTo(218.0125f, 76.851456f, 228.38013f, 102.653175f, 228.0f, 129.42f),
                    PathNode.Close,
                    PathNode.MoveTo(193.52f, 63.42f),
                    PathNode.CurveTo(176.27287f, 45.816097f, 152.64459f, 35.927708f, 128.0f, 36.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.LineTo(124.0f, 64.0f),
                    PathNode.CurveTo(124.00194f, 65.38953f, 123.28263f, 66.680504f, 122.1f, 67.41f),
                    PathNode.LineTo(21.53f, 129.29f),
                    PathNode.LineTo(33.11f, 147.81f),
                    PathNode.CurveTo(37.572224f, 153.958f, 45.146683f, 157.02736f, 52.63f, 155.72f),
                    PathNode.CurveTo(68.31f, 153.06f, 100.71f, 147.59f, 129.02f, 163.97f),
                    PathNode.CurveTo(152.92912f, 163.42647f, 172.0262f, 143.8853f, 172.02f, 119.97f),
                    PathNode.CurveTo(172.02f, 117.760864f, 173.81087f, 115.97f, 176.02f, 115.97f),
                    PathNode.CurveTo(178.22914f, 115.97f, 180.02f, 117.760864f, 180.02f, 119.97f),
                    PathNode.CurveTo(180.02686f, 147.90608f, 157.98312f, 170.86777f, 130.07f, 172.0f),
                    PathNode.LineTo(98.51f, 215.4f),
                    PathNode.CurveTo(108.6268f, 218.68608f, 119.22563f, 220.24124f, 129.86f, 220.0f),
                    PathNode.CurveTo(166.61768f, 219.26613f, 199.40924f, 196.71878f, 213.25258f, 162.65962f),
                    PathNode.CurveTo(227.0959f, 128.60045f, 219.33275f, 89.56966f, 193.51f, 63.4f),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
