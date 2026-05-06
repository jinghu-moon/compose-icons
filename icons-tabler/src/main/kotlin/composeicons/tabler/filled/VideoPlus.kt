package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) return _videoPlus!!
        _videoPlus = tablerFilledIcon(
            name = "VideoPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 5c1.657 0 3 1.343 3 3v.381L19.106 6.829c.62-.31 1.356-.277 1.946 .088 .59 .364 .948 1.008 .948 1.701v6.765c-.001 .693-.36 1.336-.949 1.7-.589 .364-1.325 .397-1.945 .087L16 15.618v.382c0 1.657-1.343 3-3 3h-8C3.343 19 2 17.657 2 16v-8C2 6.343 3.343 5 5 5ZM9 9C8.448 9 8 9.448 8 10v1h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1h1c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1v-1C10 9.448 9.552 9 9 9"),
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
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
