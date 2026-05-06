package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Edit2Line: ImageVector
    get() {
        if (_edit2Line != null) return _edit2Line!!
        _edit2Line = remixIcon(
            name = "Edit2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 18.89h1.414L15.728 9.576 14.314 8.162 5 17.476v1.414ZM21 20.89h-18v-4.243L16.435 3.212c.391-.391 1.024-.391 1.414 0l2.829 2.828c.39 .391 .39 1.024 0 1.414L9.243 18.89h11.757v2ZM15.728 6.748l1.414 1.414L18.556 6.748 17.142 5.334 15.728 6.748Z"),
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
        return _edit2Line!!
    }

private var _edit2Line: ImageVector? = null
