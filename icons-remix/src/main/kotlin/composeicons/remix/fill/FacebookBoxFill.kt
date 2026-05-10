package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookBoxFill: ImageVector
    get() {
        if (_facebookBoxFill != null) return _facebookBoxFill!!
        _facebookBoxFill = remixIcon(
            name = "FacebookBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.402 21v-6.966h2.332l.349-2.708h-2.681v-1.729c0-.784 .218-1.318 1.342-1.318l1.434-.001v-2.422c-.248-.033-1.099-.107-2.09-.107-2.068 0-3.483 1.262-3.483 3.579v1.997h-2.338v2.708h2.338v6.966h-8.606C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-4.598Z"),
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
        return _facebookBoxFill!!
    }

private var _facebookBoxFill: ImageVector? = null
