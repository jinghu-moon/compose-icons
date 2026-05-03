package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EditBoxFill: ImageVector
    get() {
        if (_editBoxFill != null) return _editBoxFill!!
        _editBoxFill = remixIcon(
            name = "EditBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.757 2.997 L 9.291 10.463 L 9.299 14.710 L 13.537 14.702 L 21.000 7.239 L 21.000 19.997 C 21.000 20.549 20.552 20.997 20.000 20.997 L 4.000 20.997 C 3.448 20.997 3.000 20.549 3.000 19.997 L 3.000 3.997 C 3.000 3.444 3.448 2.997 4.000 2.997 L 16.757 2.997 ZM 20.485 2.097 L 21.899 3.511 L 12.707 12.704 L 11.295 12.706 L 11.293 11.290 L 20.485 2.097 Z"),
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
        return _editBoxFill!!
    }

private var _editBoxFill: ImageVector? = null
