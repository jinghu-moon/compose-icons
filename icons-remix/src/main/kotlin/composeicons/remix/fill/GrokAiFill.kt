package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GrokAiFill: ImageVector
    get() {
        if (_grokAiFill != null) return _grokAiFill!!
        _grokAiFill = remixIcon(
            name = "GrokAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.939 4.961C7.866 2.033 12.176 1.295 15.775 2.778c.796 .296 1.491 .718 2.032 1.109L14.802 5.277C12.003 4.102 8.797 4.901 6.84 6.86 4.276 9.425 3.694 13.814 6.48 16.782l.277 .284L.124 23C1.999 21.027 3.895 18.573 2.76 15.81 1.24 12.112 2.125 7.779 4.939 4.961ZM23.9 .1C21.636 3.274 20.715 5.489 21.703 9.74l-.007-.007c.753 3.201-.052 6.75-2.653 9.354-3.279 3.285-8.526 4.016-12.847 1.06L9.209 18.751c2.758 1.084 5.775 .607 7.943-1.563 2.168-2.171 2.655-5.333 1.566-7.964-.207-.499-.828-.625-1.263-.304L8.59 15.472 21.289 2.701v.011L23.9 .1Z"),
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
        return _grokAiFill!!
    }

private var _grokAiFill: ImageVector? = null
