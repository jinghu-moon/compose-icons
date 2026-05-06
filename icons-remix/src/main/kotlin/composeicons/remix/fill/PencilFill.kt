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
                pathData = parseSvgPathData("M12.899 6.855l4.243 4.243L7.243 20.997h-4.243v-4.243L12.899 6.855ZM14.314 5.44 16.435 3.319c.391-.391 1.024-.391 1.414 0l2.829 2.828c.39 .391 .39 1.024 0 1.414L18.556 9.683 14.314 5.44Z"),
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
