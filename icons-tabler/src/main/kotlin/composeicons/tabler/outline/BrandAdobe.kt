package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobe: ImageVector
    get() {
        if (_brandAdobe != null) return _brandAdobe!!
        _brandAdobe = tablerOutlineIcon(
            name = "BrandAdobe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.893f, 4.514f),
                    PathNode.LineTo(20.87f, 18.514f),
                    PathNode.CurveTo(21.001974f, 18.746572f, 21.03457f, 19.022543f, 20.960411f, 19.27946f),
                    PathNode.CurveTo(20.886253f, 19.536379f, 20.71161f, 19.75253f, 20.476f, 19.879f),
                    PathNode.CurveTo(20.322645f, 19.962654f, 20.150688f, 20.00633f, 19.976f, 20.006f),
                    PathNode.LineTo(16.5f, 20.006f),
                    PathNode.LineTo(12.0f, 12.006f),
                    PathNode.LineTo(9.5f, 16.006f),
                    PathNode.LineTo(11.0f, 16.006f),
                    PathNode.LineTo(13.0f, 20.006f),
                    PathNode.LineTo(4.023f, 20.006f),
                    PathNode.CurveTo(3.458f, 20.006f, 3.0f, 19.556f, 3.0f, 19.006f),
                    PathNode.CurveTo(3.0f, 18.835f, 3.045f, 18.666f, 3.13f, 18.516f),
                    PathNode.LineTo(11.107f, 4.523f),
                    PathNode.CurveTo(11.29234f, 4.20548f, 11.632344f, 4.010255f, 12.0f, 4.010255f),
                    PathNode.CurveTo(12.367656f, 4.010255f, 12.70766f, 4.20548f, 12.893f, 4.523f),
                    PathNode.LineTo(12.893f, 4.514f)
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
        return _brandAdobe!!
    }

private var _brandAdobe: ImageVector? = null
