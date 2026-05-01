package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorRegularIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.32f, 81.37f),
                    PathNode.LineTo(174.63f, 20.69f),
                    PathNode.CurveTo(171.62932f, 17.688627f, 167.5591f, 16.002417f, 163.315f, 16.002417f),
                    PathNode.CurveTo(159.0709f, 16.002417f, 155.00069f, 17.688627f, 152.0f, 20.69f),
                    PathNode.LineTo(98.37f, 74.49f),
                    PathNode.CurveTo(87.71f, 71.15f, 63.37f, 67.12f, 37.97f, 87.63f),
                    PathNode.CurveTo(34.429237f, 90.47715f, 32.265907f, 94.69539f, 32.019794f, 99.23221f),
                    PathNode.CurveTo(31.773685f, 103.76903f, 33.46801f, 108.19653f, 36.68f, 111.41f),
                    PathNode.LineTo(85.0f, 159.71f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(96.29f, 171.0f),
                    PathNode.LineTo(144.58f, 219.29f),
                    PathNode.CurveTo(147.57822f, 222.30083f, 151.65096f, 223.99539f, 155.9f, 224.0f),
                    PathNode.CurveTo(156.28f, 224.0f, 156.65f, 224.0f, 157.03f, 224.0f),
                    PathNode.CurveTo(161.64507f, 223.68024f, 165.89319f, 221.37007f, 168.67f, 217.67f),
                    PathNode.CurveTo(188.31f, 191.57f, 186.42f, 170.35f, 181.86f, 157.67f),
                    PathNode.LineTo(235.33f, 104.0f),
                    PathNode.CurveTo(238.33005f, 100.997986f, 240.01447f, 96.927025f, 240.01259f, 92.68293f),
                    PathNode.CurveTo(240.0107f, 88.438835f, 238.3227f, 84.36936f, 235.32f, 81.37f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 92.69f),
                    PathNode.LineTo(224.0f, 92.69f),
                    PathNode.LineTo(166.73f, 150.15f),
                    PathNode.CurveTo(164.3047f, 152.58437f, 163.70496f, 156.29561f, 165.24f, 159.37f),
                    PathNode.CurveTo(174.7f, 178.3f, 163.44f, 197.96f, 155.9f, 207.99f),
                    PathNode.LineTo(48.0f, 100.08f),
                    PathNode.CurveTo(60.08f, 90.34f, 71.64f, 87.77f, 80.48f, 87.77f),
                    PathNode.CurveTo(86.089264f, 87.69344f, 91.65225f, 88.79378f, 96.81f, 91.0f),
                    PathNode.CurveTo(99.89626f, 92.54458f, 103.62515f, 91.93587f, 106.06f, 89.49f),
                    PathNode.LineTo(163.32f, 32.0f),
                    PathNode.LineTo(224.0f, 92.68f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
