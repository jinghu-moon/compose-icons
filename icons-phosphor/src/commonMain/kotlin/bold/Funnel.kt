package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorBoldIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.29f, 47.91f),
                    PathNode.CurveTo(231.08777f, 40.670063f, 223.91649f, 36.0003f, 216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(32.08485f, 36.00077f, 24.914804f, 40.66938f, 21.712208f, 47.90768f),
                    PathNode.CurveTo(18.509615f, 55.14598f, 19.877062f, 63.59202f, 25.2f, 69.45f),
                    PathNode.LineTo(25.32f, 69.59f),
                    PathNode.LineTo(92.0f, 140.75f),
                    PathNode.LineTo(92.0f, 216.0f),
                    PathNode.CurveTo(91.99889f, 223.37773f, 96.05957f, 230.15692f, 102.5647f, 233.63748f),
                    PathNode.CurveTo(109.06983f, 237.11804f, 116.96283f, 236.73465f, 123.1f, 232.64f),
                    PathNode.LineTo(155.1f, 211.31f),
                    PathNode.CurveTo(160.66434f, 207.59755f, 164.00435f, 201.3491f, 164.0f, 194.66f),
                    PathNode.LineTo(164.0f, 140.75f),
                    PathNode.LineTo(230.67f, 69.59f),
                    PathNode.LineTo(230.79f, 69.45f),
                    PathNode.CurveTo(236.11612f, 63.595104f, 237.48834f, 55.15002f, 234.29f, 47.91f),
                    PathNode.Close,
                    PathNode.MoveTo(143.29f, 127.8f),
                    PathNode.CurveTo(141.19037f, 130.01544f, 140.01389f, 132.94772f, 140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 192.52f),
                    PathNode.LineTo(116.0f, 208.52f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.CurveTo(115.99694f, 132.9532f, 114.835045f, 130.02162f, 112.75f, 127.8f),
                    PathNode.LineTo(49.23f, 60.0f),
                    PathNode.LineTo(206.77f, 60.0f),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
