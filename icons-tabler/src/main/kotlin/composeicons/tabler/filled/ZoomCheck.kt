package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCheck: ImageVector
    get() {
        if (_zoomCheck != null) return _zoomCheck!!
        _zoomCheck = tablerFilledIcon(
            name = "ZoomCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c1.925 1.112 3.301 2.975 3.798 5.142 .496 2.167 .069 4.443-1.181 6.282l4.944 4.943c.572 .564 .599 1.477 .061 2.073-.538 .596-1.45 .663-2.069 .152l-.114-.103L14.496 16.617c-2.408 1.636-5.516 1.834-8.113 .518C3.787 15.818 2.11 13.195 2.006 10.285L2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072ZM13.707 7.292c-.391-.39-1.023-.39-1.414 0L9 10.586 7.707 9.293 7.613 9.21C7.196 8.887 6.6 8.944 6.251 9.34c-.349 .395-.33 .994 .042 1.367l2 2 .094 .083c.398 .309 .964 .273 1.32-.083l4-4 .083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _zoomCheck!!
    }

private var _zoomCheck: ImageVector? = null
