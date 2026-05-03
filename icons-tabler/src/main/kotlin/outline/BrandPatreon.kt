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
                pathData = parseSvgPathData("M 20.000 8.408 C 19.997 6.109 18.254 4.226 16.210 3.546 C 13.670 2.702 10.322 2.824 7.898 3.999 C 4.959 5.424 4.036 8.544 4.002 11.655 C 3.974 14.214 4.222 20.952 7.922 21.000 C 10.672 21.036 11.081 17.397 12.352 15.644 C 13.258 14.397 14.423 14.045 15.858 13.681 C 18.323 13.054 20.004 11.055 20.000 8.408"),
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
