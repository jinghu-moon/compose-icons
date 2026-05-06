package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorBoldIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-128C81.373 28 76 33.373 76 40v36h-36C33.373 76 28 81.373 28 88v128c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-36h36c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM156 204h-104v-104h104ZM204 156h-24v-68c0-6.627-5.373-12-12-12h-68v-24h104Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
