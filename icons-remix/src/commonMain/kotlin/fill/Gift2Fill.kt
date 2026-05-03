package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Gift2Fill: ImageVector
    get() {
        if (_gift2Fill != null) return _gift2Fill!!
        _gift2Fill = remixIcon(
            name = "Gift2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.005 13.003 L 20.005 20.003 C 20.005 20.555 19.557 21.003 19.005 21.003 L 5.005 21.003 C 4.453 21.003 4.005 20.555 4.005 20.003 L 4.005 13.003 L 20.005 13.003 ZM 14.505 2.003 C 16.438 2.003 18.005 3.570 18.005 5.503 C 18.005 6.040 17.884 6.549 17.668 7.004 L 21.005 7.003 C 21.557 7.003 22.005 7.451 22.005 8.003 L 22.005 11.003 C 22.005 11.555 21.557 12.003 21.005 12.003 L 3.005 12.003 C 2.453 12.003 2.005 11.555 2.005 11.003 L 2.005 8.003 C 2.005 7.451 2.453 7.003 3.005 7.003 L 6.342 7.004 C 6.126 6.549 6.005 6.040 6.005 5.503 C 6.005 3.570 7.572 2.003 9.505 2.003 C 10.485 2.003 11.371 2.406 12.006 3.055 C 12.639 2.406 13.525 2.003 14.505 2.003 ZM 9.505 4.003 C 8.676 4.003 8.005 4.674 8.005 5.503 C 8.005 6.282 8.600 6.923 9.360 6.996 L 9.505 7.003 L 11.005 7.003 L 11.005 5.503 C 11.005 4.723 10.410 4.082 9.649 4.010 L 9.505 4.003 ZM 14.505 4.003 L 14.360 4.010 C 13.647 4.078 13.080 4.645 13.012 5.358 L 13.005 5.503 L 13.005 7.003 L 14.505 7.003 L 14.649 6.996 C 15.410 6.923 16.005 6.282 16.005 5.503 C 16.005 4.723 15.410 4.082 14.649 4.010 L 14.505 4.003 Z"),
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
        return _gift2Fill!!
    }

private var _gift2Fill: ImageVector? = null
