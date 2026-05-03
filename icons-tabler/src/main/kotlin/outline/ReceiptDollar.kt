package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptDollar: ImageVector
    get() {
        if (_receiptDollar != null) return _receiptDollar!!
        _receiptDollar = tablerOutlineIcon(
            name = "ReceiptDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 21.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000 L 19.000 21.000 L 16.000 19.000 L 14.000 21.000 L 12.000 19.000 L 10.000 21.000 L 8.000 19.000 L 5.000 21.000"),
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
        pathData = parseSvgPathData("M 14.800 8.000 C 14.431 7.360 13.739 6.975 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 7.895 9.000 9.000 C 9.000 10.105 9.895 11.000 11.000 11.000 L 13.000 11.000 C 14.105 11.000 15.000 11.895 15.000 13.000 C 15.000 14.105 14.105 15.000 13.000 15.000 L 11.000 15.000 C 10.261 15.025 9.569 14.640 9.200 14.000"),
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
        pathData = parseSvgPathData("M 12.000 6.000 L 12.000 16.000"),
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
        return _receiptDollar!!
    }

private var _receiptDollar: ImageVector? = null
