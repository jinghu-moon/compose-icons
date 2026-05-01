package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorLightIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.35f, 89.15f),
                    PathNode.LineTo(136.41f, 20.82f),
                    PathNode.LineTo(136.28f, 20.72f),
                    PathNode.CurveTo(131.35175f, 17.105337f, 124.648254f, 17.105337f, 119.72f, 20.72f),
                    PathNode.LineTo(119.59f, 20.82f),
                    PathNode.LineTo(31.65f, 89.15f),
                    PathNode.CurveTo(26.861687f, 92.70862f, 24.854538f, 98.910706f, 26.65f, 104.6f),
                    PathNode.LineTo(58.65f, 212.16f),
                    PathNode.CurveTo(58.65f, 212.21f, 58.65f, 212.25f, 58.65f, 212.29f),
                    PathNode.CurveTo(60.51549f, 218.085f, 65.91213f, 222.01021f, 72.0f, 222.0f),
                    PathNode.LineTo(184.0f, 222.0f),
                    PathNode.CurveTo(190.08049f, 222.00151f, 195.46677f, 218.07799f, 197.33f, 212.29f),
                    PathNode.CurveTo(197.33f, 212.29f, 197.33f, 212.21f, 197.33f, 212.16f),
                    PathNode.LineTo(229.33f, 104.6f),
                    PathNode.CurveTo(231.12976f, 98.91498f, 229.13095f, 92.71386f, 224.35f, 89.15f),
                    PathNode.Close,
                    PathNode.MoveTo(217.9f, 101.0f),
                    PathNode.CurveTo(217.9f, 101.0f, 217.9f, 101.08f, 217.9f, 101.12f),
                    PathNode.LineTo(185.9f, 208.66f),
                    PathNode.CurveTo(185.618f, 209.46672f, 184.85457f, 210.00514f, 184.0f, 210.0f),
                    PathNode.LineTo(72.0f, 210.0f),
                    PathNode.CurveTo(71.14909f, 210.00087f, 70.3908f, 209.46324f, 70.11f, 208.66f),
                    PathNode.LineTo(38.11f, 101.12f),
                    PathNode.CurveTo(38.11f, 101.12f, 38.11f, 101.04f, 38.11f, 101.0f),
                    PathNode.CurveTo(37.843796f, 100.17918f, 38.13406f, 99.280174f, 38.83f, 98.77f),
                    PathNode.LineTo(38.96f, 98.67f),
                    PathNode.LineTo(126.87f, 30.37f),
                    PathNode.CurveTo(127.55559f, 29.894386f, 128.46442f, 29.894386f, 129.15f, 30.37f),
                    PathNode.LineTo(217.06f, 98.67f),
                    PathNode.LineTo(217.19f, 98.77f),
                    PathNode.CurveTo(217.88226f, 99.28283f, 218.16833f, 100.181335f, 217.9f, 101.0f),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
