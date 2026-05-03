package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipCrown2Fill: ImageVector
    get() {
        if (_vipCrown2Fill != null) return _vipCrown2Fill!!
        _vipCrown2Fill = remixIcon(
            name = "VipCrown2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.806 5.200 L 7.005 8.000 L 11.191 2.139 C 11.512 1.689 12.137 1.585 12.586 1.906 C 12.676 1.970 12.755 2.049 12.819 2.139 L 17.005 8.000 L 21.204 5.200 C 21.664 4.894 22.285 5.018 22.591 5.477 C 22.723 5.675 22.780 5.913 22.752 6.149 L 21.109 20.116 C 21.050 20.620 20.623 21.000 20.116 21.000 L 3.894 21.000 C 3.387 21.000 2.960 20.620 2.901 20.116 L 1.258 6.149 C 1.193 5.600 1.586 5.103 2.134 5.039 C 2.370 5.011 2.608 5.068 2.806 5.200 ZM 12.005 15.000 C 13.110 15.000 14.005 14.104 14.005 13.000 C 14.005 11.895 13.110 11.000 12.005 11.000 C 10.901 11.000 10.005 11.895 10.005 13.000 C 10.005 14.104 10.901 15.000 12.005 15.000 Z"),
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
        return _vipCrown2Fill!!
    }

private var _vipCrown2Fill: ImageVector? = null
