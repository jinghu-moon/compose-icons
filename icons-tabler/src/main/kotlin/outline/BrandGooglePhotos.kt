package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGooglePhotos: ImageVector
    get() {
        if (_brandGooglePhotos != null) return _brandGooglePhotos!!
        _brandGooglePhotos = tablerOutlineIcon(
            name = "BrandGooglePhotos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 7.000 C 9.985 7.000 12.000 8.974 12.000 11.409 L 12.000 12.000 L 3.603 12.000 C 3.444 12.000 3.291 11.938 3.177 11.827 C 3.064 11.717 3.000 11.566 3.000 11.409 C 3.000 8.974 5.015 7.000 7.500 7.000"),
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
        pathData = parseSvgPathData("M 16.500 17.000 C 14.015 17.000 12.000 15.026 12.000 12.591 L 12.000 12.000 L 20.397 12.000 C 20.730 12.000 21.000 12.265 21.000 12.591 C 21.000 15.026 18.985 17.000 16.500 17.000"),
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
        pathData = parseSvgPathData("M 7.000 16.500 C 7.000 14.015 8.972 12.000 11.405 12.000 L 12.000 12.000 L 12.000 20.392 C 12.001 20.553 11.939 20.708 11.827 20.823 C 11.716 20.937 11.564 21.001 11.405 21.000 C 8.972 21.000 7.000 18.985 7.000 16.500"),
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
        pathData = parseSvgPathData("M 17.000 7.500 C 17.000 9.985 15.028 12.000 12.595 12.000 L 12.000 12.000 L 12.000 3.603 C 12.000 3.443 12.063 3.289 12.175 3.175 C 12.286 3.062 12.437 2.999 12.595 3.000 C 15.028 3.000 17.000 5.015 17.000 7.500"),
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
        return _brandGooglePhotos!!
    }

private var _brandGooglePhotos: ImageVector? = null
