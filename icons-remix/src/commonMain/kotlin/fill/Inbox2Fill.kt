package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Inbox2Fill: ImageVector
    get() {
        if (_inbox2Fill != null) return _inbox2Fill!!
        _inbox2Fill = remixIcon(
            name = "Inbox2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 C 4.531 3.000 4.125 3.326 4.024 3.783 L 2.024 12.783 C 2.008 12.854 2.000 12.927 2.000 13.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 13.000 C 22.000 12.927 21.992 12.854 21.976 12.783 L 19.976 3.783 C 19.875 3.326 19.469 3.000 19.000 3.000 L 5.000 3.000 ZM 19.753 12.000 L 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 L 4.247 12.000 L 5.802 5.000 L 18.198 5.000 L 19.753 12.000 Z"),
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
        return _inbox2Fill!!
    }

private var _inbox2Fill: ImageVector? = null
