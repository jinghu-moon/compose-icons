package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorLightIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 128c.002 1.824-.826 3.55-2.25 4.69l-40 32c-2.59 2.071-6.369 1.65-8.44-.94-2.071-2.59-1.65-6.369 .94-8.44L110.4 128 76.25 100.69c-2.59-2.071-3.011-5.85-.94-8.44 2.071-2.59 5.85-3.011 8.44-.94l40 32c1.424 1.14 2.252 2.866 2.25 4.69ZM176 154h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 56v144c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-144C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM218 56c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v144c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2Z"),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
