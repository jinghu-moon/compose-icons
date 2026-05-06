package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CheckboxMultipleBlankFill: ImageVector
    get() {
        if (_checkboxMultipleBlankFill != null) return _checkboxMultipleBlankFill!!
        _checkboxMultipleBlankFill = remixIcon(
            name = "CheckboxMultipleBlankFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 7v-4c0-.552 .448-1 1-1h13c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-4v3.993C17 21.549 16.551 22 15.993 22h-12.985C2.451 22 2 21.551 2 20.993L2.003 8.007C2.003 7.451 2.452 7 3.01 7h3.99ZM9 7h6.993C16.549 7 17 7.449 17 8.007v6.993h3v-11h-11v3Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _checkboxMultipleBlankFill!!
    }

private var _checkboxMultipleBlankFill: ImageVector? = null
