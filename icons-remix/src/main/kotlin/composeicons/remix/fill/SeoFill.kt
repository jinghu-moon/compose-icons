package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SeoFill: ImageVector
    get() {
        if (_seoFill != null) return _seoFill!!
        _seoFill = remixIcon(
            name = "SeoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3C4.134 3 1 6.134 1 10c0 3.866 3.134 7 7 7h1.071C9.024 16.673 9 16.34 9 16c0-.34 .024-.673 .071-1h-1.071C5.239 15 3 12.761 3 10 3 7.239 5.239 5 8 5h8c2.761 0 5 2.239 5 5 0 .343-.035 .677-.1 1.001 .586 .574 1.071 1.25 1.427 1.999 .432-.909 .674-1.926 .674-3C23 6.134 19.866 3 16 3h-8ZM11 16c0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 1.019-.305 1.967-.828 2.757l2.535 2.535-1.414 1.414L18.757 20.172C17.967 20.695 17.019 21 16 21c-2.761 0-5-2.239-5-5Z"),
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
        return _seoFill!!
    }

private var _seoFill: ImageVector? = null
