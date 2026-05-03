package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VipCrownLine: ImageVector
    get() {
        if (_vipCrownLine != null) return _vipCrownLine!!
        _vipCrownLine = remixIcon(
            name = "VipCrownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.005 19.000 L 22.005 19.000 L 22.005 21.000 L 2.005 21.000 L 2.005 19.000 ZM 2.005 5.000 L 7.005 8.500 L 12.005 2.000 L 17.005 8.500 L 22.005 5.000 L 22.005 17.000 L 2.005 17.000 L 2.005 5.000 ZM 4.005 8.841 L 4.005 15.000 L 20.005 15.000 L 20.005 8.841 L 16.585 11.235 L 12.005 5.280 L 7.424 11.235 L 4.005 8.841 Z"),
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
        return _vipCrownLine!!
    }

private var _vipCrownLine: ImageVector? = null
