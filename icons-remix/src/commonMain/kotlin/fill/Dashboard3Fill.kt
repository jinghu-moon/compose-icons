package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dashboard3Fill: ImageVector
    get() {
        if (_dashboard3Fill != null) return _dashboard3Fill!!
        _dashboard3Fill = remixIcon(
            name = "Dashboard3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 16.596 7.404 C 16.392 7.199 16.070 7.171 15.833 7.337 C 12.944 9.365 11.313 10.566 10.939 10.939 C 10.354 11.525 10.354 12.475 10.939 13.061 C 11.525 13.646 12.475 13.646 13.061 13.061 C 13.280 12.842 14.479 11.210 16.659 8.164 C 16.827 7.930 16.800 7.608 16.596 7.404 ZM 17.500 11.000 C 16.948 11.000 16.500 11.448 16.500 12.000 C 16.500 12.552 16.948 13.000 17.500 13.000 C 18.052 13.000 18.500 12.552 18.500 12.000 C 18.500 11.448 18.052 11.000 17.500 11.000 ZM 6.500 11.000 C 5.948 11.000 5.500 11.448 5.500 12.000 C 5.500 12.552 5.948 13.000 6.500 13.000 C 7.052 13.000 7.500 12.552 7.500 12.000 C 7.500 11.448 7.052 11.000 6.500 11.000 ZM 8.818 7.404 C 8.427 7.013 7.794 7.013 7.404 7.404 C 7.013 7.794 7.013 8.427 7.404 8.818 C 7.794 9.209 8.427 9.209 8.818 8.818 C 9.209 8.427 9.209 7.794 8.818 7.404 ZM 12.000 5.500 C 11.448 5.500 11.000 5.948 11.000 6.500 C 11.000 7.052 11.448 7.500 12.000 7.500 C 12.552 7.500 13.000 7.052 13.000 6.500 C 13.000 5.948 12.552 5.500 12.000 5.500 Z"),
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
        return _dashboard3Fill!!
    }

private var _dashboard3Fill: ImageVector? = null
