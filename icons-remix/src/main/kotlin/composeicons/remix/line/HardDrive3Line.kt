package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HardDrive3Line: ImageVector
    get() {
        if (_hardDrive3Line != null) return _hardDrive3Line!!
        _hardDrive3Line = remixIcon(
            name = "HardDrive3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.508 2.876C4.57 2.376 4.996 2 5.5 2h13c.504 0 .93 .376 .992 .876l1.5 12c.005 .041 .008 .082 .008 .124v6c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-6c0-.042 .003-.083 .008-.124L4.508 2.876ZM6.383 4 5.133 14h13.734L17.617 4h-11.234ZM19 16h-14v4h14v-4ZM15 17h2v2h-2v-2ZM13 17h-2v2h2v-2Z"),
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
        return _hardDrive3Line!!
    }

private var _hardDrive3Line: ImageVector? = null
