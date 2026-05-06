package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorBoldIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c.005 54.709-43.956 99.267-98.66 100h-1.34c-25.529 .054-50.1-9.718-68.62-27.29-4.819-4.551-5.036-12.146-.485-16.965 4.551-4.819 12.146-5.036 16.965-.485 30.315 28.62 78.026 27.476 106.934-2.564 28.908-30.039 28.221-77.76-1.541-106.954C151.492 44.548 103.768 44.779 74.29 74.26c-.13 .13-.25 .25-.39 .37L54.89 92h17.11c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12v-48C12 49.373 17.373 44 24 44c6.627 0 12 5.373 12 12v20.72L57.48 57.06C86.127 28.567 129.106 20.112 166.411 35.632 203.716 51.152 228.016 87.596 228 128Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
