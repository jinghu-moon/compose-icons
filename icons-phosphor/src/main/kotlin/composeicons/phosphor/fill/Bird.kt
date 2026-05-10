package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorFillIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.44 73.34 213.21 57.86C205.302 32.929 182.155 15.992 156 16h-.29C122.79 16.16 96 43.47 96 76.89v19.74L11.63 197.88l-.1 .12c-3.843 4.799-4.595 11.376-1.937 16.919 2.659 5.543 8.259 9.073 14.407 9.081h88c57.412-.061 103.939-46.588 104-104v-19.72L236.44 86.66c2.229-1.483 3.568-3.983 3.568-6.66 0-2.677-1.339-5.177-3.568-6.66ZM126.15 133.12l-60 72c-1.81 2.26-4.699 3.367-7.556 2.892-2.856-.474-5.234-2.455-6.216-5.179-.982-2.724-.415-5.766 1.481-7.954l60-72c1.81-2.26 4.699-3.367 7.556-2.892 2.856 .474 5.234 2.455 6.216 5.179 .982 2.724 .415 5.766-1.481 7.954ZM164 80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
