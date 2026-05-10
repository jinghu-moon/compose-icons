package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DisqusFill: ImageVector
    get() {
        if (_disqusFill != null) return _disqusFill!!
        _disqusFill = remixIcon(
            name = "DisqusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C9.47 22 7.16 21.061 5.399 19.512L1.5 20 2.924 16.203C2.331 14.925 2 13.501 2 12 2 6.477 6.477 2 12 2ZM8 7v10h3.733l.262-.004c3.375-.104 5.337-2.212 5.337-5.025v-.028l-.004-.215C17.231 8.956 15.211 7 11.79 7h-3.79ZM11.831 9.458c1.628 0 2.709 .928 2.709 2.529v.028l-.005 .183c-.079 1.5-1.138 2.346-2.704 2.346h-1.108v-5.085h1.108Z"),
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
        return _disqusFill!!
    }

private var _disqusFill: ImageVector? = null
