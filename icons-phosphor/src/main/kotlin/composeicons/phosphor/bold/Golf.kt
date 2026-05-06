package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorBoldIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 100c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM132 116c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM220 96c0 50.81-41.19 92-92 92C77.19 188 36 146.81 36 96 36 45.19 77.19 4 128 4c50.787 .055 91.945 41.213 92 92ZM196 96C196 58.445 165.555 28 128 28 90.445 28 60 58.445 60 96c0 37.555 30.445 68 68 68 37.539-.039 67.961-30.461 68-68ZM164 197.86c-23.302 8.186-48.698 8.186-72 0-6.249-2.209-13.106 1.066-15.315 7.315-2.209 6.249 1.066 13.106 7.315 15.315 10.334 3.655 21.084 6.006 32 7v16.51c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16.54c10.916-.994 21.666-3.345 32-7 6.249-2.209 9.524-9.066 7.315-15.315-2.209-6.249-9.066-9.524-15.315-7.315Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
