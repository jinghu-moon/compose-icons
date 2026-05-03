package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SeoLine: ImageVector
    get() {
        if (_seoLine != null) return _seoLine!!
        _seoLine = remixIcon(
            name = "SeoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 C 4.134 3.000 1.000 6.134 1.000 10.000 C 1.000 13.866 4.134 17.000 8.000 17.000 L 9.071 17.000 C 9.024 16.673 9.000 16.340 9.000 16.000 C 9.000 15.660 9.024 15.327 9.071 15.000 L 8.000 15.000 C 5.239 15.000 3.000 12.761 3.000 10.000 C 3.000 7.239 5.239 5.000 8.000 5.000 L 16.000 5.000 C 18.761 5.000 21.000 7.239 21.000 10.000 C 21.000 10.343 20.965 10.677 20.900 11.001 C 21.485 11.575 21.970 12.251 22.326 13.000 C 22.758 12.091 23.000 11.074 23.000 10.000 C 23.000 6.134 19.866 3.000 16.000 3.000 L 8.000 3.000 ZM 16.000 13.000 C 14.343 13.000 13.000 14.343 13.000 16.000 C 13.000 17.657 14.343 19.000 16.000 19.000 C 17.657 19.000 19.000 17.657 19.000 16.000 C 19.000 14.343 17.657 13.000 16.000 13.000 ZM 11.000 16.000 C 11.000 13.239 13.239 11.000 16.000 11.000 C 18.761 11.000 21.000 13.239 21.000 16.000 C 21.000 17.019 20.695 17.967 20.172 18.757 L 22.707 21.293 L 21.293 22.707 L 18.757 20.172 C 17.967 20.695 17.019 21.000 16.000 21.000 C 13.239 21.000 11.000 18.761 11.000 16.000 Z"),
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
        return _seoLine!!
    }

private var _seoLine: ImageVector? = null
