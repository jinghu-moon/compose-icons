package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilePaper2Fill: ImageVector
    get() {
        if (_filePaper2Fill != null) return _filePaper2Fill!!
        _filePaper2Fill = remixIcon(
            name = "FilePaper2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c1.657 0 3 1.343 3 3v2h-2v12c0 1.657-1.343 3-3 3h-14C2.343 22 1 20.657 1 19v-2h16v2c0 .513 .386 .935 .883 .993L18 20c.513 0 .935-.386 .993-.883L19 19v-4h-16v-10C3 3.343 4.343 2 6 2h14Z"),
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
        return _filePaper2Fill!!
    }

private var _filePaper2Fill: ImageVector? = null
