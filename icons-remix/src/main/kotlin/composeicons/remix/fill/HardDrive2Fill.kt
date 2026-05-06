package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDrive2Fill: ImageVector
    get() {
        if (_hardDrive2Fill != null) return _hardDrive2Fill!!
        _hardDrive2Fill = remixIcon(
            name = "HardDrive2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1ZM5 16v4h14v-4h-14ZM15 17h2v2h-2v-2Z"),
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
        return _hardDrive2Fill!!
    }

private var _hardDrive2Fill: ImageVector? = null
