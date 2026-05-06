package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = tablerFilledIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 14v8h-4C5.343 22 4 20.657 4 19v-4c0-.552 .448-1 1-1h6ZM19 14c.552 0 1 .448 1 1v4c0 1.657-1.343 3-3 3h-4v-8h6ZM16.5 2c1.2-0 2.317 .615 2.959 1.629 .642 1.014 .719 2.287 .204 3.371h.337c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-7v-5h-2v5h-7C2.895 12 2 11.105 2 10v-1C2 7.895 2.895 7 4 7h.337C4.114 6.531 3.999 6.019 4 5.5 4 3.567 5.567 2 7.483 2c1.755-.03 3.312 1.092 4.381 2.934L12 5.177C13.033 3.263 14.56 2.063 16.291 2.002L16.5 2ZM7.5 4C6.672 4 6 4.672 6 5.5 6 6.328 6.672 7 7.5 7h3.143C9.902 5.095 8.694 3.98 7.5 4ZM16.483 4C15.303 3.98 14.098 5.096 13.357 7h3.143c.828-.005 1.496-.68 1.492-1.509C17.987 4.663 17.311 3.995 16.483 4Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
