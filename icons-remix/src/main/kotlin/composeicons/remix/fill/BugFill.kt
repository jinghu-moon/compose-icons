package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BugFill: ImageVector
    get() {
        if (_bugFill != null) return _bugFill!!
        _bugFill = remixIcon(
            name = "BugFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.056 8.3C6.12 8.199 6.186 8.098 6.255 8h11.491c.069 .098 .135 .199 .198 .3L19.964 7.134l1 1.732-2.213 1.278c.162 .591 .249 1.214 .249 1.856v1h3v2h-3c0 .953-.191 1.862-.536 2.691l2.5 1.443-1 1.732L17.438 19.408C16.353 20.745 14.785 21.674 13 21.929v-7.929h-2v7.929C9.215 21.674 7.647 20.745 6.562 19.408L4.036 20.866l-1-1.732L5.536 17.691C5.191 16.862 5 15.953 5 15h-3v-2h3v-1c0-.643 .087-1.265 .249-1.856L3.036 8.866l1-1.732L6.056 8.3ZM8 6C8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4h-8Z"),
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
        return _bugFill!!
    }

private var _bugFill: ImageVector? = null
