package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorFillIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 104v48c0 48.601-39.399 88-88 88C79.399 240 40 200.601 40 152v-16c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
