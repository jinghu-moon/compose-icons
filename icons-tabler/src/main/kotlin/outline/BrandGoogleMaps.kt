package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleMaps: ImageVector
    get() {
        if (_brandGoogleMaps != null) return _brandGoogleMaps!!
        _brandGoogleMaps = tablerOutlineIcon(
            name = "BrandGoogleMaps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.500 9.500 C 9.500 10.881 10.619 12.000 12.000 12.000 C 13.381 12.000 14.500 10.881 14.500 9.500 C 14.500 8.119 13.381 7.000 12.000 7.000 C 10.619 7.000 9.500 8.119 9.500 9.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.428 12.494 L 13.742 3.242"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.002 7.935 L 7.065 5.390"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.693 6.593 L 9.357 16.572"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.591 6.376 C 18.063 7.283 18.306 8.290 18.300 9.311 C 18.304 10.412 18.058 11.499 17.580 12.491 C 16.981 13.556 16.282 14.560 15.491 15.491 C 14.707 16.424 14.001 17.421 13.381 18.471 C 13.067 19.091 12.813 19.741 12.624 20.409 C 12.503 20.769 12.347 21.000 12.002 21.000 C 11.687 21.000 11.539 20.864 11.376 20.407 C 11.183 19.723 10.922 19.061 10.597 18.429 C 10.172 17.700 9.696 17.001 9.174 16.338 C 8.297 15.154 6.995 13.803 6.321 12.267 C 5.902 11.334 5.690 10.322 5.700 9.300 C 5.693 7.816 6.216 6.377 7.176 5.245 C 8.366 3.819 10.129 2.996 11.987 3.000 C 12.637 2.998 13.284 3.093 13.905 3.284 C 15.497 3.782 16.824 4.895 17.591 6.376"),
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
        return _brandGoogleMaps!!
    }

private var _brandGoogleMaps: ImageVector? = null
