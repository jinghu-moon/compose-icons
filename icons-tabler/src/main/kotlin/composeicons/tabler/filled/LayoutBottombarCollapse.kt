package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombarCollapse: ImageVector
    get() {
        if (_layoutBottombarCollapse != null) return _layoutBottombarCollapse!!
        _layoutBottombarCollapse = tablerFilledIcon(
            name = "LayoutBottombarCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.589-0 2.902 1.238 2.995 2.824L21 6v12c0 1.589-1.238 2.902-2.824 2.995L18 21h-12C4.411 21 3.098 19.762 3.005 18.176L3 18v-12C3 4.411 4.238 3.098 5.824 3.005L6 3h12ZM18 5h-12c-.507 0-.934 .38-.993 .883L5 6v9h14v-9c-0-.507-.38-.934-.883-.993L18 5ZM10.613 8.21l.094 .083L12 9.585 13.293 8.293c.356-.356 .922-.392 1.32-.083l.094 .083c.356 .356 .392 .922 .083 1.32l-.083 .094-2 2c-.356 .356-.922 .392-1.32 .083l-.094-.083-2-2C8.921 9.334 8.903 8.735 9.251 8.34c.349-.395 .945-.452 1.362-.13Z"),
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
        return _layoutBottombarCollapse!!
    }

private var _layoutBottombarCollapse: ImageVector? = null
