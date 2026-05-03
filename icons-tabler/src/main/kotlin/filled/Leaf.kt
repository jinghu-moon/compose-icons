package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = tablerFilledIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.055 14.328 L 3.037 14.160 L 3.033 14.117 C 2.998 13.745 2.983 13.371 2.986 12.997 C 3.004 6.707 7.276 3.000 15.986 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 20.998 6.057 C 20.500 14.758 16.258 19.000 9.000 19.000 L 6.369 19.000 C 6.197 19.694 6.072 20.399 5.994 21.110 C 5.933 21.659 5.439 22.055 4.890 21.994 C 4.341 21.933 3.945 21.439 4.006 20.890 Q 4.180 19.322 4.586 17.943 L 4.468 17.797 L 4.260 17.517 L 4.103 17.288 L 3.921 16.995 L 3.823 16.824 L 3.758 16.702 C 3.599 16.400 3.466 16.085 3.361 15.761 L 3.289 15.524 L 3.204 15.197 L 3.147 14.929 L 3.104 14.687 ZM 11.594 10.086 C 8.749 11.351 6.740 13.216 5.486 15.669 Q 5.584 15.869 5.704 16.069 L 5.889 16.350 L 5.959 16.447 Q 6.079 16.611 6.217 16.776 L 6.414 17.000 L 7.063 17.000 C 8.100 14.729 9.840 13.054 12.406 11.914 C 12.911 11.690 13.138 11.099 12.914 10.594 C 12.690 10.089 12.099 9.862 11.594 10.086"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
