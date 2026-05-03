package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilFill: ImageVector
    get() {
        if (_pencilFill != null) return _pencilFill!!
        _pencilFill = remixIcon(
            name = "PencilFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.899 6.855 L 17.142 11.097 L 7.243 20.997 L 3.000 20.997 L 3.000 16.754 L 12.899 6.855 ZM 14.314 5.440 L 16.435 3.319 C 16.826 2.928 17.459 2.928 17.849 3.319 L 20.678 6.147 C 21.068 6.538 21.068 7.171 20.678 7.562 L 18.556 9.683 L 14.314 5.440 Z"),
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
        return _pencilFill!!
    }

private var _pencilFill: ImageVector? = null
