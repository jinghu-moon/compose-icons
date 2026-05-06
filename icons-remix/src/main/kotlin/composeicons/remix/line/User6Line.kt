package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User6Line: ImageVector
    get() {
        if (_user6Line != null) return _user6Line!!
        _user6Line = remixIcon(
            name = "User6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 17c3.662 0 6.865 1.575 8.607 3.925l-1.842 .871C17.347 20.116 14.847 19 12 19 9.152 19 6.653 20.116 5.235 21.796L3.394 20.924C5.136 18.575 8.338 17 12 17ZM12 2c2.761 0 5 2.239 5 5v3c0 2.689-2.122 4.882-4.783 4.995L12 15c-2.761 0-5-2.239-5-5v-3c0-2.689 2.122-4.882 4.783-4.995L12 2ZM12 4C10.402 4 9.096 5.249 9.005 6.824L9 7v3c0 1.657 1.343 3 3 3 1.598 0 2.904-1.249 2.995-2.824L15 10v-3c0-1.657-1.343-3-3-3Z"),
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
        return _user6Line!!
    }

private var _user6Line: ImageVector? = null
