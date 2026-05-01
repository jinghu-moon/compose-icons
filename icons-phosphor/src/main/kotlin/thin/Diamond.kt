package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorThinIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.5f, 119.55f),
                    PathNode.LineTo(136.45f, 23.49f),
                    PathNode.CurveTo(131.7719f, 18.850555f, 124.2281f, 18.850555f, 119.55f, 23.49f),
                    PathNode.LineTo(23.55f, 119.55f),
                    PathNode.CurveTo(18.910555f, 124.2281f, 18.910555f, 131.7719f, 23.55f, 136.45f),
                    PathNode.LineTo(119.6f, 232.51f),
                    PathNode.CurveTo(124.27811f, 237.14944f, 131.8219f, 237.14944f, 136.5f, 232.51f),
                    PathNode.LineTo(232.55f, 136.45f),
                    PathNode.CurveTo(237.18944f, 131.7719f, 237.18944f, 124.2281f, 232.55f, 119.55f),
                    PathNode.Close,
                    PathNode.MoveTo(226.84f, 130.79f),
                    PathNode.LineTo(130.79f, 226.85f),
                    PathNode.CurveTo(129.23709f, 228.36154f, 126.76291f, 228.36154f, 125.21f, 226.85f),
                    PathNode.LineTo(29.21f, 130.79f),
                    PathNode.CurveTo(28.468657f, 130.05078f, 28.051996f, 129.04692f, 28.051996f, 128.0f),
                    PathNode.CurveTo(28.051996f, 126.95309f, 28.468657f, 125.94922f, 29.21f, 125.21f),
                    PathNode.LineTo(125.26f, 29.15f),
                    PathNode.CurveTo(126.812904f, 27.638453f, 129.2871f, 27.638453f, 130.84f, 29.15f),
                    PathNode.LineTo(226.89f, 125.21f),
                    PathNode.CurveTo(227.63135f, 125.94922f, 228.048f, 126.95309f, 228.048f, 128.0f),
                    PathNode.CurveTo(228.048f, 129.04692f, 227.63135f, 130.05078f, 226.89f, 130.79f),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
