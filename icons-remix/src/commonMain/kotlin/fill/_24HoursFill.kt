package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill._24HoursFill: ImageVector
    get() {
        if (__24HoursFill != null) return __24HoursFill!!
        __24HoursFill = remixIcon(
            name = "_24HoursFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.005 13.003 C 13.662 13.003 15.005 14.346 15.005 16.003 C 15.005 16.852 14.652 17.619 14.085 18.164 L 12.175 20.002 L 15.005 20.003 L 15.005 22.003 L 9.005 22.003 L 9.004 20.278 L 12.698 16.723 C 12.887 16.541 13.005 16.286 13.005 16.003 C 13.005 15.450 12.557 15.003 12.005 15.003 C 11.453 15.003 11.005 15.450 11.005 16.003 L 9.005 16.003 C 9.005 14.346 10.348 13.003 12.005 13.003 ZM 18.005 13.003 L 18.005 17.003 L 20.005 17.003 L 20.005 13.003 L 22.005 13.003 L 22.005 22.003 L 20.005 22.003 L 20.005 19.003 L 16.005 19.003 L 16.005 13.003 L 18.005 13.003 ZM 4.005 12.003 C 4.005 14.529 5.176 16.782 7.005 18.249 L 7.005 20.665 C 4.016 18.936 2.005 15.704 2.005 12.003 L 4.005 12.003 ZM 12.005 2.003 C 17.190 2.003 21.454 5.949 21.955 11.003 L 19.943 11.003 C 19.451 7.057 16.084 4.003 12.005 4.003 C 9.541 4.003 7.337 5.117 5.870 6.868 L 8.005 9.003 L 2.005 9.003 L 2.005 3.003 L 4.451 5.449 C 6.285 3.338 8.989 2.003 12.005 2.003 Z"),
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
        return __24HoursFill!!
    }

private var __24HoursFill: ImageVector? = null
