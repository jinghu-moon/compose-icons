package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CookieLine: ImageVector
    get() {
        if (_cookieLine != null) return _cookieLine!!
        _cookieLine = remixIcon(
            name = "CookieLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.163 10.971 C 21.513 10.820 21.958 11.007 21.981 11.387 C 22.149 14.147 21.179 16.962 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 C 7.037 2.821 9.852 1.850 12.611 2.018 C 12.992 2.041 13.179 2.486 13.028 2.836 C 12.477 4.114 12.724 5.653 13.768 6.697 C 14.331 7.260 15.038 7.590 15.771 7.688 C 16.048 7.726 16.274 7.951 16.311 8.229 C 16.410 8.962 16.740 9.669 17.303 10.232 C 18.347 11.276 19.886 11.522 21.163 10.971 ZM 19.785 13.840 C 19.856 13.536 19.612 13.260 19.302 13.234 C 18.057 13.127 16.842 12.599 15.889 11.646 C 15.317 11.074 14.898 10.406 14.631 9.695 C 14.574 9.544 14.456 9.425 14.305 9.369 C 13.594 9.102 12.926 8.683 12.354 8.111 C 11.401 7.158 10.872 5.942 10.765 4.697 C 10.738 4.386 10.462 4.143 10.159 4.214 C 8.760 4.543 7.433 5.253 6.343 6.343 C 3.219 9.467 3.219 14.533 6.343 17.657 C 9.467 20.781 14.533 20.781 17.657 17.657 C 18.747 16.566 19.456 15.238 19.785 13.840 ZM 9.879 14.121 C 10.464 14.707 10.464 15.657 9.879 16.243 C 9.293 16.828 8.343 16.828 7.757 16.243 C 7.171 15.657 7.171 14.707 7.757 14.121 C 8.343 13.535 9.293 13.535 9.879 14.121 ZM 10.232 8.111 C 10.818 8.697 10.818 9.646 10.232 10.232 C 9.646 10.818 8.697 10.818 8.111 10.232 C 7.525 9.646 7.525 8.697 8.111 8.111 C 8.697 7.525 9.646 7.525 10.232 8.111 ZM 15.889 13.768 C 16.475 14.353 16.475 15.303 15.889 15.889 C 15.303 16.475 14.354 16.475 13.768 15.889 C 13.182 15.303 13.182 14.353 13.768 13.768 C 14.354 13.182 15.303 13.182 15.889 13.768 Z"),
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
        return _cookieLine!!
    }

private var _cookieLine: ImageVector? = null
