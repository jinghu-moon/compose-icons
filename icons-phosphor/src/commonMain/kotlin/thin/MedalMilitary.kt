package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorThinIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.0f, 44.0f),
                    PathNode.LineTo(49.0f, 44.0f),
                    PathNode.CurveTo(41.820297f, 44.0f, 36.0f, 49.820297f, 36.0f, 57.0f),
                    PathNode.LineTo(36.0f, 106.21f),
                    PathNode.CurveTo(36.01741f, 111.29151f, 38.99402f, 115.89705f, 43.62f, 118.0f),
                    PathNode.LineTo(114.34f, 150.14f),
                    PathNode.CurveTo(93.77813f, 156.85535f, 81.146996f, 177.52003f, 84.54693f, 198.88185f),
                    PathNode.CurveTo(87.94686f, 220.24365f, 106.36932f, 235.96588f, 128.0f, 235.96588f),
                    PathNode.CurveTo(149.63068f, 235.96588f, 168.05313f, 220.24365f, 171.45305f, 198.88185f),
                    PathNode.CurveTo(174.85301f, 177.52003f, 162.22186f, 156.85535f, 141.66f, 150.14f),
                    PathNode.LineTo(212.38f, 118.0f),
                    PathNode.CurveTo(217.00598f, 115.89705f, 219.98259f, 111.29151f, 220.0f, 106.21f),
                    PathNode.LineTo(220.0f, 57.0f),
                    PathNode.CurveTo(220.0f, 49.820297f, 214.1797f, 44.0f, 207.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 131.24f),
                    PathNode.LineTo(128.0f, 147.61f),
                    PathNode.LineTo(92.0f, 131.24f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 106.21f),
                    PathNode.LineTo(44.0f, 57.0f),
                    PathNode.CurveTo(44.0f, 54.238575f, 46.238575f, 52.0f, 49.0f, 52.0f),
                    PathNode.LineTo(84.0f, 52.0f),
                    PathNode.LineTo(84.0f, 127.61f),
                    PathNode.LineTo(46.93f, 110.76f),
                    PathNode.CurveTo(45.14602f, 109.94863f, 44.00054f, 108.16982f, 44.0f, 106.21f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 192.0f),
                    PathNode.CurveTo(164.0f, 211.88223f, 147.88223f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(108.11775f, 228.0f, 92.0f, 211.88223f, 92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 172.11777f, 108.11775f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(147.88223f, 156.0f, 164.0f, 172.11777f, 164.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 106.21f),
                    PathNode.CurveTo(211.99945f, 108.16982f, 210.85399f, 109.94863f, 209.07f, 110.76f),
                    PathNode.LineTo(172.0f, 127.61f),
                    PathNode.LineTo(172.0f, 52.0f),
                    PathNode.LineTo(207.0f, 52.0f),
                    PathNode.CurveTo(209.76143f, 52.0f, 212.0f, 54.238575f, 212.0f, 57.0f),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
