package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorRegularIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.45 40.07c-.237-4.051-3.469-7.283-7.52-7.52C139.8 28.08 78.82 51 52.82 94c-9.012 14.709-13.453 31.763-12.76 49 .57 15.92 5.21 32 13.79 47.85L34.34 210.35c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L65.16 202.16C81 210.73 97.09 215.37 113 215.94q1.67 .06 3.33 .06c16.117 .043 31.929-4.396 45.67-12.82 43-26 65.93-86.97 61.45-163.11ZM153.75 189.5c-22.75 13.78-49.68 14-76.71 .77l88.63-88.62c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L65.73 179C52.54 152 52.73 125 66.5 102.29 88.59 65.82 141.1 45.85 207.81 48.23c2.39 66.66-17.59 119.18-54.06 141.27Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
