package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorLightIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 90c-5.204-.005-10.289 1.56-14.59 4.49C179.604 86.174 173.843 79.269 165.986 76.001 158.129 72.733 149.17 73.517 142 78.1v-34.1C142 29.641 130.359 18 116 18 101.641 18 90 29.641 90 44v87L82.47 118.9C75.271 106.474 59.361 102.236 46.935 109.435c-12.426 7.199-16.664 23.109-9.465 35.535l4.67 8.25c34 60 48.07 84.77 93.86 84.77 47.474-.055 85.945-38.526 86-86v-35.99C222 101.641 210.359 90 196 90ZM210 152c-.05 40.849-33.151 73.95-74 74C97.2 226 86 206.17 52.58 147.31L47.89 139h0C44.025 132.309 46.312 123.751 53 119.88c2.125-1.236 4.541-1.885 7-1.88 5.011-.009 9.645 2.66 12.15 7l.1 .17 18.68 30c1.424 2.251 4.161 3.293 6.722 2.56 2.56-.733 4.331-3.066 4.348-5.73v-108c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v68c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-12c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v20c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-4c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
