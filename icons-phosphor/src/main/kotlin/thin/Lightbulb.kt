package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorThinIcon(
            name = "Lightbulb",
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
                    PathNode.CurveTo(204.00594f, 83.52244f, 195.7481f, 63.908947f, 181.09706f, 49.60239f),
                    PathNode.CurveTo(166.44601f, 35.295834f, 146.64163f, 27.506922f, 126.17f, 28.0f),
                    PathNode.CurveTo(85.0f, 29.0f, 51.77f, 63.27f, 52.0f, 104.43f),
                    PathNode.CurveTo(52.074554f, 127.66989f, 62.831047f, 149.58482f, 81.17f, 163.86f),
                    PathNode.CurveTo(88.00865f, 169.16885f, 92.006905f, 177.34258f, 92.0f, 186.0f),
                    PathNode.LineTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 194.20914f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(162.20914f, 196.0f, 164.0f, 194.20914f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 186.0f),
                    PathNode.CurveTo(164.02211f, 177.3075f, 168.06024f, 169.11311f, 174.94f, 163.8f),
                    PathNode.CurveTo(193.34007f, 149.4226f, 204.06586f, 127.35096f, 204.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.66f, 52.06f),
                    PathNode.CurveTo(134.54355f, 51.81456f, 132.60619f, 53.271175f, 132.25418f, 55.372528f),
                    PathNode.CurveTo(131.90218f, 57.47388f, 133.25911f, 59.482334f, 135.34f, 59.94f),
                    PathNode.CurveTo(153.53f, 63.0f, 169.0f, 78.45f, 172.06f, 96.67f),
                    PathNode.CurveTo(172.3865f, 98.59174f, 174.05072f, 99.9983f, 176.0f, 100.0f),
                    PathNode.CurveTo(176.22466f, 99.999435f, 176.44882f, 99.979355f, 176.67f, 99.94f),
                    PathNode.CurveTo(178.84491f, 99.56823f, 180.30803f, 97.50555f, 179.94f, 95.33f),
                    PathNode.CurveTo(175.99913f, 73.265915f, 158.72499f, 55.995773f, 136.66f, 52.06f),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
