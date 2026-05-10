package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SyringeFill: ImageVector
    get() {
        if (_syringeFill != null) return _syringeFill!!
        _syringeFill = remixIcon(
            name = "SyringeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.678 7.979 20.264 9.393 18.142 7.272 16.021 9.393l3.536 3.536-1.414 1.414-.707-.707L11.071 20h-5.657L3.293 22.121 1.879 20.707 4 18.586v-5.657L10.364 6.565 9.657 5.858 11.071 4.444l3.536 3.536L16.728 5.858 14.607 3.737 16.021 2.322l5.657 5.657ZM9.657 14.343 6.829 11.515 5.414 12.929l2.828 2.828L9.657 14.343ZM12.486 11.515 9.657 8.686 8.243 10.101l2.828 2.828 1.414-1.414Z"),
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
        return _syringeFill!!
    }

private var _syringeFill: ImageVector? = null
