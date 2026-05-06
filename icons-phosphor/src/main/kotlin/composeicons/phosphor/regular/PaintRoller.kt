package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorRegularIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 88h-16v-24c0-8.837-7.163-16-16-16h-152C39.163 48 32 55.163 32 64v24h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v24c0 8.837 7.163 16 16 16h152c8.837 0 16-7.163 16-16v-24h16v50L131.6 182.65C124.759 184.631 120.038 190.878 120 198v34c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-34L236.4 169.32C243.23 167.342 247.949 161.111 248 154v-50c0-8.837-7.163-16-16-16ZM200 128h-152v-64h152v64Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
