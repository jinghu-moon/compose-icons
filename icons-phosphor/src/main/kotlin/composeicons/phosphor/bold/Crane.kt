package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorBoldIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.17 13.71c-3.614-2.169-8.101-2.283-11.82-.3L101 76h-69C20.954 76 12 84.954 12 96v104c0 11.046 8.954 20 20 20h88c11.046 0 20-8.954 20-20v-32c.001-1.169-.171-2.331-.51-3.45L118.32 94 212 44v112h-12v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8c0 11.046 8.954 20 20 20h20c11.046 0 20-8.954 20-20v-136c-.001-4.216-2.214-8.122-5.83-10.29ZM95.07 100l16.8 56h-35.87v-56ZM52 100v56h-16v-56ZM36 196v-16h80v16Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
