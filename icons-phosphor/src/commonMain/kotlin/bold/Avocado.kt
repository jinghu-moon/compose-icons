package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorBoldIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(99.2812f, 108.0f, 76.0f, 131.28119f, 76.0f, 160.0f),
                    PathNode.CurveTo(76.0f, 188.71881f, 99.2812f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(156.71881f, 212.0f, 180.0f, 188.71881f, 180.0f, 160.0f),
                    PathNode.CurveTo(179.96693f, 131.2949f, 156.7051f, 108.033066f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(112.536026f, 188.0f, 100.0f, 175.46397f, 100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 144.53603f, 112.536026f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(143.46397f, 132.0f, 156.0f, 144.53603f, 156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 175.46397f, 143.46397f, 188.0f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.76f, 129.32f),
                    PathNode.LineTo(185.0f, 45.17f),
                    PathNode.CurveTo(176.96806f, 20.780066f, 154.30574f, 4.205048f, 128.62868f, 3.940546f),
                    PathNode.CurveTo(102.95163f, 3.676044f, 79.95267f, 19.780699f, 71.42f, 44.0f),
                    PathNode.LineTo(71.42f, 44.0f),
                    PathNode.LineTo(41.92f, 127.46f),
                    PathNode.CurveTo(27.568539f, 165.51003f, 39.90101f, 208.46832f, 72.25042f, 233.11145f),
                    PathNode.CurveTo(104.59983f, 257.75458f, 149.29071f, 258.23553f, 182.16295f, 234.29427f),
                    PathNode.CurveTo(215.0352f, 210.35301f, 228.28929f, 167.67006f, 214.76f, 129.32f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(105.65084f, 227.98373f, 84.73433f, 216.99455f, 72.04079f, 198.6f),
                    PathNode.CurveTo(59.34725f, 180.20546f, 56.495007f, 156.75067f, 64.41f, 135.85f),
                    PathNode.CurveTo(64.41f, 135.76f, 64.48f, 135.67f, 64.51f, 135.59f),
                    PathNode.LineTo(94.05f, 52.0f),
                    PathNode.LineTo(94.05f, 52.0f),
                    PathNode.CurveTo(99.17619f, 37.456917f, 112.99533f, 27.79363f, 128.41441f, 27.970057f),
                    PathNode.CurveTo(143.83351f, 28.14648f, 157.4279f, 38.123432f, 162.22f, 52.78f),
                    PathNode.LineTo(162.31f, 53.05f),
                    PathNode.LineTo(192.13f, 137.33f),
                    PathNode.CurveTo(199.49086f, 158.14622f, 196.28685f, 181.24045f, 183.53714f, 199.2666f),
                    PathNode.CurveTo(170.78741f, 217.29277f, 150.07935f, 228.00655f, 128.0f, 228.0f),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
