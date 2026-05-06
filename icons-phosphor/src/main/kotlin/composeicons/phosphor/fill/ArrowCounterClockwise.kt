package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorFillIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.005 52.52-42.195 95.294-94.71 96h-1.29c-24.518 .061-48.117-9.321-65.9-26.2-3.212-3.038-3.353-8.103-.315-11.315 3.038-3.212 8.103-3.353 11.315-.315 31.92 30.103 82.131 28.879 112.546-2.744 30.415-31.623 29.685-81.843-1.638-112.568C152.686 40.134 102.461 40.371 71.43 71.39c-.082 .088-.169 .172-.26 .25L60.63 81.29l17 17c2.323 2.279 3.033 5.739 1.797 8.749C78.191 110.049 75.254 112.011 72 112h-48c-4.418 0-8-3.582-8-8v-48c-.019-3.245 1.924-6.18 4.919-7.429 2.995-1.25 6.448-.566 8.741 1.729L49.31 70 60.25 60C87.733 32.624 128.992 24.478 164.817 39.355 200.643 54.232 223.994 89.208 224 128Z"),
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
