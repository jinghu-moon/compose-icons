package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExportFill: ImageVector
    get() {
        if (_exportFill != null) return _exportFill!!
        _exportFill = remixIcon(
            name = "ExportFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 ZM 12.000 16.000 C 10.343 16.000 9.000 14.657 9.000 13.000 L 4.000 13.000 L 4.000 5.000 L 20.000 5.000 L 20.000 13.000 L 15.000 13.000 C 15.000 14.657 13.657 16.000 12.000 16.000 ZM 16.000 11.000 L 13.000 11.000 L 13.000 14.000 L 11.000 14.000 L 11.000 11.000 L 8.000 11.000 L 12.000 6.500 L 16.000 11.000 Z"),
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
        return _exportFill!!
    }

private var _exportFill: ImageVector? = null
