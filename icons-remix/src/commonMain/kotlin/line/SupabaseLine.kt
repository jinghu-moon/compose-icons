package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SupabaseLine: ImageVector
    get() {
        if (_supabaseLine != null) return _supabaseLine!!
        _supabaseLine = remixIcon(
            name = "SupabaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.598 L 11.000 13.969 L 3.900 13.969 C 3.231 13.969 2.831 13.185 3.257 12.633 L 11.000 2.598 ZM 13.000 8.031 L 13.000 2.333 C 13.000 0.522 10.703 -0.291 9.582 1.162 L 1.673 11.411 C 0.246 13.260 1.548 15.969 3.900 15.969 L 11.000 15.969 L 11.000 21.667 C 11.000 23.479 13.296 24.292 14.417 22.838 L 22.326 12.589 C 23.753 10.740 22.452 8.031 20.099 8.031 L 13.000 8.031 ZM 13.000 10.031 L 20.099 10.031 C 20.769 10.031 21.169 10.816 20.743 11.367 L 13.000 21.402 L 13.000 10.031 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _supabaseLine!!
    }

private var _supabaseLine: ImageVector? = null
