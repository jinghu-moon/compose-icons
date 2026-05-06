package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorRegularIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.23 203.42c-.907 1.92-2.541 3.4-4.54 4.115-2 .715-4.201 .605-6.12-.305l-152-72C41.776 133.907 39.994 131.092 39.994 128c0-3.092 1.781-5.907 4.576-7.23L196.57 48.77c3.993-1.892 8.763-.188 10.655 3.805 1.892 3.993 .188 8.763-3.805 10.655L66.69 128l136.73 64.77c3.992 1.89 5.698 6.657 3.81 10.65Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
