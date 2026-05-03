package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArchiveStackLine: ImageVector
    get() {
        if (_archiveStackLine != null) return _archiveStackLine!!
        _archiveStackLine = remixIcon(
            name = "ArchiveStackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 5.000 L 20.000 5.000 L 20.000 3.000 L 4.000 3.000 L 4.000 5.000 ZM 20.000 9.000 L 4.000 9.000 L 4.000 7.000 L 20.000 7.000 L 20.000 9.000 ZM 3.000 11.000 L 10.000 11.000 L 10.000 13.000 L 14.000 13.000 L 14.000 11.000 L 21.000 11.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 11.000 ZM 16.000 13.000 L 16.000 15.000 L 8.000 15.000 L 8.000 13.000 L 5.000 13.000 L 5.000 19.000 L 19.000 19.000 L 19.000 13.000 L 16.000 13.000 Z"),
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
        return _archiveStackLine!!
    }

private var _archiveStackLine: ImageVector? = null
