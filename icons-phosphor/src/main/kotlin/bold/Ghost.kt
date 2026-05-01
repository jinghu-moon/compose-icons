package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorBoldIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 124.836555f, 108.836555f, 132.0f, 100.0f, 132.0f),
                    PathNode.CurveTo(91.163445f, 132.0f, 84.0f, 124.836555f, 84.0f, 116.0f),
                    PathNode.CurveTo(84.0f, 107.163445f, 91.163445f, 100.0f, 100.0f, 100.0f),
                    PathNode.CurveTo(108.836555f, 100.0f, 116.0f, 107.163445f, 116.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 100.0f),
                    PathNode.CurveTo(147.16344f, 100.0f, 140.0f, 107.163445f, 140.0f, 116.0f),
                    PathNode.CurveTo(140.0f, 124.836555f, 147.16344f, 132.0f, 156.0f, 132.0f),
                    PathNode.CurveTo(164.83656f, 132.0f, 172.0f, 124.836555f, 172.0f, 116.0f),
                    PathNode.CurveTo(172.0f, 107.163445f, 164.83656f, 100.0f, 156.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 120.0f),
                    PathNode.LineTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.00133f, 220.63757f, 225.33032f, 224.86078f, 221.13965f, 226.84706f),
                    PathNode.CurveTo(216.94899f, 228.83336f, 211.98892f, 228.22713f, 208.4f, 225.29f),
                    PathNode.LineTo(186.67f, 207.5f),
                    PathNode.LineTo(164.93f, 225.29f),
                    PathNode.CurveTo(160.5092f, 228.90793f, 154.1508f, 228.90793f, 149.73f, 225.29f),
                    PathNode.LineTo(128.0f, 207.5f),
                    PathNode.LineTo(106.27f, 225.29f),
                    PathNode.CurveTo(101.8492f, 228.90793f, 95.49081f, 228.90793f, 91.07f, 225.29f),
                    PathNode.LineTo(69.33f, 207.5f),
                    PathNode.LineTo(47.6f, 225.29f),
                    PathNode.CurveTo(44.011086f, 228.22713f, 39.05101f, 228.83336f, 34.860348f, 226.84706f),
                    PathNode.CurveTo(30.669682f, 224.86078f, 27.998667f, 220.63757f, 28.0f, 216.0f),
                    PathNode.LineTo(28.0f, 120.0f),
                    PathNode.CurveTo(28.0f, 64.77152f, 72.77152f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(183.22847f, 20.0f, 228.0f, 64.77152f, 228.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 78.02636f, 169.97365f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(86.02636f, 44.0f, 52.0f, 78.02636f, 52.0f, 120.0f),
                    PathNode.LineTo(52.0f, 190.68f),
                    PathNode.LineTo(61.73f, 182.68f),
                    PathNode.CurveTo(66.1508f, 179.06207f, 72.50919f, 179.06207f, 76.93f, 182.68f),
                    PathNode.LineTo(98.67f, 200.5f),
                    PathNode.LineTo(120.4f, 182.71f),
                    PathNode.CurveTo(124.82081f, 179.09207f, 131.1792f, 179.09207f, 135.6f, 182.71f),
                    PathNode.LineTo(157.33f, 200.5f),
                    PathNode.LineTo(179.07f, 182.71f),
                    PathNode.CurveTo(183.4908f, 179.09207f, 189.8492f, 179.09207f, 194.27f, 182.71f),
                    PathNode.LineTo(204.0f, 190.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ghost!!
    }

private var _ghost: ImageVector? = null
