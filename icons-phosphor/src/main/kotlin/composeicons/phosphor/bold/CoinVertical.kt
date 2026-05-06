package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorBoldIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 20h-48C65.87 20 36 67.44 36 128c0 60.56 29.87 108 68 108h48c38.13 0 68-47.44 68-108C220 67.44 190.13 20 152 20ZM189.21 172h-22.9c2.825-10.464 4.597-21.184 5.29-32h23.93c-.788 10.885-2.911 21.632-6.32 32ZM171.6 116c-.693-10.816-2.465-21.536-5.29-32h22.9c3.409 10.368 5.532 21.115 6.32 32ZM177.23 60h-20c-2.812-5.642-6.161-11-10-16h4.77c5.37 0 15.25 2.25 25.23 16ZM74.77 189.84C65.24 173.51 60 151.55 60 128 60 104.45 65.24 82.49 74.77 66.16 86 46.88 97.91 44 104 44c6.09 0 18 2.88 29.23 22.16C142.76 82.49 148 104.45 148 128c0 23.55-5.24 45.51-14.77 61.84C122 209.12 110.09 212 104 212c-6.09 0-18-2.88-29.23-22.16ZM152 212h-4.79c3.839-5 7.188-10.358 10-16h20c-9.96 13.75-19.84 16-25.21 16Z"),
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
