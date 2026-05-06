package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Crosshair2Line: ImageVector
    get() {
        if (_crosshair2Line != null) return _crosshair2Line!!
        _crosshair2Line = remixIcon(
            name = "Crosshair2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 5.071C7.934 5.509 5.509 7.934 5.071 11h1.929v2h-1.929c.439 3.066 2.863 5.491 5.929 5.929v-1.929h2v1.929c3.066-.438 5.491-2.863 5.929-5.929h-1.929v-2h1.929C18.491 7.934 16.066 5.509 13 5.071v1.929h-2v-1.929ZM3.055 11C3.516 6.828 6.828 3.516 11 3.055v-2.055h2v2.055c4.172 .461 7.484 3.773 7.945 7.945h2.055v2h-2.055c-.461 4.172-3.774 7.484-7.945 7.945v2.055h-2v-2.055C6.828 20.484 3.516 17.172 3.055 13h-2.055v-2h2.055ZM14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z"),
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
        return _crosshair2Line!!
    }

private var _crosshair2Line: ImageVector? = null
