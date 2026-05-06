package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CookieLine: ImageVector
    get() {
        if (_cookieLine != null) return _cookieLine!!
        _cookieLine = remixIcon(
            name = "CookieLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.163 10.971c.35-.151 .794 .036 .818 .416 .168 2.759-.802 5.575-2.91 7.683-3.905 3.905-10.237 3.905-14.142 0C1.024 15.166 1.024 8.834 4.929 4.929 7.037 2.821 9.852 1.85 12.611 2.018c.38 .023 .567 .468 .417 .818-.551 1.278-.304 2.817 .74 3.861 .563 .563 1.27 .893 2.003 .992 .278 .037 .503 .263 .541 .541 .099 .733 .429 1.44 .992 2.003 1.044 1.044 2.583 1.29 3.86 .739ZM19.785 13.84c.071-.304-.172-.579-.483-.606-1.245-.107-2.46-.635-3.413-1.587-.572-.572-.991-1.24-1.258-1.952-.057-.15-.175-.269-.326-.326C13.594 9.102 12.926 8.683 12.354 8.111 11.401 7.158 10.872 5.942 10.765 4.697c-.027-.311-.303-.554-.606-.483C8.76 4.543 7.433 5.253 6.343 6.343 3.219 9.467 3.219 14.533 6.343 17.657c3.124 3.124 8.19 3.124 11.314 0 1.091-1.091 1.799-2.418 2.128-3.817ZM9.879 14.121c.586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .586-.586 1.536-.586 2.121 0ZM10.232 8.111c.586 .586 .586 1.536 0 2.121-.586 .586-1.535 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .586-.586 1.536-.586 2.121 0ZM15.889 13.768c.586 .586 .586 1.536 0 2.121-.586 .586-1.535 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .586-.586 1.535-.586 2.121 0Z"),
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
        return _cookieLine!!
    }

private var _cookieLine: ImageVector? = null
