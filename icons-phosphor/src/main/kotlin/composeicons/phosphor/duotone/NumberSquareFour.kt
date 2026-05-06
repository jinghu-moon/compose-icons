package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorDuotoneIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h160v160ZM160 144h-8v-64c-.003-3.415-2.174-6.451-5.404-7.559-3.23-1.108-6.807-.044-8.906 2.649l-56 72c-1.874 2.411-2.213 5.679-.871 8.423 1.341 2.744 4.127 4.485 7.181 4.487h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM136 144h-31.64L136 103.32Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
