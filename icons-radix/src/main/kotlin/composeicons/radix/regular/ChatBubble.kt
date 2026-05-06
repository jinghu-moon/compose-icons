package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChatBubble: ImageVector
    get() {
        if (_chatBubble != null) return _chatBubble!!
        _chatBubble = radixIcon(
            name = "ChatBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.756 2.013C14.016 2.141 15 3.206 15 4.5v5c0 1.294-.984 2.359-2.244 2.487L12.5 12h-1.5v2.5c0 .202-.122 .384-.309 .462-.187 .077-.402 .035-.545-.108L7.293 12h-4.793C1.119 12 0 10.881 0 9.5v-5C0 3.119 1.119 2 2.5 2h10l.256 .013ZM2.5 3C1.672 3 1 3.672 1 4.5v5C1 10.328 1.672 11 2.5 11h5l.098 .01c.096 .019 .185 .066 .256 .137L10 13.293v-1.793c0-.276 .224-.5 .5-.5h2l.153-.008C13.41 10.915 14 10.277 14 9.5v-5l-.008-.153C13.92 3.641 13.359 3.079 12.653 3.008L12.5 3h-10Z"),
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
        return _chatBubble!!
    }

private var _chatBubble: ImageVector? = null
