package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorLightIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 86c7.994-.068 15.841 2.156 22.61 6.41 3.076 1.968 6.981 2.103 10.185 .352C212 91.011 213.995 87.652 214 84v-36c0-7.732-6.268-14-14-14h-144C48.268 34 42 40.268 42 48v160c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-36c-.004-3.646-1.993-7-5.189-8.754-3.196-1.754-7.093-1.63-10.171 .324-7.63 4.89-14.11 6.76-22.4 6.42h-.24c-23.196 0-42-18.804-42-42 0-23.196 18.804-42 42-42ZM122 128c.033 29.763 24.117 53.901 53.88 54 9.151 .485 18.24-1.752 26.12-6.43v32.43c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2v32.48c-16.778-9.028-37.061-8.599-53.441 1.131C132.178 91.342 122.098 108.948 122 128Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
