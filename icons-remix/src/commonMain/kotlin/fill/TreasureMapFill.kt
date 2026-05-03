package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TreasureMapFill: ImageVector
    get() {
        if (_treasureMapFill != null) return _treasureMapFill!!
        _treasureMapFill = remixIcon(
            name = "TreasureMapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 5.000 L 9.000 2.000 L 15.000 5.000 L 21.303 2.299 C 21.557 2.190 21.851 2.307 21.960 2.561 C 21.986 2.624 22.000 2.691 22.000 2.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 5.000 ZM 6.000 11.000 L 6.000 13.000 L 8.000 13.000 L 8.000 11.000 L 6.000 11.000 ZM 10.000 11.000 L 10.000 13.000 L 12.000 13.000 L 12.000 11.000 L 10.000 11.000 ZM 16.000 10.939 L 14.763 9.702 L 13.702 10.763 L 14.939 12.000 L 13.702 13.237 L 14.763 14.298 L 16.000 13.061 L 17.237 14.298 L 18.298 13.237 L 17.061 12.000 L 18.298 10.763 L 17.237 9.702 L 16.000 10.939 Z"),
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
        return _treasureMapFill!!
    }

private var _treasureMapFill: ImageVector? = null
