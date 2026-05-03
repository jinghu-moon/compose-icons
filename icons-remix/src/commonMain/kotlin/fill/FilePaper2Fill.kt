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
                pathData = parseSvgPathData("M 20.000 2.000 C 21.657 2.000 23.000 3.343 23.000 5.000 L 23.000 7.000 L 21.000 7.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 4.000 22.000 C 2.343 22.000 1.000 20.657 1.000 19.000 L 1.000 17.000 L 17.000 17.000 L 17.000 19.000 C 17.000 19.513 17.386 19.935 17.883 19.993 L 18.000 20.000 C 18.513 20.000 18.935 19.614 18.993 19.117 L 19.000 19.000 L 19.000 15.000 L 3.000 15.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 20.000 2.000 Z"),
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
