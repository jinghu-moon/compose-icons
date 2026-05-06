package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorBoldIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 24C68.45 24 52 43.74 52 72c0 28.26 16.45 48 40 48 23.55 0 40-19.74 40-48C132 43.74 115.55 24 92 24ZM92 96C76.45 96 76 74.46 76 72c0-2.46 .45-24 16-24 15.55 0 16 21.54 16 24 0 2.46-.45 24-16 24ZM145.27 53.37c-2.965-5.926-.565-13.134 5.36-16.1l24-12c3.72-1.861 8.138-1.664 11.677 .522 3.539 2.186 5.693 6.048 5.693 10.208v72c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52.58l-6.63 3.31c-5.926 2.965-13.134 .565-16.1-5.36ZM164 136c-23.55 0-40 19.74-40 48 0 28.26 16.45 48 40 48 23.55 0 40-19.74 40-48 0-28.26-16.45-48-40-48ZM164 208c-15.55 0-16-21.54-16-24 0-2.46 .45-24 16-24 15.55 0 16 21.54 16 24 0 2.46-.45 24-16 24ZM104 148v72c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52.58l-6.63 3.31c-3.842 1.993-8.46 1.762-12.085-.604-3.625-2.366-5.694-6.501-5.415-10.821 .279-4.32 2.862-8.154 6.761-10.035l24-12c3.72-1.861 8.138-1.664 11.677 .522 3.539 2.186 5.693 6.048 5.693 10.208Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
