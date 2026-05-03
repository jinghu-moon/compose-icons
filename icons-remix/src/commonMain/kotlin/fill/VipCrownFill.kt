package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipCrownFill: ImageVector
    get() {
        if (_vipCrownFill != null) return _vipCrownFill!!
        _vipCrownFill = remixIcon(
            name = "VipCrownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.005 19.000 L 22.005 19.000 L 22.005 21.000 L 2.005 21.000 L 2.005 19.000 ZM 2.005 5.000 L 7.005 8.000 L 12.005 2.000 L 17.005 8.000 L 22.005 5.000 L 22.005 17.000 L 2.005 17.000 L 2.005 5.000 Z"),
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
        return _vipCrownFill!!
    }

private var _vipCrownFill: ImageVector? = null
