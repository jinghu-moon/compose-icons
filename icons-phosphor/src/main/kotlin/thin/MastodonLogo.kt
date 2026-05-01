package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorThinIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(52.11775f, 36.0f, 36.0f, 52.11775f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 211.88223f, 52.11775f, 228.0f, 72.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(162.20914f, 228.0f, 164.0f, 226.20914f, 164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 221.79086f, 162.20914f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(56.53603f, 220.0f, 44.0f, 207.46397f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(184.0f, 180.0f),
                    PathNode.CurveTo(203.88223f, 180.0f, 220.0f, 163.88223f, 220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 52.11775f, 203.88223f, 36.0f, 184.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 159.46397f, 199.46397f, 172.0f, 184.0f, 172.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 56.53603f, 56.53603f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(199.46397f, 44.0f, 212.0f, 56.53603f, 212.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 138.20914f, 178.20914f, 140.0f, 176.0f, 140.0f),
                    PathNode.CurveTo(173.79086f, 140.0f, 172.0f, 138.20914f, 172.0f, 136.0f),
                    PathNode.LineTo(172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 92.95431f, 163.0457f, 84.0f, 152.0f, 84.0f),
                    PathNode.CurveTo(140.9543f, 84.0f, 132.0f, 92.95431f, 132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 104.0f),
                    PathNode.CurveTo(124.0f, 92.95431f, 115.04569f, 84.0f, 104.0f, 84.0f),
                    PathNode.CurveTo(92.95431f, 84.0f, 84.0f, 92.95431f, 84.0f, 104.0f),
                    PathNode.LineTo(84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 138.20914f, 82.20914f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(77.79086f, 140.0f, 76.0f, 138.20914f, 76.0f, 136.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(76.00548f, 91.42032f, 84.39975f, 80.38851f, 96.52256f, 77.0291f),
                    PathNode.CurveTo(108.64538f, 73.66968f, 121.52048f, 78.80741f, 128.0f, 89.59f),
                    PathNode.CurveTo(134.47952f, 78.80741f, 147.35461f, 73.66968f, 159.47745f, 77.0291f),
                    PathNode.CurveTo(171.60025f, 80.38851f, 179.99452f, 91.42032f, 180.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
