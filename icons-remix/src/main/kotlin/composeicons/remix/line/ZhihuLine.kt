package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZhihuLine: ImageVector
    get() {
        if (_zhihuLine != null) return _zhihuLine!!
        _zhihuLine = remixIcon(
            name = "ZhihuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.344 17.963l-1.687 1.074L8.525 15.687c-.44 1.402-1.171 2.666-2.138 3.825-.402 .482-.819 .918-1.301 1.375-.155 .147-.775 .716-.878 .82L2.794 20.293c.139-.139 .787-.734 .915-.856 .43-.408 .795-.789 1.142-1.206C6.117 16.713 6.88 15.021 6.988 13h-3.987v-2h4v-4h-.868C5.444 8.266 4.575 9.222 3.515 9.858L2.486 8.143C3.882 7.305 4.912 5.54 5.525 2.783l1.952 .434c-.141 .633-.303 1.227-.489 1.783h4.513v2h-2.5v4h2.5v2h-2.315l3.158 4.963ZM16.183 17.893l1.116-.893h1.701v-10h-4v10h.736l.446 .893ZM13.001 5h8v14h-3l-2.5 2-1-2h-1.5v-14Z"),
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
        return _zhihuLine!!
    }

private var _zhihuLine: ImageVector? = null
