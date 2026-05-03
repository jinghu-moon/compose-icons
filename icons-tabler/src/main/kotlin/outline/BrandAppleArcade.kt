package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppleArcade: ImageVector
    get() {
        if (_brandAppleArcade != null) return _brandAppleArcade!!
        _brandAppleArcade = tablerOutlineIcon(
            name = "BrandAppleArcade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 5.000 C 10.000 6.105 10.895 7.000 12.000 7.000 C 13.105 7.000 14.000 6.105 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 C 10.895 3.000 10.000 3.895 10.000 5.000"),
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
        pathData = parseSvgPathData("M 20.000 12.500 L 20.000 17.250 C 20.007 17.361 19.988 17.472 19.945 17.575 C 19.878 17.736 19.754 17.866 19.597 17.941 L 14.135 20.521 C 12.783 21.159 11.217 21.159 9.865 20.521 L 4.403 17.941 C 4.139 17.816 3.980 17.541 4.002 17.250 L 4.002 12.500"),
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
        pathData = parseSvgPathData("M 4.431 12.216 L 10.065 9.884 C 11.304 9.372 12.696 9.372 13.935 9.884 L 19.569 12.216 C 19.824 12.320 19.993 12.566 19.999 12.841 C 20.005 13.117 19.847 13.370 19.597 13.485 L 14.135 16.028 C 12.781 16.657 11.219 16.657 9.865 16.028 L 4.403 13.485 C 4.151 13.371 3.992 13.117 3.998 12.841 C 4.004 12.564 4.175 12.318 4.431 12.215"),
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
        pathData = parseSvgPathData("M 12.000 7.000 L 12.000 13.000"),
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
        return _brandAppleArcade!!
    }

private var _brandAppleArcade: ImageVector? = null
