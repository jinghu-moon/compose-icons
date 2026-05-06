package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HardDrive2Line: ImageVector
    get() {
        if (_hardDrive2Line != null) return _hardDrive2Line!!
        _hardDrive2Line = remixIcon(
            name = "HardDrive2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 14h14v-10h-14v10ZM5 16v4h14v-4h-14ZM4 2h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2ZM15 17h2v2h-2v-2Z"),
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
        return _hardDrive2Line!!
    }

private var _hardDrive2Line: ImageVector? = null
