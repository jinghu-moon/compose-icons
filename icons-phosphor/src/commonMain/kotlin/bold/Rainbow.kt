package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorBoldIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 172.0f),
                    PathNode.LineTo(256.0f, 180.0f),
                    PathNode.CurveTo(256.0f, 186.62741f, 250.62741f, 192.0f, 244.0f, 192.0f),
                    PathNode.CurveTo(237.37259f, 192.0f, 232.0f, 186.62741f, 232.0f, 180.0f),
                    PathNode.LineTo(232.0f, 172.0f),
                    PathNode.CurveTo(232.0f, 114.562386f, 185.4376f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(70.562386f, 68.0f, 24.0f, 114.562386f, 24.0f, 172.0f),
                    PathNode.LineTo(24.0f, 180.0f),
                    PathNode.CurveTo(24.0f, 186.62741f, 18.627417f, 192.0f, 12.0f, 192.0f),
                    PathNode.CurveTo(5.372583f, 192.0f, 0f, 186.62741f, 0f, 180.0f),
                    PathNode.LineTo(0f, 172.0f),
                    PathNode.CurveTo(0f, 101.30755f, 57.307552f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(198.69244f, 44.0f, 256.0f, 101.30755f, 256.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(108.11775f, 140.0f, 92.0f, 156.11777f, 92.0f, 176.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.CurveTo(92.0f, 186.62741f, 97.37258f, 192.0f, 104.0f, 192.0f),
                    PathNode.CurveTo(110.62742f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 169.37259f, 121.37258f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(134.62741f, 164.0f, 140.0f, 169.37259f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 145.37259f, 192.0f, 152.0f, 192.0f),
                    PathNode.CurveTo(158.62741f, 192.0f, 164.0f, 186.62741f, 164.0f, 180.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.CurveTo(164.0f, 156.11777f, 147.88223f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(81.62865f, 92.04961f, 44.049603f, 129.62865f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.CurveTo(44.0f, 186.62741f, 49.37258f, 192.0f, 56.0f, 192.0f),
                    PathNode.CurveTo(62.62742f, 192.0f, 68.0f, 186.62741f, 68.0f, 180.0f),
                    PathNode.LineTo(68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 142.86292f, 94.862915f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(161.13708f, 116.0f, 188.0f, 142.86292f, 188.0f, 176.0f),
                    PathNode.LineTo(188.0f, 180.0f),
                    PathNode.CurveTo(188.0f, 186.62741f, 193.37259f, 192.0f, 200.0f, 192.0f),
                    PathNode.CurveTo(206.62741f, 192.0f, 212.0f, 186.62741f, 212.0f, 180.0f),
                    PathNode.LineTo(212.0f, 176.0f),
                    PathNode.CurveTo(211.9504f, 129.62865f, 174.37135f, 92.04961f, 128.0f, 92.0f),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
