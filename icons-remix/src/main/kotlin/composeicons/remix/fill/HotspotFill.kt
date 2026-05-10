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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2v9h7v10c0 .552-.448 1-1 1h-12C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h6ZM13 7c1.105 0 2 .895 2 2h-2v-2ZM13 4c2.761 0 5 2.239 5 5h-2C16 7.343 14.657 6 13 6v-2ZM13 1c4.418 0 8 3.582 8 8h-2C19 5.686 16.314 3 13 3v-2Z"),
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
        return _hotspotFill!!
    }

private var _hotspotFill: ImageVector? = null
