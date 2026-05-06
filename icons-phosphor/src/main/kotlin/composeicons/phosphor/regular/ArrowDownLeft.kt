package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorRegularIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.66 69.66 83.31 184h84.69c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-104c-4.418 0-8-3.582-8-8v-104c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v84.69L186.34 58.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
