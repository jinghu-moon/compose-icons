package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlibabaCloudFill: ImageVector
    get() {
        if (_alibabaCloudFill != null) return _alibabaCloudFill!!
        _alibabaCloudFill = remixIcon(
            name = "AlibabaCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.514 5.140 L 4.680 5.140 C 3.704 5.140 2.768 5.528 2.078 6.218 C 1.388 6.908 1.000 7.844 1.000 8.820 L 1.000 15.178 C 1.000 16.154 1.388 17.090 2.078 17.780 C 2.768 18.470 3.704 18.857 4.680 18.857 L 9.529 18.857 L 8.359 17.201 L 4.823 16.120 C 4.511 16.020 4.239 15.824 4.047 15.559 C 3.854 15.295 3.751 14.975 3.752 14.648 L 3.752 9.371 C 3.750 9.044 3.852 8.724 4.045 8.459 C 4.238 8.194 4.511 7.998 4.823 7.900 L 8.359 6.796 L 9.514 5.140 ZM 19.339 5.140 L 14.489 5.140 L 15.659 6.796 L 19.195 7.900 C 19.507 7.998 19.780 8.194 19.972 8.459 C 20.164 8.724 20.266 9.044 20.262 9.371 L 20.262 14.648 C 20.265 14.975 20.162 15.294 19.970 15.559 C 19.778 15.824 19.507 16.020 19.195 16.120 L 15.659 17.201 L 14.489 18.857 L 19.339 18.857 C 19.821 18.858 20.299 18.763 20.745 18.578 C 21.190 18.393 21.595 18.122 21.935 17.780 C 22.275 17.438 22.545 17.032 22.728 16.585 C 22.910 16.139 23.003 15.660 23.000 15.178 L 23.000 8.820 C 23.000 7.847 22.615 6.914 21.929 6.224 C 21.243 5.535 20.312 5.145 19.339 5.140 ZM 15.667 11.138 L 8.337 11.138 L 8.337 12.790 L 15.667 12.790 L 15.667 11.138 Z"),
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
        return _alibabaCloudFill!!
    }

private var _alibabaCloudFill: ImageVector? = null
