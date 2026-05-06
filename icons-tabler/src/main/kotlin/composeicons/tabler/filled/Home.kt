package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = tablerFilledIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.707 2.293l9 9C22.337 11.923 21.891 13 21 13h-1v6c0 1.657-1.343 3-3 3h-1v-7c0-1.589-1.238-2.902-2.824-2.995L13 12h-2C9.343 12 8 13.343 8 15v7h-1C5.343 22 4 20.657 4 19v-6h-1C2.11 13 1.663 11.923 2.293 11.293L11.293 2.293c.391-.39 1.023-.39 1.414 0M13 14c.552 0 1 .448 1 1v7h-4v-7c0-.507 .38-.934 .883-.993L11 14Z"),
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
        return _home!!
    }

private var _home: ImageVector? = null
