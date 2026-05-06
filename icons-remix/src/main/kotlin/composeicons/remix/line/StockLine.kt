package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StockLine: ImageVector
    get() {
        if (_stockLine != null) return _stockLine!!
        _stockLine = remixIcon(
            name = "StockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.005 5.003h3v9h-3v3h-2v-3h-3v-9h3v-3h2v3ZM5.005 7.003v5h4v-5h-4ZM18.005 10.003h3v9h-3v3h-2v-3h-3v-9h3v-3h2v3ZM15.005 12.003v5h4v-5h-4Z"),
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
        return _stockLine!!
    }

private var _stockLine: ImageVector? = null
