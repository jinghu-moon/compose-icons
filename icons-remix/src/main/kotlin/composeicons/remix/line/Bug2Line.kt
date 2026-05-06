package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bug2Line: ImageVector
    get() {
        if (_bug2Line != null) return _bug2Line!!
        _bug2Line = remixIcon(
            name = "Bug2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.562 4.148c.464-.097 .945-.148 1.438-.148 .493 0 .974 .051 1.438 .148L15.121 2.464l1.414 1.414L15.486 4.928c1.232 .709 2.228 1.782 2.841 3.072h2.674v2h-2.071c.047 .327 .071 .66 .071 1v1h2v2h-2v1c0 .34-.024 .673-.071 1h2.071v2h-2.674C17.203 20.365 14.792 22 12 22 9.208 22 6.797 20.365 5.674 18h-2.674v-2h2.071C5.024 15.673 5 15.34 5 15v-1h-2v-2h2v-1c0-.34 .024-.673 .071-1h-2.071v-2h2.674C6.286 6.71 7.282 5.637 8.514 4.928L7.464 3.879 8.879 2.464l1.683 1.683ZM12 6C9.239 6 7 8.239 7 11v4c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-4C17 8.239 14.761 6 12 6ZM9 14h6v2h-6v-2ZM9 10h6v2h-6v-2Z"),
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
        return _bug2Line!!
    }

private var _bug2Line: ImageVector? = null
