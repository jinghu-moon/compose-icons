package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetBangla: ImageVector
    get() {
        if (_alphabetBangla != null) return _alphabetBangla!!
        _alphabetBangla = tablerOutlineIcon(
            name = "AlphabetBangla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 12.000 C 14.904 11.973 17.000 14.000 17.000 19.000"),
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
        pathData = parseSvgPathData("M 10.000 11.000 C 10.000 10.045 10.000 9.000 10.786 8.323 C 12.048 7.234 13.811 8.873 13.986 10.383 C 14.072 11.124 13.771 13.492 12.497 14.910 C 12.022 15.440 11.593 15.902 10.786 15.984 C 10.036 16.060 9.422 15.862 8.710 15.396 C 7.572 14.653 6.383 13.399 5.374 11.666 C 4.296 9.817 3.714 8.553 3.000 6.000"),
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
        pathData = parseSvgPathData("M 7.370 7.072 C 8.139 6.236 12.616 2.978 15.770 6.870 C 16.152 7.342 16.343 7.578 16.670 8.500 C 16.996 9.421 16.996 10.062 16.996 11.344 L 16.996 19.000"),
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
        pathData = parseSvgPathData("M 17.000 10.000 C 17.000 8.011 18.500 6.000 21.000 6.000"),
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
        return _alphabetBangla!!
    }

private var _alphabetBangla: ImageVector? = null
