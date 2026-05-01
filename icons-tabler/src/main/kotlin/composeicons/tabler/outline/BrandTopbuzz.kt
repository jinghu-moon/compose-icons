package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTopbuzz: ImageVector
    get() {
        if (_brandTopbuzz != null) return _brandTopbuzz!!
        _brandTopbuzz = tablerOutlineIcon(
            name = "BrandTopbuzz",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.417f, 8.655f),
                    PathNode.CurveTo(4.280699f, 8.626428f, 4.161378f, 8.544773f, 4.085388f, 8.428068f),
                    PathNode.CurveTo(4.009399f, 8.311363f, 3.982992f, 8.16921f, 4.012f, 8.033f),
                    PathNode.LineTo(4.998f, 3.416f),
                    PathNode.CurveTo(5.026748f, 3.279029f, 5.109095f, 3.159249f, 5.226689f, 3.083358f),
                    PathNode.CurveTo(5.344282f, 3.007468f, 5.487348f, 2.981773f, 5.624f, 3.012f),
                    PathNode.LineTo(20.582f, 6.174f),
                    PathNode.CurveTo(20.867f, 6.234f, 21.049f, 6.513f, 20.988f, 6.796f),
                    PathNode.LineTo(20.001f, 11.414f),
                    PathNode.CurveTo(19.972239f, 11.550757f, 19.890041f, 11.67036f, 19.772676f, 11.746224f),
                    PathNode.CurveTo(19.655313f, 11.822088f, 19.512506f, 11.847928f, 19.376f, 11.818f),
                    PathNode.LineTo(15.031f, 10.898f),
                    PathNode.CurveTo(14.833f, 10.858f, 14.716f, 10.922f, 14.678f, 11.095f),
                    PathNode.LineTo(12.65f, 20.585f),
                    PathNode.CurveTo(12.588596f, 20.86889f, 12.309068f, 21.049578f, 12.025f, 20.989f),
                    PathNode.LineTo(7.383f, 20.007f),
                    PathNode.CurveTo(7.099722f, 19.946482f, 6.918391f, 19.668678f, 6.977f, 19.385f),
                    PathNode.LineTo(9.005f, 9.892f),
                    PathNode.CurveTo(9.042f, 9.722f, 8.974f, 9.618f, 8.801f, 9.582f),
                    PathNode.LineTo(4.417f, 8.655f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandTopbuzz!!
    }

private var _brandTopbuzz: ImageVector? = null
