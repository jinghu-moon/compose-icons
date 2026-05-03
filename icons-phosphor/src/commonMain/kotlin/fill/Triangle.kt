package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorFillIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.78f, 211.81f),
                    PathNode.CurveTo(232.39267f, 219.42673f, 224.23952f, 224.08621f, 215.45f, 224.0f),
                    PathNode.LineTo(40.55f, 224.0f),
                    PathNode.CurveTo(31.760487f, 224.08621f, 23.607323f, 219.42673f, 19.22f, 211.81f),
                    PathNode.CurveTo(14.939032f, 204.4828f, 14.939032f, 195.41719f, 19.22f, 188.09f),
                    PathNode.LineTo(106.65f, 36.22f),
                    PathNode.CurveTo(111.09653f, 28.649155f, 119.21994f, 23.999342f, 128.0f, 23.999342f),
                    PathNode.CurveTo(136.78006f, 23.999342f, 144.90347f, 28.649155f, 149.35f, 36.22f),
                    PathNode.LineTo(236.8f, 188.09f),
                    PathNode.CurveTo(241.0748f, 195.4208f, 241.06715f, 204.48642f, 236.78f, 211.81f),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
