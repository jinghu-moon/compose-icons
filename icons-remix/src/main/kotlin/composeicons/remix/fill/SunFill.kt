package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SunFill: ImageVector
    get() {
        if (_sunFill != null) return _sunFill!!
        _sunFill = remixIcon(
            name = "SunFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM11 1h2v3h-2v-3ZM11 20h2v3h-2v-3ZM3.515 4.929 4.929 3.515 7.05 5.636 5.636 7.05 3.515 4.929ZM16.95 18.364l1.414-1.414 2.121 2.121-1.414 1.414L16.95 18.364ZM19.071 3.515l1.414 1.414L18.364 7.05 16.95 5.636 19.071 3.515ZM5.636 16.95l1.414 1.414L4.929 20.485 3.515 19.071 5.636 16.95ZM23 11v2h-3v-2h3ZM4 11v2h-3v-2h3Z"),
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
        return _sunFill!!
    }

private var _sunFill: ImageVector? = null
