package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMaskOff: ImageVector
    get() {
        if (_scubaMaskOff != null) return _scubaMaskOff!!
        _scubaMaskOff = tablerOutlineIcon(
            name = "ScubaMaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 7.000 L 16.000 7.000 C 16.552 7.000 17.000 7.448 17.000 8.000 L 17.000 12.500 C 17.000 12.654 16.986 12.804 16.960 12.950M 14.960 14.957 C 14.810 14.985 14.655 15.000 14.497 15.000 L 13.997 15.000 C 12.892 15.000 11.997 14.105 11.997 13.000 C 11.997 11.895 11.102 11.000 9.997 11.000 C 8.892 11.000 7.997 11.895 7.997 13.000 C 7.997 14.105 7.102 15.000 5.997 15.000 L 5.497 15.000 C 4.116 15.000 2.997 13.881 2.997 12.500 L 2.997 8.000 C 2.997 7.448 3.445 7.000 3.997 7.000 L 6.997 7.000"),
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
        pathData = parseSvgPathData("M 10.000 17.000 C 10.000 18.105 10.895 19.000 12.000 19.000 L 15.500 19.000 C 16.471 19.002 17.426 18.745 18.265 18.256M 20.265 16.256 C 20.735 15.446 21.004 14.504 21.004 13.500 L 21.004 4.000"),
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
        return _scubaMaskOff!!
    }

private var _scubaMaskOff: ImageVector? = null
