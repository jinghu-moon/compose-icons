package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorLightIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.85f, 72.57f),
                    PathNode.LineTo(129.65f, 42.23f),
                    PathNode.CurveTo(128.83792f, 41.998013f, 127.98601f, 41.940083f, 127.15f, 42.06f),
                    PathNode.LineTo(22.0f, 57.08f),
                    PathNode.CurveTo(15.125976f, 58.102386f, 10.028111f, 63.990417f, 10.0f, 70.94f),
                    PathNode.LineTo(10.0f, 185.06f),
                    PathNode.CurveTo(10.028111f, 192.00958f, 15.125976f, 197.89761f, 22.0f, 198.92f),
                    PathNode.LineTo(127.13f, 213.92f),
                    PathNode.CurveTo(127.411575f, 213.95988f, 127.69561f, 213.97993f, 127.98f, 213.98f),
                    PathNode.CurveTo(128.53789f, 213.97865f, 129.093f, 213.90128f, 129.63f, 213.75f),
                    PathNode.LineTo(235.83f, 183.41f),
                    PathNode.CurveTo(241.81645f, 181.68661f, 245.95512f, 176.2294f, 246.0f, 170.0f),
                    PathNode.LineTo(246.0f, 86.0f),
                    PathNode.CurveTo(245.96655f, 79.76872f, 241.83559f, 74.30282f, 235.85f, 72.57f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 122.0f),
                    PathNode.LineTo(78.0f, 122.0f),
                    PathNode.LineTo(78.0f, 61.2f),
                    PathNode.LineTo(122.0f, 54.92f),
                    PathNode.LineTo(122.0f, 201.08f),
                    PathNode.LineTo(78.0f, 194.8f),
                    PathNode.LineTo(78.0f, 134.0f),
                    PathNode.LineTo(96.0f, 134.0f),
                    PathNode.CurveTo(99.313705f, 134.0f, 102.0f, 131.3137f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 124.686295f, 99.313705f, 122.0f, 96.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 185.06f),
                    PathNode.LineTo(22.0f, 70.94f),
                    PathNode.CurveTo(21.99012f, 69.936134f, 22.725967f, 69.0805f, 23.72f, 68.94f),
                    PathNode.LineTo(66.0f, 62.94f),
                    PathNode.LineTo(66.0f, 122.0f),
                    PathNode.LineTo(48.0f, 122.0f),
                    PathNode.CurveTo(44.68629f, 122.0f, 42.0f, 124.686295f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 131.3137f, 44.68629f, 134.0f, 48.0f, 134.0f),
                    PathNode.LineTo(66.0f, 134.0f),
                    PathNode.LineTo(66.0f, 193.08f),
                    PathNode.LineTo(23.72f, 187.08f),
                    PathNode.CurveTo(22.718306f, 186.93858f, 21.979948f, 186.07143f, 22.0f, 185.06f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 170.0f),
                    PathNode.CurveTo(233.99872f, 170.89168f, 233.4073f, 171.67479f, 232.55f, 171.92f),
                    PathNode.LineTo(134.0f, 200.05f),
                    PathNode.LineTo(134.0f, 56.0f),
                    PathNode.LineTo(232.55f, 84.16f),
                    PathNode.CurveTo(233.37956f, 84.39646f, 233.96404f, 85.13815f, 234.0f, 86.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
