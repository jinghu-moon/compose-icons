package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SvelteLine: ImageVector
    get() {
        if (_svelteLine != null) return _svelteLine!!
        _svelteLine = remixIcon(
            name = "SvelteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.800 3.770 C 17.945 0.859 14.082 0.003 11.171 1.857 L 6.110 5.081 C 3.231 6.915 2.362 10.714 4.137 13.613 C 2.935 15.585 2.876 18.150 4.201 20.230 C 6.055 23.141 9.919 23.997 12.830 22.143 L 17.890 18.919 C 20.769 17.085 21.639 13.286 19.864 10.387 C 21.066 8.415 21.125 5.851 19.800 3.770 ZM 18.448 8.774 C 17.628 8.115 16.663 7.683 15.651 7.499 C 15.688 7.265 15.644 7.017 15.507 6.802 C 15.210 6.336 14.592 6.199 14.126 6.496 L 9.066 9.720 C 8.600 10.017 8.463 10.635 8.759 11.100 C 9.056 11.566 9.674 11.703 10.140 11.406 L 12.249 10.063 C 14.228 8.802 16.855 9.385 18.117 11.364 C 19.378 13.344 18.795 15.971 16.816 17.232 L 11.755 20.456 C 9.776 21.717 7.149 21.135 5.887 19.155 C 5.110 17.935 5.033 16.467 5.553 15.226 C 6.373 15.885 7.338 16.317 8.350 16.501 C 8.313 16.735 8.357 16.983 8.494 17.198 C 8.791 17.664 9.409 17.801 9.875 17.504 L 14.935 14.280 C 15.401 13.983 15.538 13.365 15.241 12.899 C 14.944 12.434 14.326 12.297 13.861 12.593 L 11.752 13.937 C 9.772 15.198 7.145 14.615 5.884 12.636 C 4.623 10.656 5.205 8.029 7.185 6.768 L 12.245 3.544 C 14.225 2.283 16.852 2.865 18.113 4.845 C 18.891 6.065 18.968 7.532 18.448 8.774 Z"),
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
        return _svelteLine!!
    }

private var _svelteLine: ImageVector? = null
