package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorThinIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-144C52.118 28 36 44.118 36 64v72c0 11.046 8.954 20 20 20h48c1.157-.01 2.262 .482 3.029 1.349 .767 .867 1.121 2.023 .971 3.171l-7.9 46.81c-.04 .221-.06 .445-.06 .67 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28-0-.225-.02-.449-.06-.67L148 160.52c-.151-1.148 .203-2.304 .971-3.171 .767-.867 1.872-1.359 3.029-1.349h48c11.046 0 20-8.954 20-20v-104c0-2.209-1.791-4-4-4ZM72 36h108v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-44h24v72h-168v-44C44 48.536 56.536 36 72 36ZM200 148h-48c-3.479-0-6.788 1.51-9.067 4.138-2.279 2.629-3.306 6.117-2.813 9.562 0 0 0 .06 0 .1L148 208.32c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20l7.86-46.52c0 0 0-.07 0-.1 .492-3.441-.531-6.926-2.806-9.554C110.779 149.518 107.476 148.005 104 148h-48c-6.627 0-12-5.373-12-12v-20h168v20c0 6.627-5.373 12-12 12Z"),
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
