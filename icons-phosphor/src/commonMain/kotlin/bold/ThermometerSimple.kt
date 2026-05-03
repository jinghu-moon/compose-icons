package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorBoldIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 150.69f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 27.281193f, 156.71881f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(99.2812f, 4.0f, 76.0f, 27.281193f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 150.69f),
                    PathNode.CurveTo(56.960873f, 177.22572f, 60.95614f, 213.84044f, 85.27006f, 235.64563f),
                    PathNode.CurveTo(109.58397f, 257.4508f, 146.41603f, 257.4508f, 170.72995f, 235.64563f),
                    PathNode.CurveTo(195.04385f, 213.84044f, 199.03912f, 177.22572f, 180.0f, 150.69f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(112.53006f, 228.0005f, 98.44672f, 219.08052f, 91.835464f, 205.09445f),
                    PathNode.CurveTo(85.224205f, 191.10835f, 87.27045f, 174.5639f, 97.09f, 162.61f),
                    PathNode.CurveTo(98.96643f, 160.43274f, 99.99904f, 157.65428f, 100.0f, 154.78f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 40.53603f, 112.536026f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(143.46397f, 28.0f, 156.0f, 40.53603f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 154.77f),
                    PathNode.CurveTo(155.99733f, 157.57507f, 156.97742f, 160.29243f, 158.77f, 162.45f),
                    PathNode.CurveTo(168.67447f, 174.38055f, 170.79147f, 190.96053f, 164.20256f, 204.99702f),
                    PathNode.CurveTo(157.61365f, 219.03352f, 143.50603f, 227.99745f, 128.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 188.0f),
                    PathNode.CurveTo(152.00224f, 199.64763f, 143.64099f, 209.6154f, 132.17058f, 211.63947f),
                    PathNode.CurveTo(120.700165f, 213.66351f, 109.43233f, 207.15947f, 105.44791f, 196.21454f),
                    PathNode.CurveTo(101.46348f, 185.2696f, 105.91286f, 173.04381f, 116.0f, 167.22f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.CurveTo(116.0f, 85.37258f, 121.37258f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(134.62741f, 80.0f, 140.0f, 85.37258f, 140.0f, 92.0f),
                    PathNode.LineTo(140.0f, 167.22f),
                    PathNode.CurveTo(147.4242f, 171.50636f, 151.99835f, 179.42728f, 152.0f, 188.0f),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
