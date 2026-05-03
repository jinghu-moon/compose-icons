package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Poo: ImageVector
    get() {
        if (_poo != null) return _poo!!
        _poo = tablerOutlineIcon(
            name = "Poo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 12.000 L 10.010 12.000"),
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
        pathData = parseSvgPathData("M 14.000 12.000 L 14.010 12.000"),
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
        pathData = parseSvgPathData("M 10.000 16.000 C 11.202 16.837 12.798 16.837 14.000 16.000"),
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
        pathData = parseSvgPathData("M 11.000 4.000 C 13.000 4.000 14.500 5.500 14.500 8.000 L 14.664 8.000 C 15.444 8.051 16.154 8.464 16.585 9.115 C 17.016 9.767 17.118 10.583 16.860 11.320 C 17.993 11.896 18.640 13.123 18.475 14.383 C 19.633 15.037 20.223 16.376 19.922 17.672 C 19.622 18.968 18.504 19.912 17.176 19.990 L 17.000 19.990 L 7.000 19.990 C 5.637 19.990 4.445 19.071 4.098 17.752 C 3.752 16.433 4.338 15.047 5.526 14.377 C 5.362 13.117 6.009 11.891 7.141 11.315 C 6.883 10.578 6.985 9.762 7.415 9.111 C 7.846 8.459 8.557 8.046 9.336 7.995 L 9.500 7.995 C 11.000 7.995 12.000 5.995 11.000 3.995 L 11.000 4.000"),
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
        return _poo!!
    }

private var _poo: ImageVector? = null
