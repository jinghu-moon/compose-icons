package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorBoldIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 20h-144C47.711 20.028 28.028 39.711 28 64v72c0 15.464 12.536 28 28 28h39.64L92 207c0 .33 0 .67 0 1 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-.33 0-.67 0-1l-3.6-43h39.6c15.464 0 28-12.536 28-28v-104c0-6.627-5.373-12-12-12ZM72 44h88v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24h20v52h-152v-32C52 52.954 60.954 44 72 44ZM200 140h-44c-5.721 .002-11.168 2.453-14.963 6.736-3.795 4.282-5.574 9.984-4.887 15.664l3.84 46c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12l3.84-46c.686-5.677-1.09-11.376-4.88-15.657C111.159 142.462 105.718 140.007 100 140h-44c-2.209 0-4-1.791-4-4v-16h152v16c0 2.209-1.791 4-4 4Z"),
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
