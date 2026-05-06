package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MobileDownloadFill: ImageVector
    get() {
        if (_mobileDownloadFill != null) return _mobileDownloadFill!!
        _mobileDownloadFill = remixIcon(
            name = "MobileDownloadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 6c0-1.537 .578-2.938 1.528-4h-7.528C5.448 2 5 2.448 5 3v18c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-9.083c-.325 .055-.659 .083-1 .083C14.686 12 12 9.314 12 6ZM12 17c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM22 6h-3v-4h-2v4h-3l4 4L22 6Z"),
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
        return _mobileDownloadFill!!
    }

private var _mobileDownloadFill: ImageVector? = null
