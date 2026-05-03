package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VerifiedBadgeFill: ImageVector
    get() {
        if (_verifiedBadgeFill != null) return _verifiedBadgeFill!!
        _verifiedBadgeFill = remixIcon(
            name = "VerifiedBadgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.007 2.104 C 8.605 1.650 7.082 2.281 6.412 3.593 L 5.606 5.170 C 5.510 5.358 5.358 5.510 5.170 5.606 L 3.593 6.412 C 2.281 7.082 1.650 8.605 2.104 10.007 L 2.649 11.692 C 2.714 11.892 2.714 12.108 2.649 12.308 L 2.104 13.993 C 1.650 15.395 2.281 16.918 3.593 17.588 L 5.170 18.394 C 5.358 18.490 5.510 18.642 5.606 18.830 L 6.412 20.407 C 7.082 21.719 8.605 22.350 10.007 21.896 L 11.692 21.351 C 11.892 21.286 12.108 21.286 12.308 21.351 L 13.993 21.896 C 15.395 22.350 16.918 21.719 17.588 20.407 L 18.394 18.830 C 18.490 18.642 18.642 18.490 18.830 18.394 L 20.407 17.588 C 21.719 16.918 22.350 15.395 21.896 13.993 L 21.351 12.308 C 21.286 12.108 21.286 11.892 21.351 11.692 L 21.896 10.007 C 22.350 8.605 21.719 7.082 20.407 6.412 L 18.830 5.606 C 18.642 5.510 18.490 5.358 18.394 5.170 L 17.588 3.593 C 16.918 2.281 15.395 1.650 13.993 2.104 L 12.308 2.649 C 12.108 2.714 11.892 2.714 11.692 2.649 L 10.007 2.104 ZM 6.760 11.757 L 8.174 10.343 L 11.002 13.172 L 16.659 7.515 L 18.073 8.929 L 11.002 16.000 L 6.760 11.757 Z"),
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
        return _verifiedBadgeFill!!
    }

private var _verifiedBadgeFill: ImageVector? = null
