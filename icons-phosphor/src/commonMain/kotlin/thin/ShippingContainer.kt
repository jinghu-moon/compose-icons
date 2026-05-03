package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorThinIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.3f, 74.5f),
                    PathNode.LineTo(129.1f, 44.15f),
                    PathNode.CurveTo(128.55687f, 43.998615f, 127.9883f, 43.961163f, 127.43f, 44.04f),
                    PathNode.LineTo(22.3f, 59.06f),
                    PathNode.CurveTo(16.402308f, 59.92995f, 12.025161f, 64.978546f, 12.0f, 70.94f),
                    PathNode.LineTo(12.0f, 185.06f),
                    PathNode.CurveTo(12.025161f, 191.02145f, 16.402308f, 196.07005f, 22.3f, 196.94f),
                    PathNode.LineTo(127.43f, 211.94f),
                    PathNode.CurveTo(127.619705f, 211.9549f, 127.810295f, 211.9549f, 128.0f, 211.94f),
                    PathNode.CurveTo(128.37177f, 211.93997f, 128.7418f, 211.88953f, 129.1f, 211.79f),
                    PathNode.LineTo(235.3f, 181.5f),
                    PathNode.CurveTo(240.43668f, 180.0308f, 243.98335f, 175.34264f, 244.0f, 170.0f),
                    PathNode.LineTo(244.0f, 86.0f),
                    PathNode.CurveTo(243.98335f, 80.65737f, 240.43668f, 75.96921f, 235.3f, 74.5f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 124.0f),
                    PathNode.LineTo(76.0f, 124.0f),
                    PathNode.LineTo(76.0f, 59.47f),
                    PathNode.LineTo(124.0f, 52.61f),
                    PathNode.LineTo(124.0f, 203.39f),
                    PathNode.LineTo(76.0f, 196.53f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(98.20914f, 132.0f, 100.0f, 130.20914f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 125.79086f, 98.20914f, 124.0f, 96.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 185.06f),
                    PathNode.LineTo(20.0f, 70.94f),
                    PathNode.CurveTo(19.979559f, 68.93558f, 21.445911f, 67.22555f, 23.43f, 66.94f),
                    PathNode.LineTo(68.0f, 60.61f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.CurveTo(45.79086f, 124.0f, 44.0f, 125.79086f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 130.20914f, 45.79086f, 132.0f, 48.0f, 132.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(68.0f, 195.39f),
                    PathNode.LineTo(23.43f, 189.0f),
                    PathNode.CurveTo(21.468538f, 188.71764f, 20.009504f, 187.04166f, 20.0f, 185.06f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 170.0f),
                    PathNode.CurveTo(235.99742f, 171.78336f, 234.81459f, 173.34958f, 233.1f, 173.84f),
                    PathNode.LineTo(132.0f, 202.7f),
                    PathNode.LineTo(132.0f, 53.3f),
                    PathNode.LineTo(233.1f, 82.19f),
                    PathNode.CurveTo(234.80397f, 82.67731f, 235.98413f, 84.22779f, 236.0f, 86.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
