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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.084 15.25C1.42 15.25 .484 13.338 1.504 12.024L10.21 .806c.584-.753 1.79-.34 1.79 .613v7.331h8.916c1.663 0 2.6 1.912 1.58 3.226L13.79 23.194c-.584 .753-1.79 .339-1.79-.613v-7.33h-8.916Z"),
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
        return _supabaseFill!!
    }

private var _supabaseFill: ImageVector? = null
