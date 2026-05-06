package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorRegularIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 160v-64c0-4.418-3.582-8-8-8h-48v-48c0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8v120c0 4.418 3.582 8 8 8h48v48c0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8v-56ZM163.31 208l-40-40h33.38l40 40ZM168 156.69v-33.38l40 40v33.38ZM208 140.69 171.31 104h36.69ZM48 48h104v56h0v48h-104ZM104 171.31 140.69 208h-36.69Z"),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
