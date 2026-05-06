package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorBoldIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.29 138.22l-104 64c-3.703 2.279-8.348 2.377-12.143 .256C118.351 200.355 116 196.348 116 192v-106.53L30.29 138.22c-5.644 3.474-13.036 1.714-16.51-3.93-3.474-5.644-1.714-13.036 3.93-16.51l104-64c3.703-2.279 8.348-2.377 12.143-.256 3.795 2.121 6.147 6.128 6.147 10.476v106.53l85.71-52.75c5.644-3.474 13.036-1.714 16.51 3.93 3.474 5.644 1.714 13.036-3.93 16.51Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
