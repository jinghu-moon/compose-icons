package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoorLockBoxFill: ImageVector
    get() {
        if (_doorLockBoxFill != null) return _doorLockBoxFill!!
        _doorLockBoxFill = remixIcon(
            name = "DoorLockBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM11 12.792v3.208h2v-3.208c.883-.386 1.5-1.267 1.5-2.292C14.5 9.119 13.381 8 12 8 10.619 8 9.5 9.119 9.5 10.5c0 1.025 .617 1.906 1.5 2.292Z"),
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
        return _doorLockBoxFill!!
    }

private var _doorLockBoxFill: ImageVector? = null
