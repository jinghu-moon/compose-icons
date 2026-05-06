package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombar: ImageVector
    get() {
        if (_layoutBottombar != null) return _layoutBottombar!!
        _layoutBottombar = tablerFilledIcon(
            name = "LayoutBottombar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.589-0 2.902 1.238 2.995 2.824L21 6v12c0 1.589-1.238 2.902-2.824 2.995L18 21h-12C4.411 21 3.098 19.762 3.005 18.176L3 18v-12C3 4.411 4.238 3.098 5.824 3.005L6 3h12ZM18 5h-12c-.507 0-.934 .38-.993 .883L5 6v9h14v-9c-0-.507-.38-.934-.883-.993L18 5Z"),
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
        return _layoutBottombar!!
    }

private var _layoutBottombar: ImageVector? = null
