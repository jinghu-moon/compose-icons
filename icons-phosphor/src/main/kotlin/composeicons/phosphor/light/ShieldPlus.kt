package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorLightIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 128c0 3.314-2.686 6-6 6h-26v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-26c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v26h26c3.314 0 6 2.686 6 6ZM222 56v56c0 51.94-25.12 83.4-46.2 100.64-22.73 18.6-45.27 24.89-46.22 25.15-1.034 .282-2.126 .282-3.16 0-1-.26-23.49-6.55-46.22-25.15C59.12 195.4 34 163.94 34 112v-56C34 48.268 40.268 42 48 42h160c7.732 0 14 6.268 14 14ZM210 56c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v56c0 37.75 13.94 68.39 41.44 91.06 12.06 9.913 25.796 17.587 40.56 22.66 14.762-5.078 28.497-12.751 40.56-22.66C196.06 180.39 210 149.75 210 112Z"),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
