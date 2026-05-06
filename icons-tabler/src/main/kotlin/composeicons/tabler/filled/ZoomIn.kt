package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) return _zoomIn!!
        _zoomIn = tablerFilledIcon(
            name = "ZoomIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c1.925 1.112 3.301 2.975 3.798 5.142 .496 2.167 .069 4.443-1.181 6.282l4.944 4.943c.572 .564 .599 1.477 .061 2.073-.538 .596-1.45 .663-2.069 .152l-.114-.103L14.496 16.617c-2.408 1.636-5.516 1.834-8.113 .518C3.787 15.818 2.11 13.195 2.006 10.285L2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072ZM10 6c-.507 0-.934 .38-.993 .883L9 7v2h-2l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L7 11h2v2l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L11 13v-2h2l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L13 9h-2v-2l-.007-.117C10.934 6.38 10.507 6 10 6Z"),
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
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
