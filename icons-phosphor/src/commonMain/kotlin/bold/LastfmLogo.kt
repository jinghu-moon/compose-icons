package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorBoldIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 160.0f),
                    PathNode.CurveTo(251.97244f, 184.28911f, 232.28911f, 203.97244f, 208.0f, 204.0f),
                    PathNode.LineTo(190.57f, 204.0f),
                    PathNode.CurveTo(167.27255f, 203.94978f, 146.09558f, 190.4615f, 136.2f, 169.37f),
                    PathNode.LineTo(106.05f, 104.78f),
                    PathNode.CurveTo(100.11162f, 92.126656f, 87.40749f, 84.033714f, 73.43f, 84.0f),
                    PathNode.LineTo(64.0f, 84.0f),
                    PathNode.CurveTo(44.11775f, 84.0f, 28.0f, 100.11775f, 28.0f, 120.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 163.88223f, 44.11775f, 180.0f, 64.0f, 180.0f),
                    PathNode.LineTo(72.0f, 180.0f),
                    PathNode.CurveTo(83.1398f, 180.00699f, 93.22408f, 173.4098f, 97.68f, 163.2f),
                    PathNode.CurveTo(100.33096f, 157.12486f, 107.40487f, 154.34903f, 113.48f, 157.0f),
                    PathNode.CurveTo(119.55513f, 159.65097f, 122.33096f, 166.72487f, 119.68f, 172.8f),
                    PathNode.CurveTo(111.40638f, 191.75725f, 92.68405f, 204.00844f, 72.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(30.878906f, 203.96143f, 4.038574f, 177.1211f, 4.0f, 144.0f),
                    PathNode.LineTo(4.0f, 120.0f),
                    PathNode.CurveTo(4.038574f, 86.87891f, 30.878906f, 60.038574f, 64.0f, 60.0f),
                    PathNode.LineTo(73.43f, 60.0f),
                    PathNode.CurveTo(96.727455f, 60.050213f, 117.90442f, 73.5385f, 127.8f, 94.63f),
                    PathNode.LineTo(158.0f, 159.22f),
                    PathNode.CurveTo(163.93068f, 171.85704f, 176.6106f, 179.94698f, 190.57f, 180.0f),
                    PathNode.LineTo(208.0f, 180.0f),
                    PathNode.CurveTo(219.0457f, 180.0f, 228.0f, 171.0457f, 228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 148.9543f, 219.0457f, 140.0f, 208.0f, 140.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.CurveTo(165.90862f, 140.0f, 148.0f, 122.09139f, 148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 77.90861f, 165.90862f, 60.0f, 188.0f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(227.88223f, 60.0f, 244.0f, 76.11775f, 244.0f, 96.0f),
                    PathNode.CurveTo(244.0f, 102.62742f, 238.62741f, 108.0f, 232.0f, 108.0f),
                    PathNode.CurveTo(225.37259f, 108.0f, 220.0f, 102.62742f, 220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 89.37258f, 214.62741f, 84.0f, 208.0f, 84.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.CurveTo(179.16344f, 84.0f, 172.0f, 91.163445f, 172.0f, 100.0f),
                    PathNode.CurveTo(172.0f, 108.836555f, 179.16344f, 116.0f, 188.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(232.28911f, 116.02756f, 251.97244f, 135.71089f, 252.0f, 160.0f),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
