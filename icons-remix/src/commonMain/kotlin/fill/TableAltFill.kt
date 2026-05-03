package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TableAltFill: ImageVector
    get() {
        if (_tableAltFill != null) return _tableAltFill!!
        _tableAltFill = remixIcon(
            name = "TableAltFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 14.000 L 7.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 14.000 L 7.000 14.000 ZM 15.000 14.000 L 15.000 3.000 L 9.000 3.000 L 9.000 14.000 L 15.000 14.000 ZM 22.000 14.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 17.000 3.000 L 17.000 14.000 L 22.000 14.000 ZM 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 16.000 L 2.000 16.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 Z"),
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
        return _tableAltFill!!
    }

private var _tableAltFill: ImageVector? = null
