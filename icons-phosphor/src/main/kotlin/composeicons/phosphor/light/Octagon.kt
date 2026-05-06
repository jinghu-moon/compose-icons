package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorLightIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.9 81.65 174.35 30.1C171.729 27.467 168.165 25.991 164.45 26h-72.9c-3.715-.009-7.279 1.467-9.9 4.1L30.1 81.65C27.467 84.271 25.991 87.835 26 91.55v72.9c-.009 3.715 1.467 7.279 4.1 9.9l51.55 51.55c2.621 2.633 6.185 4.109 9.9 4.1h72.9c3.715 .009 7.279-1.467 9.9-4.1l51.55-51.55c2.633-2.621 4.109-6.185 4.1-9.9v-72.9c.009-3.715-1.467-7.279-4.1-9.9ZM218 164.45c0 .533-.212 1.044-.59 1.42l-51.55 51.54c-.373 .376-.88 .588-1.41 .59h-72.9c-.533 0-1.044-.212-1.42-.59L38.59 165.87c-.378-.376-.59-.887-.59-1.42v-72.9c-0-.533 .212-1.044 .59-1.42L90.14 38.59c.373-.376 .88-.588 1.41-.59h72.9c.533-0 1.044 .212 1.42 .59l51.54 51.55c.376 .373 .588 .88 .59 1.41Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
