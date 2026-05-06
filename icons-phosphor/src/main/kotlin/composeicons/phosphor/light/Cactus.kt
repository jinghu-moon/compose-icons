package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorLightIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 210h-50v-28h6c36.433-.044 65.956-29.567 66-66C238 101.641 226.359 90 212 90c-14.359 0-26 11.641-26 26 0 7.732-6.268 14-14 14h-6v-74C166 35.013 148.987 18 128 18 107.013 18 90 35.013 90 56v34h-6C76.268 90 70 83.732 70 76 70 61.641 58.359 50 44 50 29.641 50 18 61.641 18 76c.044 36.433 29.567 65.956 66 66h6v68h-50c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM96 130h-12C54.19 129.967 30.033 105.81 30 76 30 68.268 36.268 62 44 62c7.732 0 14 6.268 14 14 0 14.359 11.641 26 26 26h12c3.314 0 6-2.686 6-6v-40c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26v80c0 3.314 2.686 6 6 6h12c14.359 0 26-11.641 26-26 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14-.033 29.81-24.19 53.967-54 54h-12c-3.314 0-6 2.686-6 6v34h-52v-74c0-3.314-2.686-6-6-6Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
