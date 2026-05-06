package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Key2Line: ImageVector
    get() {
        if (_key2Line != null) return _key2Line!!
        _key2Line = remixIcon(
            name = "Key2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.758 11.828 18.607 3.979l1.414 1.414L18.607 6.808l2.475 2.475-1.414 1.414L17.192 8.222 15.778 9.636l2.121 2.121-1.414 1.414L14.364 11.05l-2.192 2.192c1.286 1.941 1.074 4.583-.636 6.293-1.953 1.953-5.118 1.953-7.071 0-1.953-1.953-1.953-5.118 0-7.071 1.71-1.711 4.352-1.923 6.293-.636ZM10.121 18.121c1.172-1.172 1.172-3.071 0-4.243-1.172-1.172-3.071-1.172-4.243 0-1.172 1.172-1.172 3.071 0 4.243 1.172 1.172 3.071 1.172 4.243 0Z"),
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
        return _key2Line!!
    }

private var _key2Line: ImageVector? = null
