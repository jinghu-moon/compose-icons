package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorLightIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M59.76 100.24l-32-32c-2.34-2.343-2.34-6.137 0-8.48L59.76 27.76c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874L40.49 64 68.24 91.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723ZM99.76 100.24c2.343 2.34 6.137 2.34 8.48 0l32-32c2.34-2.343 2.34-6.137 0-8.48L108.24 27.76c-1.496-1.605-3.748-2.266-5.874-1.723-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874L127.51 64 99.76 91.76c-2.34 2.343-2.34 6.137 0 8.48ZM200 42h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c1.105 0 2 .895 2 2v144c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-64c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v64c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
