package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorBoldIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 70.62742f, 28.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(110.62742f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 110.62742f, 116.0f, 104.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(120.0f, 204.0f),
                    PathNode.CurveTo(126.62742f, 204.0f, 132.0f, 198.62741f, 132.0f, 192.0f),
                    PathNode.CurveTo(132.0f, 185.37259f, 126.62742f, 180.0f, 120.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.49f, 200.49f),
                    PathNode.CurveTo(238.23837f, 202.74945f, 235.17982f, 204.01947f, 231.99f, 204.01947f),
                    PathNode.CurveTo(228.80019f, 204.01947f, 225.74162f, 202.74945f, 223.49f, 200.49f),
                    PathNode.LineTo(205.41f, 182.41f),
                    PathNode.CurveTo(186.2341f, 193.103f, 162.11005f, 188.02318f, 148.87454f, 170.50528f),
                    PathNode.CurveTo(135.63902f, 152.9874f, 137.34315f, 128.39328f, 152.86823f, 112.86822f),
                    PathNode.CurveTo(168.39328f, 97.343155f, 192.9874f, 95.63902f, 210.50528f, 108.874535f),
                    PathNode.CurveTo(228.02318f, 122.11005f, 233.103f, 146.2341f, 222.41f, 165.41f),
                    PathNode.LineTo(240.49f, 183.48f),
                    PathNode.CurveTo(242.75252f, 185.73203f, 244.02449f, 188.79272f, 244.02449f, 191.985f),
                    PathNode.CurveTo(244.02449f, 195.17728f, 242.75252f, 198.23799f, 240.49f, 200.49f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 164.0f),
                    PathNode.CurveTo(195.0457f, 164.0f, 204.0f, 155.0457f, 204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 132.9543f, 195.0457f, 124.0f, 184.0f, 124.0f),
                    PathNode.CurveTo(172.9543f, 124.0f, 164.0f, 132.9543f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 155.0457f, 172.9543f, 164.0f, 184.0f, 164.0f),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
