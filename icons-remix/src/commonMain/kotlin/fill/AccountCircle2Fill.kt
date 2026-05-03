package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccountCircle2Fill: ImageVector
    get() {
        if (_accountCircle2Fill != null) return _accountCircle2Fill!!
        _accountCircle2Fill = remixIcon(
            name = "AccountCircle2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 12.000 8.000 C 12.552 8.000 13.000 8.448 13.000 9.000 C 13.000 9.552 12.552 10.000 12.000 10.000 C 11.448 10.000 11.000 9.552 11.000 9.000 C 11.000 8.448 11.448 8.000 12.000 8.000 ZM 12.000 12.000 C 13.657 12.000 15.000 10.657 15.000 9.000 C 15.000 7.343 13.657 6.000 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000 C 9.000 10.657 10.343 12.000 12.000 12.000 ZM 12.000 15.000 C 13.105 15.000 14.000 15.895 14.000 17.000 L 16.000 17.000 C 16.000 14.791 14.209 13.000 12.000 13.000 C 9.791 13.000 8.000 14.791 8.000 17.000 L 10.000 17.000 C 10.000 15.895 10.895 15.000 12.000 15.000 Z"),
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
        return _accountCircle2Fill!!
    }

private var _accountCircle2Fill: ImageVector? = null
