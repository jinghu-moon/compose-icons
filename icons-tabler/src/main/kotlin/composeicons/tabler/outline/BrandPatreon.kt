package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) return _brandPatreon!!
        _brandPatreon = tablerOutlineIcon(
            name = "BrandPatreon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 8.408C19.997 6.109 18.254 4.226 16.21 3.546 13.67 2.702 10.322 2.824 7.898 3.999 4.959 5.424 4.036 8.544 4.002 11.655c-.028 2.559 .22 9.297 3.92 9.345 2.75 .036 3.159-3.603 4.43-5.356 .906-1.247 2.071-1.599 3.506-1.963C18.323 13.054 20.004 11.055 20 8.408"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
