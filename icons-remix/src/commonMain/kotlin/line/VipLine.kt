package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VipLine: ImageVector
    get() {
        if (_vipLine != null) return _vipLine!!
        _vipLine = remixIcon(
            name = "VipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.005 19.000 L 22.005 19.000 L 22.005 21.000 L 2.005 21.000 L 2.005 19.000 ZM 11.005 8.000 L 13.005 8.000 L 13.005 16.000 L 11.005 16.000 L 11.005 8.000 ZM 7.970 8.000 L 6.109 13.113 L 4.248 8.000 L 2.123 8.000 L 5.109 15.964 L 7.109 15.964 L 10.095 8.000 L 7.970 8.000 ZM 17.005 14.000 L 17.005 16.000 L 15.005 16.000 L 15.005 8.000 L 19.005 8.000 C 20.662 8.000 22.005 9.343 22.005 11.000 C 22.005 12.657 20.662 14.000 19.005 14.000 L 17.005 14.000 ZM 17.005 10.000 L 17.005 12.000 L 19.005 12.000 C 19.557 12.000 20.005 11.552 20.005 11.000 C 20.005 10.448 19.557 10.000 19.005 10.000 L 17.005 10.000 ZM 2.005 3.000 L 22.005 3.000 L 22.005 5.000 L 2.005 5.000 L 2.005 3.000 Z"),
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
        return _vipLine!!
    }

private var _vipLine: ImageVector? = null
