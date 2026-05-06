package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorBoldIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 198.65v41.35c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-41.35C211.97 182.368 206.318 166.595 196 154v48.27c-.028 5.281-3.505 9.924-8.566 11.435-5.061 1.511-10.515-.464-13.434-4.865L163.33 192.54c-.13-.19-.25-.38-.36-.58-2.146-3.866-7.019-5.261-10.885-3.115-3.866 2.146-5.261 7.019-3.115 10.885l22 33.66c2.426 3.587 2.732 8.204 .799 12.079-1.933 3.876-5.804 6.409-10.129 6.629-4.325 .22-8.433-1.908-10.749-5.568l-22.26-34c-.12-.19-.24-.38-.35-.58-7.188-12.541-5.076-28.345 5.154-38.558 10.23-10.213 26.036-12.3 38.566-5.092v-100.3h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12c11.046 0 20 8.954 20 20v57.52c25.01 17.739 39.908 46.468 40 77.13ZM88 56C88 49.373 82.627 44 76 44h-12C52.954 44 44 52.954 44 64v136c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-132h8c6.627 0 12-5.373 12-12ZM156.49 116.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L132 107v-91C132 9.373 126.627 4 120 4c-6.627 0-12 5.373-12 12v91l-7.51-7.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l28 28c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
