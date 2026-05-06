package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BubbleText: ImageVector
    get() {
        if (_bubbleText != null) return _bubbleText!!
        _bubbleText = tablerFilledIcon(
            name = "BubbleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.4 2l.253 .005c2.172 .088 4.148 1.283 5.235 3.166l.089 .163 .178 .039c1.859 .436 3.422 1.687 4.254 3.406l.105 .228c.849 1.947 .665 4.191-.489 5.974-1.155 1.783-3.126 2.869-5.251 2.891l-.144-.002-.037 .052c-1.271 1.675-3.417 2.433-5.458 1.926l-.186-.051L7.514 21.857c-.291 .175-.652 .19-.957 .04-.305-.15-.513-.445-.551-.783L6 21v-2.435l-.055-.026C5.289 18.207 4.747 17.685 4.391 17.041l-.102-.199c-.317-.666-.425-1.412-.312-2.14l.038-.21-.116-.092C2.136 12.94 1.397 10.58 2.012 8.375l.071-.238C2.85 5.782 5.027 4.174 7.503 4.133h.157l.15-.165C8.943 2.776 10.496 2.072 12.14 2.005ZM14 13h-5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h5c.552 0 1-.448 1-1 0-.552-.448-1-1-1M17 9h-10C6.448 9 6 9.448 6 10c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1C18 9.448 17.552 9 17 9"),
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
        return _bubbleText!!
    }

private var _bubbleText: ImageVector? = null
