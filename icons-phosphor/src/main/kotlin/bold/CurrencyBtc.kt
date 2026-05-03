package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorBoldIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 185.080 114.460 C 195.483 101.796 198.705 84.699 193.625 69.117 C 188.546 53.535 175.868 41.621 160.000 37.520 L 160.000 24.000 C 160.000 17.373 154.627 12.000 148.000 12.000 C 141.373 12.000 136.000 17.373 136.000 24.000 L 136.000 36.000 L 120.000 36.000 L 120.000 24.000 C 120.000 17.373 114.627 12.000 108.000 12.000 C 101.373 12.000 96.000 17.373 96.000 24.000 L 96.000 36.000 L 72.000 36.000 C 65.373 36.000 60.000 41.373 60.000 48.000 C 60.000 54.627 65.373 60.000 72.000 60.000 L 76.000 60.000 L 76.000 188.000 L 72.000 188.000 C 65.373 188.000 60.000 193.373 60.000 200.000 C 60.000 206.627 65.373 212.000 72.000 212.000 L 96.000 212.000 L 96.000 224.000 C 96.000 230.627 101.373 236.000 108.000 236.000 C 114.627 236.000 120.000 230.627 120.000 224.000 L 120.000 212.000 L 136.000 212.000 L 136.000 224.000 C 136.000 230.627 141.373 236.000 148.000 236.000 C 154.627 236.000 160.000 230.627 160.000 224.000 L 160.000 212.000 C 183.723 211.990 204.432 195.925 210.340 172.949 C 216.248 149.973 205.856 125.912 185.080 114.460 ZM 172.000 84.000 C 172.000 97.255 161.255 108.000 148.000 108.000 L 100.000 108.000 L 100.000 60.000 L 148.000 60.000 C 161.255 60.000 172.000 70.745 172.000 84.000 ZM 160.000 188.000 L 100.000 188.000 L 100.000 132.000 L 160.000 132.000 C 175.464 132.000 188.000 144.536 188.000 160.000 C 188.000 175.464 175.464 188.000 160.000 188.000 Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
