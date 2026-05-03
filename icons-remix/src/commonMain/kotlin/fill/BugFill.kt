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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.056 8.300 C 6.120 8.199 6.186 8.098 6.255 8.000 L 17.745 8.000 C 17.814 8.098 17.880 8.199 17.944 8.300 L 19.964 7.134 L 20.964 8.866 L 18.751 10.144 C 18.913 10.735 19.000 11.357 19.000 12.000 L 19.000 13.000 L 22.000 13.000 L 22.000 15.000 L 19.000 15.000 C 19.000 15.953 18.809 16.862 18.464 17.691 L 20.964 19.134 L 19.964 20.866 L 17.438 19.408 C 16.353 20.745 14.785 21.674 13.000 21.929 L 13.000 14.000 L 11.000 14.000 L 11.000 21.929 C 9.215 21.674 7.647 20.745 6.562 19.408 L 4.036 20.866 L 3.036 19.134 L 5.536 17.691 C 5.191 16.862 5.000 15.953 5.000 15.000 L 2.000 15.000 L 2.000 13.000 L 5.000 13.000 L 5.000 12.000 C 5.000 11.357 5.087 10.735 5.249 10.144 L 3.036 8.866 L 4.036 7.134 L 6.056 8.300 ZM 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 L 8.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bugFill!!
    }

private var _bugFill: ImageVector? = null
