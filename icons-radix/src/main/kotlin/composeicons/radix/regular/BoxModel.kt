package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BoxModel: ImageVector
    get() {
        if (_boxModel != null) return _boxModel!!
        _boxModel = radixIcon(
            name = "BoxModel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 1c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-11C1.448 14 1 13.552 1 13v-11C1 1.448 1.448 1 2 1h11ZM2 13h11v-11h-11v11ZM10.601 4.01c.228 .047 .399 .249 .399 .49v6c0 .276-.224 .5-.5 .5h-6C4.224 11 4 10.776 4 10.5v-6l.01-.101C4.056 4.171 4.258 4 4.5 4h6l.101 .01ZM5 10h5v-5h-5v5Z"),
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
        return _boxModel!!
    }

private var _boxModel: ImageVector? = null
