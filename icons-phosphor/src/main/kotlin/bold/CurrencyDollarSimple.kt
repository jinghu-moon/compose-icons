package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorBoldIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 168.000 C 203.967 196.705 180.705 219.967 152.000 220.000 L 140.000 220.000 L 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 L 116.000 220.000 L 104.000 220.000 C 75.295 219.967 52.033 196.705 52.000 168.000 C 52.000 161.373 57.373 156.000 64.000 156.000 C 70.627 156.000 76.000 161.373 76.000 168.000 C 76.000 183.464 88.536 196.000 104.000 196.000 L 152.000 196.000 C 167.464 196.000 180.000 183.464 180.000 168.000 C 180.000 152.536 167.464 140.000 152.000 140.000 L 112.000 140.000 C 83.281 140.000 60.000 116.719 60.000 88.000 C 60.000 59.281 83.281 36.000 112.000 36.000 L 116.000 36.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 36.000 L 144.000 36.000 C 172.705 36.033 195.967 59.295 196.000 88.000 C 196.000 94.627 190.627 100.000 184.000 100.000 C 177.373 100.000 172.000 94.627 172.000 88.000 C 172.000 72.536 159.464 60.000 144.000 60.000 L 112.000 60.000 C 96.536 60.000 84.000 72.536 84.000 88.000 C 84.000 103.464 96.536 116.000 112.000 116.000 L 152.000 116.000 C 180.705 116.033 203.967 139.295 204.000 168.000 Z"),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
