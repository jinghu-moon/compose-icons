package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorBoldIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 148.4v-12.4C227.886 94.697 202.492 57.677 164 42.7v-2.7C164 28.954 155.046 20 144 20h-32C100.954 20 92 28.954 92 40v2.7C53.508 57.677 28.114 94.697 28 136v12.4C18.687 150.301 11.998 158.495 12 168v24c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-24c.002-9.505-6.687-17.699-16-19.6ZM204 136v12h-40v-78.93c24.579 13.307 39.922 38.98 40 66.93ZM140 44v104h-24v-104ZM92 69.07v78.93h-40v-12C52.078 108.05 67.421 82.377 92 69.07ZM220 188h-184v-16h184Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
