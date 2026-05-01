package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorFillIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 98.34f),
                    PathNode.CurveTo(232.78593f, 101.465935f, 232.78593f, 106.534065f, 229.66f, 109.66f),
                    PathNode.CurveTo(226.53407f, 112.785934f, 221.46593f, 112.785934f, 218.34f, 109.66f),
                    PathNode.LineTo(200.0f, 91.31f),
                    PathNode.LineTo(181.66f, 109.66f),
                    PathNode.CurveTo(178.53407f, 112.785934f, 173.46593f, 112.785934f, 170.34f, 109.66f),
                    PathNode.CurveTo(167.21407f, 106.534065f, 167.21407f, 101.465935f, 170.34f, 98.34f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(170.34f, 61.66f),
                    PathNode.CurveTo(167.21407f, 58.53407f, 167.21407f, 53.46593f, 170.34f, 50.34f),
                    PathNode.CurveTo(173.46593f, 47.21407f, 178.53407f, 47.21407f, 181.66f, 50.34f),
                    PathNode.LineTo(200.0f, 68.69f),
                    PathNode.LineTo(218.34f, 50.34f),
                    PathNode.CurveTo(221.46593f, 47.21407f, 226.53407f, 47.21407f, 229.66f, 50.34f),
                    PathNode.CurveTo(232.78593f, 53.46593f, 232.78593f, 58.53407f, 229.66f, 61.66f),
                    PathNode.LineTo(211.31f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.85f, 131.0f),
                    PathNode.CurveTo(205.38556f, 130.06508f, 203.99785f, 129.01509f, 202.7f, 127.86f),
                    PathNode.CurveTo(201.17601f, 126.4799f, 198.85399f, 126.4799f, 197.33f, 127.86f),
                    PathNode.CurveTo(184.66899f, 139.14235f, 165.40482f, 138.5882f, 153.41331f, 126.59669f),
                    PathNode.CurveTo(141.42181f, 114.60518f, 140.86765f, 95.341f, 152.15f, 82.68f),
                    PathNode.CurveTo(153.51208f, 81.16057f, 153.51208f, 78.85943f, 152.15f, 77.34f),
                    PathNode.CurveTo(142.63364f, 66.671745f, 141.34789f, 50.985508f, 149.0f, 38.91f),
                    PathNode.CurveTo(149.72905f, 37.721275f, 149.7864f, 36.238667f, 149.15137f, 34.99717f),
                    PathNode.CurveTo(148.51633f, 33.755676f, 147.28056f, 32.934513f, 145.89f, 32.83f),
                    PathNode.QuadTo(137.0f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(86.934425f, 31.845535f, 46.963894f, 45.237f, 14.28f, 70.1f),
                    PathNode.CurveTo(10.842456f, 72.71749f, 8.615581f, 76.61903f, 8.11f, 80.91f),
                    PathNode.CurveTo(7.601669f, 85.191765f, 8.882438f, 89.49356f, 11.65f, 92.8f),
                    PathNode.LineTo(115.65f, 218.23f),
                    PathNode.CurveTo(118.69429f, 221.90648f, 123.226776f, 224.0241f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(132.75923f, 224.0121f, 137.27461f, 221.89565f, 140.31f, 218.23f),
                    PathNode.LineTo(207.76f, 136.92f),
                    PathNode.CurveTo(208.49214f, 136.03934f, 208.81168f, 134.8871f, 208.63768f, 133.75514f),
                    PathNode.CurveTo(208.46367f, 132.6232f, 207.81284f, 131.62012f, 206.85f, 131.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
