package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorBoldIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(47.71089f, 28.027554f, 28.027554f, 47.71089f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.027554f, 216.28911f, 47.71089f, 235.97244f, 72.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(166.62741f, 236.0f, 172.0f, 230.62741f, 172.0f, 224.0f),
                    PathNode.CurveTo(172.0f, 217.37259f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(60.954304f, 212.0f, 52.0f, 203.0457f, 52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(184.0f, 188.0f),
                    PathNode.CurveTo(208.28911f, 187.97244f, 227.97244f, 168.28911f, 228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(227.97244f, 47.71089f, 208.28911f, 28.027554f, 184.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 155.0457f, 195.0457f, 164.0f, 184.0f, 164.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(52.0f, 72.0f),
                    PathNode.CurveTo(52.0f, 60.954304f, 60.954304f, 52.0f, 72.0f, 52.0f),
                    PathNode.LineTo(184.0f, 52.0f),
                    PathNode.CurveTo(195.0457f, 52.0f, 204.0f, 60.954304f, 204.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 104.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 142.62741f, 182.62741f, 148.0f, 176.0f, 148.0f),
                    PathNode.CurveTo(169.37259f, 148.0f, 164.0f, 142.62741f, 164.0f, 136.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 97.37258f, 158.62741f, 92.0f, 152.0f, 92.0f),
                    PathNode.CurveTo(145.37259f, 92.0f, 140.0f, 97.37258f, 140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 142.62741f, 134.62741f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(121.37258f, 148.0f, 116.0f, 142.62741f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 97.37258f, 110.62742f, 92.0f, 104.0f, 92.0f),
                    PathNode.CurveTo(97.37258f, 92.0f, 92.0f, 97.37258f, 92.0f, 104.0f),
                    PathNode.LineTo(92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 142.62741f, 86.62742f, 148.0f, 80.0f, 148.0f),
                    PathNode.CurveTo(73.37258f, 148.0f, 68.0f, 142.62741f, 68.0f, 136.0f),
                    PathNode.LineTo(68.0f, 104.0f),
                    PathNode.CurveTo(68.012924f, 89.8093f, 76.36111f, 76.95019f, 89.31803f, 71.16275f),
                    PathNode.CurveTo(102.274956f, 65.37533f, 117.42288f, 67.739525f, 128.0f, 77.2f),
                    PathNode.CurveTo(138.57712f, 67.739525f, 153.72505f, 65.37533f, 166.68199f, 71.16275f),
                    PathNode.CurveTo(179.63889f, 76.95019f, 187.98708f, 89.8093f, 188.0f, 104.0f),
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
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
