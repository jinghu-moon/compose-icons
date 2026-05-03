package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HotspotFill: ImageVector
    get() {
        if (_hotspotFill != null) return _hotspotFill!!
        _hotspotFill = remixIcon(
            name = "HotspotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.000 L 11.000 11.000 L 18.000 11.000 L 18.000 21.000 C 18.000 21.552 17.552 22.000 17.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 11.000 2.000 ZM 13.000 7.000 C 14.105 7.000 15.000 7.895 15.000 9.000 L 13.000 9.000 L 13.000 7.000 ZM 13.000 4.000 C 15.761 4.000 18.000 6.239 18.000 9.000 L 16.000 9.000 C 16.000 7.343 14.657 6.000 13.000 6.000 L 13.000 4.000 ZM 13.000 1.000 C 17.418 1.000 21.000 4.582 21.000 9.000 L 19.000 9.000 C 19.000 5.686 16.314 3.000 13.000 3.000 L 13.000 1.000 Z"),
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
        return _hotspotFill!!
    }

private var _hotspotFill: ImageVector? = null
