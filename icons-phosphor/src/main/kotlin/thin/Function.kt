package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorThinIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 42.20914f, 202.20914f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(170.71f, 44.0f),
                    PathNode.CurveTo(157.1746f, 43.999977f, 145.57704f, 53.682156f, 143.16f, 67.0f),
                    PathNode.LineTo(132.79f, 124.0f),
                    PathNode.LineTo(184.0f, 124.0f),
                    PathNode.CurveTo(186.20914f, 124.0f, 188.0f, 125.79086f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 130.20914f, 186.20914f, 132.0f, 184.0f, 132.0f),
                    PathNode.LineTo(131.34f, 132.0f),
                    PathNode.LineTo(120.71f, 190.44f),
                    PathNode.CurveTo(117.597595f, 207.55788f, 102.68852f, 220.00034f, 85.29f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 213.79086f, 53.79086f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(85.29f, 212.0f),
                    PathNode.CurveTo(98.8254f, 212.00002f, 110.422966f, 202.31784f, 112.84f, 189.0f),
                    PathNode.LineTo(123.21f, 132.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.CurveTo(69.79086f, 132.0f, 68.0f, 130.20914f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 125.79086f, 69.79086f, 124.0f, 72.0f, 124.0f),
                    PathNode.LineTo(124.66f, 124.0f),
                    PathNode.LineTo(135.29f, 65.56f),
                    PathNode.CurveTo(138.4024f, 48.44213f, 153.31148f, 35.99966f, 170.71f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(202.20914f, 36.0f, 204.0f, 37.79086f, 204.0f, 40.0f),
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
        return _function!!
    }

private var _function: ImageVector? = null
