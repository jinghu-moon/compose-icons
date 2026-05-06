package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorLightIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 163.37v-19.37C221.94 99.927 191.32 61.79 148.3 52.21c8.508-10.632 7.372-26.027-2.605-35.295-9.977-9.268-25.414-9.268-35.391 0-9.977 9.268-11.113 24.663-2.605 35.295C64.68 61.79 34.06 99.927 34 144v19.37c-4.88 2.315-7.993 7.229-8 12.63v32c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-32c-.007-5.401-3.12-10.315-8-12.63ZM114 36c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14ZM128 62c45.265 .055 81.945 36.735 82 82v18h-164v-18C46.055 98.735 82.735 62.055 128 62ZM122 174v36h-44v-36ZM134 174h44v36h-44ZM38 208v-32c0-1.105 .895-2 2-2h26v36h-26c-1.105 0-2-.895-2-2ZM218 208c0 1.105-.895 2-2 2h-26v-36h26c1.105 0 2 .895 2 2Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
