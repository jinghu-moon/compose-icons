package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LibraryPhoto: ImageVector
    get() {
        if (_libraryPhoto != null) return _libraryPhoto!!
        _libraryPhoto = tablerOutlineIcon(
            name = "LibraryPhoto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 5.667 C 7.000 4.194 8.194 3.000 9.667 3.000 L 18.333 3.000 C 19.806 3.000 21.000 4.194 21.000 5.667 L 21.000 14.333 C 21.000 15.806 19.806 17.000 18.333 17.000 L 9.667 17.000 C 8.194 17.000 7.000 15.806 7.000 14.333 L 7.000 5.667"),
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
        pathData = parseSvgPathData("M 4.012 7.260 C 3.388 7.616 3.002 8.278 3.000 8.997 L 3.000 18.997 C 3.000 20.097 3.900 20.997 5.000 20.997 L 15.000 20.997 C 15.750 20.997 16.158 20.612 16.500 19.997"),
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
        pathData = parseSvgPathData("M 17.000 7.000 L 17.010 7.000"),
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
        pathData = parseSvgPathData("M 7.000 13.000 L 10.644 9.356 C 10.871 9.129 11.179 9.001 11.500 9.001 C 11.821 9.001 12.129 9.129 12.356 9.356 L 16.000 13.000"),
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
        pathData = parseSvgPathData("M 15.000 12.000 L 16.644 10.356 C 16.871 10.129 17.179 10.001 17.500 10.001 C 17.821 10.001 18.129 10.129 18.356 10.356 L 21.000 13.000"),
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
        return _libraryPhoto!!
    }

private var _libraryPhoto: ImageVector? = null
