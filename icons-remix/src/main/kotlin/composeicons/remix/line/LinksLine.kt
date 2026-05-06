package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinksLine: ImageVector
    get() {
        if (_linksLine != null) return _linksLine!!
        _linksLine = remixIcon(
            name = "LinksLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.061 8.111l1.414 1.414c2.734 2.734 2.734 7.166 0 9.9l-.354 .354c-2.734 2.734-7.166 2.734-9.9 0C1.488 17.045 1.488 12.612 4.222 9.879l1.414 1.414c-1.953 1.953-1.953 5.118 0 7.071 1.953 1.953 5.118 1.953 7.071 0l.354-.354c1.953-1.953 1.953-5.118 0-7.071L11.646 9.525 13.061 8.111ZM19.778 14.121 18.364 12.707c1.953-1.953 1.953-5.118 0-7.071-1.953-1.953-5.118-1.953-7.071 0l-.354 .354c-1.953 1.953-1.953 5.118 0 7.071l1.414 1.414-1.414 1.414L9.525 14.475C6.792 11.741 6.792 7.309 9.525 4.575l.354-.354c2.734-2.734 7.166-2.734 9.899 0 2.734 2.734 2.734 7.166 0 9.9Z"),
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
        return _linksLine!!
    }

private var _linksLine: ImageVector? = null
