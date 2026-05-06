package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorThinIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.83 218.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L190.34 220h-110.34C68.954 220 60 211.046 60 200v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v96c0 6.627 5.373 12 12 12h110.34L173.17 194.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l24 24c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM80 68c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361L65.66 44h110.34c6.627 0 12 5.373 12 12v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96C196 44.954 187.046 36 176 36h-110.34L82.83 18.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-24 24c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l24 24c.751 .75 1.769 1.171 2.83 1.17Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
