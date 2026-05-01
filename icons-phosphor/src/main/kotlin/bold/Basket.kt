package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorBoldIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 174.62741f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.06f, 126.81f),
                    PathNode.LineTo(164.06f, 166.81f),
                    PathNode.CurveTo(163.40326f, 173.40413f, 168.21596f, 179.28233f, 174.81f, 179.94f),
                    PathNode.CurveTo(175.21f, 179.94f, 175.62f, 180.0f, 176.01f, 180.0f),
                    PathNode.CurveTo(182.17244f, 179.99443f, 187.3289f, 175.32205f, 187.94f, 169.19f),
                    PathNode.LineTo(191.94f, 129.19f),
                    PathNode.CurveTo(192.51407f, 122.64328f, 187.7154f, 116.85269f, 181.17595f, 116.200935f),
                    PathNode.CurveTo(174.6365f, 115.54918f, 168.78935f, 120.278755f, 168.06f, 126.81f),
                    PathNode.Close,
                    PathNode.MoveTo(87.94f, 126.81f),
                    PathNode.CurveTo(87.21065f, 120.278755f, 81.36349f, 115.54918f, 74.82404f, 116.200935f),
                    PathNode.CurveTo(68.2846f, 116.85269f, 63.485935f, 122.64328f, 64.06f, 129.19f),
                    PathNode.LineTo(68.06f, 169.19f),
                    PathNode.CurveTo(68.671486f, 175.32585f, 73.833755f, 179.99956f, 80.0f, 180.0f),
                    PathNode.CurveTo(80.39f, 180.0f, 80.8f, 180.0f, 81.2f, 179.94f),
                    PathNode.CurveTo(87.794044f, 179.28233f, 92.606735f, 173.40413f, 91.95f, 166.81f),
                    PathNode.Close,
                    PathNode.MoveTo(243.94f, 89.59f),
                    PathNode.LineTo(228.87f, 202.59f),
                    PathNode.CurveTo(227.54247f, 212.55112f, 219.0492f, 219.99289f, 209.0f, 220.0f),
                    PathNode.LineTo(47.0f, 220.0f),
                    PathNode.CurveTo(36.98646f, 219.97131f, 28.527748f, 212.56247f, 27.18f, 202.64f),
                    PathNode.LineTo(12.11f, 89.64f),
                    PathNode.CurveTo(11.63589f, 86.20345f, 12.672187f, 82.72989f, 14.951711f, 80.11486f),
                    PathNode.CurveTo(17.231236f, 77.49983f, 20.530907f, 75.99925f, 24.0f, 76.0f),
                    PathNode.LineTo(66.55f, 76.0f),
                    PathNode.LineTo(119.0f, 16.1f),
                    PathNode.CurveTo(121.27864f, 13.496453f, 124.57014f, 12.003107f, 128.03f, 12.003107f),
                    PathNode.CurveTo(131.48987f, 12.003107f, 134.78136f, 13.496453f, 137.06f, 16.1f),
                    PathNode.LineTo(189.45f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(235.4591f, 76.00121f, 238.74944f, 77.495056f, 241.02713f, 80.09841f),
                    PathNode.CurveTo(243.30486f, 82.701775f, 244.34831f, 86.16139f, 243.89f, 89.59f),
                    PathNode.Close,
                    PathNode.MoveTo(98.45f, 76.0f),
                    PathNode.LineTo(157.55f, 76.0f),
                    PathNode.LineTo(128.0f, 42.22f),
                    PathNode.Close,
                    PathNode.MoveTo(218.29f, 100.0f),
                    PathNode.LineTo(37.71f, 100.0f),
                    PathNode.LineTo(50.51f, 196.0f),
                    PathNode.LineTo(205.51f, 196.0f),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
