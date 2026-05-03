package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitForkFill: ImageVector
    get() {
        if (_gitForkFill != null) return _gitForkFill!!
        _gitForkFill = remixIcon(
            name = "GitForkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 6.000 C 9.000 7.306 8.165 8.417 7.000 8.829 L 7.000 9.000 C 7.000 10.105 7.895 11.000 9.000 11.000 L 15.000 11.000 C 16.105 11.000 17.000 10.105 17.000 9.000 L 17.000 8.829 C 15.835 8.417 15.000 7.306 15.000 6.000 C 15.000 4.343 16.343 3.000 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 C 21.000 7.306 20.165 8.417 19.000 8.829 L 19.000 9.000 C 19.000 11.209 17.209 13.000 15.000 13.000 L 13.000 13.000 L 13.000 15.171 C 14.165 15.583 15.000 16.694 15.000 18.000 C 15.000 19.657 13.657 21.000 12.000 21.000 C 10.343 21.000 9.000 19.657 9.000 18.000 C 9.000 16.694 9.835 15.583 11.000 15.171 L 11.000 13.000 L 9.000 13.000 C 6.791 13.000 5.000 11.209 5.000 9.000 L 5.000 8.829 C 3.835 8.417 3.000 7.306 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 C 7.657 3.000 9.000 4.343 9.000 6.000 Z"),
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
        return _gitForkFill!!
    }

private var _gitForkFill: ImageVector? = null
