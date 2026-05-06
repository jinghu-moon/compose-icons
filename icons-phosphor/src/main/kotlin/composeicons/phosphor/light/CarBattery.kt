package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorLightIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 136c0 3.314-2.686 6-6 6h-10v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h10c3.314 0 6 2.686 6 6ZM104 130h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM238 88v96c0 7.732-6.268 14-14 14h-192c-7.732 0-14-6.268-14-14v-96C18 80.268 24.268 74 32 74h18v-18C50 48.268 56.268 42 64 42h32c7.732 0 14 6.268 14 14v18h36v-18c0-7.732 6.268-14 14-14h32c7.732 0 14 6.268 14 14v18h18c7.732 0 14 6.268 14 14ZM158 74h36v-18c0-1.105-.895-2-2-2h-32c-1.105 0-2 .895-2 2ZM62 74h36v-18c0-1.105-.895-2-2-2h-32c-1.105 0-2 .895-2 2ZM226 88c0-1.105-.895-2-2-2h-192c-1.105 0-2 .895-2 2v96c0 1.105 .895 2 2 2h192c1.105 0 2-.895 2-2Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
