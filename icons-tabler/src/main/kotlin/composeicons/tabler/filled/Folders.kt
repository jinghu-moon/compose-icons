package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = tablerFilledIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.265 0 .52 .105 .707 .293L14.415 4h4.585c1.589-0 2.902 1.238 2.995 2.824L22 7v7c0 1.657-1.343 3-3 3h-1v1c0 1.657-1.343 3-3 3h-10C3.343 21 2 19.657 2 18v-9C2 7.343 3.343 6 5 6h1v-1C6 3.343 7.343 2 9 2ZM6 8h-1C4.448 8 4 8.448 4 9v9c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-1h-7C7.343 17 6 15.657 6 14Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
