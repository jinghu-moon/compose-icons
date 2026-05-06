package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorLightIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.24 108.24l-48 48c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L209.51 110h-44.51c-41.057-.034-76.926 27.741-87.17 67.5-.828 3.209-4.101 5.138-7.31 4.31-3.209-.828-5.138-4.101-4.31-7.31C77.822 129.442 118.47 97.966 165 98h44.53L171.76 60.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l48 48c2.34 2.343 2.34 6.137 0 8.48ZM192 210h-154v-122c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6h160c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
