package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) return _handSwipeRight!!
        _handSwipeRight = phosphorFillIcon(
            name = "HandSwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 178.93f),
                    PathNode.CurveTo(216.0f, 204.52f, 207.52f, 218.86f, 207.16f, 219.58f),
                    PathNode.CurveTo(205.80348f, 222.29086f, 203.03131f, 224.00217f, 200.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(61.162212f, 224.00032f, 58.53663f, 222.49727f, 57.1f, 220.05f),
                    PathNode.LineTo(26.15f, 160.0f),
                    PathNode.CurveTo(23.95973f, 156.20924f, 23.418472f, 151.68654f, 24.652374f, 147.486f),
                    PathNode.CurveTo(25.886274f, 143.28543f, 28.78754f, 139.77397f, 32.68f, 137.77f),
                    PathNode.CurveTo(40.34f, 133.77f, 49.78f, 136.93f, 54.08f, 144.39f),
                    PathNode.LineTo(75.08f, 180.83f),
                    PathNode.CurveTo(76.27422f, 182.97534f, 78.63996f, 184.19371f, 81.08f, 183.92f),
                    PathNode.LineTo(81.2f, 183.92f),
                    PathNode.CurveTo(85.1699f, 183.23668f, 88.05346f, 179.76793f, 88.0f, 175.74f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(87.99493f, 51.619694f, 89.78592f, 47.42884f, 92.95517f, 44.40511f),
                    PathNode.CurveTo(96.12443f, 41.381374f, 100.39477f, 39.789196f, 104.77f, 40.0f),
                    PathNode.CurveTo(113.38f, 40.4f, 120.0f, 47.82f, 120.0f, 56.43f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(119.99513f, 130.21684f, 120.91034f, 132.3363f, 122.52731f, 133.85281f),
                    PathNode.CurveTo(124.14429f, 135.36931f, 126.31803f, 136.14687f, 128.53f, 136.0f),
                    PathNode.CurveTo(132.79767f, 135.63339f, 136.05766f, 132.033f, 136.0f, 127.75f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(135.99492f, 107.61969f, 137.78592f, 103.42884f, 140.95517f, 100.405106f),
                    PathNode.CurveTo(144.12442f, 97.38138f, 148.39478f, 95.78919f, 152.77f, 96.0f),
                    PathNode.CurveTo(161.38f, 96.4f, 168.0f, 103.82f, 168.0f, 112.43f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(167.99513f, 138.21684f, 168.91034f, 140.3363f, 170.52731f, 141.85281f),
                    PathNode.CurveTo(172.14429f, 143.36931f, 174.31801f, 144.14687f, 176.53f, 144.0f),
                    PathNode.CurveTo(180.79535f, 143.62871f, 184.05276f, 140.03116f, 184.0f, 135.75f),
                    PathNode.LineTo(184.0f, 128.47f),
                    PathNode.CurveTo(184.0f, 119.86f, 190.62f, 112.47f, 199.23f, 112.04f),
                    PathNode.CurveTo(203.5983f, 111.82953f, 207.86237f, 113.41633f, 211.03035f, 116.43131f),
                    PathNode.CurveTo(214.19835f, 119.44629f, 215.99414f, 123.62664f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(253.66f, 50.34f),
                    PathNode.LineTo(221.66f, 18.34f),
                    PathNode.CurveTo(218.53407f, 15.214068f, 213.46593f, 15.214068f, 210.34f, 18.34f),
                    PathNode.CurveTo(207.21407f, 21.46593f, 207.21407f, 26.53407f, 210.34f, 29.66f),
                    PathNode.LineTo(228.69f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(171.58173f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.LineTo(228.69f, 64.0f),
                    PathNode.LineTo(210.34f, 82.34f),
                    PathNode.CurveTo(207.21407f, 85.465935f, 207.21407f, 90.534065f, 210.34f, 93.66f),
                    PathNode.CurveTo(213.46593f, 96.785934f, 218.53407f, 96.785934f, 221.66f, 93.66f),
                    PathNode.LineTo(253.66f, 61.66f),
                    PathNode.CurveTo(255.16223f, 60.159454f, 256.0063f, 58.123276f, 256.0063f, 56.0f),
                    PathNode.CurveTo(256.0063f, 53.876724f, 255.16223f, 51.840546f, 253.66f, 50.34f),
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
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
