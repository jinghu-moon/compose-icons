package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorDuotoneIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.76f, 135.48f),
                    PathNode.LineTo(159.82f, 159.82f),
                    PathNode.LineTo(135.48f, 226.76f),
                    PathNode.CurveTo(134.31615f, 229.89552f, 131.32457f, 231.9761f, 127.98f, 231.9761f),
                    PathNode.CurveTo(124.63544f, 231.9761f, 121.64385f, 229.89552f, 120.48f, 226.76f),
                    PathNode.LineTo(96.18f, 159.82f),
                    PathNode.LineTo(29.24f, 135.48f),
                    PathNode.CurveTo(26.104471f, 134.31615f, 24.023882f, 131.32457f, 24.023882f, 127.98f),
                    PathNode.CurveTo(24.023882f, 124.63544f, 26.104471f, 121.64385f, 29.24f, 120.48f),
                    PathNode.LineTo(96.18f, 96.18f),
                    PathNode.LineTo(120.52f, 29.24f),
                    PathNode.CurveTo(121.68386f, 26.104471f, 124.67544f, 24.023882f, 128.02f, 24.023882f),
                    PathNode.CurveTo(131.36456f, 24.023882f, 134.35614f, 26.104471f, 135.52f, 29.24f),
                    PathNode.LineTo(159.86f, 96.18f),
                    PathNode.LineTo(226.8f, 120.52f),
                    PathNode.CurveTo(229.90457f, 121.70704f, 231.95174f, 124.690056f, 231.94287f, 128.01381f),
                    PathNode.CurveTo(231.93399f, 131.33755f, 229.87086f, 134.30959f, 226.76f, 135.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.5f, 113.0f),
                    PathNode.LineTo(166.06f, 89.94f),
                    PathNode.LineTo(143.0f, 26.5f),
                    PathNode.CurveTo(140.67229f, 20.228943f, 134.68913f, 16.067764f, 128.0f, 16.067764f),
                    PathNode.CurveTo(121.310875f, 16.067764f, 115.32772f, 20.228943f, 113.0f, 26.5f),
                    PathNode.LineTo(89.94f, 89.94f),
                    PathNode.LineTo(26.5f, 113.0f),
                    PathNode.CurveTo(20.228943f, 115.32772f, 16.067764f, 121.310875f, 16.067764f, 128.0f),
                    PathNode.CurveTo(16.067764f, 134.68913f, 20.228943f, 140.67229f, 26.5f, 143.0f),
                    PathNode.LineTo(89.94f, 166.07f),
                    PathNode.LineTo(113.0f, 229.5f),
                    PathNode.CurveTo(115.32772f, 235.77106f, 121.310875f, 239.93224f, 128.0f, 239.93224f),
                    PathNode.CurveTo(134.68913f, 239.93224f, 140.67229f, 235.77106f, 143.0f, 229.5f),
                    PathNode.LineTo(166.07f, 166.06f),
                    PathNode.LineTo(229.5f, 143.0f),
                    PathNode.CurveTo(235.77106f, 140.67229f, 239.93224f, 134.68913f, 239.93224f, 128.0f),
                    PathNode.CurveTo(239.93224f, 121.310875f, 235.77106f, 115.32772f, 229.5f, 113.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.08f, 152.3f),
                    PathNode.CurveTo(154.85869f, 153.10883f, 153.10883f, 154.85869f, 152.3f, 157.08f),
                    PathNode.LineTo(128.0f, 223.9f),
                    PathNode.LineTo(103.7f, 157.08f),
                    PathNode.CurveTo(102.89117f, 154.85869f, 101.14131f, 153.10883f, 98.92f, 152.3f),
                    PathNode.LineTo(32.1f, 128.0f),
                    PathNode.LineTo(98.92f, 103.7f),
                    PathNode.CurveTo(101.14131f, 102.89117f, 102.89117f, 101.14131f, 103.7f, 98.92f),
                    PathNode.LineTo(128.0f, 32.1f),
                    PathNode.LineTo(152.3f, 98.92f),
                    PathNode.CurveTo(153.10883f, 101.14131f, 154.85869f, 102.89117f, 157.08f, 103.7f),
                    PathNode.LineTo(223.9f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _starFour!!
    }

private var _starFour: ImageVector? = null
