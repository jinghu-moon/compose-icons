package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorBoldIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.14 131.54l-32-80h0c-2.186-5.451-7.996-8.519-13.73-7.25L140 57v-17c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v22.37L53.4 76.29c-3.869 .858-7.065 3.571-8.54 7.25h0 0 0L12.86 163.46c-.578 1.443-.87 2.985-.86 4.54 0 12.13 6.2 22.43 17.45 29 8.116 4.54 17.251 6.949 26.55 7 9.299-.051 18.434-2.46 26.55-7C93.8 190.43 100 180.13 100 168c-0-1.528-.292-3.042-.86-4.46L72.38 96.65 116 87v117h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-122.37l40.42-9-23.56 58.9c-.569 1.421-.861 2.939-.86 4.47 0 12.13 6.2 22.43 17.45 29 16.466 9.347 36.634 9.347 53.1 0C237.8 158.43 244 148.13 244 136c-0-1.528-.292-3.042-.86-4.46ZM56 180c-3.71 0-18-1.87-19.81-10.18L56 120.31l19.81 49.51C74 178.13 59.71 180 56 180ZM200 148c-3.71 0-18-1.87-19.81-10.18L200 88.31l19.81 49.51C218 146.13 203.71 148 200 148Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
