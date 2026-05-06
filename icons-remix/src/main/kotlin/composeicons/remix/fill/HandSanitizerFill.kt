package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandSanitizerFill: ImageVector
    get() {
        if (_handSanitizerFill != null) return _handSanitizerFill!!
        _handSanitizerFill = remixIcon(
            name = "HandSanitizerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2v2l-4-.001v2.001h3v2c2.209 0 4 1.791 4 4v8c0 1.105-.895 2-2 2h-12c-1.105 0-2-.895-2-2v-8C4 9.791 5.791 8 8 8v-2h3v-2.001L7.5 4C6.87 4 6.13 4.49 5.3 5.6L3.7 4.4C4.87 2.84 6.13 2 7.5 2h9.5ZM13 12h-2v2h-2v2h1.999l.001 2h2l-.001-2h2.001v-2h-2v-2Z"),
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
        return _handSanitizerFill!!
    }

private var _handSanitizerFill: ImageVector? = null
