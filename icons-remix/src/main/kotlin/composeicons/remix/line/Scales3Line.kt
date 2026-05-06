package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scales3Line: ImageVector
    get() {
        if (_scales3Line != null) return _scales3Line!!
        _scales3Line = remixIcon(
            name = "Scales3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.998 2l-.001 1.278 5.001 1.668L21.631 3.735l.632 1.897L19.232 6.643l3.095 8.512C21.235 16.292 19.7 17 17.999 17c-1.701 0-3.237-.708-4.329-1.845L16.764 6.643 12.998 5.387v13.613h4.001v2h-10v-2h3.999v-13.613L7.232 6.643l3.095 8.512C9.235 16.292 7.7 17 5.999 17 4.298 17 2.762 16.292 1.67 15.155L4.764 6.643 1.734 5.632 2.366 3.735 5.999 4.946 10.998 3.278 10.998 2h2ZM17.999 9.103l-1.958 5.387c.588 .331 1.258 .511 1.958 .511 .701 0 1.371-.18 1.958-.511L17.999 9.103ZM5.999 9.103 4.04 14.489c.588 .331 1.258 .511 1.958 .511 .701 0 1.371-.18 1.958-.511L5.999 9.103Z"),
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
        return _scales3Line!!
    }

private var _scales3Line: ImageVector? = null
