package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorRegularIcon(
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
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(88.25378f, 215.95592f, 56.04409f, 183.74623f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 122.0f, 64.09f, 99.21f, 80.06f, 76.16f),
                    PathNode.LineTo(106.43f, 101.74f),
                    PathNode.CurveTo(108.375854f, 103.62974f, 111.146706f, 104.40477f, 113.79062f, 103.798836f),
                    PathNode.CurveTo(116.43454f, 103.19289f, 118.59132f, 101.28853f, 119.52f, 98.74f),
                    PathNode.LineTo(141.79f, 37.67f),
                    PathNode.CurveTo(164.21f, 58.08f, 200.0f, 97.91f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.95592f, 183.74623f, 167.74623f, 215.95592f, 128.0f, 216.0f),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
