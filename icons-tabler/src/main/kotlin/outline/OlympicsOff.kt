package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OlympicsOff: ImageVector
    get() {
        if (_olympicsOff != null) return _olympicsOff!!
        _olympicsOff = tablerOutlineIcon(
            name = "OlympicsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 6.000 C 4.343 6.000 3.000 7.343 3.000 9.000 C 3.000 10.657 4.343 12.000 6.000 12.000 C 7.657 12.000 9.000 10.657 9.000 9.000"),
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
        pathData = parseSvgPathData("M 15.000 9.000 C 15.000 10.657 16.343 12.000 18.000 12.000 C 19.657 12.000 21.000 10.657 21.000 9.000 C 21.000 7.343 19.657 6.000 18.000 6.000 C 16.343 6.000 15.000 7.343 15.000 9.000"),
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
        pathData = parseSvgPathData("M 9.000 9.000 C 9.000 10.657 10.343 12.000 12.000 12.000M 14.566 10.555 C 15.285 9.371 15.100 7.848 14.117 6.871 C 13.135 5.894 11.611 5.717 10.431 6.442"),
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
        pathData = parseSvgPathData("M 6.000 15.000 C 6.000 16.657 7.343 18.000 9.000 18.000 C 10.657 18.000 12.000 16.657 12.000 15.000 C 12.000 13.343 10.657 12.000 9.000 12.000 C 7.343 12.000 6.000 13.343 6.000 15.000"),
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
        pathData = parseSvgPathData("M 12.878 12.880 C 11.705 14.051 11.703 15.950 12.874 17.123 C 14.045 18.296 15.944 18.298 17.117 17.127M 17.703 13.696 C 17.402 13.075 16.898 12.576 16.273 12.282"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _olympicsOff!!
    }

private var _olympicsOff: ImageVector? = null
