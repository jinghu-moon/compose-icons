package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HotspotLine: ImageVector
    get() {
        if (_hotspotLine != null) return _hotspotLine!!
        _hotspotLine = remixIcon(
            name = "HotspotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2v2h-4v16h10v-9h2v10c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h5ZM13 7c1.105 0 2 .895 2 2h-2v-2ZM13 4c2.761 0 5 2.239 5 5h-2C16 7.343 14.657 6 13 6v-2ZM13 1c4.418 0 8 3.582 8 8h-2C19 5.686 16.314 3 13 3v-2Z"),
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
        return _hotspotLine!!
    }

private var _hotspotLine: ImageVector? = null
