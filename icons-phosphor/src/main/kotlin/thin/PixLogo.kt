package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorThinIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.5f, 119.55f),
                    PathNode.LineTo(136.45f, 23.55f),
                    PathNode.CurveTo(131.7719f, 18.910555f, 124.2281f, 18.910555f, 119.55f, 23.55f),
                    PathNode.LineTo(23.55f, 119.6f),
                    PathNode.CurveTo(18.910555f, 124.27811f, 18.910555f, 131.8219f, 23.55f, 136.5f),
                    PathNode.LineTo(119.6f, 232.55f),
                    PathNode.CurveTo(124.27811f, 237.18944f, 131.8219f, 237.18944f, 136.5f, 232.55f),
                    PathNode.LineTo(232.55f, 136.5f),
                    PathNode.CurveTo(237.18944f, 131.8219f, 237.18944f, 124.27811f, 232.55f, 119.6f),
                    PathNode.Close,
                    PathNode.MoveTo(125.21f, 29.16f),
                    PathNode.CurveTo(125.94922f, 28.418657f, 126.95309f, 28.001995f, 128.0f, 28.001995f),
                    PathNode.CurveTo(129.04692f, 28.001995f, 130.05078f, 28.418657f, 130.79f, 29.16f),
                    PathNode.LineTo(193.64f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(158.93881f, 91.99917f, 157.92079f, 92.42004f, 157.17f, 93.17f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(98.83f, 93.17f),
                    PathNode.CurveTo(98.07921f, 92.42004f, 97.06119f, 91.99917f, 96.0f, 92.0f),
                    PathNode.LineTo(62.36f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 128.0f),
                    PathNode.CurveTo(27.996061f, 126.95191f, 28.414146f, 125.94635f, 29.16f, 125.21f),
                    PathNode.LineTo(54.36f, 100.0f),
                    PathNode.LineTo(94.36f, 100.0f),
                    PathNode.LineTo(122.36f, 128.0f),
                    PathNode.LineTo(94.36f, 156.0f),
                    PathNode.LineTo(54.36f, 156.0f),
                    PathNode.LineTo(29.16f, 130.79f),
                    PathNode.CurveTo(28.414146f, 130.05365f, 27.996061f, 129.0481f, 28.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.79f, 226.84f),
                    PathNode.CurveTo(129.23709f, 228.35155f, 126.76291f, 228.35155f, 125.21f, 226.84f),
                    PathNode.LineTo(62.36f, 164.0f),
                    PathNode.LineTo(96.0f, 164.0f),
                    PathNode.CurveTo(97.06119f, 164.00084f, 98.07921f, 163.57996f, 98.83f, 162.83f),
                    PathNode.LineTo(128.0f, 133.66f),
                    PathNode.LineTo(157.17f, 162.83f),
                    PathNode.CurveTo(157.92079f, 163.57996f, 158.93881f, 164.00084f, 160.0f, 164.0f),
                    PathNode.LineTo(193.64f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.84f, 130.79f),
                    PathNode.LineTo(201.64f, 156.0f),
                    PathNode.LineTo(161.64f, 156.0f),
                    PathNode.LineTo(133.64f, 128.0f),
                    PathNode.LineTo(161.64f, 100.0f),
                    PathNode.LineTo(201.64f, 100.0f),
                    PathNode.LineTo(226.84f, 125.21f),
                    PathNode.CurveTo(227.58134f, 125.94922f, 227.998f, 126.95309f, 227.998f, 128.0f),
                    PathNode.CurveTo(227.998f, 129.04692f, 227.58134f, 130.05078f, 226.84f, 130.79f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
