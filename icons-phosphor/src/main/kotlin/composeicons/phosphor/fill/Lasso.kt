package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.addPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorFillIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M93.43 136.11c-5.824-.729-11.615 1.573-15.35 6.1 9.31 6.56 22.51 11.33 37.43 13.07C110.41 143.33 101.72 137 93.43 136.11Z")
            addPathData("M224 48v160c0 8.837-7.163 16-16 16h-80.35c-1.499-.005-2.869-.848-3.55-2.184-.681-1.336-.557-2.94 .32-4.156C131.92 207.43 136 194.42 136 179.82c0-2.79-.13-5.46-.35-8.05C176.79 169.33 208 147.47 208 120 208 90.85 172.86 68 128 68 83.14 68 48 90.84 48 120c0 27.31 30.82 49.07 71.58 51.73 .282 2.687 .422 5.388 .42 8.09 0 17.62-7.65 31.95-21 39.32-6.028 3.345-12.838 5.023-19.73 4.86h-31.27c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM192 120C192 100.49 162.69 84 128 84 93.31 84 64 100.48 64 120c.047 3.746 1.082 7.412 3 10.63 7.229-7.704 17.656-11.567 28.16-10.43 15 1.63 30.84 13.4 37.54 35.68C165.3 154.47 192 138.62 192 120Z")
        }
        return _lasso!!
    }

private var _lasso: ImageVector? = null
