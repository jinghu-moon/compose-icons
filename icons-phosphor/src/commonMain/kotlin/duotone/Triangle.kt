package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorDuotoneIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.46f, 216.0f),
                    PathNode.LineTo(40.54f, 216.0f),
                    PathNode.CurveTo(27.92f, 216.0f, 20.0f, 202.79f, 26.13f, 192.09f),
                    PathNode.LineTo(113.59f, 40.22f),
                    PathNode.CurveTo(119.89f, 29.22f, 136.11f, 29.22f, 142.41f, 40.22f),
                    PathNode.LineTo(229.87f, 192.09f),
                    PathNode.CurveTo(236.0f, 202.79f, 228.08f, 216.0f, 215.46f, 216.0f),
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
                    PathNode.MoveTo(236.8f, 188.09f),
                    PathNode.LineTo(149.35f, 36.22f),
                    PathNode.CurveTo(144.90347f, 28.649155f, 136.78006f, 23.999342f, 128.0f, 23.999342f),
                    PathNode.CurveTo(119.21994f, 23.999342f, 111.09653f, 28.649155f, 106.65f, 36.22f),
                    PathNode.LineTo(19.2f, 188.09f),
                    PathNode.CurveTo(14.919031f, 195.41719f, 14.919031f, 204.4828f, 19.2f, 211.81f),
                    PathNode.CurveTo(23.590843f, 219.433f, 31.75336f, 224.09348f, 40.55f, 224.0f),
                    PathNode.LineTo(215.45f, 224.0f),
                    PathNode.CurveTo(224.23952f, 224.08621f, 232.39267f, 219.42673f, 236.78f, 211.81f),
                    PathNode.CurveTo(241.06715f, 204.48642f, 241.0748f, 195.4208f, 236.8f, 188.09f),
                    PathNode.Close,
                    PathNode.MoveTo(222.93f, 203.8f),
                    PathNode.CurveTo(221.3778f, 206.44777f, 218.51875f, 208.05313f, 215.45f, 208.0f),
                    PathNode.LineTo(40.55f, 208.0f),
                    PathNode.CurveTo(37.48125f, 208.05313f, 34.6222f, 206.44777f, 33.07f, 203.8f),
                    PathNode.CurveTo(31.663565f, 201.41884f, 31.663565f, 198.46117f, 33.07f, 196.08f),
                    PathNode.LineTo(120.52f, 44.21f),
                    PathNode.CurveTo(122.10202f, 41.577347f, 124.94857f, 39.96694f, 128.02f, 39.96694f),
                    PathNode.CurveTo(131.09143f, 39.96694f, 133.93797f, 41.577347f, 135.52f, 44.21f),
                    PathNode.LineTo(222.97f, 196.08f),
                    PathNode.CurveTo(224.36412f, 198.46844f, 224.3488f, 201.42613f, 222.93f, 203.8f),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
