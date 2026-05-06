package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GradienterLine: ImageVector
    get() {
        if (_gradienterLine != null) return _gradienterLine!!
        _gradienterLine = remixIcon(
            name = "GradienterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.049 13h2.013c.492 3.946 3.858 7 7.938 7 4.08 0 7.446-3.054 7.938-7h2.013c-.502 5.053-4.765 9-9.951 9C6.815 22 2.551 18.053 2.049 13ZM2.049 11C2.551 5.947 6.815 2 12 2c5.185 0 9.449 3.947 9.951 9h-2.013C19.446 7.054 16.08 4 12 4 7.92 4 4.554 7.054 4.062 11h-2.013ZM12 14C10.895 14 10 13.105 10 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _gradienterLine!!
    }

private var _gradienterLine: ImageVector? = null
