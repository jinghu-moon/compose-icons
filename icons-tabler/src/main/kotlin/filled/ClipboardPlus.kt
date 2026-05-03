package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardPlus: ImageVector
    get() {
        if (_clipboardPlus != null) return _clipboardPlus!!
        _clipboardPlus = tablerFilledIcon(
            name = "ClipboardPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.997 4.170 C 19.197 4.593 20.000 5.727 20.000 7.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 7.000 C 4.000 5.727 4.803 4.593 6.003 4.170 C 6.094 6.311 7.857 8.000 10.000 8.000 L 14.000 8.000 C 16.053 8.000 17.773 6.446 17.980 4.403 ZM 12.000 11.000 C 11.448 11.000 11.000 11.448 11.000 12.000 L 11.000 13.000 L 10.000 13.000 C 9.448 13.000 9.000 13.448 9.000 14.000 C 9.000 14.552 9.448 15.000 10.000 15.000 L 11.000 15.000 L 11.000 16.000 C 11.000 16.552 11.448 17.000 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 15.000 L 14.000 15.000 C 14.552 15.000 15.000 14.552 15.000 14.000 C 15.000 13.448 14.552 13.000 14.000 13.000 L 13.000 13.000 L 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000M 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 16.000 5.105 15.105 6.000 14.000 6.000 L 10.000 6.000 C 8.895 6.000 8.000 5.105 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _clipboardPlus!!
    }

private var _clipboardPlus: ImageVector? = null
