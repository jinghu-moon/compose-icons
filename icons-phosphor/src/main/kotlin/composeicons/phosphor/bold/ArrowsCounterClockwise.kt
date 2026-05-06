package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorBoldIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 108h-48C33.373 108 28 102.627 28 96v-48C28 41.373 33.373 36 40 36c6.627 0 12 5.373 12 12v19l7.8-7.8C78.397 40.528 103.647 30.004 130 29.94h.56c26.127-.063 51.228 10.165 69.87 28.47 4.739 4.634 4.824 12.231 .19 16.97-4.634 4.739-12.231 4.824-16.97 .19C153.873 46.488 106.242 46.769 76.81 76.2L69 84h19c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM216 148h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h19l-7.8 7.8c-14.122 14.192-33.299 22.198-53.32 22.26h-.43c-19.852 .051-38.926-7.72-53.09-21.63-4.739-4.634-12.336-4.549-16.97 .19-4.634 4.739-4.549 12.336 .19 16.97 18.642 18.305 43.743 28.533 69.87 28.47h.55c26.344-.082 51.577-10.617 70.16-29.29L204 189v19c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
