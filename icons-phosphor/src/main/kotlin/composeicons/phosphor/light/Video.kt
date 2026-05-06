package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorLightIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.33 107l-48-32c-1.842-1.229-4.212-1.344-6.164-.297C107.214 75.749 105.997 77.785 106 80v64c-.003 2.215 1.214 4.251 3.166 5.297 1.952 1.046 4.322 .932 6.164-.297l48-32c1.676-1.112 2.683-2.989 2.683-5 0-2.011-1.008-3.888-2.683-5ZM118 132.79v-41.58L149.18 112ZM216 42h-176C32.268 42 26 48.268 26 56v112c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM218 168c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
