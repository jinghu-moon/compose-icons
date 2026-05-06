package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorLightIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 154h-42.72c.476-3.312 .716-6.654 .72-10C198 105.34 166.66 74 128 74 89.34 74 58 105.34 58 144c.004 3.346 .244 6.688 .72 10h-42.72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM70 144c-.003-21.925 12.357-41.978 31.946-51.827 19.588-9.849 43.056-7.811 60.653 5.268 17.597 13.079 26.315 34.962 22.531 56.559h-114.26c-.575-3.302-.866-6.648-.87-10ZM214 200c0 3.314-2.686 6-6 6h-160c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h160c3.314 0 6 2.686 6 6ZM74.63 42.69c-1.483-2.966-.281-6.572 2.685-8.055 2.966-1.483 6.572-.281 8.055 2.685l8 16c1.48 2.966 .276 6.57-2.69 8.05-2.966 1.48-6.57 .276-8.05-2.69ZM18.63 93.32c.71-1.425 1.958-2.508 3.468-3.013 1.51-.505 3.158-.388 4.582 .323l16 8c2.966 1.48 4.17 5.084 2.69 8.05-1.48 2.966-5.084 4.17-8.05 2.69l-16-8c-1.425-.71-2.508-1.958-3.013-3.468-.505-1.51-.388-3.158 .323-4.582ZM210.63 106.68c-.711-1.424-.827-3.073-.323-4.582 .505-1.51 1.588-2.757 3.013-3.468l16-8c2.966-1.48 6.57-.276 8.05 2.69 1.48 2.966 .276 6.57-2.69 8.05l-16 8c-1.424 .711-3.073 .827-4.582 .323-1.51-.505-2.757-1.588-3.468-3.013ZM162.63 53.32l8-16c1.483-2.966 5.089-4.168 8.055-2.685 2.966 1.483 4.168 5.089 2.685 8.055l-8 16c-1.48 2.966-5.084 4.17-8.05 2.69-2.966-1.48-4.17-5.084-2.69-8.05Z"),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
