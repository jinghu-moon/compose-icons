package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorBoldIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 28h-8c-11.046 0-20 8.954-20 20v52h-73.84C52.9 83.349 37.462 72.021 20 72 13.373 72 8 77.373 8 84c0 6.627 5.373 12 12 12 8.837 0 16 7.163 16 16 .05 46.371 37.629 83.95 84 84h40c46.392 0 84-37.608 84-84C244 65.608 206.392 28 160 28ZM208.06 76.12c5.303 7.066 8.968 15.223 10.73 23.88h-40.58ZM160 52c10.473 .002 20.761 2.761 29.83 8L156 87v-35ZM160 172h-40C91.501 171.962 66.948 151.915 61.21 124h157.58c-5.738 27.915-30.291 47.962-58.79 48ZM108 224c0 11.046-8.954 20-20 20C76.954 244 68 235.046 68 224c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM212 224c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
