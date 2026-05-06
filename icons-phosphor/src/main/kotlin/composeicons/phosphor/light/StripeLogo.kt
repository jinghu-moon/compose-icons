package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorLightIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 152c0 16.54-17.05 30-38 30C107.05 182 90 168.54 90 152c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 9.76 11.91 18 26 18 14.09 0 26-8.24 26-18 0-11.21-10.7-15.1-28.33-20.18C109.78 127.24 91.78 122.05 91.78 104 91.78 86.9 107.35 74 128 74c15 0 27.74 6.88 33.34 18 1.497 2.957 .312 6.568-2.645 8.065-2.957 1.497-6.568 .312-8.065-2.645C147.08 90.36 138.41 86 128 86c-13.81 0-24.22 7.74-24.22 18 0 8.41 9.52 11.76 25.21 16.29C145.48 125 166 131 166 152ZM222 48v160c0 7.732-6.268 14-14 14h-160c-7.732 0-14-6.268-14-14v-160C34 40.268 40.268 34 48 34h160c7.732 0 14 6.268 14 14ZM210 48c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v160c0 1.105 .895 2 2 2h160c1.105 0 2-.895 2-2Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
