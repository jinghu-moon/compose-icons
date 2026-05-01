package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorRegularIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.91f, 77.72f),
                    PathNode.LineTo(228.91f, 84.21f),
                    PathNode.LineTo(241.25f, 101.21f),
                    PathNode.CurveTo(243.02544f, 103.51686f, 243.40768f, 106.60605f, 242.2481f, 109.276085f),
                    PathNode.CurveTo(241.0885f, 111.94613f, 238.5701f, 113.775566f, 235.67236f, 114.05289f),
                    PathNode.CurveTo(232.77464f, 114.33021f, 229.95496f, 113.011635f, 228.31f, 110.61f),
                    PathNode.LineTo(216.0f, 93.61f),
                    PathNode.LineTo(203.66f, 110.61f),
                    PathNode.CurveTo(201.01788f, 114.04297f, 196.12326f, 114.74922f, 192.61842f, 112.20321f),
                    PathNode.CurveTo(189.1136f, 109.6572f, 188.27203f, 104.784004f, 190.72f, 101.21f),
                    PathNode.LineTo(203.06f, 84.21f),
                    PathNode.LineTo(183.06f, 77.72f),
                    PathNode.CurveTo(178.85712f, 76.35586f, 176.55586f, 71.84289f, 177.92f, 67.64f),
                    PathNode.CurveTo(179.28415f, 63.437115f, 183.79712f, 61.135857f, 188.0f, 62.5f),
                    PathNode.LineTo(208.0f, 69.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 43.581722f, 211.58173f, 40.0f, 216.0f, 40.0f),
                    PathNode.CurveTo(220.41827f, 40.0f, 224.0f, 43.581722f, 224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 69.0f),
                    PathNode.LineTo(244.0f, 62.51f),
                    PathNode.CurveTo(248.20288f, 61.143097f, 252.7181f, 63.442112f, 254.085f, 67.645f),
                    PathNode.CurveTo(255.4519f, 71.847885f, 253.1529f, 76.3631f, 248.95f, 77.73f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 184.0f),
                    PathNode.CurveTo(151.99162f, 200.62743f, 139.25032f, 214.47807f, 122.68136f, 215.87132f),
                    PathNode.CurveTo(106.1124f, 217.26459f, 91.23702f, 205.73616f, 88.45206f, 189.34363f),
                    PathNode.CurveTo(85.66709f, 172.9511f, 95.90056f, 157.15686f, 112.0f, 153.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 115.58172f, 115.58172f, 112.0f, 120.0f, 112.0f),
                    PathNode.CurveTo(124.41828f, 112.0f, 128.0f, 115.58172f, 128.0f, 120.0f),
                    PathNode.LineTo(128.0f, 153.0f),
                    PathNode.CurveTo(142.1221f, 156.66814f, 151.9862f, 169.40929f, 152.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 175.16344f, 128.83656f, 168.0f, 120.0f, 168.0f),
                    PathNode.CurveTo(111.163445f, 168.0f, 104.0f, 175.16344f, 104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 192.83656f, 111.163445f, 200.0f, 120.0f, 200.0f),
                    PathNode.CurveTo(128.83656f, 200.0f, 136.0f, 192.83656f, 136.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.CurveTo(183.98134f, 213.839f, 163.34491f, 239.70569f, 134.25555f, 246.35211f),
                    PathNode.CurveTo(105.16618f, 252.99854f, 75.343735f, 238.66083f, 62.36804f, 211.79082f),
                    PathNode.CurveTo(49.392345f, 184.9208f, 56.70694f, 152.64938f, 80.0f, 134.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 25.90861f, 97.90861f, 8.0f, 120.0f, 8.0f),
                    PathNode.CurveTo(142.09138f, 8.0f, 160.0f, 25.90861f, 160.0f, 48.0f),
                    PathNode.LineTo(160.0f, 134.0f),
                    PathNode.CurveTo(175.17178f, 146.16208f, 184.0005f, 164.55524f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 184.0f),
                    PathNode.CurveTo(167.98724f, 168.29356f, 160.30368f, 153.58351f, 147.42f, 144.6f),
                    PathNode.CurveTo(145.26506f, 143.09537f, 143.98663f, 140.62822f, 144.0f, 138.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 34.745167f, 133.25484f, 24.0f, 120.0f, 24.0f),
                    PathNode.CurveTo(106.74516f, 24.0f, 96.0f, 34.745167f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(96.00025f, 140.6141f, 94.72331f, 143.06343f, 92.58f, 144.56f),
                    PathNode.CurveTo(73.88265f, 157.57314f, 66.90721f, 181.93584f, 75.88415f, 202.87259f),
                    PathNode.CurveTo(84.86109f, 223.80933f, 107.31755f, 235.55266f, 129.63408f, 230.98048f),
                    PathNode.CurveTo(151.95062f, 226.4083f, 167.9797f, 206.78009f, 168.0f, 184.0f),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
