package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.VideoMinus: ImageVector
    get() {
        if (_videoMinus != null) return _videoMinus!!
        _videoMinus = tablerFilledIcon(
            name = "VideoMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 5.000 C 14.657 5.000 16.000 6.343 16.000 8.000 L 16.000 8.381 L 19.106 6.829 C 19.726 6.519 20.462 6.552 21.052 6.917 C 21.641 7.281 22.000 7.925 22.000 8.618 L 22.000 15.383 C 21.999 16.076 21.640 16.719 21.051 17.083 C 20.461 17.447 19.726 17.480 19.106 17.170 L 16.000 15.618 L 16.000 16.000 C 16.000 17.657 14.657 19.000 13.000 19.000 L 5.000 19.000 C 3.343 19.000 2.000 17.657 2.000 16.000 L 2.000 8.000 C 2.000 6.343 3.343 5.000 5.000 5.000 ZM 11.000 11.000 L 7.000 11.000 C 6.448 11.000 6.000 11.448 6.000 12.000 C 6.000 12.552 6.448 13.000 7.000 13.000 L 11.000 13.000 C 11.552 13.000 12.000 12.552 12.000 12.000 C 12.000 11.448 11.552 11.000 11.000 11.000"),
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
        return _videoMinus!!
    }

private var _videoMinus: ImageVector? = null
