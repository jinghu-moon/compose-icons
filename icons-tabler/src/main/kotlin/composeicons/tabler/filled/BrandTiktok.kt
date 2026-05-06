package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerFilledIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.083 2h-4.083c-.552 0-1 .448-1 1v11.5c0 .686-.465 1.285-1.13 1.454-.665 .169-1.36-.134-1.688-.737-.328-.603-.205-1.351 .299-1.817l.12-.1c.251-.189 .399-.485 .399-.8v-4.326c0-.306-.139-.595-.379-.785C8.381 7.199 8.068 7.13 7.77 7.2 4.063 8.074 1.599 11.588 2.041 15.371c.442 3.783 3.65 6.634 7.459 6.629l.243-.005c4.045-.131 7.256-3.448 7.257-7.495v-2.7l.311 .153c1.122 .53 2.333 .868 3.59 .993 .281 .028 .561-.064 .771-.254 .209-.19 .329-.459 .328-.742v-4.033c-0-.488-.353-.905-.834-.986C19.069 6.575 17.425 4.932 17.069 2.835 16.988 2.353 16.571 2 16.083 2Z"),
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
