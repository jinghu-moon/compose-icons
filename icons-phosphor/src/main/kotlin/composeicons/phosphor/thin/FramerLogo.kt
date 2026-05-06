package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorThinIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 104v-64c0-2.209-1.791-4-4-4h-144c-1.666-.006-3.162 1.022-3.753 2.579-.592 1.558-.156 3.319 1.093 4.421l64.14 57h-61.48c-2.209 0-4 1.791-4 4v64c-.001 1.061 .42 2.079 1.17 2.83l72 72c1.144 1.145 2.866 1.488 4.361 .868 1.496-.62 2.47-2.08 2.469-3.698v-68h68c1.666 .006 3.162-1.022 3.753-2.579 .592-1.558 .156-3.319-1.093-4.421L138.52 108h61.48c2.209 0 4-1.791 4-4ZM189.48 164h-61.48c-2.209 0-4 1.791-4 4v62.34l-64-64v-58.34h66.48ZM196 100h-66.48L66.52 44h129.48Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
