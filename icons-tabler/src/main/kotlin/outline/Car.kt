package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = tablerOutlineIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 17.000 C 5.000 18.105 5.895 19.000 7.000 19.000 C 8.105 19.000 9.000 18.105 9.000 17.000 C 9.000 15.895 8.105 15.000 7.000 15.000 C 5.895 15.000 5.000 15.895 5.000 17.000"),
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
        pathData = parseSvgPathData("M 15.000 17.000 C 15.000 18.105 15.895 19.000 17.000 19.000 C 18.105 19.000 19.000 18.105 19.000 17.000 C 19.000 15.895 18.105 15.000 17.000 15.000 C 15.895 15.000 15.000 15.895 15.000 17.000"),
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
        pathData = parseSvgPathData("M 5.000 17.000 L 3.000 17.000 L 3.000 11.000 L 5.000 6.000 L 14.000 6.000 L 18.000 11.000 L 19.000 11.000 C 20.105 11.000 21.000 11.895 21.000 13.000 L 21.000 17.000 L 19.000 17.000M 15.000 17.000 L 9.000 17.000M 3.000 11.000 L 18.000 11.000M 12.000 11.000 L 12.000 6.000"),
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
        return _car!!
    }

private var _car: ImageVector? = null
