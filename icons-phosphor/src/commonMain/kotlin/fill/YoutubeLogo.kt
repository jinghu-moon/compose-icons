package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorFillIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.33f, 69.52f),
                    PathNode.CurveTo(232.41846f, 62.041195f, 227.02635f, 55.93832f, 219.84f, 53.12f),
                    PathNode.CurveTo(185.56f, 39.88f, 131.0f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(125.0f, 40.0f, 70.44f, 39.88f, 36.16f, 53.12f),
                    PathNode.CurveTo(28.973654f, 55.93832f, 23.58154f, 62.041195f, 21.67f, 69.52f),
                    PathNode.CurveTo(19.08f, 79.5f, 16.0f, 97.74f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 158.26f, 19.08f, 176.5f, 21.67f, 186.48f),
                    PathNode.CurveTo(23.5787f, 193.9626f, 28.971247f, 200.06969f, 36.16f, 202.89f),
                    PathNode.CurveTo(69.0f, 215.56f, 120.4f, 216.0f, 127.34f, 216.0f),
                    PathNode.LineTo(128.66f, 216.0f),
                    PathNode.CurveTo(135.6f, 216.0f, 187.03f, 215.56f, 219.84f, 202.89f),
                    PathNode.CurveTo(227.02875f, 200.06969f, 232.4213f, 193.9626f, 234.33f, 186.48f),
                    PathNode.CurveTo(236.92f, 176.48f, 240.0f, 158.26f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 97.74f, 236.92f, 79.5f, 234.33f, 69.52f),
                    PathNode.Close,
                    PathNode.MoveTo(160.59f, 134.52f),
                    PathNode.LineTo(120.59f, 162.52f),
                    PathNode.CurveTo(118.15116f, 164.2285f, 114.96522f, 164.44107f, 112.32102f, 163.07172f),
                    PathNode.CurveTo(109.67682f, 161.70236f, 108.011986f, 158.9777f, 108.0f, 156.0f),
                    PathNode.LineTo(108.0f, 100.0f),
                    PathNode.CurveTo(108.00084f, 97.01689f, 109.66137f, 94.28204f, 112.307755f, 92.90525f),
                    PathNode.CurveTo(114.95415f, 91.52846f, 118.14674f, 91.73844f, 120.59f, 93.45f),
                    PathNode.LineTo(160.59f, 121.45f),
                    PathNode.CurveTo(162.72542f, 122.947464f, 163.9968f, 125.39186f, 163.9968f, 128.0f),
                    PathNode.CurveTo(163.9968f, 130.60814f, 162.72542f, 133.05254f, 160.59f, 134.55f),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
