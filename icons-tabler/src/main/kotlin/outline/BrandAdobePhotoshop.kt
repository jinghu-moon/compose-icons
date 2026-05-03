package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobePhotoshop: ImageVector
    get() {
        if (_brandAdobePhotoshop != null) return _brandAdobePhotoshop!!
        _brandAdobePhotoshop = tablerOutlineIcon(
            name = "BrandAdobePhotoshop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 7.757 3.000 5.636 4.318 4.318 C 5.636 3.000 7.758 3.000 12.000 3.000 C 16.242 3.000 18.364 3.000 19.682 4.318 C 21.000 5.636 21.000 7.758 21.000 12.000 C 21.000 16.242 21.000 18.364 19.682 19.682 C 18.364 21.000 16.242 21.000 12.000 21.000 C 7.758 21.000 5.636 21.000 4.318 19.682 C 3.000 18.364 3.000 16.242 3.000 12.000"),
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
        pathData = parseSvgPathData("M 6.790 15.790 L 6.790 12.000M 6.790 12.000 L 6.790 9.276 C 6.790 9.166 6.790 9.111 6.794 9.065 C 6.838 8.615 7.194 8.259 7.644 8.215 C 7.690 8.211 7.745 8.211 7.855 8.211 L 9.158 8.211 C 9.845 8.195 10.487 8.553 10.835 9.145 C 11.184 9.738 11.184 10.473 10.835 11.066 C 10.487 11.658 9.845 12.016 9.158 12.000 L 6.790 12.000"),
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
        pathData = parseSvgPathData("M 17.178 11.263 C 17.014 10.604 16.243 10.105 15.316 10.105 C 14.269 10.105 13.421 10.742 13.421 11.526 C 13.421 12.311 14.269 12.947 15.316 12.947 C 16.362 12.947 17.211 13.584 17.211 14.368 C 17.211 15.153 16.362 15.789 15.316 15.789 C 14.386 15.789 13.612 15.287 13.452 14.624"),
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
        return _brandAdobePhotoshop!!
    }

private var _brandAdobePhotoshop: ImageVector? = null
