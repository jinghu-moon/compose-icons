package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorLightIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 136v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM128 162c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM222 56v56c0 51.94-25.12 83.4-46.2 100.64-22.73 18.6-45.27 24.89-46.22 25.15-1.034 .282-2.126 .282-3.16 0-1-.26-23.49-6.55-46.22-25.15C59.12 195.4 34 163.94 34 112v-56C34 48.268 40.268 42 48 42h160c7.732 0 14 6.268 14 14ZM210 56c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v56c0 37.75 13.94 68.39 41.44 91.06 12.061 9.911 25.797 17.585 40.56 22.66 14.761-5.08 28.496-12.753 40.56-22.66C196.06 180.39 210 149.75 210 112Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
