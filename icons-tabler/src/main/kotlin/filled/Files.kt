package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = tablerFilledIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 L 14.000 2.001 L 14.000 8.000 C 14.000 8.507 14.380 8.934 14.883 8.993 L 15.000 9.000 L 21.000 9.000 L 21.000 15.000 C 21.000 16.657 19.657 18.000 18.000 18.000 L 17.000 18.000 L 17.000 19.000 C 17.000 20.657 15.657 22.000 14.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 9.000 C 4.000 7.343 5.343 6.000 7.000 6.000 L 8.000 6.000 L 8.000 5.000 C 8.000 3.343 9.343 2.000 11.000 2.000M 8.000 8.000 L 7.000 8.000 C 6.448 8.000 6.000 8.448 6.000 9.000 L 6.000 19.000 C 6.000 19.552 6.448 20.000 7.000 20.000 L 14.000 20.000 C 14.552 20.000 15.000 19.552 15.000 19.000 L 15.000 18.000 L 11.000 18.000 C 9.343 18.000 8.000 16.657 8.000 15.000 ZM 20.415 7.000 L 16.000 7.000 L 16.000 2.585 Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
