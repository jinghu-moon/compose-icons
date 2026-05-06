package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TreeLine: ImageVector
    get() {
        if (_treeLine != null) return _treeLine!!
        _treeLine = remixIcon(
            name = "TreeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7C6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6 0 .262-.017 .521-.05 .775C19.77 8.804 21 10.757 21 13c0 3.314-2.686 6-6 6h-2v3h-2v-3h-2.5C5.462 19 3 16.538 3 13.5 3 11.286 4.307 9.38 6.191 8.507 6.066 8.026 6 7.52 6 7ZM7.01 10.332C5.822 10.892 5 12.101 5 13.5 5 15.433 6.567 17 8.5 17h6.5c2.209 0 4-1.791 4-4C19 11.306 17.946 9.855 16.454 9.272l-.841-.329C15.791 8.303 16 7.672 16 7 16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7c0 1.308 .627 2.469 1.6 3.2L8.399 11.8C7.858 11.393 7.387 10.896 7.01 10.332Z"),
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
        return _treeLine!!
    }

private var _treeLine: ImageVector? = null
