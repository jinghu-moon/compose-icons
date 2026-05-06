package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InstanceFill: ImageVector
    get() {
        if (_instanceFill != null) return _instanceFill!!
        _instanceFill = remixIcon(
            name = "InstanceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1l9.5 5.5v11L12 23 2.5 17.5v-11L12 1ZM6.499 9.971 11 12.577v5.048h2v-5.048L17.501 9.971 16.499 8.24 12 10.845 7.501 8.24 6.499 9.971Z"),
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
        return _instanceFill!!
    }

private var _instanceFill: ImageVector? = null
