package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorBoldIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 36.0f),
                    PathNode.CurveTo(126.16635f, 36.016453f, 95.0663f, 54.584335f, 79.0f, 84.36f),
                    PathNode.CurveTo(54.004837f, 81.777756f, 29.622957f, 93.19028f, 15.594873f, 114.03828f),
                    PathNode.CurveTo(1.566791f, 134.88628f, 0.179337f, 161.77115f, 11.986799f, 183.95245f),
                    PathNode.CurveTo(23.794262f, 206.13374f, 46.871803f, 219.99551f, 72.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(210.8102f, 220.0f, 252.0f, 178.8102f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 77.18981f, 210.8102f, 36.0f, 160.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.CurveTo(47.69947f, 196.50258f, 27.592579f, 177.21053f, 27.09f, 152.91f),
                    PathNode.CurveTo(26.587421f, 128.60947f, 45.87947f, 108.50258f, 70.18f, 108.0f),
                    PathNode.CurveTo(68.72328f, 114.56674f, 67.99223f, 121.27363f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 134.62741f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(86.62742f, 140.0f, 92.0f, 134.62741f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 90.44463f, 122.44463f, 60.0f, 160.0f, 60.0f),
                    PathNode.CurveTo(197.55536f, 60.0f, 228.0f, 90.44463f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 165.55536f, 197.55536f, 196.0f, 160.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.49f, 103.51f),
                    PathNode.CurveTo(202.74945f, 105.76162f, 204.01947f, 108.82018f, 204.01947f, 112.01f),
                    PathNode.CurveTo(204.01947f, 115.19982f, 202.74945f, 118.25838f, 200.49f, 120.51f),
                    PathNode.LineTo(152.49f, 168.51f),
                    PathNode.CurveTo(150.23837f, 170.76945f, 147.17982f, 172.03946f, 143.99f, 172.03946f),
                    PathNode.CurveTo(140.80019f, 172.03946f, 137.74162f, 170.76945f, 135.49f, 168.51f),
                    PathNode.LineTo(111.49f, 144.51f),
                    PathNode.CurveTo(106.79558f, 139.81558f, 106.79558f, 132.20442f, 111.49f, 127.51f),
                    PathNode.CurveTo(116.18442f, 122.81558f, 123.79558f, 122.81558f, 128.49f, 127.51f),
                    PathNode.LineTo(144.0f, 143.0f),
                    PathNode.LineTo(183.51f, 103.48f),
                    PathNode.CurveTo(185.7648f, 101.230644f, 188.82132f, 99.969925f, 192.00623f, 99.975555f),
                    PathNode.CurveTo(195.19113f, 99.98118f, 198.24316f, 101.25269f, 200.49f, 103.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
