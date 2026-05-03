package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOauth: ImageVector
    get() {
        if (_brandOauth != null) return _brandOauth!!
        _brandOauth = tablerOutlineIcon(
            name = "BrandOauth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.556 6.000 C 13.206 6.000 13.791 6.373 14.064 6.947 L 16.903 14.795 C 17.051 15.208 17.027 15.664 16.837 16.059 C 16.648 16.455 16.308 16.759 15.893 16.903 C 15.087 17.189 14.196 16.822 13.825 16.052 L 13.365 15.000 L 10.635 15.000 L 10.237 15.905 C 9.943 16.708 9.089 17.159 8.260 16.950 L 8.107 16.903 C 7.302 16.623 6.844 15.774 7.051 14.947 L 9.875 7.095 C 10.095 6.491 10.644 6.068 11.284 6.008 L 12.556 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandOauth!!
    }

private var _brandOauth: ImageVector? = null
