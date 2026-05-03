package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorBoldIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 72.28f),
                    PathNode.LineTo(180.0f, 72.0f),
                    PathNode.CurveTo(180.0f, 60.954304f, 171.0457f, 52.0f, 160.0f, 52.0f),
                    PathNode.LineTo(140.0f, 52.0f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(140.0f, 9.372583f, 134.62741f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(121.37258f, 4.0f, 116.0f, 9.372583f, 116.0f, 16.0f),
                    PathNode.LineTo(116.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(84.95431f, 52.0f, 76.0f, 60.954304f, 76.0f, 72.0f),
                    PathNode.LineTo(76.0f, 72.28f),
                    PathNode.CurveTo(36.71038f, 91.904495f, 11.919003f, 132.08203f, 12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 182.62741f, 17.372583f, 188.0f, 24.0f, 188.0f),
                    PathNode.LineTo(84.19f, 188.0f),
                    PathNode.CurveTo(86.29895f, 210.61995f, 105.28195f, 227.9154f, 128.0f, 227.9154f),
                    PathNode.CurveTo(150.71805f, 227.9154f, 169.70105f, 210.61995f, 171.81f, 188.0f),
                    PathNode.LineTo(232.0f, 188.0f),
                    PathNode.CurveTo(238.62741f, 188.0f, 244.0f, 182.62741f, 244.0f, 176.0f),
                    PathNode.CurveTo(244.081f, 132.08203f, 219.28961f, 91.904495f, 180.0f, 72.28f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(118.49463f, 204.00194f, 110.30107f, 197.31332f, 108.4f, 188.0f),
                    PathNode.LineTo(147.6f, 188.0f),
                    PathNode.CurveTo(145.69893f, 197.31332f, 137.50537f, 204.00194f, 128.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.78f, 164.0f),
                    PathNode.CurveTo(41.002277f, 131.44467f, 62.29634f, 103.62587f, 92.62f, 91.05f),
                    PathNode.CurveTo(97.080925f, 89.18911f, 99.98993f, 84.83349f, 100.0f, 80.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(156.0f, 80.0f),
                    PathNode.CurveTo(155.99799f, 84.84441f, 158.90901f, 89.214905f, 163.38f, 91.08f),
                    PathNode.CurveTo(193.71779f, 103.6646f, 215.01453f, 131.50597f, 219.22f, 164.08f),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
