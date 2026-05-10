package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CookieFill: ImageVector
    get() {
        if (_cookieFill != null) return _cookieFill!!
        _cookieFill = remixIcon(
            name = "CookieFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 4.929C7.037 2.821 9.852 1.85 12.611 2.018c.38 .023 .567 .468 .417 .818-.55 1.278-.304 2.817 .74 3.861 .563 .563 1.27 .893 2.002 .992 .278 .037 .503 .263 .541 .541 .099 .732 .429 1.439 .992 2.002 1.044 1.044 2.583 1.29 3.86 .739 .35-.151 .795 .036 .818 .416 .168 2.759-.802 5.575-2.911 7.683-3.905 3.905-10.236 3.905-14.142 0C1.024 15.165 1.024 8.834 4.929 4.929ZM9.878 14.121c-.586-.586-1.535-.586-2.121 0-.585 .586-.586 1.535 0 2.121 .586 .586 1.535 .585 2.121 0 .586-.586 .586-1.535 0-2.121ZM15.889 13.768c-.586-.586-1.535-.586-2.121 0-.586 .586-.586 1.535 0 2.121 .586 .586 1.535 .586 2.121 0 .585-.586 .586-1.535 0-2.121ZM10.232 8.111c-.586-.586-1.535-.586-2.121 0-.586 .586-.586 1.535 0 2.121 .586 .586 1.535 .586 2.121 0 .586-.586 .586-1.535 0-2.121Z"),
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
        return _cookieFill!!
    }

private var _cookieFill: ImageVector? = null
