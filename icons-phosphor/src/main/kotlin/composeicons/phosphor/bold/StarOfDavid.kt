package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorBoldIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.82 128 234.42 78c2.146-3.717 2.143-8.297-.007-12.012C232.263 62.273 228.292 59.99 224 60h-57L138.45 10C136.296 6.269 132.308 3.979 128 4h0c-4.307 0-8.284 2.309-10.42 6.05L89 60h-57c-4.292-.01-8.263 2.273-10.413 5.988C19.437 69.703 19.434 74.283 21.58 78l28.58 50L21.58 178c-2.146 3.717-2.143 8.297 .007 12.012 2.15 3.715 6.121 5.998 10.413 5.988h57l28.57 50c2.136 3.74 6.113 6.048 10.42 6.048 4.307 0 8.284-2.308 10.42-6.048L167 196h57c4.277-0 8.23-2.277 10.377-5.975 2.147-3.699 2.163-8.261 .043-11.975ZM203.32 84 192 103.81 180.68 84ZM178.18 128 153 172h-50.1L77.81 128 102.94 84h50.06ZM128 40.18 139.33 60h-22.67ZM52.68 84h22.61L64 103.82ZM52.68 171.92 64 152.18 75.29 172ZM128 215.82 116.66 196h22.67ZM180.68 172 192 152.19 203.32 172Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
