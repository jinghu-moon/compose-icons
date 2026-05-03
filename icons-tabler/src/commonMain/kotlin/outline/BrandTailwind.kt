package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTailwind: ImageVector
    get() {
        if (_brandTailwind != null) return _brandTailwind!!
        _brandTailwind = tablerOutlineIcon(
            name = "BrandTailwind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.667f, 6.0f),
                    PathNode.CurveTo(9.177f, 6.0f, 7.623f, 7.222f, 7.0f, 9.667f),
                    PathNode.CurveTo(7.933f, 8.444f, 9.023f, 7.987f, 10.267f, 8.292f),
                    PathNode.CurveTo(10.977f, 8.466f, 11.484f, 8.972f, 12.045f, 9.532f),
                    PathNode.CurveTo(12.961f, 10.444f, 14.045f, 11.5f, 16.333f, 11.5f),
                    PathNode.CurveTo(18.823f, 11.5f, 20.377f, 10.278f, 21.0f, 7.833f),
                    PathNode.CurveTo(20.067f, 9.056f, 18.977f, 9.513f, 17.733f, 9.208f),
                    PathNode.CurveTo(17.023f, 9.034f, 16.516f, 8.528f, 15.955f, 7.968f),
                    PathNode.CurveTo(15.039f, 7.056f, 13.98f, 6.0f, 11.667f, 6.0f),
                    PathNode.MoveTo(7.667f, 12.5f),
                    PathNode.CurveTo(5.177f, 12.5f, 3.623f, 13.722f, 3.0f, 16.167f),
                    PathNode.CurveTo(3.933f, 14.944f, 5.023f, 14.487f, 6.267f, 14.792f),
                    PathNode.CurveTo(6.977f, 14.966f, 7.484f, 15.472f, 8.045f, 16.032f),
                    PathNode.CurveTo(8.961f, 16.944f, 10.02f, 18.0f, 12.333f, 18.0f),
                    PathNode.CurveTo(14.823f, 18.0f, 16.377f, 16.778f, 17.0f, 14.333f),
                    PathNode.CurveTo(16.067f, 15.556f, 14.977f, 16.013f, 13.733f, 15.708f),
                    PathNode.CurveTo(13.023f, 15.534f, 12.516f, 15.028f, 11.955f, 14.468f),
                    PathNode.CurveTo(11.039f, 13.556f, 9.98f, 12.5f, 7.667f, 12.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandTailwind!!
    }

private var _brandTailwind: ImageVector? = null
