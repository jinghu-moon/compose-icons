package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorFillIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.49 207.8l-12.69 12.69c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L134.23 163.92 115 214.08l-.13 .33c-2.506 5.837-8.258 9.612-14.61 9.59h-.78c-6.636-.278-12.392-4.672-14.41-11L32.8 52.92C30.931 47.208 32.431 40.93 36.68 36.68c4.25-4.25 10.528-5.75 16.24-3.88L213 85.07c6.262 2.095 10.594 7.821 10.906 14.417 .312 6.596-3.46 12.706-9.496 15.383l-.33 .13-50.16 19.27 56.57 56.56c4.686 4.686 4.686 12.284 0 16.97Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
