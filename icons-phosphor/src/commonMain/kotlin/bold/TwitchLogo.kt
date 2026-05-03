package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorBoldIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 240.0f),
                    PathNode.CurveTo(60.000195f, 244.6556f, 62.69319f, 248.89095f, 66.90906f, 250.86607f),
                    PathNode.CurveTo(71.12492f, 252.84119f, 76.10275f, 252.19958f, 79.68f, 249.22f),
                    PathNode.LineTo(124.34f, 212.0f),
                    PathNode.LineTo(165.1f, 212.0f),
                    PathNode.CurveTo(169.78056f, 211.99516f, 174.3121f, 210.35378f, 177.91f, 207.36f),
                    PathNode.LineTo(220.8f, 171.62f),
                    PathNode.CurveTo(225.37065f, 167.82571f, 228.01053f, 162.19032f, 228.0f, 156.25f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 154.38f),
                    PathNode.LineTo(163.66f, 188.0f),
                    PathNode.LineTo(120.0f, 188.0f),
                    PathNode.CurveTo(117.19369f, 188.00014f, 114.47618f, 188.98383f, 112.32f, 190.78f),
                    PathNode.LineTo(84.0f, 214.38f),
                    PathNode.LineTo(84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 193.37259f, 78.62742f, 188.0f, 72.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 136.0f),
                    PathNode.LineTo(156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 81.37258f, 161.37259f, 76.0f, 168.0f, 76.0f),
                    PathNode.CurveTo(174.62741f, 76.0f, 180.0f, 81.37258f, 180.0f, 88.0f),
                    PathNode.LineTo(180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 142.62741f, 174.62741f, 148.0f, 168.0f, 148.0f),
                    PathNode.CurveTo(161.37259f, 148.0f, 156.0f, 142.62741f, 156.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 136.0f),
                    PathNode.LineTo(108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 81.37258f, 113.37258f, 76.0f, 120.0f, 76.0f),
                    PathNode.CurveTo(126.62742f, 76.0f, 132.0f, 81.37258f, 132.0f, 88.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 142.62741f, 126.62742f, 148.0f, 120.0f, 148.0f),
                    PathNode.CurveTo(113.37258f, 148.0f, 108.0f, 142.62741f, 108.0f, 136.0f),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
