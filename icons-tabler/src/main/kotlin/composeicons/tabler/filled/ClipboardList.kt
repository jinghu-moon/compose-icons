package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardList: ImageVector
    get() {
        if (_clipboardList != null) return _clipboardList!!
        _clipboardList = tablerFilledIcon(
            name = "ClipboardList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.997 4.17C19.197 4.593 20 5.727 20 7v12c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-12C4 5.727 4.803 4.593 6.003 4.17 6.094 6.311 7.857 8 10 8h4c2.053 0 3.773-1.554 3.98-3.597ZM9.01 15h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L9.01 17c.552 0 1-.448 1-1 0-.552-.448-1-1-1M15 15h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1M9.01 11h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L9.01 13c.552 0 1-.448 1-1 0-.552-.448-1-1-1M15 11h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4C8.895 6 8 5.105 8 4 8 2.895 8.895 2 10 2Z"),
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
        return _clipboardList!!
    }

private var _clipboardList: ImageVector? = null
