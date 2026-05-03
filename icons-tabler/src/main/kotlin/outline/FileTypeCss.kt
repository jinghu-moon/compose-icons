package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeCss: ImageVector
    get() {
        if (_fileTypeCss != null) return _fileTypeCss!!
        _fileTypeCss = tablerOutlineIcon(
            name = "FileTypeCss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 3.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 19.000 8.000"),
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
        pathData = parseSvgPathData("M 5.000 12.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 14.000 3.000 L 19.000 8.000 L 19.000 12.000"),
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
        pathData = parseSvgPathData("M 8.000 16.500 C 8.000 15.672 7.328 15.000 6.500 15.000 C 5.672 15.000 5.000 15.672 5.000 16.500 L 5.000 19.500 C 5.000 20.328 5.672 21.000 6.500 21.000 C 7.328 21.000 8.000 20.328 8.000 19.500"),
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
        pathData = parseSvgPathData("M 11.000 20.250 C 11.000 20.664 11.336 21.000 11.750 21.000 L 13.000 21.000 C 13.552 21.000 14.000 20.552 14.000 20.000 L 14.000 19.000 C 14.000 18.448 13.552 18.000 13.000 18.000 L 12.000 18.000 C 11.448 18.000 11.000 17.552 11.000 17.000 L 11.000 16.000 C 11.000 15.448 11.448 15.000 12.000 15.000 L 13.250 15.000 C 13.664 15.000 14.000 15.336 14.000 15.750"),
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
        pathData = parseSvgPathData("M 17.000 20.250 C 17.000 20.664 17.336 21.000 17.750 21.000 L 19.000 21.000 C 19.552 21.000 20.000 20.552 20.000 20.000 L 20.000 19.000 C 20.000 18.448 19.552 18.000 19.000 18.000 L 18.000 18.000 C 17.448 18.000 17.000 17.552 17.000 17.000 L 17.000 16.000 C 17.000 15.448 17.448 15.000 18.000 15.000 L 19.250 15.000 C 19.664 15.000 20.000 15.336 20.000 15.750"),
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
        return _fileTypeCss!!
    }

private var _fileTypeCss: ImageVector? = null
