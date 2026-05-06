package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorLightIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 78c14.359 0 26-11.641 26-26C190 37.641 178.359 26 164 26c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26ZM164 38c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM200 138c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM200 202c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM56 138c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C94 155.013 76.987 138 56 138ZM56 202C41.641 202 30 190.359 30 176c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM192 118h-40c-1.591-.001-3.116-.634-4.24-1.76L120 88.49 96.49 112l35.75 35.76c1.126 1.124 1.759 2.649 1.76 4.24v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-45.51L83.76 116.24c-2.34-2.343-2.34-6.137 0-8.48l32-32c2.343-2.34 6.137-2.34 8.48 0L154.49 106h37.51c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
