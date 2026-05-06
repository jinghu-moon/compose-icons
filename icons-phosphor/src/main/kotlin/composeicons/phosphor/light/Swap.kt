package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorLightIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 48v104c0 7.732-6.268 14-14 14h-113.51l13.75 13.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-24-24c-2.34-2.343-2.34-6.137 0-8.48l24-24c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L94.49 154h113.51c1.105 0 2-.895 2-2v-104c0-1.105-.895-2-2-2h-112c-1.105 0-2 .895-2 2v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-8C82 40.268 88.268 34 96 34h112c7.732 0 14 6.268 14 14ZM168 194c-3.314 0-6 2.686-6 6v8c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-104c0-1.105 .895-2 2-2h113.51l-13.75 13.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l24-24c2.34-2.343 2.34-6.137 0-8.48l-24-24c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L161.51 90h-113.51c-7.732 0-14 6.268-14 14v104c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-8c0-3.314-2.686-6-6-6Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
