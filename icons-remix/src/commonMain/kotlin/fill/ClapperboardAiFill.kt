package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClapperboardAiFill: ImageVector
    get() {
        if (_clapperboardAiFill != null) return _clapperboardAiFill!!
        _clapperboardAiFill = remixIcon(
            name = "ClapperboardAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 20.000 11.000 C 20.701 11.000 21.374 10.880 22.000 10.659 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 5.998 3.000 L 3.689 7.000 L 5.998 7.000 L 8.307 3.000 L 11.998 3.000 L 9.689 7.000 L 11.998 7.000 L 14.307 3.000 L 14.341 3.000 C 14.120 3.626 14.000 4.299 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 Z"),
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
        return _clapperboardAiFill!!
    }

private var _clapperboardAiFill: ImageVector? = null
