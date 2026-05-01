package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorDuotoneIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.01257f, 163.7945f, 230.01741f, 175.50507f, 226.1f, 186.63f),
                    PathNode.CurveTo(224.97899f, 189.85039f, 221.93991f, 192.00624f, 218.53f, 192.0f),
                    PathNode.LineTo(37.46f, 192.0f),
                    PathNode.CurveTo(34.044476f, 191.98523f, 31.0101f, 189.81667f, 29.89f, 186.59f),
                    PathNode.CurveTo(25.891424f, 175.22014f, 23.89846f, 163.24205f, 24.0f, 151.19f),
                    PathNode.CurveTo(24.44f, 94.0f, 71.73f, 47.49f, 129.0f, 48.0f),
                    PathNode.CurveTo(186.0467f, 48.54855f, 232.00264f, 94.95065f, 232.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(114.34f, 154.34f),
                    PathNode.LineTo(210.34f, 58.34f),
                    PathNode.CurveTo(213.46593f, 55.21407f, 218.53407f, 55.21407f, 221.66f, 58.34f),
                    PathNode.CurveTo(224.78593f, 61.46593f, 224.78593f, 66.534065f, 221.66f, 69.66f),
                    PathNode.LineTo(125.66f, 165.66f),
                    PathNode.CurveTo(122.534065f, 168.78593f, 117.465935f, 168.78593f, 114.34f, 165.66f),
                    PathNode.CurveTo(111.214066f, 162.53407f, 111.214066f, 157.46593f, 114.34f, 154.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(134.94908f, 87.991196f, 141.85306f, 89.11597f, 148.44f, 91.33f),
                    PathNode.CurveTo(151.16187f, 92.295006f, 154.19255f, 91.718155f, 156.36958f, 89.8207f),
                    PathNode.CurveTo(158.54663f, 87.923256f, 159.53204f, 84.99977f, 158.94788f, 82.1716f),
                    PathNode.CurveTo(158.36371f, 79.34343f, 156.30064f, 77.04962f, 153.55f, 76.17f),
                    PathNode.CurveTo(127.640274f, 67.43516f, 99.063965f, 72.53798f, 77.77865f, 89.70034f),
                    PathNode.CurveTo(56.49334f, 106.862724f, 45.447456f, 133.70732f, 48.49f, 160.88f),
                    PathNode.CurveTo(48.938065f, 164.92863f, 52.356655f, 167.99417f, 56.43f, 168.0f),
                    PathNode.CurveTo(56.72f, 168.0f, 57.02f, 168.0f, 57.32f, 167.95f),
                    PathNode.CurveTo(61.710247f, 167.46323f, 64.87518f, 163.51042f, 64.39f, 159.12f),
                    PathNode.CurveTo(64.12966f, 156.7556f, 63.999462f, 154.3787f, 64.0f, 152.0f),
                    PathNode.CurveTo(64.03858f, 116.66977f, 92.66977f, 88.03858f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.74f, 101.0f),
                    PathNode.CurveTo(225.72417f, 97.06773f, 220.90227f, 95.51416f, 216.97f, 97.53f),
                    PathNode.CurveTo(213.03773f, 99.54584f, 211.48416f, 104.36773f, 213.5f, 108.3f),
                    PathNode.CurveTo(225.46085f, 131.78804f, 227.26807f, 159.15298f, 218.5f, 184.01f),
                    PathNode.LineTo(37.4f, 183.94f),
                    PathNode.CurveTo(27.148003f, 154.55261f, 31.74088f, 122.02157f, 49.728073f, 96.62112f),
                    PathNode.CurveTo(67.71526f, 71.22066f, 96.87582f, 56.08708f, 128.0f, 56.0f),
                    PathNode.LineTo(128.88f, 56.0f),
                    PathNode.CurveTo(143.77924f, 56.09369f, 158.44756f, 59.690544f, 171.7f, 66.5f),
                    PathNode.CurveTo(174.25264f, 67.90487f, 177.36722f, 67.810814f, 179.83044f, 66.254486f),
                    PathNode.CurveTo(182.29366f, 64.69815f, 183.71594f, 61.92568f, 183.54321f, 59.01711f),
                    PathNode.CurveTo(183.3705f, 56.10854f, 181.6301f, 53.523876f, 179.0f, 52.27f),
                    PathNode.CurveTo(163.52791f, 44.310917f, 146.39888f, 40.107452f, 129.0f, 40.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.CurveTo(91.66064f, 40.014484f, 57.58494f, 57.650948f, 36.589252f, 87.3112f),
                    PathNode.CurveTo(15.593569f, 116.97146f, 10.285522f, 154.97176f, 22.35f, 189.25f),
                    PathNode.CurveTo(24.602674f, 195.67104f, 30.65532f, 199.97719f, 37.46f, 200.0f),
                    PathNode.LineTo(218.53f, 200.0f),
                    PathNode.CurveTo(225.331f, 200.00417f, 231.39142f, 195.70853f, 233.64f, 189.29f),
                    PathNode.CurveTo(243.8365f, 160.28902f, 241.7042f, 128.37662f, 227.74f, 100.99f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
