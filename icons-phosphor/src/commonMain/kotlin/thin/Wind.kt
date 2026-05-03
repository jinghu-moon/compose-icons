package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorThinIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 199.46397f, 167.46397f, 212.0f, 152.0f, 212.0f),
                    PathNode.CurveTo(139.91f, 212.0f, 128.24f, 204.17f, 124.25f, 193.39f),
                    PathNode.CurveTo(123.7224f, 192.04306f, 123.963135f, 190.51622f, 124.879585f, 189.39697f),
                    PathNode.CurveTo(125.79604f, 188.27773f, 127.245384f, 187.74051f, 128.66994f, 187.99202f),
                    PathNode.CurveTo(130.09448f, 188.24353f, 131.27223f, 189.2446f, 131.75f, 190.61f),
                    PathNode.CurveTo(134.58f, 198.24f, 143.28f, 204.0f, 152.0f, 204.0f),
                    PathNode.CurveTo(163.0457f, 204.0f, 172.0f, 195.0457f, 172.0f, 184.0f),
                    PathNode.CurveTo(172.0f, 172.9543f, 163.0457f, 164.0f, 152.0f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(37.79086f, 164.0f, 36.0f, 162.20914f, 36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 157.79086f, 37.79086f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(152.0f, 156.0f),
                    PathNode.CurveTo(167.46397f, 156.0f, 180.0f, 168.53603f, 180.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 56.53603f, 135.46397f, 44.0f, 120.0f, 44.0f),
                    PathNode.CurveTo(107.91f, 44.0f, 96.24f, 51.83f, 92.25f, 62.61f),
                    PathNode.CurveTo(91.52984f, 64.66814f, 92.590744f, 66.92388f, 94.63531f, 67.68174f),
                    PathNode.CurveTo(96.67986f, 68.43958f, 98.95472f, 67.42029f, 99.75f, 65.39f),
                    PathNode.CurveTo(102.58f, 57.76f, 111.28f, 52.0f, 120.0f, 52.0f),
                    PathNode.CurveTo(131.0457f, 52.0f, 140.0f, 60.954304f, 140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 83.04569f, 131.0457f, 92.0f, 120.0f, 92.0f),
                    PathNode.LineTo(24.0f, 92.0f),
                    PathNode.CurveTo(21.790861f, 92.0f, 20.0f, 93.79086f, 20.0f, 96.0f),
                    PathNode.CurveTo(20.0f, 98.20914f, 21.790861f, 100.0f, 24.0f, 100.0f),
                    PathNode.LineTo(120.0f, 100.0f),
                    PathNode.CurveTo(135.46397f, 100.0f, 148.0f, 87.463974f, 148.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.CurveTo(195.91f, 76.0f, 184.24f, 83.83f, 180.25f, 94.61f),
                    PathNode.CurveTo(179.7224f, 95.95694f, 179.96313f, 97.48377f, 180.8796f, 98.60303f),
                    PathNode.CurveTo(181.79604f, 99.72227f, 183.24539f, 100.25949f, 184.66994f, 100.00798f),
                    PathNode.CurveTo(186.09448f, 99.75646f, 187.27225f, 98.7554f, 187.75f, 97.39f),
                    PathNode.CurveTo(190.58f, 89.76f, 199.28f, 84.0f, 208.0f, 84.0f),
                    PathNode.CurveTo(219.0457f, 84.0f, 228.0f, 92.95431f, 228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 115.04569f, 219.0457f, 124.0f, 208.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(29.790861f, 124.0f, 28.0f, 125.79086f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 130.20914f, 29.790861f, 132.0f, 32.0f, 132.0f),
                    PathNode.LineTo(208.0f, 132.0f),
                    PathNode.CurveTo(223.46397f, 132.0f, 236.0f, 119.463974f, 236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 88.536026f, 223.46397f, 76.0f, 208.0f, 76.0f),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
