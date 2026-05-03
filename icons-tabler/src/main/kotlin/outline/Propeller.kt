package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Propeller: ImageVector
    get() {
        if (_propeller != null) return _propeller!!
        _propeller = tablerOutlineIcon(
            name = "Propeller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 13.000 C 9.000 14.657 10.343 16.000 12.000 16.000 C 13.657 16.000 15.000 14.657 15.000 13.000 C 15.000 11.343 13.657 10.000 12.000 10.000 C 10.343 10.000 9.000 11.343 9.000 13.000"),
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
        pathData = parseSvgPathData("M 14.167 10.500 C 14.889 8.962 15.323 7.457 15.470 5.986 C 15.690 4.356 14.708 3.000 12.000 3.000 C 9.292 3.000 8.310 4.357 8.530 5.986 C 8.677 7.457 9.111 8.962 9.833 10.500"),
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
        pathData = parseSvgPathData("M 13.169 16.751 C 14.139 18.146 15.226 19.274 16.426 20.137 C 17.726 21.137 19.393 20.970 20.747 18.625 C 22.101 16.280 21.417 14.751 19.897 14.127 C 18.549 13.519 17.029 13.142 15.335 12.999"),
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
        pathData = parseSvgPathData("M 8.664 13.000 C 6.971 13.143 5.451 13.520 4.104 14.128 C 2.582 14.751 1.898 16.281 3.252 18.626 C 4.606 20.971 6.272 21.143 7.573 20.138 C 8.773 19.275 9.860 18.147 10.831 16.752"),
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
        return _propeller!!
    }

private var _propeller: ImageVector? = null
