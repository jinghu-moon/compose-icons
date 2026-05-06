package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorThinIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.05 58.1C183.73 38.69 168.44 28 152 28h-48C87.56 28 72.27 38.69 61 58.1 50 76.84 44 101.66 44 128c0 26.34 6 51.16 17 69.9C72.27 217.31 87.56 228 104 228h48c16.44 0 31.73-10.69 43.05-30.1C206 179.16 212 154.34 212 128c0-26.34-6-51.16-16.95-69.9ZM191.27 188h-39.17c7.24-16.14 11.37-35.53 11.84-56h40c-.5 20.77-4.94 40.28-12.67 56ZM163.94 124c-.47-20.47-4.6-39.86-11.84-56h39.17c7.74 15.72 12.17 35.23 12.67 56ZM152 36c12.89 0 25.19 8.51 34.84 24h-38.73c-.35-.63-.7-1.28-1.06-1.9C141.47 48.54 134.93 41.1 127.76 36ZM67.86 193.87C57.63 176.34 52 153 52 128 52 103 57.63 79.66 67.86 62.13 77.69 45.28 90.52 36 104 36c13.48 0 26.31 9.28 36.14 26.13C150.37 79.66 156 103.05 156 128c0 24.95-5.63 48.34-15.86 65.87C130.31 210.72 117.48 220 104 220 90.52 220 77.69 210.72 67.86 193.87ZM152 220h-24.24c7.17-5.09 13.71-12.54 19.29-22.1 .36-.62 .71-1.27 1.06-1.9h38.73c-9.65 15.49-21.95 24-34.84 24Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
