package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneCalling: ImageVector
    get() {
        if (_phoneCalling != null) return _phoneCalling!!
        _phoneCalling = tablerFilledIcon(
            name = "PhoneCalling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.928 3.629 L 11.928 8.629 C 12.110 9.084 11.934 9.605 11.514 9.857 L 9.844 10.860 C 10.665 12.206 11.795 13.336 13.140 14.157 L 14.143 12.486 C 14.395 12.066 14.916 11.890 15.371 12.072 L 20.371 14.072 C 20.751 14.224 21.000 14.591 21.000 15.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 17.940 21.998 C 9.361 21.477 2.522 14.638 2.000 6.000 C 2.000 4.343 3.343 3.000 5.000 3.000 L 9.000 3.000 C 9.409 3.000 9.776 3.249 9.928 3.629"),
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
        pathData = parseSvgPathData("M 16.000 7.000 L 16.000 7.010 C 16.000 7.562 15.552 8.010 15.000 8.010 C 14.448 8.010 14.000 7.562 14.000 7.010 L 14.000 7.000 C 14.000 6.448 14.448 6.000 15.000 6.000 C 15.552 6.000 16.000 6.448 16.000 7.000"),
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
        pathData = parseSvgPathData("M 19.000 7.000 L 19.000 7.010 C 19.000 7.562 18.552 8.010 18.000 8.010 C 17.448 8.010 17.000 7.562 17.000 7.010 L 17.000 7.000 C 17.000 6.448 17.448 6.000 18.000 6.000 C 18.552 6.000 19.000 6.448 19.000 7.000"),
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
        pathData = parseSvgPathData("M 22.000 7.000 L 22.000 7.010 C 22.000 7.562 21.552 8.010 21.000 8.010 C 20.448 8.010 20.000 7.562 20.000 7.010 L 20.000 7.000 C 20.000 6.448 20.448 6.000 21.000 6.000 C 21.552 6.000 22.000 6.448 22.000 7.000"),
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
        return _phoneCalling!!
    }

private var _phoneCalling: ImageVector? = null
