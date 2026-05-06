package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MegaphoneFill: ImageVector
    get() {
        if (_megaphoneFill != null) return _megaphoneFill!!
        _megaphoneFill = remixIcon(
            name = "MegaphoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 10.063v-6.063C21 3.448 20.552 3 20 3h-1C17.021 4.979 13.303 6.087 11 6.613v10.774c2.303 .526 6.021 1.634 8 3.613h1c.552 0 1-.448 1-1v-6.063c.863-.222 1.5-1.005 1.5-1.937 0-.932-.637-1.715-1.5-1.937ZM5 7C3.895 7 3 7.895 3 9v6c0 1.105 .895 2 2 2h1l1 5h2v-15h-4Z"),
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
        return _megaphoneFill!!
    }

private var _megaphoneFill: ImageVector? = null
