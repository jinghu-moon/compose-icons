package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDriveFill: ImageVector
    get() {
        if (_hardDriveFill != null) return _hardDriveFill!!
        _hardDriveFill = remixIcon(
            name = "HardDriveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.951 2h6.049c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-8.049c.329 .033 .662 .049 1 .049C9.523 13 14 8.523 14 3c0-.338-.017-.671-.049-1ZM15 16v2h2v-2h-2ZM11.938 2c.041 .328 .062 .661 .062 1 0 4.418-3.582 8-8 8-.339 0-.672-.021-1-.062v-7.938C3 2.448 3.448 2 4 2h7.938Z"),
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
        return _hardDriveFill!!
    }

private var _hardDriveFill: ImageVector? = null
