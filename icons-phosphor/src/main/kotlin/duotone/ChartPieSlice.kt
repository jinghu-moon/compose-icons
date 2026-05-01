package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorDuotoneIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 37.5f),
                    PathNode.LineTo(96.0f, 109.5f),
                    PathNode.LineTo(33.6f, 145.5f),
                    PathNode.CurveTo(24.994402f, 99.05046f, 51.460613f, 53.24355f, 96.0f, 37.5f),
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
                    PathNode.MoveTo(100.0f, 116.43f),
                    PathNode.CurveTo(102.47576f, 115.00062f, 104.00064f, 112.358765f, 104.0f, 109.5f),
                    PathNode.LineTo(104.0f, 37.5f),
                    PathNode.CurveTo(103.98551f, 34.91209f, 102.72005f, 32.491055f, 100.60346f, 31.001902f),
                    PathNode.CurveTo(98.486885f, 29.51275f, 95.780685f, 29.139467f, 93.34f, 30.0f),
                    PathNode.CurveTo(45.102192f, 47.07239f, 16.434929f, 96.68147f, 25.73f, 147.0f),
                    PathNode.CurveTo(26.203268f, 149.556f, 27.888891f, 151.72269f, 30.25f, 152.81f),
                    PathNode.CurveTo(31.298553f, 153.30034f, 32.442467f, 153.55302f, 33.6f, 153.55f),
                    PathNode.CurveTo(35.00413f, 153.55057f, 36.38367f, 153.18152f, 37.6f, 152.48f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 49.62f),
                    PathNode.LineTo(88.0f, 104.88f),
                    PathNode.LineTo(40.12f, 132.51f),
                    PathNode.CurveTo(40.0f, 131.0f, 40.0f, 129.48f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.028942f, 94.9374f, 58.562893f, 64.673004f, 88.0f, 49.62f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 123.82f),
                    PathNode.LineTo(41.19f, 169.73f),
                    PathNode.CurveTo(39.342793f, 170.8008f, 38.00027f, 172.56557f, 37.461243f, 174.63153f),
                    PathNode.CurveTo(36.922215f, 176.69751f, 37.231403f, 178.89322f, 38.32f, 180.73f),
                    PathNode.CurveTo(63.853172f, 224.13649f, 116.81745f, 243.01253f, 164.04797f, 225.53842f),
                    PathNode.CurveTo(211.2785f, 208.06433f, 239.20325f, 159.26138f, 230.33649f, 109.68874f),
                    PathNode.CurveTo(221.46973f, 60.1161f, 178.35936f, 24.018784f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(99.67184f, 215.9241f, 73.093155f, 202.28714f, 56.51f, 179.32f),
                    PathNode.LineTo(132.03f, 135.32f),
                    PathNode.CurveTo(134.50267f, 133.89241f, 136.02707f, 131.25519f, 136.03f, 128.4f),
                    PathNode.LineTo(136.03f, 40.36f),
                    PathNode.CurveTo(182.9062f, 44.612965f, 218.13647f, 84.99944f, 215.9868f, 132.01907f),
                    PathNode.CurveTo(213.83714f, 179.03868f, 175.06871f, 216.04205f, 128.0f, 216.0f),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
