package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorRegularIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM216 200h-176v-144h176v144ZM178.05 87.66C164.59 77.56 146.81 72 128 72 109.19 72 91.41 77.56 78 87.66 63.79 98.27 56 112.6 56 128c0 15.4 7.79 29.73 22 40.34C91.41 178.44 109.19 184 128 184c18.81 0 36.59-5.56 50.05-15.66C192.21 157.73 200 143.4 200 128c0-15.4-7.79-29.73-21.95-40.34ZM128 168C97.12 168 72 150.06 72 128 72 105.94 97.12 88 128 88c30.88 0 56 17.94 56 40 0 22.06-25.12 40-56 40Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
