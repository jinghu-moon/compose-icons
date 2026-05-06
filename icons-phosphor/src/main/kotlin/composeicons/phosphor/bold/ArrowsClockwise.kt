package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorBoldIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48v48c0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h19l-7.8-7.8C165.078 62.008 145.901 54.002 125.88 53.94h-.43C105.608 53.897 86.547 61.667 72.39 75.57c-4.739 4.634-12.336 4.549-16.97-.19C50.786 70.641 50.871 63.044 55.61 58.41 74.252 40.105 99.353 29.877 125.48 29.94h.52c26.357 .072 51.608 10.607 70.2 29.29L204 67v-19c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM183.61 180.43c-14.164 13.91-33.238 21.681-53.09 21.63h-.43c-20.021-.062-39.198-8.068-53.32-22.26L69 172h19c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-19l7.8 7.8c18.597 18.672 43.847 29.196 70.2 29.26h.56c26.127 .063 51.228-10.165 69.87-28.47 4.739-4.634 4.824-12.231 .19-16.97-4.634-4.739-12.231-4.824-16.97-.19Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
