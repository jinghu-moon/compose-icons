package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorLightIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 136v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM230 91.55v72.9c.009 3.715-1.467 7.279-4.1 9.9l-51.55 51.55c-2.621 2.633-6.185 4.109-9.9 4.1h-72.9c-3.715 .009-7.279-1.467-9.9-4.1L30.1 174.35C27.467 171.729 25.991 168.165 26 164.45v-72.9c-.009-3.715 1.467-7.279 4.1-9.9L81.65 30.1C84.271 27.467 87.835 25.991 91.55 26h72.9c3.715-.009 7.279 1.467 9.9 4.1l51.55 51.55c2.633 2.621 4.109 6.185 4.1 9.9ZM218 91.55c0-.533-.212-1.044-.59-1.42L165.87 38.59c-.376-.378-.887-.59-1.42-.59h-72.9c-.53 .002-1.037 .214-1.41 .59L38.58 90.13c-.374 .377-.583 .888-.58 1.42v72.9c-0 .533 .212 1.044 .59 1.42l51.54 51.54c.376 .378 .887 .59 1.42 .59h72.9c.53-.002 1.037-.214 1.41-.59l51.56-51.54c.374-.377 .583-.888 .58-1.42ZM128 162c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
