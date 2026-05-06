package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QrScan2Line: ImageVector
    get() {
        if (_qrScan2Line != null) return _qrScan2Line!!
        _qrScan2Line = remixIcon(
            name = "QrScan2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3h6v5h-2v-3h-4v-2ZM9 3v2h-4v3h-2v-5h6ZM15 21v-2h4v-3h2v5h-6ZM9 21h-6v-5h2v3h4v2ZM3 11h18v2h-18v-2Z"),
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
        return _qrScan2Line!!
    }

private var _qrScan2Line: ImageVector? = null
