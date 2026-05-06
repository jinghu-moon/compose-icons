package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorThinIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 164c19.882 0 36-16.118 36-36C164 108.118 147.882 92 128 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM128 100c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28ZM240 60h-224c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4v-128c0-2.209-1.791-4-4-4ZM20 107.26C39.472 102.676 54.676 87.472 59.26 68h137.48c4.584 19.472 19.788 34.676 39.26 39.26v41.48c-19.472 4.584-34.676 19.788-39.26 39.26h-137.48C54.676 168.528 39.472 153.324 20 148.74ZM236 99C220.971 94.774 209.226 83.029 205 68h31ZM51 68C46.774 83.029 35.029 94.774 20 99v-31ZM20 157c15.029 4.226 26.774 15.971 31 31h-31ZM205 188c4.226-15.029 15.971-26.774 31-31v31Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
