package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorThinIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.32f, 119.12f),
                    PathNode.LineTo(136.88f, 15.68f),
                    PathNode.CurveTo(134.52596f, 13.322863f, 131.33131f, 11.998377f, 128.0f, 11.998377f),
                    PathNode.CurveTo(124.668686f, 11.998377f, 121.47405f, 13.322863f, 119.12f, 15.68f),
                    PathNode.LineTo(15.68f, 119.12f),
                    PathNode.CurveTo(13.322863f, 121.47405f, 11.998377f, 124.668686f, 11.998377f, 128.0f),
                    PathNode.CurveTo(11.998377f, 131.33131f, 13.322863f, 134.52596f, 15.68f, 136.88f),
                    PathNode.LineTo(119.12f, 240.32f),
                    PathNode.LineTo(119.12f, 240.32f),
                    PathNode.CurveTo(121.47405f, 242.67714f, 124.668686f, 244.00162f, 128.0f, 244.00162f),
                    PathNode.CurveTo(131.33131f, 244.00162f, 134.52596f, 242.67714f, 136.88f, 240.32f),
                    PathNode.LineTo(240.32f, 136.88f),
                    PathNode.CurveTo(242.67714f, 134.52596f, 244.00162f, 131.33131f, 244.00162f, 128.0f),
                    PathNode.CurveTo(244.00162f, 124.668686f, 242.67714f, 121.47405f, 240.32f, 119.12f),
                    PathNode.Close,
                    PathNode.MoveTo(234.66f, 131.22f),
                    PathNode.LineTo(131.22f, 234.67f),
                    PathNode.CurveTo(129.44022f, 236.44492f, 126.55978f, 236.44492f, 124.78f, 234.67f),
                    PathNode.LineTo(124.78f, 234.67f),
                    PathNode.LineTo(21.33f, 131.22f),
                    PathNode.CurveTo(20.475079f, 130.3665f, 19.994667f, 129.20804f, 19.994667f, 128.0f),
                    PathNode.CurveTo(19.994667f, 126.79196f, 20.475079f, 125.63351f, 21.33f, 124.78f),
                    PathNode.LineTo(124.78f, 21.33f),
                    PathNode.CurveTo(126.55978f, 19.555077f, 129.44022f, 19.555077f, 131.22f, 21.33f),
                    PathNode.LineTo(234.67f, 124.78f),
                    PathNode.CurveTo(235.52492f, 125.63351f, 236.00533f, 126.79196f, 236.00533f, 128.0f),
                    PathNode.CurveTo(236.00533f, 129.20804f, 235.52492f, 130.3665f, 234.67f, 131.22f),
                    PathNode.Close,
                    PathNode.MoveTo(170.83f, 117.22f),
                    PathNode.CurveTo(171.58112f, 117.97027f, 172.00314f, 118.988365f, 172.00314f, 120.05f),
                    PathNode.CurveTo(172.00314f, 121.11163f, 171.58112f, 122.12973f, 170.83f, 122.88f),
                    PathNode.LineTo(146.83f, 146.88f),
                    PathNode.CurveTo(145.26703f, 148.44296f, 142.73297f, 148.44296f, 141.17f, 146.88f),
                    PathNode.CurveTo(139.60704f, 145.31702f, 139.60704f, 142.78296f, 141.17f, 141.22f),
                    PathNode.LineTo(158.34f, 124.0f),
                    PathNode.LineTo(112.0f, 124.0f),
                    PathNode.CurveTo(100.95431f, 124.0f, 92.0f, 132.9543f, 92.0f, 144.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 154.20914f, 90.20914f, 156.0f, 88.0f, 156.0f),
                    PathNode.CurveTo(85.79086f, 156.0f, 84.0f, 154.20914f, 84.0f, 152.0f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 128.53603f, 96.536026f, 116.0f, 112.0f, 116.0f),
                    PathNode.LineTo(158.34f, 116.0f),
                    PathNode.LineTo(141.17f, 98.83f),
                    PathNode.CurveTo(139.60704f, 97.26704f, 139.60704f, 94.73296f, 141.17f, 93.17f),
                    PathNode.CurveTo(142.73297f, 91.60703f, 145.26703f, 91.60703f, 146.83f, 93.17f),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
