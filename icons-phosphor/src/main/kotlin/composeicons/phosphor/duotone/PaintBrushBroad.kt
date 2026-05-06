package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorDuotoneIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 112v24c0 8.837-7.163 16-16 16h-48c-2.319-0-4.524 1.006-6.043 2.758-1.52 1.752-2.204 4.077-1.877 6.372L152 208c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24l7.92-46.87c.328-2.296-.357-4.621-1.877-6.372C108.524 153.006 106.319 152 104 152h-48c-8.837 0-16-7.163-16-16v-24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 24h-144C49.909 24 32 41.909 32 64v72c0 13.255 10.745 24 24 24h48l-7.89 46.67c-.072 .44-.109 .884-.11 1.33 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32-.001-.446-.038-.89-.11-1.33L152 160h48c13.255 0 24-10.745 24-24v-104c0-4.418-3.582-8-8-8ZM72 40h104v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h16v64h-160v-40C48 50.745 58.745 40 72 40ZM200 144h-48c-4.638-0-9.048 2.012-12.087 5.516-3.039 3.503-4.408 8.153-3.753 12.744v.2L144 208.6c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16l7.8-46.14v-.2c.654-4.584-.71-9.227-3.74-12.729C113.03 146.029 108.631 144.011 104 144h-48c-4.418 0-8-3.582-8-8v-16h160v16c0 4.418-3.582 8-8 8Z"),
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
