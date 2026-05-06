package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorLightIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 136v64c0 7.732-6.268 14-14 14h-192c-7.732 0-14-6.268-14-14v-64c0-7.732 6.268-14 14-14h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40c-1.105 0-2 .895-2 2v64c0 1.105 .895 2 2 2h192c1.105 0 2-.895 2-2v-64c0-1.105-.895-2-2-2h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c7.732 0 14 6.268 14 14ZM123.76 132.24c2.343 2.34 6.137 2.34 8.48 0l48-48c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L134 113.51v-89.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v89.51L84.24 75.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333ZM198 168c0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
