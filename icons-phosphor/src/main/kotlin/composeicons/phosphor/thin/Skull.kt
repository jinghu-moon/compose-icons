package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorThinIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 108c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM92 148c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM164 108c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM164 148c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM128 20C72.86 20 28 63.07 28 116c0 33.43 18.33 64.64 48 82v18c0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12v-18c29.67-17.38 48-48.59 48-82C228 63.07 183.14 20 128 20ZM174.06 192.19c-1.272 .705-2.061 2.046-2.06 3.5v20.31c0 2.209-1.791 4-4 4h-20v-28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28h-24v-28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28h-20c-2.209 0-4-1.791-4-4v-20.31c.001-1.454-.788-2.795-2.06-3.5C53.6 176.48 36 147.29 36 116 36 67.48 77.27 28 128 28c50.73 0 92 39.48 92 88 0 31.29-17.6 60.48-45.94 76.19Z"),
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
