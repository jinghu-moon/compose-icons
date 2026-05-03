package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptRussianRuble: ImageVector
    get() {
        if (_receiptRussianRuble != null) return _receiptRussianRuble!!
        _receiptRussianRuble = lucideOutlineIcon(
            name = "ReceiptRussianRuble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 C 5.248 1.999 5.490 2.068 5.700 2.200 L 6.633 2.800 C 7.060 3.073 7.606 3.073 8.033 2.800 L 8.967 2.200 C 9.394 1.927 9.940 1.927 10.367 2.200 L 11.300 2.800 C 11.727 3.073 12.273 3.073 12.700 2.800 L 13.633 2.200 C 14.060 1.927 14.606 1.927 15.033 2.200 L 15.967 2.800 C 16.394 3.073 16.940 3.073 17.367 2.800 L 18.300 2.200 C 18.510 2.068 18.752 1.999 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 C 18.752 22.001 18.510 21.932 18.300 21.800 L 17.367 21.200 C 16.940 20.927 16.394 20.927 15.967 21.200 L 15.033 21.800 C 14.606 22.073 14.060 22.073 13.633 21.800 L 12.700 21.200 C 12.273 20.927 11.727 20.927 11.300 21.200 L 10.367 21.800 C 9.940 22.073 9.394 22.073 8.967 21.800 L 8.033 21.200 C 7.606 20.927 7.060 20.927 6.633 21.200 L 5.700 21.800 C 5.490 21.932 5.248 22.001 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 11.000 L 13.000 11.000 C 14.105 11.000 15.000 10.105 15.000 9.000 C 15.000 7.895 14.105 7.000 13.000 7.000 L 10.000 7.000 L 10.000 17.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 15.000 L 13.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _receiptRussianRuble!!
    }

private var _receiptRussianRuble: ImageVector? = null
