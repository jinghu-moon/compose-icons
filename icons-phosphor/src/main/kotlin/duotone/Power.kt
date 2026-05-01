package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorDuotoneIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 176.60106f, 176.60106f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 43.581722f, 123.58172f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.41827f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.37f, 49.3f),
                    PathNode.CurveTo(176.67288f, 46.963306f, 171.78453f, 48.02878f, 169.39519f, 51.69208f),
                    PathNode.CurveTo(167.00583f, 55.35538f, 168.00125f, 60.258488f, 171.63f, 62.7f),
                    PathNode.CurveTo(194.74f, 77.77f, 208.0f, 101.57f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 172.18279f, 172.18279f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(83.81722f, 208.0f, 48.0f, 172.18279f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 101.57f, 61.26f, 77.77f, 84.37f, 62.7f),
                    PathNode.CurveTo(87.99874f, 60.258488f, 88.99417f, 55.35538f, 86.60482f, 51.69208f),
                    PathNode.CurveTo(84.21547f, 48.02878f, 79.32711f, 46.963306f, 75.63f, 49.3f),
                    PathNode.CurveTo(47.9f, 67.38f, 32.0f, 96.06f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 181.01933f, 74.98067f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(181.01933f, 224.0f, 224.0f, 181.01933f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 96.06f, 208.1f, 67.38f, 180.37f, 49.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _power!!
    }

private var _power: ImageVector? = null
