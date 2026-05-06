package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorBoldIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.94 92.67 59.94 28.67c-3.668-1.275-7.727-.696-10.892 1.554C45.882 32.474 44.002 36.116 44 40v176c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-39.47L243.94 115.33c4.818-1.681 8.046-6.227 8.046-11.33 0-5.103-3.228-9.649-8.046-11.33ZM68 151.12v-94.24L203.47 104Z"),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
