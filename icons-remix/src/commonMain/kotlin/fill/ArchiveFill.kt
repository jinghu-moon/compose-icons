package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArchiveFill: ImageVector
    get() {
        if (_archiveFill != null) return _archiveFill!!
        _archiveFill = remixIcon(
            name = "ArchiveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 10.000 L 21.000 10.000 L 21.000 20.004 C 21.000 20.554 20.555 21.000 20.007 21.000 L 3.993 21.000 C 3.445 21.000 3.000 20.555 3.000 20.004 L 3.000 10.000 ZM 9.000 12.000 L 9.000 14.000 L 15.000 14.000 L 15.000 12.000 L 9.000 12.000 ZM 2.000 4.000 C 2.000 3.448 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.444 22.000 4.000 L 22.000 8.000 L 2.000 8.000 L 2.000 4.000 Z"),
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
        return _archiveFill!!
    }

private var _archiveFill: ImageVector? = null
