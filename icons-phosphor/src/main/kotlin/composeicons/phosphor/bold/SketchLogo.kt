package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorBoldIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249 96.1l-56-64C190.729 29.503 187.45 28.009 184 28h-112c-3.45 .009-6.729 1.503-9 4.1l-56 64c-4.055 4.635-3.943 11.588 .26 16.09l112 120c2.269 2.43 5.445 3.809 8.77 3.809 3.325 0 6.501-1.379 8.77-3.809l112-120c4.185-4.517 4.272-11.47 .2-16.09ZM213.55 92h-31.55L152 52h26.55ZM71.88 116l21.19 53L43.61 116ZM158.28 116 128 191.69 97.72 116ZM104 92 128 60l24 32ZM184.12 116h28.27l-49.46 53ZM77.45 52h26.55L74 92h-31.55Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
