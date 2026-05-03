package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArchiveDrawerFill: ImageVector
    get() {
        if (_archiveDrawerFill != null) return _archiveDrawerFill!!
        _archiveDrawerFill = remixIcon(
            name = "ArchiveDrawerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 13.000 L 21.000 13.000 L 21.000 21.003 C 21.000 21.553 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.554 3.000 21.003 L 3.000 13.000 ZM 3.000 2.998 C 3.000 2.447 3.445 2.000 3.993 2.000 L 20.007 2.000 C 20.555 2.000 21.000 2.446 21.000 2.998 L 21.000 11.000 L 3.000 11.000 L 3.000 2.998 ZM 9.000 5.000 L 9.000 7.000 L 15.000 7.000 L 15.000 5.000 L 9.000 5.000 ZM 9.000 16.000 L 9.000 18.000 L 15.000 18.000 L 15.000 16.000 L 9.000 16.000 Z"),
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
        return _archiveDrawerFill!!
    }

private var _archiveDrawerFill: ImageVector? = null
