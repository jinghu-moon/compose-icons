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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 4.000 L 7.000 20.000 L 17.000 20.000 L 17.000 12.000 L 19.000 12.000 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 13.000 2.000 L 13.000 4.000 L 7.000 4.000 ZM 19.000 6.000 L 22.000 6.000 L 18.000 10.000 L 14.000 6.000 L 17.000 6.000 L 17.000 2.000 L 19.000 2.000 L 19.000 6.000 ZM 13.000 18.000 C 13.000 18.552 12.552 19.000 12.000 19.000 C 11.448 19.000 11.000 18.552 11.000 18.000 C 11.000 17.448 11.448 17.000 12.000 17.000 C 12.552 17.000 13.000 17.448 13.000 18.000 Z"),
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
        return _mobileDownloadLine!!
    }

private var _mobileDownloadLine: ImageVector? = null
