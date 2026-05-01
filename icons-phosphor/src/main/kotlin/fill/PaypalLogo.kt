package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorFillIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.12f, 93.54f),
                    PathNode.CurveTo(214.75061f, 86.63932f, 207.83472f, 81.097015f, 199.93f, 77.36f),
                    PathNode.CurveTo(198.5205f, 47.494686f, 173.89856f, 24.004131f, 144.0f, 24.0f),
                    PathNode.LineTo(84.0f, 24.0f),
                    PathNode.CurveTo(76.6588f, 24.001112f, 70.26024f, 28.997927f, 68.48f, 36.12f),
                    PathNode.LineTo(32.48f, 180.12f),
                    PathNode.CurveTo(31.28534f, 184.89938f, 32.359005f, 189.96266f, 35.39057f, 193.84587f),
                    PathNode.CurveTo(38.42214f, 197.7291f, 43.073563f, 199.99925f, 48.0f, 200.0f),
                    PathNode.LineTo(75.5f, 200.0f),
                    PathNode.LineTo(72.5f, 212.12f),
                    PathNode.CurveTo(71.30618f, 216.89598f, 72.37743f, 221.95566f, 75.40441f, 225.838f),
                    PathNode.CurveTo(78.4314f, 229.72035f, 83.07707f, 231.9931f, 88.0f, 232.0f),
                    PathNode.LineTo(119.5f, 232.0f),
                    PathNode.CurveTo(126.83374f, 231.98972f, 133.22157f, 226.99484f, 135.0f, 219.88f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(197.40608f, 183.99927f, 216.93904f, 171.79564f, 226.32623f, 152.55765f),
                    PathNode.CurveTo(235.71342f, 133.31964f, 233.31238f, 110.41331f, 220.14f, 93.54f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 184.0f),
                    PathNode.LineTo(84.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(163.1998f, 39.994564f, 179.69524f, 53.631638f, 183.3f, 72.49f),
                    PathNode.CurveTo(180.87967f, 72.1705f, 178.44131f, 72.00683f, 176.0f, 72.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(112.655075f, 71.99652f, 106.251144f, 76.99431f, 104.47f, 84.12f),
                    PathNode.LineTo(79.52f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.77f, 137.7f),
                    PathNode.CurveTo(210.3412f, 155.50673f, 194.34921f, 168.00497f, 176.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(136.6588f, 168.00111f, 130.26024f, 172.99792f, 128.48f, 180.12f),
                    PathNode.LineTo(119.48f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(169.29044f, 136.00725f, 191.43535f, 119.03359f, 198.0f, 94.61f),
                    PathNode.CurveTo(201.61198f, 97.00333f, 204.8133f, 99.96487f, 207.48f, 103.38f),
                    PathNode.CurveTo(215.10683f, 113.06755f, 217.8038f, 125.74702f, 214.78f, 137.7f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
