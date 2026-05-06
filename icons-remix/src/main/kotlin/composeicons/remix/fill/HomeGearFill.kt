package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeGearFill: ImageVector
    get() {
        if (_homeGearFill != null) return _homeGearFill!!
        _homeGearFill = remixIcon(
            name = "HomeGearFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 20c0 .552-.448 1-1 1h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9ZM8.592 13.808l-.991 .572 1.001 1.733 .993-.573c.393 .371 .873 .653 1.405 .811v1.144h2.001v-1.144c.532-.158 1.012-.44 1.405-.811l.993 .573 1.001-1.733-.991-.572c.062-.26 .094-.531 .094-.81 0-.279-.033-.55-.094-.81l.991-.572L15.398 9.882l-.993 .573c-.393-.371-.873-.653-1.405-.811v-1.144h-2.001v1.144c-.532 .158-1.012 .44-1.405 .811L8.602 9.882 7.601 11.616l.991 .572c-.062 .26-.094 .531-.094 .81 0 .279 .033 .55 .094 .81ZM12 14.497c-.829 0-1.501-.671-1.501-1.499 0-.828 .672-1.499 1.501-1.499 .829 0 1.501 .671 1.501 1.499 0 .828-.672 1.499-1.501 1.499Z"),
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
        return _homeGearFill!!
    }

private var _homeGearFill: ImageVector? = null
