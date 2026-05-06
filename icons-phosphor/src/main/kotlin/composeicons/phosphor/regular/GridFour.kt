package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GridFour: ImageVector
    get() {
        if (_gridFour != null) return _gridFour!!
        _gridFour = phosphorRegularIcon(
            name = "GridFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40h-144C47.163 40 40 47.163 40 56v144c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM200 120h-64v-64h64ZM120 56v64h-64v-64ZM56 136h64v64h-64ZM200 200h-64v-64h64v64Z"),
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
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
