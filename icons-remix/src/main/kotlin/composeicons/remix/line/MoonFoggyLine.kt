package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonFoggyLine: ImageVector
    get() {
        if (_moonFoggyLine != null) return _moonFoggyLine!!
        _moonFoggyLine = remixIcon(
            name = "MoonFoggyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 20.334v-2.199c1.699-.898 3.012-2.43 3.623-4.281C19.093 13.95 18.55 14 18 14 13.029 14 9 9.971 9 5c0-.046 0-.091 .001-.137C7.041 5.899 5.603 7.776 5.15 10h-2.033C3.794 5.738 7.304 2.42 11.656 2.037 11.235 2.937 11 3.941 11 5 11 8.866 14.134 12 18 12c1.475 0 2.844-.456 3.972-1.235 .018 .243 .028 .488 .028 .735 0 4.011-2.485 7.441-6 8.834ZM7 20h7v2h-7v-2ZM4 12h6v2h-6v-2ZM2 16h10v2h-10v-2Z"),
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
        return _moonFoggyLine!!
    }

private var _moonFoggyLine: ImageVector? = null
