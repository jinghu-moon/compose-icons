package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeGearFill: ImageVector
    get() {
        if (_homeGearFill != null) return _homeGearFill!!
        _homeGearFill = remixIcon(
            name = "HomeGearFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 ZM 8.592 13.808 L 7.601 14.380 L 8.602 16.113 L 9.594 15.540 C 9.988 15.912 10.467 16.193 10.999 16.351 L 10.999 17.496 L 13.001 17.496 L 13.001 16.351 C 13.533 16.193 14.012 15.911 14.406 15.540 L 15.398 16.113 L 16.399 14.380 L 15.408 13.808 C 15.470 13.548 15.502 13.277 15.502 12.998 C 15.502 12.719 15.470 12.448 15.408 12.188 L 16.399 11.615 L 15.398 9.882 L 14.406 10.455 C 14.012 10.084 13.533 9.803 13.001 9.644 L 13.001 8.500 L 10.999 8.500 L 10.999 9.644 C 10.467 9.803 9.987 10.084 9.594 10.455 L 8.602 9.882 L 7.601 11.616 L 8.592 12.188 C 8.530 12.448 8.498 12.719 8.498 12.998 C 8.498 13.277 8.530 13.548 8.592 13.808 ZM 12.000 14.497 C 11.171 14.497 10.499 13.826 10.499 12.998 C 10.499 12.170 11.171 11.498 12.000 11.498 C 12.829 11.498 13.501 12.170 13.501 12.998 C 13.501 13.826 12.829 14.497 12.000 14.497 Z"),
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
        return _homeGearFill!!
    }

private var _homeGearFill: ImageVector? = null
