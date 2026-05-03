package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMaxMin: ImageVector
    get() {
        if (_mathMaxMin != null) return _mathMaxMin!!
        _mathMaxMin = tablerOutlineIcon(
            name = "MathMaxMin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 19.000 C 15.000 20.105 15.895 21.000 17.000 21.000 C 18.105 21.000 19.000 20.105 19.000 19.000 C 19.000 17.895 18.105 17.000 17.000 17.000 C 15.895 17.000 15.000 17.895 15.000 19.000"),
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
        pathData = parseSvgPathData("M 5.000 5.000 C 5.000 6.105 5.895 7.000 7.000 7.000 C 8.105 7.000 9.000 6.105 9.000 5.000 C 9.000 3.895 8.105 3.000 7.000 3.000 C 5.895 3.000 5.000 3.895 5.000 5.000"),
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
        pathData = parseSvgPathData("M 3.000 14.000 C 3.000 14.000 3.605 8.560 5.284 6.138M 8.679 6.164 C 10.816 8.816 13.226 15.277 15.359 17.883"),
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
        pathData = parseSvgPathData("M 18.748 18.038 C 19.450 17.158 20.200 14.478 21.000 10.000"),
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
        return _mathMaxMin!!
    }

private var _mathMaxMin: ImageVector? = null
