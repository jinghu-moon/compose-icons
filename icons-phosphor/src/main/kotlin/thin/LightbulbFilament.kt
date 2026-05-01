package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorThinIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 232.0f),
                    PathNode.CurveTo(172.0f, 234.20914f, 170.20914f, 236.0f, 168.0f, 236.0f),
                    PathNode.LineTo(88.0f, 236.0f),
                    PathNode.CurveTo(85.79086f, 236.0f, 84.0f, 234.20914f, 84.0f, 232.0f),
                    PathNode.CurveTo(84.0f, 229.79086f, 85.79086f, 228.0f, 88.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(170.20914f, 228.0f, 172.0f, 229.79086f, 172.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0627f, 129.79489f, 200.2127f, 154.1739f, 179.89f, 170.06f),
                    PathNode.CurveTo(174.9365f, 173.8673f, 172.02345f, 179.75243f, 172.0f, 186.0f),
                    PathNode.LineTo(172.0f, 192.0f),
                    PathNode.CurveTo(172.0f, 198.62741f, 166.62741f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(89.37258f, 204.0f, 84.0f, 198.62741f, 84.0f, 192.0f),
                    PathNode.LineTo(84.0f, 186.0f),
                    PathNode.CurveTo(83.99779f, 179.81345f, 81.13268f, 173.97617f, 76.24f, 170.19f),
                    PathNode.CurveTo(55.961388f, 154.40466f, 44.07177f, 130.16814f, 44.0f, 104.47f),
                    PathNode.CurveTo(43.75f, 59.0f, 80.52f, 21.09f, 126.0f, 20.0f),
                    PathNode.CurveTo(148.62267f, 19.461212f, 170.50581f, 28.072758f, 186.69412f, 43.884586f),
                    PathNode.CurveTo(202.88243f, 59.69642f, 212.00641f, 81.370926f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.006f, 83.52066f, 195.7468f, 63.905598f, 181.09357f, 49.59874f),
                    PathNode.CurveTo(166.44032f, 35.29188f, 146.63335f, 27.504183f, 126.16f, 28.0f),
                    PathNode.CurveTo(85.0f, 29.0f, 51.77f, 63.27f, 52.0f, 104.43f),
                    PathNode.CurveTo(52.074554f, 127.66989f, 62.831047f, 149.58482f, 81.17f, 163.86f),
                    PathNode.CurveTo(88.00865f, 169.16885f, 92.006905f, 177.34258f, 92.0f, 186.0f),
                    PathNode.LineTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 194.20914f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 145.66f),
                    PathNode.LineTo(93.17f, 114.83f),
                    PathNode.CurveTo(91.60703f, 113.26704f, 91.60703f, 110.73296f, 93.17f, 109.17f),
                    PathNode.CurveTo(94.73296f, 107.60703f, 97.26704f, 107.60703f, 98.83f, 109.17f),
                    PathNode.LineTo(128.0f, 138.34f),
                    PathNode.LineTo(157.17f, 109.17f),
                    PathNode.CurveTo(158.73297f, 107.60703f, 161.26703f, 107.60703f, 162.83f, 109.17f),
                    PathNode.CurveTo(164.39296f, 110.73296f, 164.39296f, 113.26704f, 162.83f, 114.83f),
                    PathNode.LineTo(132.0f, 145.66f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(162.20914f, 196.0f, 164.0f, 194.20914f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 186.0f),
                    PathNode.CurveTo(164.02211f, 177.3075f, 168.06024f, 169.11311f, 174.94f, 163.8f),
                    PathNode.CurveTo(193.34007f, 149.4226f, 204.06586f, 127.35096f, 204.0f, 104.0f),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
