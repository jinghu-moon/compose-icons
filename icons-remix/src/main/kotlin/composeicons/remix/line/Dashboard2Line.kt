package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dashboard2Line: ImageVector
    get() {
        if (_dashboard2Line != null) return _dashboard2Line!!
        _dashboard2Line = remixIcon(
            name = "Dashboard2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 5c1.018 0 1.985 .217 2.858 .608L13.295 7.169C12.882 7.059 12.448 7 12 7 9.239 7 7 9.239 7 12c0 1.381 .56 2.631 1.464 3.535L7.05 16.95l-.156-.161C5.72 15.537 5 13.852 5 12 5 8.134 8.134 5 12 5ZM18.392 9.143c.39 .872 .608 1.839 .608 2.857 0 1.933-.784 3.683-2.05 4.95L15.535 15.535C16.44 14.631 17 13.381 17 12c0-.448-.059-.882-.169-1.295L18.392 9.143ZM16.243 6.343l1.414 1.414-3.724 3.726c.044 .165 .068 .338 .068 .517 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 .179 0 .352 .024 .517 .068L16.243 6.343Z"),
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
        return _dashboard2Line!!
    }

private var _dashboard2Line: ImageVector? = null
