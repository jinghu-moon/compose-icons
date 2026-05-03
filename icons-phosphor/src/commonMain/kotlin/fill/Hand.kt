package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorFillIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 154.93f),
                    PathNode.CurveTo(216.0f, 201.13f, 179.15f, 239.48f, 133.0f, 239.99f),
                    PathNode.CurveTo(110.3704f, 240.29515f, 88.5815f, 231.42447f, 72.6f, 215.4f),
                    PathNode.CurveTo(50.79f, 192.33f, 26.15f, 136.0f, 26.15f, 136.0f),
                    PathNode.CurveTo(23.95973f, 132.20924f, 23.418472f, 127.68655f, 24.652374f, 123.48599f),
                    PathNode.CurveTo(25.886274f, 119.28544f, 28.78754f, 115.77398f, 32.68f, 113.77f),
                    PathNode.CurveTo(40.34f, 109.77f, 49.78f, 112.93f, 54.08f, 120.39f),
                    PathNode.LineTo(75.08f, 156.83f),
                    PathNode.CurveTo(76.27422f, 158.97534f, 78.63996f, 160.19371f, 81.08f, 159.92f),
                    PathNode.LineTo(81.2f, 159.92f),
                    PathNode.CurveTo(85.1699f, 159.23668f, 88.05346f, 155.76793f, 88.0f, 151.74f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(87.99493f, 43.619694f, 89.78592f, 39.42884f, 92.95517f, 36.40511f),
                    PathNode.CurveTo(96.12443f, 33.381374f, 100.39477f, 31.789194f, 104.77f, 32.0f),
                    PathNode.CurveTo(113.38f, 32.4f, 120.0f, 39.82f, 120.0f, 48.43f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(119.99513f, 114.216835f, 120.91034f, 116.3363f, 122.52731f, 117.852806f),
                    PathNode.CurveTo(124.14429f, 119.36931f, 126.31803f, 120.14687f, 128.53f, 120.0f),
                    PathNode.CurveTo(132.79767f, 119.63339f, 136.05766f, 116.033005f, 136.0f, 111.75f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(135.99492f, 27.619694f, 137.78592f, 23.428843f, 140.95517f, 20.405107f),
                    PathNode.CurveTo(144.12442f, 17.381374f, 148.39478f, 15.789195f, 152.77f, 16.0f),
                    PathNode.CurveTo(161.38f, 16.4f, 168.0f, 23.82f, 168.0f, 32.43f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(167.99513f, 122.216835f, 168.91034f, 124.3363f, 170.52731f, 125.852806f),
                    PathNode.CurveTo(172.14429f, 127.36931f, 174.31801f, 128.14687f, 176.53f, 128.0f),
                    PathNode.CurveTo(180.79767f, 127.63339f, 184.05766f, 124.033005f, 184.0f, 119.75f),
                    PathNode.LineTo(184.0f, 64.45f),
                    PathNode.CurveTo(184.0f, 55.84f, 190.62f, 48.45f, 199.23f, 48.02f),
                    PathNode.CurveTo(203.60176f, 47.809364f, 207.86896f, 49.398857f, 211.03758f, 52.418213f),
                    PathNode.CurveTo(214.2062f, 55.43757f, 215.9996f, 59.623165f, 216.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hand!!
    }

private var _hand: ImageVector? = null
