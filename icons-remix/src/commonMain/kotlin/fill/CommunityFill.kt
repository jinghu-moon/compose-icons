package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CommunityFill: ImageVector
    get() {
        if (_communityFill != null) return _communityFill!!
        _communityFill = remixIcon(
            name = "CommunityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 19.000 L 12.000 19.000 L 12.000 12.942 L 8.000 9.454 L 4.000 12.942 L 4.000 19.000 L 7.000 19.000 L 7.000 15.000 L 9.000 15.000 L 9.000 19.000 ZM 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 12.487 C 2.000 12.198 2.125 11.923 2.343 11.733 L 6.000 8.544 L 6.000 4.000 C 6.000 3.448 6.448 3.000 7.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 ZM 16.000 11.000 L 16.000 13.000 L 18.000 13.000 L 18.000 11.000 L 16.000 11.000 ZM 16.000 15.000 L 16.000 17.000 L 18.000 17.000 L 18.000 15.000 L 16.000 15.000 ZM 16.000 7.000 L 16.000 9.000 L 18.000 9.000 L 18.000 7.000 L 16.000 7.000 ZM 12.000 7.000 L 12.000 9.000 L 14.000 9.000 L 14.000 7.000 L 12.000 7.000 Z"),
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
        return _communityFill!!
    }

private var _communityFill: ImageVector? = null
