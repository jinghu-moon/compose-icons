package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorFillIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM92.8 145.6c3.535 2.651 4.251 7.665 1.6 11.2-2.651 3.535-7.665 4.251-11.2 1.6l-32-24C49.186 132.889 48 130.518 48 128c0-2.518 1.186-4.889 3.2-6.4l32-24c3.535-2.651 8.549-1.935 11.2 1.6 2.651 3.535 1.935 8.549-1.6 11.2L69.33 128ZM151.69 74.2l-32 112c-.742 2.798-2.938 4.977-5.742 5.697-2.804 .72-5.778-.131-7.777-2.225-1.999-2.094-2.71-5.105-1.86-7.872l32-112c1.279-4.166 5.658-6.541 9.848-5.343 4.19 1.199 6.65 5.53 5.532 9.743ZM204.8 134.4l-32 24c-3.535 2.651-8.549 1.935-11.2-1.6-2.651-3.535-1.935-8.549 1.6-11.2L186.67 128 163.2 110.4c-3.535-2.651-4.251-7.665-1.6-11.2 2.651-3.535 7.665-4.251 11.2-1.6l32 24c2.014 1.511 3.2 3.882 3.2 6.4 0 2.518-1.186 4.889-3.2 6.4Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
