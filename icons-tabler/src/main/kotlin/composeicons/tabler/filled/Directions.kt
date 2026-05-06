package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Directions: ImageVector
    get() {
        if (_directions != null) return _directions!!
        _directions = tablerFilledIcon(
            name = "Directions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 22C9.448 22 9 21.552 9 21c0-.552 .448-1 1-1h1v-2.001L6 18c-.265-0-.52-.105-.707-.293L3.293 15.707c-.39-.391-.39-1.023 0-1.414l2-2C5.48 12.105 5.735 12 6 12l5-.001v-1.999h-3C7.448 10 7 9.552 7 9v-4C7 4.448 7.448 4 8 4h3v-1c0-.552 .448-1 1-1 .552 0 1 .448 1 1v1h6c.265 0 .52 .105 .707 .293l2 2c.39 .39 .39 1.023 0 1.414l-2 2c-.187 .188-.442 .293-.707 .293h-6v1.999L14 12c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1l-1-.001v2.001h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _directions!!
    }

private var _directions: ImageVector? = null
