package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorBoldIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 80.836555f, 168.83656f, 88.0f, 160.0f, 88.0f),
                    PathNode.CurveTo(151.16344f, 88.0f, 144.0f, 80.836555f, 144.0f, 72.0f),
                    PathNode.CurveTo(144.0f, 63.163445f, 151.16344f, 56.0f, 160.0f, 56.0f),
                    PathNode.CurveTo(168.83656f, 56.0f, 176.0f, 63.163445f, 176.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.CurveTo(244.00595f, 84.017006f, 242.00156f, 87.77056f, 238.66f, 90.0f),
                    PathNode.LineTo(220.0f, 102.42f),
                    PathNode.LineTo(220.0f, 120.0f),
                    PathNode.CurveTo(219.93387f, 179.61934f, 171.61934f, 227.93387f, 112.0f, 228.0f),
                    PathNode.LineTo(24.0f, 228.0f),
                    PathNode.CurveTo(16.314547f, 227.99136f, 9.313863f, 223.57957f, 5.98986f, 216.65013f),
                    PathNode.CurveTo(2.665857f, 209.72067f, 3.606584f, 201.49945f, 8.41f, 195.5f),
                    PathNode.LineTo(8.56f, 195.32f),
                    PathNode.LineTo(92.0f, 95.18f),
                    PathNode.LineTo(92.0f, 76.89f),
                    PathNode.CurveTo(92.0f, 41.28f, 120.57f, 12.17f, 155.69f, 12.0f),
                    PathNode.LineTo(156.0f, 12.0f),
                    PathNode.CurveTo(183.37903f, 11.971591f, 207.7377f, 29.378119f, 216.58f, 55.29f),
                    PathNode.LineTo(238.66f, 70.0f),
                    PathNode.CurveTo(242.00156f, 72.22944f, 244.00595f, 75.982994f, 244.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.37f, 80.0f),
                    PathNode.LineTo(199.68f, 72.87f),
                    PathNode.CurveTo(197.20554f, 71.23476f, 195.42432f, 68.741066f, 194.68f, 65.87f),
                    PathNode.CurveTo(190.0749f, 48.278812f, 174.18398f, 36.00729f, 156.0f, 36.0f),
                    PathNode.LineTo(155.81f, 36.0f),
                    PathNode.CurveTo(133.86f, 36.11f, 116.01f, 54.45f, 116.01f, 76.89f),
                    PathNode.LineTo(116.01f, 99.52f),
                    PathNode.CurveTo(116.00939f, 102.33099f, 115.02198f, 105.05257f, 113.22f, 107.21f),
                    PathNode.LineTo(32.57f, 204.0f),
                    PathNode.LineTo(53.05f, 204.0f),
                    PathNode.LineTo(122.79f, 120.32f),
                    PathNode.CurveTo(125.49347f, 116.89537f, 129.84271f, 115.20797f, 134.14847f, 115.91321f),
                    PathNode.CurveTo(138.45422f, 116.61844f, 142.0379f, 119.60516f, 143.50758f, 123.71331f),
                    PathNode.CurveTo(144.97726f, 127.82146f, 144.10133f, 132.40361f, 141.22f, 135.68f),
                    PathNode.LineTo(84.29f, 204.0f),
                    PathNode.LineTo(112.0f, 204.0f),
                    PathNode.CurveTo(158.37135f, 203.9504f, 195.9504f, 166.37135f, 196.0f, 120.0f),
                    PathNode.LineTo(196.0f, 96.0f),
                    PathNode.CurveTo(195.99628f, 91.981094f, 198.00464f, 88.22714f, 201.35f, 86.0f),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
