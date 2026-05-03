package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorBoldIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.82f, 116.64f),
                    PathNode.CurveTo(97.6326f, 114.52556f, 99.99848f, 110.509674f, 100.0f, 106.15f),
                    PathNode.LineTo(100.0f, 40.74f),
                    PathNode.CurveTo(100.000435f, 36.653084f, 97.920815f, 32.846928f, 94.481285f, 30.639553f),
                    PathNode.CurveTo(91.041756f, 28.432182f, 86.71525f, 28.127117f, 83.0f, 29.83f),
                    PathNode.CurveTo(44.65909f, 47.475037f, 20.068293f, 85.79374f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 131.37f, 20.16f, 134.76f, 20.47f, 138.1f),
                    PathNode.CurveTo(20.847431f, 142.1318f, 23.232836f, 145.70134f, 26.813543f, 147.5925f),
                    PathNode.CurveTo(30.394253f, 149.48366f, 34.687256f, 149.44136f, 38.23f, 147.48f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 62.06f),
                    PathNode.LineTo(76.0f, 99.06f),
                    PathNode.LineTo(44.81f, 116.36f),
                    PathNode.CurveTo(47.85797f, 94.92974f, 59.02415f, 75.49006f, 76.0f, 62.06f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(121.37258f, 20.0f, 116.0f, 25.372583f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 121.53f),
                    PathNode.LineTo(39.18f, 166.27f),
                    PathNode.CurveTo(36.420986f, 167.87694f, 34.416134f, 170.51714f, 33.60912f, 173.60632f),
                    PathNode.CurveTo(32.8021f, 176.69553f, 33.259468f, 179.97896f, 34.88f, 182.73f),
                    PathNode.CurveTo(61.385338f, 227.82028f, 116.39169f, 247.43723f, 165.44785f, 229.29446f),
                    PathNode.CurveTo(214.50401f, 211.1517f, 243.50923f, 160.46422f, 234.29715f, 108.978264f),
                    PathNode.CurveTo(225.08505f, 57.4923f, 180.3036f, 20.00704f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(102.51009f, 211.93117f, 78.414345f, 200.3555f, 62.43f, 180.5f),
                    PathNode.LineTo(134.0f, 138.79f),
                    PathNode.CurveTo(137.70592f, 136.65039f, 139.99203f, 132.69922f, 140.0f, 128.42f),
                    PathNode.LineTo(140.0f, 44.85f),
                    PathNode.CurveTo(183.64288f, 51.1061f, 215.02211f, 90.039246f, 211.865f, 134.01508f),
                    PathNode.CurveTo(208.7079f, 177.99089f, 172.08899f, 212.04231f, 128.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
