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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 6.000 C 12.000 4.463 12.578 3.062 13.528 2.000 L 6.000 2.000 C 5.448 2.000 5.000 2.448 5.000 3.000 L 5.000 21.000 C 5.000 21.552 5.448 22.000 6.000 22.000 L 18.000 22.000 C 18.552 22.000 19.000 21.552 19.000 21.000 L 19.000 11.917 C 18.675 11.972 18.341 12.000 18.000 12.000 C 14.686 12.000 12.000 9.314 12.000 6.000 ZM 12.000 17.000 C 12.552 17.000 13.000 17.448 13.000 18.000 C 13.000 18.552 12.552 19.000 12.000 19.000 C 11.448 19.000 11.000 18.552 11.000 18.000 C 11.000 17.448 11.448 17.000 12.000 17.000 ZM 22.000 6.000 L 19.000 6.000 L 19.000 2.000 L 17.000 2.000 L 17.000 6.000 L 14.000 6.000 L 18.000 10.000 L 22.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mobileDownloadFill!!
    }

private var _mobileDownloadFill: ImageVector? = null
