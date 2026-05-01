package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorThinIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.72f, 122.63f),
                    PathNode.LineTo(202.72f, 42.63f),
                    PathNode.CurveTo(200.7011f, 38.558613f, 196.54445f, 35.987846f, 192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(59.451954f, 35.98403f, 55.29049f, 38.555374f, 53.27f, 42.63f),
                    PathNode.LineTo(13.27f, 122.63f),
                    PathNode.CurveTo(11.408685f, 126.349655f, 11.606284f, 130.7679f, 13.792217f, 134.30653f),
                    PathNode.CurveTo(15.978151f, 137.84518f, 19.840635f, 139.9995f, 24.0f, 140.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(93.79086f, 212.0f, 92.0f, 213.79086f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 218.20914f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(162.20914f, 220.0f, 164.0f, 218.20914f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 213.79086f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(232.0f, 140.0f),
                    PathNode.CurveTo(236.15936f, 139.9995f, 240.02185f, 137.84518f, 242.20778f, 134.30653f),
                    PathNode.CurveTo(244.39372f, 130.7679f, 244.59131f, 126.349655f, 242.73f, 122.63f),
                    PathNode.Close,
                    PathNode.MoveTo(235.39f, 130.1f),
                    PathNode.CurveTo(234.67265f, 131.28532f, 233.38547f, 132.00676f, 232.0f, 132.0f),
                    PathNode.LineTo(24.0f, 132.0f),
                    PathNode.CurveTo(22.612951f, 132.00099f, 21.324396f, 131.28334f, 20.594948f, 130.10359f),
                    PathNode.CurveTo(19.8655f, 128.92384f, 19.799295f, 127.45042f, 20.42f, 126.21f),
                    PathNode.LineTo(60.42f, 46.21f),
                    PathNode.CurveTo(61.098255f, 44.854572f, 62.48434f, 43.998917f, 64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(193.51566f, 43.998917f, 194.90175f, 44.854572f, 195.58f, 46.21f),
                    PathNode.LineTo(235.58f, 126.21f),
                    PathNode.CurveTo(236.20676f, 127.44952f, 236.13458f, 128.92747f, 235.39f, 130.1f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 106.20914f, 186.20914f, 108.0f, 184.0f, 108.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.CurveTo(69.79086f, 108.0f, 68.0f, 106.20914f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 101.79086f, 69.79086f, 100.0f, 72.0f, 100.0f),
                    PathNode.LineTo(184.0f, 100.0f),
                    PathNode.CurveTo(186.20914f, 100.0f, 188.0f, 101.79086f, 188.0f, 104.0f),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
