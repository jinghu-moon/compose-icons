package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AdCircle: ImageVector
    get() {
        if (_adCircle != null) return _adCircle!!
        _adCircle = tablerFilledIcon(
            name = "AdCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.57 22 2.152 17.673 2.004 12.28L2 12l.004-.28C2.152 6.327 6.57 2 12 2ZM8.5 8C7.183 8 6.091 9.022 6.005 10.336L6 10.5v4.5l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L8 15v-1h1v1l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L11 15v-4.5l-.005-.164C10.909 9.022 9.817 8 8.5 8ZM15 8h-1c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h1c1.657 0 3-1.343 3-3v-2C18 9.343 16.657 8 15 8ZM15 10c.552 0 1 .448 1 1v2c-0 .507-.38 .934-.883 .993L15 14v-4ZM8.5 10c.241-0 .449 .172 .492 .41L9 10.5v1.5h-1v-1.5l.008-.09c.043-.238 .251-.41 .492-.41Z"),
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
        return _adCircle!!
    }

private var _adCircle: ImageVector? = null
