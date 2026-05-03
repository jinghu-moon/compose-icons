package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRust: ImageVector
    get() {
        if (_brandRust != null) return _brandRust!!
        _brandRust = tablerOutlineIcon(
            name = "BrandRust",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.139 3.463 C 10.612 1.513 13.388 1.513 13.861 3.463 C 14.005 4.058 14.424 4.548 14.989 4.782 C 15.555 5.016 16.198 4.966 16.720 4.648 C 18.434 3.603 20.398 5.566 19.353 7.281 C 19.035 7.803 18.986 8.446 19.220 9.011 C 19.454 9.575 19.943 9.995 20.537 10.139 C 22.487 10.612 22.487 13.388 20.537 13.861 C 19.942 14.005 19.452 14.424 19.218 14.989 C 18.984 15.555 19.034 16.198 19.352 16.720 C 20.397 18.434 18.434 20.398 16.719 19.353 C 16.197 19.035 15.554 18.986 14.989 19.220 C 14.425 19.454 14.005 19.943 13.861 20.537 C 13.388 22.487 10.612 22.487 10.139 20.537 C 9.995 19.942 9.576 19.452 9.011 19.218 C 8.445 18.984 7.802 19.034 7.280 19.352 C 5.566 20.397 3.602 18.434 4.647 16.719 C 4.965 16.197 5.014 15.554 4.780 14.989 C 4.546 14.425 4.057 14.005 3.463 13.861 C 1.513 13.388 1.513 10.612 3.463 10.139 C 4.058 9.995 4.548 9.576 4.782 9.011 C 5.016 8.445 4.966 7.802 4.648 7.280 C 3.603 5.566 5.566 3.602 7.281 4.647 C 7.803 4.966 8.446 5.016 9.011 4.782 C 9.576 4.548 9.995 4.058 10.139 3.463"),
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
        pathData = parseSvgPathData("M 8.000 12.000 L 14.000 12.000 C 15.105 12.000 16.000 11.105 16.000 10.000 C 16.000 8.895 15.105 8.000 14.000 8.000 L 8.000 8.000 L 8.000 16.000 L 8.000 12.000"),
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
        pathData = parseSvgPathData("M 19.000 16.000 L 17.000 16.000 C 15.895 16.000 15.000 15.105 15.000 14.000 C 15.000 12.895 14.105 12.000 13.000 12.000 L 12.000 12.000"),
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
        pathData = parseSvgPathData("M 9.000 8.000 L 5.000 8.000"),
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
        pathData = parseSvgPathData("M 5.000 16.000 L 9.000 16.000"),
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
        return _brandRust!!
    }

private var _brandRust: ImageVector? = null
