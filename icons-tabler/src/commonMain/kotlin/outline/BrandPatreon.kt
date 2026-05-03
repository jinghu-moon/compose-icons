package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) return _brandPatreon!!
        _brandPatreon = tablerOutlineIcon(
            name = "BrandPatreon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.408f),
                    PathNode.CurveTo(19.997f, 6.109f, 18.254f, 4.226f, 16.21f, 3.546f),
                    PathNode.CurveTo(13.67f, 2.702f, 10.322f, 2.824f, 7.898f, 3.999f),
                    PathNode.CurveTo(4.959f, 5.424f, 4.036f, 8.544f, 4.002f, 11.655f),
                    PathNode.CurveTo(3.974f, 14.214f, 4.222f, 20.952f, 7.922f, 21.0f),
                    PathNode.CurveTo(10.672f, 21.036f, 11.081f, 17.397f, 12.352f, 15.644f),
                    PathNode.CurveTo(13.258f, 14.397f, 14.423f, 14.045f, 15.858f, 13.681f),
                    PathNode.CurveTo(18.323f, 13.054f, 20.004f, 11.055f, 20.0f, 8.408f)
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
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
