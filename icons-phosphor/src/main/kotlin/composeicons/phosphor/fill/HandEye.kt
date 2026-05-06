package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorFillIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 180c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM216 104v48c0 48.601-39.399 88-88 88C79.399 240 40 200.601 40 152v-88C40 55.163 47.163 48 56 48c8.837 0 16 7.163 16 16v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM179.58 178.21C178.88 176.81 162.08 144 128 144c-34.08 0-50.88 32.81-51.58 34.21-.564 1.127-.564 2.453 0 3.58C77.12 183.19 93.92 216 128 216c34.08 0 50.88-32.81 51.58-34.21 .564-1.127 .564-2.453 0-3.58Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
