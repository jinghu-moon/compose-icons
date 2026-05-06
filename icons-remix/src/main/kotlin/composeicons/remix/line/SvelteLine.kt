package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SvelteLine: ImageVector
    get() {
        if (_svelteLine != null) return _svelteLine!!
        _svelteLine = remixIcon(
            name = "SvelteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.8 3.77C17.945 .859 14.082 .003 11.171 1.857L6.11 5.081C3.231 6.915 2.362 10.714 4.137 13.613c-1.202 1.972-1.261 4.536 .064 6.616 1.855 2.911 5.718 3.768 8.629 1.913l5.06-3.224c2.879-1.834 3.748-5.633 1.974-8.532C21.066 8.415 21.125 5.851 19.8 3.77ZM18.448 8.774C17.628 8.115 16.663 7.683 15.651 7.499c.038-.234-.007-.481-.144-.696-.297-.466-.915-.603-1.381-.306L9.066 9.72c-.466 .297-.603 .915-.306 1.381 .297 .466 .915 .603 1.381 .306l2.109-1.343c1.98-1.261 4.607-.679 5.868 1.301 1.261 1.98 .679 4.607-1.301 5.868l-5.06 3.224C9.776 21.717 7.149 21.135 5.887 19.155 5.11 17.935 5.033 16.467 5.553 15.226c.82 .659 1.785 1.091 2.797 1.276-.038 .234 .007 .481 .144 .697 .297 .466 .915 .603 1.381 .306l5.06-3.224c.466-.297 .603-.915 .306-1.381-.297-.466-.915-.603-1.381-.306l-2.109 1.343C9.772 15.198 7.145 14.615 5.884 12.636 4.623 10.656 5.205 8.029 7.185 6.768L12.245 3.544c1.98-1.261 4.607-.679 5.868 1.301 .777 1.22 .855 2.687 .335 3.929Z"),
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
        return _svelteLine!!
    }

private var _svelteLine: ImageVector? = null
