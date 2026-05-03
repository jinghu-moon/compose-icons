package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FirefoxFill: ImageVector
    get() {
        if (_firefoxFill != null) return _firefoxFill!!
        _firefoxFill = remixIcon(
            name = "FirefoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 10.536 2.315 9.146 2.880 7.894 C 3.347 6.955 4.114 6.020 4.731 5.700 C 4.078 6.983 3.758 8.241 3.690 9.083 C 4.145 7.583 5.006 6.326 6.211 5.439 C 8.277 3.920 11.059 3.852 12.167 4.820 C 10.111 5.526 7.871 8.367 8.364 11.695 C 8.444 12.245 8.609 12.778 8.853 13.277 C 8.469 12.266 8.435 10.844 9.055 9.919 C 9.747 8.889 10.733 8.671 11.261 8.783 C 11.053 8.739 10.593 9.619 10.525 9.774 C 10.352 10.168 10.266 10.594 10.274 11.024 C 10.289 11.922 10.659 12.778 11.304 13.403 C 13.226 15.275 16.327 14.539 17.715 12.402 C 18.669 10.931 18.785 8.434 17.561 6.450 C 17.255 5.967 16.891 5.523 16.477 5.129 C 14.626 3.364 11.998 2.561 9.495 2.925 C 8.389 3.102 7.448 3.421 6.671 3.881 C 7.756 2.798 9.912 2.000 12.001 2.000 Z"),
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
        return _firefoxFill!!
    }

private var _firefoxFill: ImageVector? = null
