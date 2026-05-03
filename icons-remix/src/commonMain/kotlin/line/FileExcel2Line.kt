package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileExcel2Line: ImageVector
    get() {
        if (_fileExcel2Line != null) return _fileExcel2Line!!
        _fileExcel2Line = remixIcon(
            name = "FileExcel2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.859 2.877 L 15.429 1.082 C 15.703 1.042 15.956 1.232 15.995 1.506 C 15.998 1.529 16.000 1.553 16.000 1.576 L 16.000 22.424 C 16.000 22.700 15.776 22.924 15.500 22.924 C 15.476 22.924 15.453 22.922 15.429 22.918 L 2.859 21.123 C 2.366 21.052 2.000 20.630 2.000 20.133 L 2.000 3.867 C 2.000 3.370 2.366 2.948 2.859 2.877 ZM 4.000 4.735 L 4.000 19.265 L 14.000 20.694 L 14.000 3.306 L 4.000 4.735 ZM 17.000 19.000 L 20.000 19.000 L 20.000 5.000 L 17.000 5.000 L 17.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 17.000 21.000 L 17.000 19.000 ZM 10.200 12.000 L 13.000 16.000 L 10.600 16.000 L 9.000 13.714 L 7.400 16.000 L 5.000 16.000 L 7.800 12.000 L 5.000 8.000 L 7.400 8.000 L 9.000 10.286 L 10.600 8.000 L 13.000 8.000 L 10.200 12.000 Z"),
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
        return _fileExcel2Line!!
    }

private var _fileExcel2Line: ImageVector? = null
