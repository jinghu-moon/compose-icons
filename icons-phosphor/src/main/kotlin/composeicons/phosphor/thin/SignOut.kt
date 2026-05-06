package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorThinIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 216c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-60v168h60c2.209 0 4 1.791 4 4ZM226.83 125.17l-40-40c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L214.34 124h-102.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h102.34l-33.17 33.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
