package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LungsFill: ImageVector
    get() {
        if (_lungsFill != null) return _lungsFill!!
        _lungsFill = remixIcon(
            name = "LungsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 5.5c1.412 .471 2.048 2.159 2.327 4.023L6.304 12.134l1 1.732 3.71-2.141C11.06 13.079 11 14.309 11 15c0 3-1 6-5 6C2 21 2 21 2 17 2 9.5 5.501 4.5 8.5 5.5ZM22.001 17l-0 .436C21.996 21 21.85 21 18.001 21c-4 0-5-3-5-6 0-.691-.06-1.92-.014-3.274l3.709 2.14 1-1.732L13.174 9.524c.278-1.865 .915-3.553 2.327-4.024 2.999-1 6.5 4 6.5 11.5ZM13 2v9h-2v-9h2Z"),
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
        return _lungsFill!!
    }

private var _lungsFill: ImageVector? = null
