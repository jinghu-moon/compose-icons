package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = radixIcon(
            name = "FileText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.086 1.000 C 9.484 1.000 9.865 1.158 10.146 1.439 L 12.561 3.854 L 12.660 3.964 C 12.879 4.231 13.000 4.566 13.000 4.914 L 13.000 12.500 C 13.000 13.328 12.328 14.000 11.500 14.000 L 3.500 14.000 C 2.672 14.000 2.000 13.328 2.000 12.500 L 2.000 2.500 C 2.000 1.672 2.672 1.000 3.500 1.000 L 9.086 1.000 ZM 3.500 2.000 C 3.224 2.000 3.000 2.224 3.000 2.500 L 3.000 12.500 C 3.000 12.776 3.224 13.000 3.500 13.000 L 11.500 13.000 C 11.776 13.000 12.000 12.776 12.000 12.500 L 12.000 4.914 C 12.000 4.815 11.970 4.718 11.916 4.637 L 11.854 4.561 L 9.439 2.146 C 9.346 2.053 9.218 2.000 9.086 2.000 L 3.500 2.000 ZM 10.500 10.000 C 10.776 10.000 11.000 10.224 11.000 10.500 C 11.000 10.776 10.776 11.000 10.500 11.000 L 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 C 4.000 10.224 4.224 10.000 4.500 10.000 L 10.500 10.000 ZM 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 10.500 7.000 ZM 7.500 4.000 C 7.776 4.000 8.000 4.224 8.000 4.500 C 8.000 4.776 7.776 5.000 7.500 5.000 L 4.500 5.000 C 4.224 5.000 4.000 4.776 4.000 4.500 C 4.000 4.224 4.224 4.000 4.500 4.000 L 7.500 4.000 Z"),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
