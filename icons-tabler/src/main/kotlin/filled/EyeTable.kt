package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EyeTable: ImageVector
    get() {
        if (_eyeTable != null) return _eyeTable!!
        _eyeTable = tablerFilledIcon(
            name = "EyeTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 C 21.000 3.552 20.552 4.000 20.000 4.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 6.000 22.000 C 4.895 22.000 4.000 21.105 4.000 20.000 L 4.000 4.000 C 3.448 4.000 3.000 3.552 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 ZM 8.000 17.000 L 7.872 17.007 C 7.346 17.070 6.961 17.531 6.992 18.059 C 7.023 18.587 7.461 19.000 7.990 19.000 L 8.118 18.993 C 8.644 18.930 9.029 18.469 8.998 17.941 C 8.967 17.413 8.529 17.000 8.000 17.000M 12.000 17.000 L 11.872 17.007 C 11.346 17.070 10.961 17.531 10.992 18.059 C 11.023 18.587 11.461 19.000 11.990 19.000 L 12.118 18.993 C 12.644 18.930 13.029 18.469 12.998 17.941 C 12.967 17.413 12.529 17.000 12.000 17.000M 16.000 17.000 L 15.872 17.007 C 15.346 17.070 14.961 17.531 14.992 18.059 C 15.023 18.587 15.461 19.000 15.990 19.000 L 16.118 18.993 C 16.644 18.930 17.029 18.469 16.998 17.941 C 16.967 17.413 16.529 17.000 16.000 17.000M 10.000 14.000 L 9.000 14.000 C 8.448 14.000 8.000 14.448 8.000 15.000 C 8.000 15.552 8.448 16.000 9.000 16.000 L 10.000 16.000 C 10.552 16.000 11.000 15.552 11.000 15.000 C 11.000 14.448 10.552 14.000 10.000 14.000M 15.000 14.000 L 14.000 14.000 C 13.448 14.000 13.000 14.448 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 15.000 16.000 C 15.552 16.000 16.000 15.552 16.000 15.000 C 16.000 14.448 15.552 14.000 15.000 14.000M 14.000 6.000 L 10.000 6.000 C 9.448 6.000 9.000 6.448 9.000 7.000 C 9.000 7.552 9.448 8.000 10.000 8.000 L 11.000 8.000 L 11.000 11.000 C 11.000 11.552 11.448 12.000 12.000 12.000 C 12.552 12.000 13.000 11.552 13.000 11.000 L 13.000 8.000 L 14.000 8.000 C 14.552 8.000 15.000 7.552 15.000 7.000 C 15.000 6.448 14.552 6.000 14.000 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _eyeTable!!
    }

private var _eyeTable: ImageVector? = null
