package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandSanitizerLine: ImageVector
    get() {
        if (_handSanitizerLine != null) return _handSanitizerLine!!
        _handSanitizerLine = remixIcon(
            name = "HandSanitizerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2v2l-4-.001v2.001h3v2c2.209 0 4 1.791 4 4v8c0 1.105-.895 2-2 2h-12c-1.105 0-2-.895-2-2v-8C4 9.791 5.791 8 8 8v-2h3v-2.001L7.5 4C6.87 4 6.13 4.49 5.3 5.6L3.7 4.4C4.87 2.84 6.13 2 7.5 2h9.5ZM16 10h-8c-1.105 0-2 .895-2 2v8h12v-8c0-1.105-.895-2-2-2ZM13 12v2h2v2h-2.001l.001 2h-2l-.001-2h-1.999v-2h2v-2h2Z"),
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
        return _handSanitizerLine!!
    }

private var _handSanitizerLine: ImageVector? = null
