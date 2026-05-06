package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorLightIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 76.05v-4.05c0-7.732-6.268-14-14-14h-26v-42c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v42h-26C88.268 58 82 64.268 82 72v4C42.924 93.923 17.908 133.009 18 176c0 3.314 2.686 6 6 6h66v2c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38v-2h66c3.314 0 6-2.686 6-6 .072-42.972-24.94-82.034-64-99.95ZM154 184c0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26v-2h52ZM30.18 170C32.403 132.65 55.75 99.846 90.31 85.51 92.535 84.582 93.989 82.411 94 80v-8c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2v8c-.001 2.422 1.455 4.607 3.69 5.54 34.551 14.331 57.895 47.122 60.13 84.46Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
