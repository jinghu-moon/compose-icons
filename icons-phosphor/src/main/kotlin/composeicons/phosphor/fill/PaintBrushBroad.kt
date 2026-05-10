package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorFillIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 24h-144C49.909 24 32 41.909 32 64v72c0 13.255 10.745 24 24 24h48l-7.89 46.67c-.072 .44-.109 .884-.11 1.33 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32-.001-.446-.038-.89-.11-1.33L152 160h48c13.255 0 24-10.745 24-24v-104c0-4.418-3.582-8-8-8ZM72 40h104v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h16v72h-160v-48C48 50.745 58.745 40 72 40Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
