package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Key2Fill: ImageVector
    get() {
        if (_key2Fill != null) return _key2Fill!!
        _key2Fill = remixIcon(
            name = "Key2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.313 11.566 L 18.253 3.626 L 20.374 5.747 L 18.960 7.161 L 21.081 9.282 L 17.546 12.818 L 15.425 10.697 L 12.434 13.687 C 13.418 15.572 13.119 17.952 11.535 19.535 C 9.583 21.488 6.417 21.488 4.464 19.535 C 2.512 17.583 2.512 14.417 4.464 12.464 C 6.048 10.881 8.428 10.582 10.313 11.566 ZM 9.414 17.414 C 10.195 16.633 10.195 15.367 9.414 14.586 C 8.633 13.805 7.367 13.805 6.586 14.586 C 5.805 15.367 5.805 16.633 6.586 17.414 C 7.367 18.195 8.633 18.195 9.414 17.414 Z"),
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
        return _key2Fill!!
    }

private var _key2Fill: ImageVector? = null
