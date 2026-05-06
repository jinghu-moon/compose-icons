package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorThinIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.79 132.42 156 93.53v-45.53C156 32.536 143.464 20 128 20c-15.464 0-28 12.536-28 28v45.53L22.21 132.42c-1.355 .678-2.211 2.064-2.21 3.58v32c.001 1.197 .538 2.331 1.464 3.09 .926 .759 2.142 1.064 3.316 .83l75.22-15v25.46L85.17 197.17c-.75 .751-1.171 1.769-1.17 2.83v32c.001 1.328 .66 2.569 1.76 3.312 1.1 .743 2.497 .893 3.73 .398L128 220.31l38.51 15.4c.473 .194 .979 .293 1.49 .29 .799 .003 1.581-.238 2.24-.69 1.099-.743 1.759-1.983 1.76-3.31v-32c.001-1.061-.42-2.079-1.17-2.83L156 182.34v-25.46l75.22 15c1.167 .232 2.377-.068 3.301-.818 .924-.75 1.466-1.872 1.479-3.062v-32c.001-1.516-.855-2.902-2.21-3.58ZM228 163.12l-75.22-15c-1.167-.232-2.377 .068-3.301 .818-.924 .75-1.466 1.872-1.479 3.062v32c-.001 1.061 .42 2.079 1.17 2.83L164 201.66v24.43L129.49 212.29c-.962-.389-2.038-.389-3 0L92 226.09v-24.43l14.83-14.83c.75-.751 1.171-1.769 1.17-2.83v-32c-.001-1.197-.538-2.331-1.464-3.09-.926-.759-2.142-1.064-3.316-.83L28 163.12v-24.65L105.79 99.58c1.355-.678 2.211-2.064 2.21-3.58v-48c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v48c-.001 1.516 .855 2.902 2.21 3.58L228 138.47Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
