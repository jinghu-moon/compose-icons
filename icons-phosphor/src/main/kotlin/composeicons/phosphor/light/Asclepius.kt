package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorLightIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 79v1c0 20.987-17.013 38-38 38h-42v84h10c7.465 .002 14.156-4.604 16.819-11.578 2.663-6.974 .746-14.867-4.819-19.842-1.655-1.414-2.415-3.613-1.985-5.746 .43-2.134 1.981-3.867 4.054-4.531 2.073-.663 4.343-.151 5.931 1.337 9.271 8.292 12.463 21.445 8.024 33.065C167.586 206.324 156.438 214 144 214h-10v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-84h-26c-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C79.431 166 66 152.569 66 136c0-16.569 13.431-30 30-30h26v-82c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v82h42c14.359 0 26-11.641 26-26v-1C202 65.193 190.807 54 177 54h-17c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h17c20.435 0 37 16.565 37 37ZM56 94h-24c-3.314 0-6-2.686-6-6v-8C26 59.013 43.013 42 64 42h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-2v2C94 76.987 76.987 94 56 94ZM82 54h-18C49.641 54 38 65.641 38 80v2h18C70.359 82 82 70.359 82 56Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
