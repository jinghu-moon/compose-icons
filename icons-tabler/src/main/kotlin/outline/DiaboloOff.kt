package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiaboloOff: ImageVector
    get() {
        if (_diaboloOff != null) return _diaboloOff!!
        _diaboloOff = tablerOutlineIcon(
            name = "DiaboloOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.727 4.749 C 4.260 5.129 4.000 5.553 4.000 6.000 C 4.000 7.217 5.933 8.265 8.710 8.735M 12.967 8.978 C 16.929 8.800 20.000 7.534 20.000 6.000 C 20.000 4.343 16.418 3.000 12.000 3.000 C 10.340 3.000 8.798 3.190 7.520 3.514"),
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
        pathData = parseSvgPathData("M 4.000 6.000 L 4.000 6.143 C 4.000 6.247 4.016 6.351 4.048 6.450 L 6.000 12.000 L 4.036 17.670 C 4.012 17.756 4.000 17.845 4.000 17.935 L 4.000 18.000 C 4.000 19.657 7.582 21.000 12.000 21.000 C 15.218 21.000 17.992 20.288 19.262 19.260M 19.051 15.033 L 18.000 12.000 L 19.952 6.450 C 19.984 6.351 20.000 6.247 20.000 6.143 L 20.000 6.000"),
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
        pathData = parseSvgPathData("M 6.000 12.000 C 6.000 13.105 8.686 14.000 12.000 14.000 C 12.656 14.000 13.288 13.965 13.879 13.900M 17.077 13.066 C 17.662 12.758 18.000 12.392 18.000 12.000"),
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
        return _diaboloOff!!
    }

private var _diaboloOff: ImageVector? = null
