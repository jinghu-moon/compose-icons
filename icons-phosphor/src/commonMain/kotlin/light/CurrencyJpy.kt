package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorLightIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.64f, 51.8f),
                    PathNode.LineTo(140.64f, 130.0f),
                    PathNode.LineTo(176.0f, 130.0f),
                    PathNode.CurveTo(179.3137f, 130.0f, 182.0f, 132.6863f, 182.0f, 136.0f),
                    PathNode.CurveTo(182.0f, 139.3137f, 179.3137f, 142.0f, 176.0f, 142.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.LineTo(134.0f, 162.0f),
                    PathNode.LineTo(176.0f, 162.0f),
                    PathNode.CurveTo(179.3137f, 162.0f, 182.0f, 164.6863f, 182.0f, 168.0f),
                    PathNode.CurveTo(182.0f, 171.3137f, 179.3137f, 174.0f, 176.0f, 174.0f),
                    PathNode.LineTo(134.0f, 174.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 174.0f),
                    PathNode.LineTo(80.0f, 174.0f),
                    PathNode.CurveTo(76.686295f, 174.0f, 74.0f, 171.3137f, 74.0f, 168.0f),
                    PathNode.CurveTo(74.0f, 164.6863f, 76.686295f, 162.0f, 80.0f, 162.0f),
                    PathNode.LineTo(122.0f, 162.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.LineTo(80.0f, 142.0f),
                    PathNode.CurveTo(76.686295f, 142.0f, 74.0f, 139.3137f, 74.0f, 136.0f),
                    PathNode.CurveTo(74.0f, 132.6863f, 76.686295f, 130.0f, 80.0f, 130.0f),
                    PathNode.LineTo(115.34f, 130.0f),
                    PathNode.LineTo(51.34f, 51.8f),
                    PathNode.CurveTo(49.906925f, 50.15036f, 49.48401f, 47.85205f, 50.235992f, 45.800335f),
                    PathNode.CurveTo(50.987976f, 43.74862f, 52.79594f, 42.26796f, 54.955627f, 41.935116f),
                    PathNode.CurveTo(57.11531f, 41.602276f, 59.28518f, 42.469894f, 60.62f, 44.2f),
                    PathNode.LineTo(128.0f, 126.53f),
                    PathNode.LineTo(195.36f, 44.2f),
                    PathNode.CurveTo(197.48865f, 41.74967f, 201.17998f, 41.436382f, 203.69113f, 43.49293f),
                    PathNode.CurveTo(206.20229f, 45.54948f, 206.62271f, 49.230145f, 204.64f, 51.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
