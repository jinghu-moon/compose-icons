package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.HobbyKnife: ImageVector
    get() {
        if (_hobbyKnife != null) return _hobbyKnife!!
        _hobbyKnife = radixIcon(
            name = "HobbyKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.225 13.918c.194 .128 .458 .106 .629-.064l1.5-1.5 .064-.078c.11-.166 .11-.385 0-.551l-.064-.078L8.604 5.897C8.573 5.865 8.537 5.841 8.5 5.819v-.319c0-.141-.06-.275-.164-.37L2.936 .23C2.767 .076 2.515 .057 2.325 .183 2.134 .309 2.052 .549 2.127 .765L4.528 7.664l.031 .072c.086 .161 .255 .264 .441 .264h1.318c.021 .037 .047 .072 .078 .104l5.75 5.75 .078 .064ZM3.716 2.289 7.5 5.722v.071L6.293 7h-.938L3.716 2.289ZM7.457 7.75l.793-.793L13.293 12l-.793 .793L7.457 7.75Z"),
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
        return _hobbyKnife!!
    }

private var _hobbyKnife: ImageVector? = null
