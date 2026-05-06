package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorBoldIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 132c0 13.255-10.745 24-24 24C78.745 156 68 145.255 68 132c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM164 108c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM236 116c0 29.85-13.05 57.78-36 77.52v22.48c0 11.046-8.954 20-20 20h-104C64.954 236 56 227.046 56 216v-22.48C33 173.78 20 145.85 20 116 20 58.65 68.45 12 128 12c59.55 0 108 46.65 108 104ZM212 116C212 71.89 174.32 36 128 36 81.68 36 44 71.89 44 116c0 24.31 11.41 47 31.31 62.3 2.958 2.272 4.691 5.79 4.69 9.52v24.18h16v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20h16v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20h16v-24.18c.002-3.726 1.735-7.24 4.69-9.51C200.59 163 212 140.31 212 116Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
