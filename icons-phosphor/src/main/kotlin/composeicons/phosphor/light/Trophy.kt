package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorLightIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 66h-26v-18c0-3.314-2.686-6-6-6h-144c-3.314 0-6 2.686-6 6v18h-26C16.268 66 10 72.268 10 80v16c0 20.987 17.013 38 38 38h5.14c9.147 31.081 36.556 53.272 68.86 55.75v28.25h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-28.25c32.44-2.52 59.43-25.3 68.62-55.75h5.38c20.987 0 38-17.013 38-38v-16c0-7.732-6.268-14-14-14ZM48 122C33.641 122 22 110.359 22 96v-16c0-1.105 .895-2 2-2h26v34c.01 3.344 .227 6.683 .65 10ZM194 111.1c0 36.62-29.38 66.63-65.5 66.9-17.591 .133-34.507-6.761-46.993-19.153C69.022 146.455 61.999 129.591 62 112v-58h132ZM234 96c0 14.359-11.641 26-26 26h-2.77c.51-3.611 .767-7.253 .77-10.9v-33.1h26c1.105 0 2 .895 2 2Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
