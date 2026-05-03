package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorFillIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 104.000 C 132.418 104.000 136.000 107.582 136.000 112.000 C 136.000 116.418 132.418 120.000 128.000 120.000 L 88.000 120.000 L 88.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 139.582 120.000 144.000 C 120.000 148.418 116.418 152.000 112.000 152.000 L 88.810 152.000 C 91.673 166.037 101.824 177.471 115.423 181.976 C 129.022 186.482 143.992 183.371 154.670 173.820 C 156.782 171.802 159.826 171.096 162.611 171.977 C 165.396 172.859 167.479 175.188 168.045 178.054 C 168.611 180.919 167.570 183.866 165.330 185.740 C 149.948 199.492 128.251 203.673 108.861 196.619 C 89.471 189.566 75.530 172.421 72.580 152.000 L 64.000 152.000 C 59.582 152.000 56.000 148.418 56.000 144.000 C 56.000 139.582 59.582 136.000 64.000 136.000 L 72.000 136.000 L 72.000 120.000 L 64.000 120.000 C 59.582 120.000 56.000 116.418 56.000 112.000 C 56.000 107.582 59.582 104.000 64.000 104.000 L 72.580 104.000 C 75.530 83.579 89.471 66.434 108.861 59.381 C 128.251 52.327 149.948 56.508 165.330 70.260 C 167.570 72.134 168.611 75.081 168.045 77.946 C 167.479 80.812 165.396 83.141 162.611 84.023 C 159.826 84.904 156.782 84.198 154.670 82.180 C 143.992 72.629 129.022 69.518 115.423 74.024 C 101.824 78.529 91.673 89.963 88.810 104.000 Z"),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
