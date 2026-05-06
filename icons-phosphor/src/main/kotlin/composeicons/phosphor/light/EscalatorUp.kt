package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorLightIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 42h-56c-1.675-0-3.274 .699-4.41 1.93L69.37 146h-37.37c-7.732 0-14 6.268-14 14v40c0 7.732 6.268 14 14 14h56c1.675 0 3.274-.699 4.41-1.93L186.63 110h37.37c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14ZM226 96c0 1.105-.895 2-2 2h-40c-1.675-0-3.274 .699-4.41 1.93L85.37 202h-53.37c-1.105 0-2-.895-2-2v-40c0-1.105 .895-2 2-2h40c1.675 0 3.274-.699 4.41-1.93L170.63 54h53.37c1.105 0 2 .895 2 2ZM228.24 171.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L206 166.49v41.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-41.51l-13.76 13.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l24-24c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
