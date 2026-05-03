package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QqFill: ImageVector
    get() {
        if (_qqFill != null) return _qqFill!!
        _qqFill = remixIcon(
            name = "QqFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.914 14.529 C 19.734 13.955 19.488 13.286 19.239 12.643 L 18.329 10.397 C 18.330 10.371 18.341 9.929 18.341 9.701 C 18.341 5.860 16.508 2.000 12.001 2.000 C 7.494 2.000 5.661 5.860 5.661 9.701 C 5.661 9.929 5.672 10.371 5.673 10.397 L 4.764 12.643 C 4.515 13.286 4.268 13.955 4.088 14.529 C 3.228 17.266 3.507 18.398 3.719 18.424 C 4.174 18.478 5.490 16.364 5.490 16.364 C 5.490 17.588 6.127 19.186 7.506 20.340 C 6.991 20.497 6.359 20.739 5.952 21.035 C 5.587 21.302 5.633 21.574 5.699 21.684 C 5.988 22.166 10.654 21.992 12.002 21.842 C 13.349 21.992 18.016 22.166 18.304 21.684 C 18.370 21.574 18.416 21.302 18.051 21.035 C 17.644 20.739 17.012 20.497 16.496 20.340 C 17.875 19.186 18.512 17.588 18.512 16.364 C 18.512 16.364 19.828 18.478 20.283 18.424 C 20.495 18.398 20.773 17.266 19.914 14.529 Z"),
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
        return _qqFill!!
    }

private var _qqFill: ImageVector? = null
