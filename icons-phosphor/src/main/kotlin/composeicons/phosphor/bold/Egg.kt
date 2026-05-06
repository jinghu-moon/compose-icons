package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorBoldIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 57.34C171.06 29 147.88 12 128 12 108.12 12 84.94 29 66 57.34 46.94 86 36 120.46 36 152c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 120.46 209.06 86 190 57.34ZM128 220C90.461 219.961 60.039 189.539 60 152 60 90.88 106.19 36 128 36c21.81 0 68 54.88 68 116-.039 37.539-30.461 67.961-68 68Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
