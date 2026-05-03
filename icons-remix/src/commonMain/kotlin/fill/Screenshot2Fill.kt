package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Screenshot2Fill: ImageVector
    get() {
        if (_screenshot2Fill != null) return _screenshot2Fill!!
        _screenshot2Fill = remixIcon(
            name = "Screenshot2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 5.000 3.000 L 5.000 5.000 L 3.000 5.000 L 3.000 3.000 ZM 7.000 3.000 L 9.000 3.000 L 9.000 5.000 L 7.000 5.000 L 7.000 3.000 ZM 11.000 3.000 L 13.000 3.000 L 13.000 5.000 L 11.000 5.000 L 11.000 3.000 ZM 15.000 3.000 L 17.000 3.000 L 17.000 5.000 L 15.000 5.000 L 15.000 3.000 ZM 19.000 3.000 L 21.000 3.000 L 21.000 5.000 L 19.000 5.000 L 19.000 3.000 ZM 19.000 7.000 L 21.000 7.000 L 21.000 9.000 L 19.000 9.000 L 19.000 7.000 ZM 3.000 19.000 L 5.000 19.000 L 5.000 21.000 L 3.000 21.000 L 3.000 19.000 ZM 3.000 15.000 L 5.000 15.000 L 5.000 17.000 L 3.000 17.000 L 3.000 15.000 ZM 3.000 11.000 L 5.000 11.000 L 5.000 13.000 L 3.000 13.000 L 3.000 11.000 ZM 3.000 7.000 L 5.000 7.000 L 5.000 9.000 L 3.000 9.000 L 3.000 7.000 ZM 10.667 11.000 L 11.703 9.445 C 11.889 9.167 12.201 9.000 12.535 9.000 L 15.465 9.000 C 15.799 9.000 16.111 9.167 16.297 9.445 L 17.333 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 8.000 21.000 C 7.448 21.000 7.000 20.552 7.000 20.000 L 7.000 12.000 C 7.000 11.448 7.448 11.000 8.000 11.000 L 10.667 11.000 ZM 14.000 18.000 C 15.105 18.000 16.000 17.105 16.000 16.000 C 16.000 14.895 15.105 14.000 14.000 14.000 C 12.895 14.000 12.000 14.895 12.000 16.000 C 12.000 17.105 12.895 18.000 14.000 18.000 Z"),
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
        return _screenshot2Fill!!
    }

private var _screenshot2Fill: ImageVector? = null
