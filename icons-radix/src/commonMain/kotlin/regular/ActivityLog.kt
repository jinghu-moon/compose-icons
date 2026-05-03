package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ActivityLog: ImageVector
    get() {
        if (_activityLog != null) return _activityLog!!
        _activityLog = radixIcon(
            name = "ActivityLog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 13.000 C 2.776 13.000 3.000 13.224 3.000 13.500 C 3.000 13.776 2.776 14.000 2.500 14.000 L 0.500 14.000 C 0.224 14.000 0.000 13.776 0.000 13.500 C 0.000 13.224 0.224 13.000 0.500 13.000 L 2.500 13.000 ZM 14.500 13.000 C 14.776 13.000 15.000 13.224 15.000 13.500 C 15.000 13.776 14.776 14.000 14.500 14.000 L 4.500 14.000 C 4.224 14.000 4.000 13.776 4.000 13.500 C 4.000 13.224 4.224 13.000 4.500 13.000 L 14.500 13.000 ZM 11.500 10.000 C 11.776 10.000 12.000 10.224 12.000 10.500 C 12.000 10.776 11.776 11.000 11.500 11.000 L 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 C 4.000 10.224 4.224 10.000 4.500 10.000 L 11.500 10.000 ZM 2.500 7.000 C 2.776 7.000 3.000 7.224 3.000 7.500 C 3.000 7.776 2.776 8.000 2.500 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 2.500 7.000 ZM 14.500 7.000 C 14.776 7.000 15.000 7.224 15.000 7.500 C 15.000 7.776 14.776 8.000 14.500 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 14.500 7.000 ZM 11.500 4.000 C 11.776 4.000 12.000 4.224 12.000 4.500 C 12.000 4.776 11.776 5.000 11.500 5.000 L 4.500 5.000 C 4.224 5.000 4.000 4.776 4.000 4.500 C 4.000 4.224 4.224 4.000 4.500 4.000 L 11.500 4.000 ZM 2.500 1.000 C 2.776 1.000 3.000 1.224 3.000 1.500 C 3.000 1.776 2.776 2.000 2.500 2.000 L 0.500 2.000 C 0.224 2.000 0.000 1.776 0.000 1.500 C 0.000 1.224 0.224 1.000 0.500 1.000 L 2.500 1.000 ZM 14.500 1.000 C 14.776 1.000 15.000 1.224 15.000 1.500 C 15.000 1.776 14.776 2.000 14.500 2.000 L 4.500 2.000 C 4.224 2.000 4.000 1.776 4.000 1.500 C 4.000 1.224 4.224 1.000 4.500 1.000 L 14.500 1.000 Z"),
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
        return _activityLog!!
    }

private var _activityLog: ImageVector? = null
