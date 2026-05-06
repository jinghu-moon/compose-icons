package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorLightIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM230 176v32c0 7.732-6.268 14-14 14h-36c-6.186-.027-11.631-4.082-13.43-10L155.35 174h-26.1l4.33 14.56c0 .13 .07 .27 .1 .4 .923 4.148-.088 8.491-2.749 11.804-2.66 3.314-6.682 5.24-10.931 5.236h-47.86c-1.205 .015-2.386-.334-3.39-1C41.984 186.729 25.98 156.408 26 124 26 70.73 69.35 26.78 122.61 26c26.231-.372 51.516 9.788 70.197 28.207C211.487 72.626 222.003 97.766 222 124v4c0 3.314-2.686 6-6 6h-60l8.27 28h51.73c7.732 0 14 6.268 14 14ZM122 191.71 106.46 139.45c0-.14-.07-.28-.1-.41-.921-4.141 .085-8.477 2.736-11.789 2.651-3.312 6.661-5.243 10.904-5.251h90C208.913 75.286 170.726 37.987 124 38h-1.24C76 38.66 38 77.22 38 124c-.009 27.778 13.399 53.85 36 70h46c.585 .006 1.143-.244 1.528-.684 .385-.44 .557-1.027 .472-1.606ZM151.79 162l-8.27-28h-23.52c-.585-.006-1.143 .244-1.528 .684-.385 .44-.557 1.027-.472 1.606L125.66 162ZM218 176c0-1.105-.895-2-2-2h-48.15l10.21 34.57c.255 .857 1.046 1.44 1.94 1.43h36c1.105 0 2-.895 2-2Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
