package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorFillIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.33f, 104.0f),
                    PathNode.LineTo(181.86f, 157.65f),
                    PathNode.CurveTo(186.42f, 170.32f, 188.31f, 191.54f, 168.67f, 217.65f),
                    PathNode.CurveTo(165.89041f, 221.36522f, 161.62915f, 223.6839f, 157.0f, 224.0f),
                    PathNode.CurveTo(156.62f, 224.0f, 156.25f, 224.0f, 155.87f, 224.0f),
                    PathNode.CurveTo(151.62383f, 224.00069f, 147.55151f, 222.31348f, 144.55f, 219.31f),
                    PathNode.LineTo(96.29f, 171.0f),
                    PathNode.LineTo(53.66f, 213.66f),
                    PathNode.CurveTo(50.53407f, 216.78593f, 45.46593f, 216.78593f, 42.34f, 213.66f),
                    PathNode.CurveTo(39.21407f, 210.53407f, 39.21407f, 205.46593f, 42.34f, 202.34f),
                    PathNode.LineTo(85.0f, 159.71f),
                    PathNode.LineTo(36.7f, 111.41f),
                    PathNode.CurveTo(33.489174f, 108.19517f, 31.796595f, 103.76682f, 32.044613f, 99.229965f),
                    PathNode.CurveTo(32.292633f, 94.693115f, 34.45786f, 90.47566f, 38.0f, 87.63f),
                    PathNode.CurveTo(63.42f, 67.12f, 87.75f, 71.15f, 98.4f, 74.49f),
                    PathNode.LineTo(152.0f, 20.7f),
                    PathNode.CurveTo(155.00069f, 17.698627f, 159.0709f, 16.012417f, 163.315f, 16.012417f),
                    PathNode.CurveTo(167.5591f, 16.012417f, 171.62932f, 17.698627f, 174.63f, 20.7f),
                    PathNode.LineTo(235.32f, 81.38f),
                    PathNode.CurveTo(241.56621f, 87.62478f, 241.57068f, 97.7497f, 235.33f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
