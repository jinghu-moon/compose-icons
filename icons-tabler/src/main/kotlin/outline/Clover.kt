package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = tablerOutlineIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 10.000 L 8.603 6.560 C 7.798 5.741 7.798 4.429 8.603 3.610 C 8.987 3.219 9.511 2.999 10.059 2.999 C 10.607 2.999 11.131 3.219 11.515 3.610 L 12.000 4.000 L 12.485 3.610 C 12.869 3.219 13.393 2.999 13.941 2.999 C 14.489 2.999 15.013 3.219 15.397 3.610 C 16.202 4.429 16.202 5.741 15.397 6.560 L 12.000 10.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 14.000 L 8.603 17.440 C 7.798 18.259 7.798 19.571 8.603 20.390 C 8.987 20.781 9.511 21.001 10.059 21.001 C 10.607 21.001 11.131 20.781 11.515 20.390 L 12.000 20.000 L 12.485 20.390 C 12.869 20.781 13.393 21.001 13.941 21.001 C 14.489 21.001 15.013 20.781 15.397 20.390 C 16.202 19.571 16.202 18.259 15.397 17.440 L 12.000 14.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 12.000 L 17.440 8.603 C 18.259 7.798 19.571 7.798 20.390 8.603 C 20.781 8.987 21.001 9.511 21.001 10.059 C 21.001 10.607 20.781 11.131 20.390 11.515 L 20.000 12.000 L 20.390 12.485 C 20.781 12.869 21.001 13.393 21.001 13.941 C 21.001 14.489 20.781 15.013 20.390 15.397 C 19.571 16.202 18.259 16.202 17.440 15.397 L 14.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 12.000 L 6.560 8.603 C 5.741 7.798 4.429 7.798 3.610 8.603 C 3.219 8.987 2.999 9.511 2.999 10.059 C 2.999 10.607 3.219 11.131 3.610 11.515 L 4.000 12.000 L 3.610 12.485 C 3.219 12.869 2.999 13.393 2.999 13.941 C 2.999 14.489 3.219 15.013 3.610 15.397 C 4.429 16.202 5.741 16.202 6.560 15.397 L 10.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _clover!!
    }

private var _clover: ImageVector? = null
