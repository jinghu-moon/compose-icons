package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Inbox2Line: ImageVector
    get() {
        if (_inbox2Line != null) return _inbox2Line!!
        _inbox2Line = remixIcon(
            name = "Inbox2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.024 3.783C4.125 3.326 4.531 3 5 3h14c.469 0 .875 .326 .976 .783l2 9c.016 .071 .024 .144 .024 .217v7c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-7c0-.073 .008-.146 .024-.217l2-9ZM5.802 5 4.247 12h4.753c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h4.753L18.198 5h-12.396ZM16.584 14c-.772 1.766-2.534 3-4.584 3C9.95 17 8.188 15.766 7.416 14h-3.416v5h16v-5h-3.416Z"),
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
        return _inbox2Line!!
    }

private var _inbox2Line: ImageVector? = null
