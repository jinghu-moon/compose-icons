package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) return _bounceLeft!!
        _bounceLeft = tablerFilledIcon(
            name = "BounceLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.486 11.143 C 8.959 10.860 9.573 11.013 9.857 11.486 C 10.902 13.226 11.687 14.929 12.249 16.723 L 12.421 17.304 L 12.513 17.174 C 14.606 14.253 16.993 13.521 20.078 14.474 L 20.316 14.551 C 20.840 14.726 21.124 15.292 20.949 15.816 C 20.774 16.340 20.208 16.624 19.684 16.449 C 16.752 15.471 14.954 16.327 12.894 20.447 C 12.461 21.313 11.173 21.120 11.014 20.164 C 10.554 17.404 9.645 15.019 8.143 12.514 C 7.860 12.041 8.013 11.427 8.486 11.143 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 6.000 4.000 C 4.343 4.000 3.000 5.343 3.000 7.000 C 3.000 8.657 4.343 10.000 6.000 10.000 C 7.657 10.000 9.000 8.657 9.000 7.000 C 9.000 5.343 7.657 4.000 6.000 4.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
