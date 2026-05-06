package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorThinIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.1 131.41l-104 64c-.632 .387-1.359 .592-2.1 .59-2.209 0-4-1.791-4-4v-120.84L26.1 131.41c-1.883 1.16-4.35 .573-5.51-1.31-1.16-1.883-.573-4.35 1.31-5.51L125.9 60.59c1.235-.762 2.785-.795 4.052-.087 1.266 .708 2.05 2.046 2.048 3.497v120.84l97.9-60.25c1.883-1.16 4.35-.573 5.51 1.31 1.16 1.883 .573 4.35-1.31 5.51Z"),
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
