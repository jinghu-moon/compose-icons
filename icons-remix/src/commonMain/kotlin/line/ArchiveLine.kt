package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArchiveLine: ImageVector
    get() {
        if (_archiveLine != null) return _archiveLine!!
        _archiveLine = remixIcon(
            name = "ArchiveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 10.000 L 2.000 10.000 L 2.000 4.003 C 2.000 3.449 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.438 22.000 4.003 L 22.000 10.000 L 21.000 10.000 L 21.000 20.001 C 21.000 20.553 20.555 21.000 20.007 21.000 L 3.993 21.000 C 3.445 21.000 3.000 20.552 3.000 20.001 L 3.000 10.000 ZM 19.000 10.000 L 5.000 10.000 L 5.000 19.000 L 19.000 19.000 L 19.000 10.000 ZM 4.000 5.000 L 4.000 8.000 L 20.000 8.000 L 20.000 5.000 L 4.000 5.000 ZM 9.000 12.000 L 15.000 12.000 L 15.000 14.000 L 9.000 14.000 L 9.000 12.000 Z"),
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
        return _archiveLine!!
    }

private var _archiveLine: ImageVector? = null
