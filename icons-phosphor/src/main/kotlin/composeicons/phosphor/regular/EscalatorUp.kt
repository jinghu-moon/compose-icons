package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorRegularIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 40h-56c-2.233-.001-4.365 .93-5.88 2.57L68.5 144h-36.5c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16h56c2.233 .001 4.365-.93 5.88-2.57L187.5 112h36.5c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16ZM224 96h-40c-2.233-.001-4.365 .93-5.88 2.57L84.5 200h-52.5v-40h40c2.233 .001 4.365-.93 5.88-2.57L171.5 56h52.5ZM229.66 170.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L208 171.31v36.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-36.69l-10.34 10.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l24-24c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
