package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorBoldIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 44.0f),
                    PathNode.LineTo(24.0f, 44.0f),
                    PathNode.CurveTo(12.954305f, 44.0f, 4.0f, 52.954304f, 4.0f, 64.0f),
                    PathNode.LineTo(4.0f, 192.0f),
                    PathNode.CurveTo(4.0f, 203.0457f, 12.954305f, 212.0f, 24.0f, 212.0f),
                    PathNode.LineTo(232.0f, 212.0f),
                    PathNode.CurveTo(243.0457f, 212.0f, 252.0f, 203.0457f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 64.0f),
                    PathNode.CurveTo(252.0f, 52.954304f, 243.0457f, 44.0f, 232.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 188.0f),
                    PathNode.LineTo(28.0f, 188.0f),
                    PathNode.LineTo(28.0f, 68.0f),
                    PathNode.LineTo(228.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 148.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.CurveTo(47.996178f, 103.14352f, 50.91993f, 98.76354f, 55.406517f, 96.90453f),
                    PathNode.CurveTo(59.89311f, 95.04552f, 65.05786f, 96.074036f, 68.49f, 99.51f),
                    PathNode.LineTo(88.0f, 119.0f),
                    PathNode.LineTo(107.51f, 99.48f),
                    PathNode.CurveTo(110.94599f, 96.04013f, 116.11805f, 95.0135f, 120.60738f, 96.88022f),
                    PathNode.CurveTo(125.09672f, 98.74693f, 128.016f, 103.138054f, 128.0f, 108.0f),
                    PathNode.LineTo(128.0f, 148.0f),
                    PathNode.CurveTo(128.0f, 154.62741f, 122.62742f, 160.0f, 116.0f, 160.0f),
                    PathNode.CurveTo(109.37258f, 160.0f, 104.0f, 154.62741f, 104.0f, 148.0f),
                    PathNode.LineTo(104.0f, 137.0f),
                    PathNode.LineTo(96.49f, 144.52f),
                    PathNode.CurveTo(94.23838f, 146.77945f, 91.17982f, 148.04947f, 87.99f, 148.04947f),
                    PathNode.CurveTo(84.80018f, 148.04947f, 81.74162f, 146.77945f, 79.49f, 144.52f),
                    PathNode.LineTo(72.0f, 137.0f),
                    PathNode.LineTo(72.0f, 148.0f),
                    PathNode.CurveTo(72.0f, 154.62741f, 66.62742f, 160.0f, 60.0f, 160.0f),
                    PathNode.CurveTo(53.37258f, 160.0f, 48.0f, 154.62741f, 48.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.63f, 124.5f),
                    PathNode.CurveTo(148.61882f, 122.01447f, 151.51372f, 120.42101f, 154.67763f, 120.070305f),
                    PathNode.CurveTo(157.84152f, 119.7196f, 161.01512f, 120.64037f, 163.5f, 122.63f),
                    PathNode.LineTo(164.0f, 123.03f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.CurveTo(164.0f, 101.37258f, 169.37259f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(182.62741f, 96.0f, 188.0f, 101.37258f, 188.0f, 108.0f),
                    PathNode.LineTo(188.0f, 123.0f),
                    PathNode.LineTo(188.5f, 122.6f),
                    PathNode.CurveTo(193.67491f, 118.45786f, 201.22786f, 119.29509f, 205.37f, 124.47f),
                    PathNode.CurveTo(209.51213f, 129.64491f, 208.67491f, 137.19786f, 203.5f, 141.34f),
                    PathNode.LineTo(183.5f, 157.34f),
                    PathNode.CurveTo(179.11601f, 160.85f, 172.88399f, 160.85f, 168.5f, 157.34f),
                    PathNode.LineTo(148.5f, 141.34f),
                    PathNode.CurveTo(143.34337f, 137.20065f, 142.5071f, 129.6698f, 146.63f, 124.5f),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
