package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorBoldIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.5f, 66.8f),
                    PathNode.LineTo(131.3f, 36.46f),
                    PathNode.CurveTo(129.67548f, 35.9981f, 127.9721f, 35.882267f, 126.3f, 36.12f),
                    PathNode.LineTo(21.17f, 51.12f),
                    PathNode.CurveTo(11.331717f, 52.56957f, 4.032314f, 60.995552f, 4.0f, 70.94f),
                    PathNode.LineTo(4.0f, 185.06f),
                    PathNode.CurveTo(4.042183f, 194.99686f, 11.33919f, 203.41158f, 21.17f, 204.86f),
                    PathNode.LineTo(126.3f, 219.86f),
                    PathNode.CurveTo(126.86316f, 219.93974f, 127.43122f, 219.97984f, 128.0f, 219.98f),
                    PathNode.CurveTo(129.11604f, 219.98087f, 130.22675f, 219.82605f, 131.3f, 219.52f),
                    PathNode.LineTo(237.5f, 189.2f),
                    PathNode.CurveTo(246.05504f, 186.72182f, 251.95712f, 178.90665f, 252.0f, 170.0f),
                    PathNode.LineTo(252.0f, 86.0f),
                    PathNode.CurveTo(251.96043f, 77.09224f, 246.05702f, 69.2753f, 237.5f, 66.8f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.LineTo(84.0f, 66.41f),
                    PathNode.LineTo(116.0f, 61.84f),
                    PathNode.LineTo(116.0f, 194.16f),
                    PathNode.LineTo(84.0f, 189.59f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.CurveTo(98.62742f, 140.0f, 104.0f, 134.62741f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 121.37258f, 98.62742f, 116.0f, 92.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 74.41f),
                    PathNode.LineTo(60.0f, 69.84f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.CurveTo(45.37258f, 116.0f, 40.0f, 121.37258f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 134.62741f, 45.37258f, 140.0f, 52.0f, 140.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(60.0f, 186.16f),
                    PathNode.LineTo(28.0f, 181.59f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 167.0f),
                    PathNode.LineTo(140.0f, 192.14f),
                    PathNode.LineTo(140.0f, 63.91f),
                    PathNode.LineTo(228.0f, 89.05f),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
