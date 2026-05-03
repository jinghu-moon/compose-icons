package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VerifiedBadgeLine: ImageVector
    get() {
        if (_verifiedBadgeLine != null) return _verifiedBadgeLine!!
        _verifiedBadgeLine = remixIcon(
            name = "VerifiedBadgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.007 2.104 C 8.606 1.650 7.082 2.281 6.412 3.593 L 5.606 5.170 C 5.510 5.358 5.358 5.510 5.170 5.606 L 3.593 6.411 C 2.281 7.082 1.650 8.605 2.104 10.007 L 2.649 11.692 C 2.714 11.892 2.714 12.108 2.649 12.308 L 2.104 13.993 C 1.650 15.394 2.281 16.918 3.593 17.588 L 5.170 18.394 C 5.358 18.490 5.510 18.642 5.606 18.830 L 6.412 20.407 C 7.082 21.719 8.606 22.350 10.007 21.896 L 11.692 21.351 C 11.892 21.286 12.108 21.286 12.308 21.351 L 13.993 21.896 C 15.395 22.350 16.918 21.719 17.589 20.407 L 18.394 18.830 C 18.490 18.642 18.642 18.490 18.830 18.394 L 20.407 17.588 C 21.719 16.918 22.350 15.394 21.896 13.993 L 21.351 12.308 C 21.286 12.108 21.286 11.892 21.351 11.692 L 21.896 10.007 C 22.350 8.605 21.719 7.082 20.407 6.411 L 18.830 5.606 C 18.642 5.510 18.490 5.358 18.394 5.170 L 17.589 3.593 C 16.918 2.281 15.395 1.650 13.993 2.104 L 12.308 2.649 C 12.108 2.714 11.892 2.714 11.692 2.649 L 10.007 2.104 ZM 8.193 4.503 C 8.416 4.066 8.924 3.855 9.391 4.006 L 11.076 4.552 C 11.677 4.746 12.323 4.746 12.924 4.552 L 14.609 4.006 C 15.076 3.855 15.584 4.066 15.808 4.503 L 16.613 6.080 C 16.901 6.642 17.358 7.099 17.920 7.387 L 19.497 8.192 C 19.934 8.416 20.145 8.924 19.994 9.391 L 19.448 11.076 C 19.254 11.677 19.254 12.323 19.448 12.924 L 19.994 14.609 C 20.145 15.076 19.934 15.584 19.497 15.807 L 17.920 16.613 C 17.358 16.900 16.901 17.358 16.613 17.920 L 15.808 19.497 C 15.584 19.934 15.076 20.145 14.609 19.993 L 12.924 19.448 C 12.323 19.253 11.677 19.253 11.076 19.448 L 9.391 19.993 C 8.924 20.145 8.416 19.934 8.193 19.497 L 7.387 17.920 C 7.100 17.358 6.642 16.900 6.080 16.613 L 4.503 15.807 C 4.066 15.584 3.855 15.076 4.007 14.609 L 4.552 12.924 C 4.747 12.323 4.747 11.677 4.552 11.076 L 4.007 9.391 C 3.855 8.924 4.066 8.416 4.503 8.192 L 6.080 7.387 C 6.642 7.099 7.100 6.642 7.387 6.080 L 8.193 4.503 ZM 6.760 11.757 L 11.002 16.000 L 18.073 8.929 L 16.659 7.515 L 11.002 13.172 L 8.174 10.343 L 6.760 11.757 Z"),
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
        return _verifiedBadgeLine!!
    }

private var _verifiedBadgeLine: ImageVector? = null
