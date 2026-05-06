package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorDuotoneIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128c0 48.601-39.399 88-88 88C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 128c.005 52.52-42.195 95.294-94.71 96h-1.29c-24.518 .061-48.117-9.321-65.9-26.2-3.212-3.038-3.353-8.103-.315-11.315 3.038-3.212 8.103-3.353 11.315-.315 31.92 30.103 82.131 28.879 112.546-2.744 30.415-31.623 29.685-81.843-1.638-112.568C152.686 40.134 102.461 40.371 71.43 71.39c-.082 .088-.169 .172-.26 .25L44.59 96h27.41c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v29.8L60.25 60C87.733 32.624 128.992 24.478 164.817 39.355 200.643 54.232 223.994 89.208 224 128Z"),
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
