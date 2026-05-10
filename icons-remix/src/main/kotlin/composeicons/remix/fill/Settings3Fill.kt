package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings3Fill: ImageVector
    get() {
        if (_settings3Fill != null) return _settings3Fill!!
        _settings3Fill = remixIcon(
            name = "Settings3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.954 2.211c1.334-.279 2.727-.288 4.091-.003 .177 1.16 .86 2.231 1.955 2.863 1.095 .632 2.364 .688 3.457 .261 .929 1.039 1.618 2.25 2.043 3.544-.915 .733-1.5 1.859-1.5 3.123 0 1.264 .586 2.391 1.502 3.124-.211 .64-.491 1.269-.841 1.876-.351 .607-.755 1.163-1.204 1.667-1.093-.426-2.362-.37-3.456 .262-1.094 .632-1.777 1.702-1.954 2.861-1.333 .279-2.727 .288-4.091 .003C9.777 20.631 9.095 19.559 8 18.927 6.905 18.295 5.635 18.24 4.543 18.666 3.614 17.627 2.925 16.416 2.5 15.122c.914-.733 1.5-1.859 1.5-3.123C4 10.735 3.413 9.608 2.498 8.875c.211-.64 .491-1.269 .841-1.876C3.69 6.392 4.094 5.836 4.543 5.333c1.093 .426 2.362 .37 3.456-.262C9.094 4.439 9.776 3.369 9.954 2.211ZM12 14.999c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z"),
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
        return _settings3Fill!!
    }

private var _settings3Fill: ImageVector? = null
