package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorFillIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(143.38f, 17.85f),
                    PathNode.CurveTo(141.37866f, 16.18609f, 138.693f, 15.59976f, 136.18028f, 16.278172f),
                    PathNode.CurveTo(133.66757f, 16.956585f, 131.64195f, 18.814926f, 130.75f, 21.26f),
                    PathNode.LineTo(108.75f, 81.67f),
                    PathNode.LineTo(84.59f, 58.26f),
                    PathNode.CurveTo(82.94883f, 56.668217f, 80.705025f, 55.85468f, 78.42505f, 56.02477f),
                    PathNode.CurveTo(76.14507f, 56.19486f, 74.04682f, 57.33232f, 72.66f, 59.15f),
                    PathNode.CurveTo(51.0f, 87.53f, 40.0f, 116.08f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 84.55f, 165.21f, 36.0f, 143.38f, 17.85f),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
