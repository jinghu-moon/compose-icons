package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorLightIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 195.3137f, 219.3137f, 198.0f, 216.0f, 198.0f),
                    PathNode.CurveTo(212.6863f, 198.0f, 210.0f, 195.3137f, 210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 111.5f, 144.5f, 46.0f, 64.0f, 46.0f),
                    PathNode.CurveTo(60.68629f, 46.0f, 58.0f, 43.31371f, 58.0f, 40.0f),
                    PathNode.CurveTo(58.0f, 36.68629f, 60.68629f, 34.0f, 64.0f, 34.0f),
                    PathNode.CurveTo(151.12f, 34.0f, 222.0f, 104.88f, 222.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 106.0f),
                    PathNode.CurveTo(60.68629f, 106.0f, 58.0f, 108.686295f, 58.0f, 112.0f),
                    PathNode.CurveTo(58.0f, 115.313705f, 60.68629f, 118.0f, 64.0f, 118.0f),
                    PathNode.CurveTo(104.84851f, 118.04959f, 137.95041f, 151.15149f, 138.0f, 192.0f),
                    PathNode.CurveTo(138.0f, 195.3137f, 140.6863f, 198.0f, 144.0f, 198.0f),
                    PathNode.CurveTo(147.3137f, 198.0f, 150.0f, 195.3137f, 150.0f, 192.0f),
                    PathNode.CurveTo(149.9449f, 144.52635f, 111.47364f, 106.05511f, 64.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 178.0f),
                    PathNode.CurveTo(62.477154f, 178.0f, 58.0f, 182.47716f, 58.0f, 188.0f),
                    PathNode.CurveTo(58.0f, 193.52284f, 62.477154f, 198.0f, 68.0f, 198.0f),
                    PathNode.CurveTo(73.52285f, 198.0f, 78.0f, 193.52284f, 78.0f, 188.0f),
                    PathNode.CurveTo(78.0f, 182.47716f, 73.52285f, 178.0f, 68.0f, 178.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
