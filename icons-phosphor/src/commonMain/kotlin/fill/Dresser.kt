package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorFillIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 82.20914f, 41.79086f, 84.0f, 44.0f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.CurveTo(214.20914f, 84.0f, 216.0f, 82.20914f, 216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(115.58172f, 64.0f, 112.0f, 60.418278f, 112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 51.581722f, 115.58172f, 48.0f, 120.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(140.41827f, 48.0f, 144.0f, 51.581722f, 144.0f, 56.0f),
                    PathNode.CurveTo(144.0f, 60.418278f, 140.41827f, 64.0f, 136.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 100.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.CurveTo(41.79086f, 100.0f, 40.0f, 101.79086f, 40.0f, 104.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 154.20914f, 41.79086f, 156.0f, 44.0f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.CurveTo(214.20914f, 156.0f, 216.0f, 154.20914f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 101.79086f, 214.20914f, 100.0f, 212.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 136.0f),
                    PathNode.LineTo(120.27f, 136.0f),
                    PathNode.CurveTo(115.988846f, 136.05276f, 112.3913f, 132.79535f, 112.02f, 128.53f),
                    PathNode.CurveTo(111.87313f, 126.31803f, 112.65069f, 124.14429f, 114.16719f, 122.52731f),
                    PathNode.CurveTo(115.68369f, 120.91034f, 117.80316f, 119.99513f, 120.02f, 120.0f),
                    PathNode.LineTo(135.75f, 120.0f),
                    PathNode.CurveTo(140.03116f, 119.947235f, 143.62871f, 123.20465f, 144.0f, 127.47f),
                    PathNode.CurveTo(144.14687f, 129.68198f, 143.36931f, 131.85571f, 141.85281f, 133.47269f),
                    PathNode.CurveTo(140.3363f, 135.08966f, 138.21684f, 136.00487f, 136.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 172.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.CurveTo(41.79086f, 172.0f, 40.0f, 173.79086f, 40.0f, 176.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 173.79086f, 214.20914f, 172.0f, 212.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.CurveTo(115.58172f, 208.0f, 112.0f, 204.41827f, 112.0f, 200.0f),
                    PathNode.CurveTo(112.0f, 195.58173f, 115.58172f, 192.0f, 120.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(140.41827f, 192.0f, 144.0f, 195.58173f, 144.0f, 200.0f),
                    PathNode.CurveTo(144.0f, 204.41827f, 140.41827f, 208.0f, 136.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dresser!!
    }

private var _dresser: ImageVector? = null
