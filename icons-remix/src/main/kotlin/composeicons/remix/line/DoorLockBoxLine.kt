package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorLockBoxLine: ImageVector
    get() {
        if (_doorLockBoxLine != null) return _doorLockBoxLine!!
        _doorLockBoxLine = remixIcon(
            name = "DoorLockBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM5 5v14h14v-14h-14ZM11 12.792C10.117 12.406 9.5 11.525 9.5 10.5 9.5 9.119 10.619 8 12 8c1.381 0 2.5 1.119 2.5 2.5 0 1.025-.617 1.906-1.5 2.292v3.208h-2v-3.208Z"),
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
        return _doorLockBoxLine!!
    }

private var _doorLockBoxLine: ImageVector? = null
