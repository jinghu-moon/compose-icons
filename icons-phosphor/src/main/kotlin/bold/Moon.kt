package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorBoldIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.37f, 139.4f),
                    PathNode.CurveTo(233.23322f, 136.25667f, 228.61696f, 135.10262f, 224.37f, 136.4f),
                    PathNode.CurveTo(194.70638f, 145.35513f, 162.52155f, 137.26714f, 140.6154f, 115.35263f),
                    PathNode.CurveTo(118.70925f, 93.438126f, 110.63355f, 61.250202f, 119.6f, 31.59f),
                    PathNode.CurveTo(120.90832f, 27.341068f, 119.76031f, 22.717f, 116.61665f, 19.573345f),
                    PathNode.CurveTo(113.473f, 16.429691f, 108.84893f, 15.281686f, 104.6f, 16.59f),
                    PathNode.CurveTo(82.70395f, 23.31995f, 63.488857f, 36.785564f, 49.69f, 55.07f),
                    PathNode.CurveTo(25.077894f, 87.783424f, 21.077808f, 131.60054f, 39.35959f, 168.22977f),
                    PathNode.CurveTo(57.641373f, 204.859f, 95.06195f, 228.0029f, 136.0f, 228.0f),
                    PathNode.CurveTo(159.4335f, 228.06877f, 182.24274f, 220.44931f, 200.93f, 206.31f),
                    PathNode.CurveTo(219.20473f, 192.49731f, 232.65637f, 173.27167f, 239.37f, 151.37f),
                    PathNode.CurveTo(240.65533f, 147.13211f, 239.50212f, 142.53076f, 236.37f, 139.4f),
                    PathNode.Close,
                    PathNode.MoveTo(186.49f, 187.14f),
                    PathNode.CurveTo(153.04721f, 212.31612f, 106.17182f, 209.02711f, 76.57235f, 179.42764f),
                    PathNode.CurveTo(46.972885f, 149.82819f, 43.683884f, 102.95279f, 68.86f, 69.51f),
                    PathNode.CurveTo(75.26733f, 61.034637f, 83.208046f, 53.836765f, 92.27f, 48.29f),
                    PathNode.QuadTo(92.0f, 52.13f, 92.0f, 56.0f),
                    PathNode.CurveTo(92.06613f, 115.61934f, 140.38066f, 163.93387f, 200.0f, 164.0f),
                    PathNode.QuadTo(203.87f, 164.0f, 207.71f, 163.73f),
                    PathNode.CurveTo(202.16591f, 172.79395f, 194.96762f, 180.73514f, 186.49f, 187.14f),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
