package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorBoldIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.15f, 78.54f),
                    PathNode.LineTo(177.46f, 17.86f),
                    PathNode.CurveTo(173.70863f, 14.104459f, 168.61818f, 11.994267f, 163.31f, 11.994267f),
                    PathNode.CurveTo(158.0018f, 11.994267f, 152.91136f, 14.104459f, 149.16f, 17.86f),
                    PathNode.LineTo(97.2f, 70.0f),
                    PathNode.CurveTo(84.77f, 66.67f, 60.52f, 64.28f, 35.46f, 84.5f),
                    PathNode.CurveTo(31.034117f, 88.06082f, 28.331207f, 93.33569f, 28.025938f, 99.00797f),
                    PathNode.CurveTo(27.72067f, 104.680244f, 29.841845f, 110.21474f, 33.86f, 114.23f),
                    PathNode.LineTo(79.32f, 159.7f),
                    PathNode.LineTo(39.52f, 199.5f),
                    PathNode.CurveTo(34.82558f, 204.19443f, 34.82558f, 211.80557f, 39.52f, 216.5f),
                    PathNode.CurveTo(44.21442f, 221.19443f, 51.82558f, 221.19443f, 56.52f, 216.5f),
                    PathNode.LineTo(96.32f, 176.69f),
                    PathNode.LineTo(141.79f, 222.15f),
                    PathNode.CurveTo(145.53659f, 225.89243f, 150.61447f, 227.9962f, 155.91f, 228.0f),
                    PathNode.CurveTo(156.37f, 228.0f, 156.84f, 228.0f, 157.31f, 227.95f),
                    PathNode.CurveTo(163.08534f, 227.53265f, 168.39635f, 224.63277f, 171.87f, 220.0f),
                    PathNode.CurveTo(176.56f, 213.77f, 182.87f, 203.87f, 186.31f, 192.0f),
                    PathNode.CurveTo(189.75f, 180.13f, 189.76f, 169.12f, 186.47f, 158.6f),
                    PathNode.LineTo(238.17f, 106.73f),
                    PathNode.CurveTo(245.91232f, 98.92493f, 245.90338f, 86.33408f, 238.15f, 78.54f),
                    PathNode.Close,
                    PathNode.MoveTo(163.89f, 147.33f),
                    PathNode.CurveTo(160.24916f, 150.98447f, 159.35127f, 156.5569f, 161.66f, 161.17f),
                    PathNode.CurveTo(165.09f, 168.03f, 168.56f, 182.17f, 155.38f, 201.82f),
                    PathNode.LineTo(54.08f, 100.53f),
                    PathNode.CurveTo(75.17f, 85.94f, 93.61f, 93.89f, 95.08f, 94.53f),
                    PathNode.CurveTo(99.68099f, 96.9188f, 105.3063f, 95.98601f, 108.89f, 92.24f),
                    PathNode.LineTo(163.32f, 37.63f),
                    PathNode.LineTo(218.32f, 92.63f),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
