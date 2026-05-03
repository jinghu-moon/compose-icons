package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blade: ImageVector
    get() {
        if (_blade != null) return _blade!!
        _blade = tablerOutlineIcon(
            name = "Blade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.707 3.707 L 20.293 6.293 C 20.683 6.683 20.683 7.317 20.293 7.707 L 19.707 8.293 C 19.317 8.684 19.317 9.316 19.707 9.707 L 20.293 10.293 C 20.683 10.684 20.683 11.316 20.293 11.707 L 11.707 20.293 C 11.316 20.683 10.684 20.683 10.293 20.293 L 9.707 19.707 C 9.316 19.317 8.684 19.317 8.293 19.707 L 7.707 20.293 C 7.317 20.683 6.683 20.683 6.293 20.293 L 3.707 17.707 C 3.317 17.316 3.317 16.684 3.707 16.293 L 4.293 15.707 C 4.683 15.316 4.683 14.684 4.293 14.293 L 3.707 13.707 C 3.317 13.316 3.317 12.684 3.707 12.293 L 12.293 3.707 C 12.684 3.317 13.316 3.317 13.707 3.707 L 14.293 4.293 C 14.684 4.683 15.316 4.683 15.707 4.293 L 16.293 3.707 C 16.684 3.317 17.316 3.317 17.707 3.707"),
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
        pathData = parseSvgPathData("M 8.000 16.000 L 11.200 12.800"),
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
        pathData = parseSvgPathData("M 12.800 11.200 L 16.000 8.000"),
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
        pathData = parseSvgPathData("M 14.000 8.000 L 16.000 10.000"),
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
        pathData = parseSvgPathData("M 8.000 14.000 L 10.000 16.000"),
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
        pathData = parseSvgPathData("M 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000 C 11.448 11.000 11.000 11.448 11.000 12.000"),
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
        return _blade!!
    }

private var _blade: ImageVector? = null
