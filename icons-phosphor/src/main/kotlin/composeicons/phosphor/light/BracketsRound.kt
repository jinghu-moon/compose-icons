package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorLightIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.52 64C44.23 81.46 38 103 38 128c0 25 6.23 46.54 18.52 64 9.17 13 18.49 18.81 18.59 18.87 2.745 1.751 3.593 5.372 1.91 8.16-1.683 2.788-5.282 3.724-8.11 2.11C67.16 220.09 26 194.63 26 128 26 61.37 67.16 35.91 68.91 34.86c2.828-1.614 6.427-.677 8.11 2.11 1.683 2.788 .835 6.409-1.91 8.16C75 45.19 65.69 51 56.52 64ZM187.09 34.86c-2.828-1.614-6.427-.677-8.11 2.11-1.683 2.788-.835 6.409 1.91 8.16 .1 .06 9.42 5.84 18.59 18.87C211.77 81.46 218 103 218 128c0 25-6.23 46.54-18.52 64-9.17 13-18.49 18.81-18.57 18.85-2.842 1.707-3.762 5.393-2.055 8.235 1.707 2.841 5.393 3.762 8.235 2.055C188.84 220.14 230 194.63 230 128 230 61.37 188.84 35.91 187.09 34.86Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
