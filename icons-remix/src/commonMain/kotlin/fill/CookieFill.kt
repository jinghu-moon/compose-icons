package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CookieFill: ImageVector
    get() {
        if (_cookieFill != null) return _cookieFill!!
        _cookieFill = remixIcon(
            name = "CookieFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 4.929 C 7.037 2.821 9.852 1.850 12.611 2.018 C 12.991 2.041 13.178 2.486 13.027 2.835 C 12.477 4.113 12.724 5.653 13.768 6.697 C 14.331 7.260 15.038 7.590 15.770 7.689 C 16.048 7.726 16.274 7.952 16.311 8.229 C 16.410 8.962 16.740 9.669 17.303 10.232 C 18.347 11.276 19.885 11.522 21.163 10.971 C 21.513 10.821 21.958 11.007 21.981 11.388 C 22.149 14.147 21.179 16.962 19.070 19.071 C 15.165 22.976 8.834 22.976 4.929 19.071 C 1.024 15.165 1.024 8.834 4.929 4.929 ZM 9.878 14.121 C 9.292 13.536 8.343 13.536 7.757 14.121 C 7.172 14.707 7.171 15.657 7.757 16.243 C 8.343 16.828 9.292 16.828 9.878 16.243 C 10.464 15.657 10.464 14.707 9.878 14.121 ZM 15.889 13.768 C 15.303 13.182 14.354 13.182 13.768 13.768 C 13.182 14.354 13.182 15.303 13.768 15.889 C 14.354 16.475 15.303 16.475 15.889 15.889 C 16.474 15.303 16.475 14.354 15.889 13.768 ZM 10.232 8.111 C 9.646 7.525 8.696 7.525 8.111 8.111 C 7.525 8.696 7.525 9.646 8.111 10.232 C 8.696 10.818 9.646 10.818 10.232 10.232 C 10.817 9.646 10.817 8.696 10.232 8.111 Z"),
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
        return _cookieFill!!
    }

private var _cookieFill: ImageVector? = null
