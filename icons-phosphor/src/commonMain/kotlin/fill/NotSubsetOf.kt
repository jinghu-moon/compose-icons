package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorFillIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.LineTo(159.37f, 80.0f),
                    PathNode.LineTo(90.83f, 158.33f),
                    PathNode.CurveTo(79.124245f, 143.9715f, 76.72611f, 124.1585f, 84.66816f, 107.42186f),
                    PathNode.CurveTo(92.610214f, 90.68523f, 109.47459f, 80.01288f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.27f, 58.0f),
                    PathNode.CurveTo(187.6735f, 56.6021f, 185.587f, 55.895763f, 183.46965f, 56.036423f),
                    PathNode.CurveTo(181.3523f, 56.17708f, 179.37756f, 57.153206f, 177.98f, 58.75f),
                    PathNode.LineTo(173.37f, 64.0f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.CurveTo(102.8135f, 64.01975f, 79.98039f, 78.810005f, 69.664566f, 101.78703f),
                    PathNode.CurveTo(59.348747f, 124.76406f, 63.468513f, 151.65514f, 80.19f, 170.49f),
                    PathNode.LineTo(66.0f, 186.73f),
                    PathNode.CurveTo(63.400845f, 190.07132f, 63.85457f, 194.85905f, 67.03511f, 197.65262f),
                    PathNode.CurveTo(70.21565f, 200.4462f, 75.02193f, 200.2785f, 78.0f, 197.27f),
                    PathNode.LineTo(92.22f, 181.0f),
                    PathNode.CurveTo(102.7737f, 188.1718f, 115.2401f, 192.0044f, 128.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(180.41827f, 192.0f, 184.0f, 188.41827f, 184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 179.58173f, 180.41827f, 176.0f, 176.0f, 176.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(119.12256f, 176.0117f, 110.418526f, 173.54213f, 102.87f, 168.87f),
                    PathNode.LineTo(190.0f, 69.27f),
                    PathNode.CurveTo(192.90253f, 65.95357f, 192.57611f, 60.914276f, 189.27f, 58.0f),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
