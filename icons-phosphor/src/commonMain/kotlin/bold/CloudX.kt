package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorBoldIcon(
            name = "CloudX",
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
                    PathNode.MoveTo(192.49f, 116.49f),
                    PathNode.LineTo(177.0f, 132.0f),
                    PathNode.LineTo(192.52f, 147.51f),
                    PathNode.CurveTo(197.21442f, 152.20442f, 197.21442f, 159.81558f, 192.52f, 164.51f),
                    PathNode.CurveTo(187.82558f, 169.20442f, 180.21442f, 169.20442f, 175.52f, 164.51f),
                    PathNode.LineTo(160.0f, 149.0f),
                    PathNode.LineTo(144.49f, 164.52f),
                    PathNode.CurveTo(139.79558f, 169.21442f, 132.18442f, 169.21442f, 127.49f, 164.52f),
                    PathNode.CurveTo(122.79558f, 159.82558f, 122.79558f, 152.21442f, 127.49f, 147.52f),
                    PathNode.LineTo(143.0f, 132.0f),
                    PathNode.LineTo(127.48f, 116.49f),
                    PathNode.CurveTo(122.785576f, 111.79558f, 122.785576f, 104.18442f, 127.48f, 99.49f),
                    PathNode.CurveTo(132.17442f, 94.79558f, 139.78558f, 94.79558f, 144.48f, 99.49f),
                    PathNode.LineTo(160.0f, 115.0f),
                    PathNode.LineTo(175.51f, 99.48f),
                    PathNode.CurveTo(180.20442f, 94.78558f, 187.81558f, 94.78558f, 192.51f, 99.48f),
                    PathNode.CurveTo(197.20442f, 104.17442f, 197.20442f, 111.785576f, 192.51f, 116.48f),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
