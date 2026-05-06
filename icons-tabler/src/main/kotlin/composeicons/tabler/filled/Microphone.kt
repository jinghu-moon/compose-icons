package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = tablerFilledIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 9c.552 0 1 .448 1 1 0 4.032-2.999 7.434-6.999 7.938L13 20h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-8C7.448 22 7 21.552 7 21c0-.552 .448-1 1-1h3v-2.062C7 17.434 4 14.032 4 10 4 9.448 4.448 9 5 9c.552 0 1 .448 1 1 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-.552 .448-1 1-1M12 1c2.209 0 4 1.791 4 4v5c0 2.209-1.791 4-4 4C9.791 14 8 12.209 8 10v-5C8 2.791 9.791 1 12 1"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
