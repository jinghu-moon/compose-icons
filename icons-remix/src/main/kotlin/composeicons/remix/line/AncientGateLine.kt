package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AncientGateLine: ImageVector
    get() {
        if (_ancientGateLine != null) return _ancientGateLine!!
        _ancientGateLine = remixIcon(
            name = "AncientGateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.964 3h10.072c.249 1.722 1.724 3 3.464 3 .332 0 .663-.047 .981-.14C21.297 7.644 19.794 9 18 9h-12C4.206 9 2.703 7.644 2.518 5.86 2.837 5.953 3.168 6 3.5 6 5.24 6 6.716 4.722 6.964 3ZM16.899 6.658C16.339 6.172 15.902 5.62 15.588 5h-7.176C8.098 5.62 7.661 6.172 7.101 6.658 6.959 6.78 6.814 6.894 6.667 7h10.666c-.148-.106-.292-.22-.434-.342ZM21.5 11.5c.538 0 1.042-.141 1.479-.389 .014 .128 .021 .258 .021 .389 0 1.396-.817 2.601-2 3.163v6.336h-7v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2h-7v-6.336C1.818 14.102 1 12.897 1 11.5c0-.131 .007-.261 .021-.389 .436 .248 .941 .389 1.479 .389 1.11 0 2.08-.603 2.599-1.5h13.803c.519 .897 1.488 1.5 2.599 1.5ZM18.963 12.81c-.388-.229-.734-.498-1.038-.809h-11.85c-.304 .311-.65 .581-1.038 .809-.203 .12-.41 .224-.622 .312L5 13.4v5.6h3c0-1.105 .391-2.047 1.172-2.828C9.953 15.391 10.895 15 12 15c1.105 0 2.047 .391 2.828 1.172C15.609 16.953 16 17.895 16 19h3v-5.6l.585-.278c-.212-.089-.419-.193-.622-.312Z"),
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
        return _ancientGateLine!!
    }

private var _ancientGateLine: ImageVector? = null
