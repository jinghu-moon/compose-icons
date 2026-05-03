package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorThinIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 218.20914f, 196.0f, 216.0f, 196.0f),
                    PathNode.CurveTo(213.79086f, 196.0f, 212.0f, 194.20914f, 212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 110.39f, 145.61f, 44.0f, 64.0f, 44.0f),
                    PathNode.CurveTo(61.79086f, 44.0f, 60.0f, 42.20914f, 60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 61.79086f, 36.0f, 64.0f, 36.0f),
                    PathNode.CurveTo(150.0f, 36.0f, 220.0f, 106.0f, 220.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 108.0f),
                    PathNode.CurveTo(61.79086f, 108.0f, 60.0f, 109.79086f, 60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 114.20914f, 61.79086f, 116.0f, 64.0f, 116.0f),
                    PathNode.CurveTo(105.95536f, 116.04409f, 139.9559f, 150.04462f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 194.20914f, 141.79086f, 196.0f, 144.0f, 196.0f),
                    PathNode.CurveTo(146.20914f, 196.0f, 148.0f, 194.20914f, 148.0f, 192.0f),
                    PathNode.CurveTo(147.9504f, 145.62865f, 110.37135f, 108.04961f, 64.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 180.0f),
                    PathNode.CurveTo(63.581722f, 180.0f, 60.0f, 183.58173f, 60.0f, 188.0f),
                    PathNode.CurveTo(60.0f, 192.41827f, 63.581722f, 196.0f, 68.0f, 196.0f),
                    PathNode.CurveTo(72.41828f, 196.0f, 76.0f, 192.41827f, 76.0f, 188.0f),
                    PathNode.CurveTo(76.0f, 183.58173f, 72.41828f, 180.0f, 68.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
