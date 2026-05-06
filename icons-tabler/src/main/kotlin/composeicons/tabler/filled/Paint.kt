package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Paint: ImageVector
    get() {
        if (_paint != null) return _paint!!
        _paint = tablerFilledIcon(
            name = "Paint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.589-0 2.902 1.238 2.995 2.824L20 5c1.657 0 3 1.343 3 3 0 3.226-2.551 5.875-5.775 5.996L17 14h-4l.15 .005c.984 .074 1.767 .854 1.844 1.838L15 16v4c0 1.047-.806 1.917-1.85 1.995L13 22h-2C9.953 22 9.083 21.194 9.005 20.15L9 20v-4c-0-1.047 .806-1.917 1.85-1.995L11 14v-1c0-.507 .38-.934 .883-.993L12 12h5c2.209 0 4-1.791 4-4-0-.507-.38-.934-.883-.993L20 7l-.005 .176c-.089 1.518-1.301 2.73-2.819 2.819L17 10h-10C5.411 10 4.098 8.762 4.005 7.176L4 7v-2C4 3.411 5.238 2.098 6.824 2.005L7 2h10Z"),
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
        return _paint!!
    }

private var _paint: ImageVector? = null
