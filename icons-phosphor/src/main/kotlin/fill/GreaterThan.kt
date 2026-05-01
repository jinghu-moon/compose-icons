package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorFillIcon(
            name = "GreaterThan",
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
                    PathNode.MoveTo(187.35f, 135.26f),
                    PathNode.LineTo(83.35f, 183.26f),
                    PathNode.CurveTo(79.37406f, 184.93756f, 74.78414f, 183.1594f, 72.9761f, 179.24106f),
                    PathNode.CurveTo(71.16805f, 175.32272f, 72.79356f, 170.67654f, 76.65f, 168.74f),
                    PathNode.LineTo(164.91f, 128.0f),
                    PathNode.LineTo(76.65f, 87.26f),
                    PathNode.CurveTo(73.958565f, 86.124405f, 72.10007f, 83.6121f, 71.80176f, 80.70617f),
                    PathNode.CurveTo(71.503456f, 77.80025f, 72.81277f, 74.96275f, 75.217354f, 73.30402f),
                    PathNode.CurveTo(77.62194f, 71.6453f, 80.739456f, 71.42909f, 83.35f, 72.74f),
                    PathNode.LineTo(187.35f, 120.74f),
                    PathNode.CurveTo(190.1789f, 122.0494f, 191.98958f, 124.88276f, 191.98958f, 128.0f),
                    PathNode.CurveTo(191.98958f, 131.11723f, 190.1789f, 133.95059f, 187.35f, 135.26f),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
