package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailAiFill: ImageVector
    get() {
        if (_mailAiFill != null) return _mailAiFill!!
        _mailAiFill = remixIcon(
            name = "MailAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.713 8.128 L 20.467 8.694 C 20.286 9.108 19.714 9.108 19.533 8.694 L 19.287 8.128 C 18.847 7.119 18.056 6.316 17.068 5.877 L 16.308 5.539 C 15.897 5.357 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.807 18.844 2.974 19.276 1.931 L 19.529 1.320 C 19.706 0.893 20.294 0.893 20.471 1.320 L 20.724 1.931 C 21.156 2.974 21.962 3.807 22.975 4.257 L 23.692 4.576 C 24.103 4.759 24.103 5.357 23.692 5.539 L 22.932 5.877 C 21.944 6.316 21.153 7.119 20.713 8.128 ZM 20.000 11.000 C 20.701 11.000 21.374 10.880 22.000 10.659 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 2.000 21.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 14.341 3.000 C 14.120 3.626 14.000 4.299 14.000 5.000 C 14.000 6.444 14.510 7.768 15.359 8.803 L 12.000 11.683 L 5.651 6.241 L 4.349 7.759 L 12.000 14.317 L 16.885 10.129 C 17.793 10.682 18.860 11.000 20.000 11.000 Z"),
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
        return _mailAiFill!!
    }

private var _mailAiFill: ImageVector? = null
