package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorBoldIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 52.0f),
                    PathNode.CurveTo(194.32689f, 52.0f, 180.0f, 66.32689f, 180.0f, 84.0f),
                    PathNode.CurveTo(180.0f, 101.67311f, 194.32689f, 116.0f, 212.0f, 116.0f),
                    PathNode.CurveTo(229.67311f, 116.0f, 244.0f, 101.67311f, 244.0f, 84.0f),
                    PathNode.CurveTo(244.0f, 66.32689f, 229.67311f, 52.0f, 212.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 92.0f),
                    PathNode.CurveTo(207.58173f, 92.0f, 204.0f, 88.41828f, 204.0f, 84.0f),
                    PathNode.CurveTo(204.0f, 79.58172f, 207.58173f, 76.0f, 212.0f, 76.0f),
                    PathNode.CurveTo(216.41827f, 76.0f, 220.0f, 79.58172f, 220.0f, 84.0f),
                    PathNode.CurveTo(220.0f, 88.41828f, 216.41827f, 92.0f, 212.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 27.281193f, 136.71881f, 4.0f, 108.0f, 4.0f),
                    PathNode.CurveTo(79.2812f, 4.0f, 56.0f, 27.281193f, 56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 150.69f),
                    PathNode.CurveTo(36.960873f, 177.22572f, 40.95614f, 213.84044f, 65.27006f, 235.64563f),
                    PathNode.CurveTo(89.58397f, 257.4508f, 126.41603f, 257.4508f, 150.72995f, 235.64563f),
                    PathNode.CurveTo(175.04385f, 213.84044f, 179.03912f, 177.22572f, 160.0f, 150.69f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 228.0f),
                    PathNode.CurveTo(92.53006f, 228.0005f, 78.44672f, 219.08052f, 71.835464f, 205.09445f),
                    PathNode.CurveTo(65.224205f, 191.10835f, 67.27045f, 174.5639f, 77.09f, 162.61f),
                    PathNode.CurveTo(78.96643f, 160.43274f, 79.99904f, 157.65428f, 80.0f, 154.78f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(80.0f, 40.53603f, 92.536026f, 28.0f, 108.0f, 28.0f),
                    PathNode.CurveTo(123.463974f, 28.0f, 136.0f, 40.53603f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 154.77f),
                    PathNode.CurveTo(135.99733f, 157.57507f, 136.97742f, 160.29243f, 138.77f, 162.45f),
                    PathNode.CurveTo(148.67447f, 174.38055f, 150.79147f, 190.96053f, 144.20256f, 204.99702f),
                    PathNode.CurveTo(137.61365f, 219.03352f, 123.50603f, 227.99745f, 108.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 188.0f),
                    PathNode.CurveTo(132.00224f, 199.64763f, 123.641f, 209.6154f, 112.170586f, 211.63947f),
                    PathNode.CurveTo(100.700165f, 213.66351f, 89.43233f, 207.15947f, 85.44791f, 196.21454f),
                    PathNode.CurveTo(81.46348f, 185.2696f, 85.91286f, 173.04381f, 96.0f, 167.22f),
                    PathNode.LineTo(96.0f, 92.0f),
                    PathNode.CurveTo(96.0f, 85.37258f, 101.37258f, 80.0f, 108.0f, 80.0f),
                    PathNode.CurveTo(114.62742f, 80.0f, 120.0f, 85.37258f, 120.0f, 92.0f),
                    PathNode.LineTo(120.0f, 167.22f),
                    PathNode.CurveTo(127.4242f, 171.50636f, 131.99835f, 179.42728f, 132.0f, 188.0f),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
