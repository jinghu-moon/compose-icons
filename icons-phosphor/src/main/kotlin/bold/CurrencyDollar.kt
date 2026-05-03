package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorBoldIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 116.000 L 140.000 116.000 L 140.000 60.000 L 144.000 60.000 C 159.464 60.000 172.000 72.536 172.000 88.000 C 172.000 94.627 177.373 100.000 184.000 100.000 C 190.627 100.000 196.000 94.627 196.000 88.000 C 195.967 59.295 172.705 36.033 144.000 36.000 L 140.000 36.000 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 36.000 L 112.000 36.000 C 83.281 36.000 60.000 59.281 60.000 88.000 C 60.000 116.719 83.281 140.000 112.000 140.000 L 116.000 140.000 L 116.000 196.000 L 104.000 196.000 C 88.536 196.000 76.000 183.464 76.000 168.000 C 76.000 161.373 70.627 156.000 64.000 156.000 C 57.373 156.000 52.000 161.373 52.000 168.000 C 52.033 196.705 75.295 219.967 104.000 220.000 L 116.000 220.000 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 220.000 L 152.000 220.000 C 180.719 220.000 204.000 196.719 204.000 168.000 C 204.000 139.281 180.719 116.000 152.000 116.000 ZM 112.000 116.000 C 96.536 116.000 84.000 103.464 84.000 88.000 C 84.000 72.536 96.536 60.000 112.000 60.000 L 116.000 60.000 L 116.000 116.000 ZM 152.000 196.000 L 140.000 196.000 L 140.000 140.000 L 152.000 140.000 C 167.464 140.000 180.000 152.536 180.000 168.000 C 180.000 183.464 167.464 196.000 152.000 196.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
