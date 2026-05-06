package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MobileDownloadLine: ImageVector
    get() {
        if (_mobileDownloadLine != null) return _mobileDownloadLine!!
        _mobileDownloadLine = remixIcon(
            name = "MobileDownloadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4v16h10v-8h2v9c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h7v2h-6ZM19 6h3l-4 4L14 6h3v-4h2v4ZM13 18c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z"),
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
        return _mobileDownloadLine!!
    }

private var _mobileDownloadLine: ImageVector? = null
