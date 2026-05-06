package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorLightIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 58h-50v-42c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v42h-68v-42c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v42h-49.45c-1.677-.124-3.331 .449-4.571 1.585C26.739 60.721 26.023 62.319 26 64c0 3.314 2.686 6 6 6h18v90c0 20.987 17.013 38 38 38h34v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h34c20.987 0 38-17.013 38-38v-90h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM194 160c0 14.359-11.641 26-26 26h-80C73.641 186 62 174.359 62 160v-90h132ZM107.07 131.42c-1.124-1.618-1.382-3.685-.69-5.53l12-32c1.165-3.104 4.626-4.675 7.73-3.51 3.104 1.165 4.675 4.626 3.51 7.73L120.62 122h23.38c1.969-.001 3.813 .964 4.935 2.583 1.122 1.618 1.378 3.684 .685 5.527l-12 32c-1.165 3.104-4.626 4.675-7.73 3.51-3.104-1.165-4.675-4.626-3.51-7.73L135.38 134h-23.38c-1.967 0-3.809-.964-4.93-2.58Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
