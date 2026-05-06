package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Registered: ImageVector
    get() {
        if (_registered != null) return _registered!!
        _registered = tablerFilledIcon(
            name = "Registered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12 8h-2C9.448 8 9 8.448 9 9v6c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-1h.585l1.708 1.707c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402l-.9-.899c1.029-.777 1.446-2.124 1.037-3.347C14.434 8.825 13.289 8 12 8M12 10c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2Z"),
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
        return _registered!!
    }

private var _registered: ImageVector? = null
