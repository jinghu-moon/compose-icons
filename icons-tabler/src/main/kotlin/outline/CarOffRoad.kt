package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarOffRoad: ImageVector
    get() {
        if (_carOffRoad != null) return _carOffRoad!!
        _carOffRoad = tablerOutlineIcon(
            name = "CarOffRoad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 17.000 L 15.000 17.000"),
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
        pathData = parseSvgPathData("M 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 C 5.895 19.000 5.000 18.105 5.000 17.000 C 5.000 15.895 5.895 15.000 7.000 15.000 C 8.105 15.000 9.000 15.895 9.000 17.000"),
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
        pathData = parseSvgPathData("M 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 C 15.000 15.895 15.895 15.000 17.000 15.000 C 18.105 15.000 19.000 15.895 19.000 17.000"),
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
        pathData = parseSvgPathData("M 17.000 10.000 L 15.000 7.000"),
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
        pathData = parseSvgPathData("M 19.000 17.000 L 21.000 17.000 L 21.000 12.000 C 21.000 10.895 20.105 10.000 19.000 10.000 L 14.000 10.000 L 14.000 12.000 L 11.414 12.000 C 11.149 12.000 10.894 11.895 10.707 11.707 L 9.586 10.586 C 9.211 10.211 8.702 10.000 8.172 10.000 L 4.000 10.000 C 3.448 10.000 3.000 10.448 3.000 11.000 L 3.000 17.000 L 5.000 17.000"),
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
        return _carOffRoad!!
    }

private var _carOffRoad: ImageVector? = null
