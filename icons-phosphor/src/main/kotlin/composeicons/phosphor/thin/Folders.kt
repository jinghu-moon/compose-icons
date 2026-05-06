package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorThinIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 68h-70.67L124.53 46.4C122.451 44.845 119.926 44.004 117.33 44h-45.33C65.373 44 60 49.373 60 56v20h-20C33.373 76 28 81.373 28 88v112c0 6.627 5.373 12 12 12h152.89c6.134-.006 11.104-4.976 11.11-11.11v-20.89h20.89c6.134-.006 11.104-4.976 11.11-11.11v-88.89c0-6.627-5.373-12-12-12ZM196 200.89c-.005 1.715-1.395 3.105-3.11 3.11h-152.89c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h45.33c.865 0 1.708 .281 2.4 .8l29.87 22.4c.692 .519 1.535 .8 2.4 .8h72c2.209 0 4 1.791 4 4ZM228 168.89c-.005 1.715-1.395 3.105-3.11 3.11h-20.89v-60c0-6.627-5.373-12-12-12h-70.67L92.53 78.4C90.451 76.845 87.926 76.004 85.33 76h-17.33v-20c0-2.209 1.791-4 4-4h45.33c.865 0 1.708 .281 2.4 .8l29.87 22.4c.692 .519 1.535 .8 2.4 .8h72c2.209 0 4 1.791 4 4Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
