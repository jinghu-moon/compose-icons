package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QrScanAiLine: ImageVector
    get() {
        if (_qrScanAiLine != null) return _qrScanAiLine!!
        _qrScanAiLine = remixIcon(
            name = "QrScanAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 19h4v2h-6v-5h2v3ZM21 21h-6v-2h4v-3h2v5ZM21 13h-18v-2h18v2ZM18.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.181 .414-.753 .414-.934 0l-.247-.565C17.847 7.119 17.055 6.316 16.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM9 5h-4v3h-2v-5h6v2Z"),
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
        return _qrScanAiLine!!
    }

private var _qrScanAiLine: ImageVector? = null
