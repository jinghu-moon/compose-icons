package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FirebaseFill: ImageVector
    get() {
        if (_firebaseFill != null) return _firebaseFill!!
        _firebaseFill = remixIcon(
            name = "FirebaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.757 1.501 4 18.5h0L9.473 4.816 7.695 1.353C7.474 .924 6.834 1.025 6.757 1.501ZM11.564 4.318 4 18.5l0 0L13.84 6.949 12.441 4.327c-.187-.35-.685-.353-.877-.009ZM10.94 22.837 4 18.5 17.31 5.665c.294-.27 .773-.103 .832 .295L20 18.5l-6.94 4.337c-.649 .405-1.472 .405-2.12 0Z"),
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
        return _firebaseFill!!
    }

private var _firebaseFill: ImageVector? = null
