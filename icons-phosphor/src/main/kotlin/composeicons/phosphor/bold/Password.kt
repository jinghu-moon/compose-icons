package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorBoldIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 56v144c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-144C24 49.373 29.373 44 36 44c6.627 0 12 5.373 12 12ZM134.73 106.7 120 111.48v-15.48c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v15.48L81.27 106.7c-4.11-1.446-8.68-.55-11.941 2.339-3.261 2.889-4.699 7.319-3.758 11.573 .941 4.254 4.114 7.663 8.289 8.908l14.72 4.79-9.1 12.52c-3.896 5.363-2.708 12.869 2.655 16.765 5.363 3.896 12.869 2.708 16.765-2.655L108 148.42l9.1 12.52c3.896 5.363 11.402 6.551 16.765 2.655 5.363-3.896 6.551-11.402 2.655-16.765l-9.1-12.52 14.72-4.79c4.175-1.245 7.348-4.654 8.289-8.908 .941-4.254-.497-8.684-3.758-11.573-3.261-2.889-7.831-3.785-11.941-2.339ZM249.85 114.4c-2.05-6.301-8.819-9.748-15.12-7.7L220 111.48v-15.48c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v15.48l-14.73-4.78c-4.11-1.446-8.68-.55-11.941 2.339-3.261 2.889-4.699 7.319-3.758 11.573 .941 4.254 4.114 7.663 8.289 8.908l14.72 4.79-9.1 12.52c-3.896 5.363-2.708 12.869 2.655 16.765 5.363 3.896 12.869 2.708 16.765-2.655L208 148.42l9.1 12.52c3.896 5.363 11.402 6.551 16.765 2.655 5.363-3.896 6.551-11.402 2.655-16.765l-9.1-12.52 14.72-4.79c3.028-.982 5.541-3.127 6.987-5.963 1.446-2.836 1.706-6.13 .723-9.157Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
