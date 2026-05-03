package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipFill: ImageVector
    get() {
        if (_vipFill != null) return _vipFill!!
        _vipFill = remixIcon(
            name = "VipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.448 22.005 4.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.448 2.453 3.000 3.005 3.000 ZM 11.005 8.500 L 11.005 15.500 L 13.005 15.500 L 13.005 8.500 L 11.005 8.500 ZM 10.720 8.500 L 8.606 8.500 L 7.109 12.613 L 5.612 8.500 L 3.498 8.500 L 6.109 15.464 L 8.109 15.464 L 10.720 8.500 ZM 16.005 13.500 L 17.505 13.500 C 18.886 13.500 20.005 12.381 20.005 11.000 C 20.005 9.619 18.886 8.500 17.505 8.500 L 14.005 8.500 L 14.005 15.500 L 16.005 15.500 L 16.005 13.500 ZM 16.005 11.500 L 16.005 10.500 L 17.505 10.500 C 17.781 10.500 18.005 10.724 18.005 11.000 C 18.005 11.276 17.781 11.500 17.505 11.500 L 16.005 11.500 Z"),
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
        return _vipFill!!
    }

private var _vipFill: ImageVector? = null
