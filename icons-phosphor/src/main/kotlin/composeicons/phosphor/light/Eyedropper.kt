package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorLightIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 67.34c-.102-9.194-3.944-17.95-10.64-24.25C198.12 30.56 176.68 31 163.54 44.18L142.82 65l-.63-.63c-8.591-8.59-22.519-8.59-31.11 0l-9 9c-2.629 2.626-4.106 6.189-4.106 9.905 0 3.716 1.477 7.279 4.106 9.905l3.47 3.47L53.14 149.1c-9.65 9.581-13.407 23.608-9.84 36.73l-8.31 19c-1.95 4.425-.972 9.594 2.46 13 2.601 2.652 6.155 4.154 9.87 4.17 1.955 .003 3.888-.399 5.68-1.18l18-7.9c12.886 3.142 26.477-.676 35.84-10.07l52.44-52.46 3.47 3.48c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l9-9c4.128-4.126 6.447-9.723 6.447-15.56 0-5.837-2.319-11.434-6.447-15.56l-.66-.66L212 91.85c6.531-6.468 10.142-15.319 10-24.51ZM98.39 194.34c-6.803 6.8-16.804 9.289-26 6.47-1.371-.42-2.847-.334-4.16 .24l-20 8.75c-.699 .303-1.509 .183-2.09-.31l9.12-20.9c.601-1.362 .669-2.9 .19-4.31-3.196-9.371-.766-19.744 6.26-26.72l52.44-52.45 36.76 36.78ZM203.55 83.34l-25.38 25.56c-2.333 2.341-2.333 6.129 0 8.47l4.88 4.89c1.878 1.876 2.933 4.421 2.933 7.075 0 2.654-1.055 5.199-2.933 7.075l-9 9c-.78 .775-2.04 .775-2.82 0L110.54 84.71c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415l9-9c3.905-3.904 10.235-3.904 14.14 0l4.89 4.89c1.126 1.122 2.651 1.751 4.24 1.75h0c1.596-.001 3.125-.638 4.25-1.77L172 52.66c8.58-8.58 22.52-9 31.08-.85 4.326 4.083 6.814 9.744 6.897 15.692 .083 5.948-2.246 11.676-6.457 15.878Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
