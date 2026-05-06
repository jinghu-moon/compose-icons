package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorRegularIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-147.47c-5.616 .016-10.817 2.962-13.72 7.77L9.14 123.88c-1.523 2.535-1.523 5.705 0 8.24l45.67 76.11c2.903 4.808 8.104 7.754 13.72 7.77h147.47c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM61.67 204.12 68.53 200h0ZM216 200h-147.47L25.33 128 68.53 56h147.47ZM106.34 146.34 124.69 128 106.34 109.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L136 116.69 154.34 98.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L147.31 128l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L136 139.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
