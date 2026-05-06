package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorBoldIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.67 68h-10.67v-28c0-6.627-5.373-12-12-12h-128C57.373 28 52 33.373 52 40v28h-10.67C25.16 68 12 80.56 12 96v80c0 6.627 5.373 12 12 12h28v28c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12v-80C244 80.56 230.84 68 214.67 68ZM76 52h104v16h-104ZM180 204h-104v-32h104ZM220 164h-16v-4c0-6.627-5.373-12-12-12h-128c-6.627 0-12 5.373-12 12v4h-16v-68c0-2.17 2.44-4 5.33-4h173.34c2.89 0 5.33 1.83 5.33 4ZM204 120c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
