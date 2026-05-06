package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignpostFill: ImageVector
    get() {
        if (_signpostFill != null) return _signpostFill!!
        _signpostFill = remixIcon(
            name = "SignpostFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 5v-3h-2v3h-6C3.448 5 3 5.448 3 6v8c0 .552 .448 1 1 1h13.414l4.293-4.293c.391-.391 .391-1.024 0-1.414L17.414 5h-5.414ZM12 17h-2v5h2v-5Z"),
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
        return _signpostFill!!
    }

private var _signpostFill: ImageVector? = null
