package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorFillIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.35f, 168.74f),
                    PathNode.CurveTo(182.04144f, 169.8756f, 183.89993f, 172.3879f, 184.19824f, 175.29382f),
                    PathNode.CurveTo(184.49655f, 178.19975f, 183.18724f, 181.03725f, 180.78265f, 182.69597f),
                    PathNode.CurveTo(178.37807f, 184.3547f, 175.26054f, 184.5709f, 172.65f, 183.26f),
                    PathNode.LineTo(68.65f, 135.26f),
                    PathNode.CurveTo(65.821106f, 133.95059f, 64.010414f, 131.11723f, 64.010414f, 128.0f),
                    PathNode.CurveTo(64.010414f, 124.88276f, 65.821106f, 122.0494f, 68.65f, 120.74f),
                    PathNode.LineTo(172.65f, 72.74f),
                    PathNode.CurveTo(176.62595f, 71.06244f, 181.21587f, 72.840614f, 183.02391f, 76.75894f),
                    PathNode.CurveTo(184.83195f, 80.67727f, 183.20644f, 85.32345f, 179.35f, 87.26f),
                    PathNode.LineTo(91.09f, 128.0f),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
