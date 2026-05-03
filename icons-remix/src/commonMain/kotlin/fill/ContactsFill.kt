package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsFill: ImageVector
    get() {
        if (_contactsFill != null) return _contactsFill!!
        _contactsFill = remixIcon(
            name = "ContactsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 C 2.000 17.582 5.582 14.000 10.000 14.000 C 14.418 14.000 18.000 17.582 18.000 22.000 L 2.000 22.000 ZM 10.000 13.000 C 6.685 13.000 4.000 10.315 4.000 7.000 C 4.000 3.685 6.685 1.000 10.000 1.000 C 13.315 1.000 16.000 3.685 16.000 7.000 C 16.000 10.315 13.315 13.000 10.000 13.000 ZM 20.000 17.000 L 24.000 17.000 L 24.000 19.000 L 20.000 19.000 L 20.000 17.000 ZM 17.000 12.000 L 24.000 12.000 L 24.000 14.000 L 17.000 14.000 L 17.000 12.000 ZM 19.000 7.000 L 24.000 7.000 L 24.000 9.000 L 19.000 9.000 L 19.000 7.000 Z"),
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
        return _contactsFill!!
    }

private var _contactsFill: ImageVector? = null
