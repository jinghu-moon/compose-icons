package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorLightIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.24 59.76l-32-32c-2.343-2.34-6.137-2.34-8.48 0L91.76 123.76C90.634 124.884 90.001 126.409 90 128v32c0 3.314 2.686 6 6 6h32c1.591-.001 3.116-.634 4.24-1.76l96-96c2.34-2.343 2.34-6.137 0-8.48ZM125.51 154h-23.51v-23.51L168 64.49 191.51 88ZM200 79.51 176.49 56 192 40.49 215.51 64ZM222 128v80c0 7.732-6.268 14-14 14h-160c-7.732 0-14-6.268-14-14v-160C34 40.268 40.268 34 48 34h80c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-80c-1.105 0-2 .895-2 2v160c0 1.105 .895 2 2 2h160c1.105 0 2-.895 2-2v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
