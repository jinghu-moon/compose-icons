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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.598v11.371h-7.1c-.67 0-1.069-.785-.644-1.337L11 2.598ZM13 8.031v-5.698C13 .522 10.703-.291 9.582 1.162L1.673 11.411c-1.427 1.849-.125 4.559 2.227 4.559h7.1v5.698c0 1.811 2.296 2.624 3.418 1.171L22.326 12.589c1.427-1.849 .125-4.559-2.227-4.559h-7.1ZM13 10.031h7.1c.67 0 1.069 .785 .644 1.337L13 21.402v-11.371Z"),
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
        return _supabaseLine!!
    }

private var _supabaseLine: ImageVector? = null
