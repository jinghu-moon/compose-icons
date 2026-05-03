package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorBoldIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.8f, 162.93f),
                    PathNode.LineTo(255.8f, 162.62f),
                    PathNode.CurveTo(254.06181f, 145.419f, 242.39848f, 130.8359f, 226.0f, 125.36f),
                    PathNode.LineTo(169.38f, 105.16f),
                    PathNode.LineTo(169.14f, 105.07f),
                    PathNode.CurveTo(163.83417f, 103.30139f, 159.51129f, 99.39194f, 157.22f, 94.29f),
                    PathNode.LineTo(134.06f, 40.0f),
                    PathNode.LineTo(134.0f, 39.84f),
                    PathNode.CurveTo(129.69856f, 30.2744f, 118.754486f, 25.637007f, 108.89f, 29.2f),
                    PathNode.LineTo(33.17f, 56.73f),
                    PathNode.CurveTo(25.275986f, 59.62008f, 20.019533f, 67.1236f, 20.0f, 75.53f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(236.0f, 212.0f),
                    PathNode.CurveTo(247.0457f, 212.0f, 256.0f, 203.0457f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 167.06f),
                    PathNode.CurveTo(256.0f, 165.67f, 255.93f, 164.3f, 255.8f, 162.93f),
                    PathNode.Close,
                    PathNode.MoveTo(113.53f, 53.05f),
                    PathNode.LineTo(119.53f, 67.05f),
                    PathNode.LineTo(103.9f, 72.72f),
                    PathNode.CurveTo(99.78358f, 74.119064f, 96.745865f, 77.63524f, 95.95948f, 81.91121f),
                    PathNode.CurveTo(95.173096f, 86.18718f, 96.76105f, 90.55405f, 100.11036f, 93.326126f),
                    PathNode.CurveTo(103.45967f, 96.098206f, 108.04641f, 96.84185f, 112.1f, 95.27f),
                    PathNode.LineTo(129.0f, 89.14f),
                    PathNode.LineTo(133.54f, 99.77f),
                    PathNode.LineTo(119.94f, 104.77f),
                    PathNode.CurveTo(114.541885f, 106.80131f, 111.352455f, 112.3856f, 112.34544f, 118.06712f),
                    PathNode.CurveTo(113.33842f, 123.74865f, 118.2329f, 127.92009f, 124.0f, 128.0f),
                    PathNode.CurveTo(125.399155f, 128.00188f, 126.787476f, 127.754684f, 128.1f, 127.27f),
                    PathNode.LineTo(147.67f, 120.16f),
                    PathNode.CurveTo(151.7705f, 123.51971f, 156.44609f, 126.10822f, 161.47f, 127.8f),
                    PathNode.LineTo(218.09f, 148.0f),
                    PathNode.LineTo(218.32f, 148.08f),
                    PathNode.CurveTo(220.8379f, 148.91422f, 223.16353f, 150.24362f, 225.16f, 151.99f),
                    PathNode.LineTo(44.0f, 151.99f),
                    PathNode.LineTo(44.0f, 78.33f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 188.0f),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
