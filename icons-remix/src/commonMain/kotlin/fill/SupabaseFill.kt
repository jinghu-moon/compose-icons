package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SupabaseFill: ImageVector
    get() {
        if (_supabaseFill != null) return _supabaseFill!!
        _supabaseFill = remixIcon(
            name = "SupabaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.084 15.250 C 1.420 15.250 0.484 13.338 1.504 12.024 L 10.210 0.806 C 10.794 0.054 12.000 0.467 12.000 1.419 L 12.000 8.750 L 20.916 8.750 C 22.579 8.750 23.516 10.662 22.496 11.976 L 13.790 23.194 C 13.206 23.946 12.000 23.533 12.000 22.580 L 12.000 15.250 L 3.084 15.250 Z"),
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
        return _supabaseFill!!
    }

private var _supabaseFill: ImageVector? = null
