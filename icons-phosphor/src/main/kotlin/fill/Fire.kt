package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorFillIcon(
            name = "Fire",
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
                    PathNode.Close,
                    PathNode.MoveTo(183.89f, 153.34f),
                    PathNode.CurveTo(179.64134f, 177.07161f, 161.06252f, 195.64644f, 137.33f, 199.89f),
                    PathNode.CurveTo(136.89072f, 199.96535f, 136.4457f, 200.00215f, 136.0f, 200.0f),
                    PathNode.CurveTo(131.8393f, 199.99892f, 128.374f, 196.80872f, 128.02954f, 192.6623f),
                    PathNode.CurveTo(127.68509f, 188.51585f, 130.57649f, 184.7976f, 134.68f, 184.11f),
                    PathNode.CurveTo(151.25f, 181.32f, 165.31f, 167.26f, 168.12f, 150.66f),
                    PathNode.CurveTo(168.86006f, 146.30247f, 172.99248f, 143.36993f, 177.35f, 144.11f),
                    PathNode.CurveTo(181.70752f, 144.85007f, 184.64006f, 148.98247f, 183.9f, 153.34f),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
