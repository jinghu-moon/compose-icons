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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 13c.276 0 .5 .224 .5 .5C3 13.776 2.776 14 2.5 14h-2C.224 14 0 13.776 0 13.5 0 13.224 .224 13 .5 13h2ZM14.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-10C4.224 14 4 13.776 4 13.5 4 13.224 4.224 13 4.5 13h10ZM11.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-7C4.224 11 4 10.776 4 10.5 4 10.224 4.224 10 4.5 10h7ZM2.5 7C2.776 7 3 7.224 3 7.5 3 7.776 2.776 8 2.5 8h-2C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h2ZM14.5 7c.276 0 .5 .224 .5 .5C15 7.776 14.776 8 14.5 8h-10C4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7h10ZM11.5 4c.276 0 .5 .224 .5 .5C12 4.776 11.776 5 11.5 5h-7C4.224 5 4 4.776 4 4.5 4 4.224 4.224 4 4.5 4h7ZM2.5 1C2.776 1 3 1.224 3 1.5 3 1.776 2.776 2 2.5 2h-2C.224 2 0 1.776 0 1.5 0 1.224 .224 1 .5 1h2ZM14.5 1c.276 0 .5 .224 .5 .5C15 1.776 14.776 2 14.5 2h-10C4.224 2 4 1.776 4 1.5 4 1.224 4.224 1 4.5 1h10Z"),
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
        return _activityLog!!
    }

private var _activityLog: ImageVector? = null
