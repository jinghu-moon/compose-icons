package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorFillIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 64v128c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-56h-48v56c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-128C56 55.163 63.163 48 72 48h16c8.837 0 16 7.163 16 16v56h48v-56c0-8.837 7.163-16 16-16h16c8.837 0 16 7.163 16 16ZM36 72h-4C23.163 72 16 79.163 16 88v32h-7.73C3.981 119.937 .372 123.197 0 127.47c-.147 2.212 .631 4.386 2.147 6.003C3.664 135.09 5.783 136.005 8 136h8v32c0 8.837 7.163 16 16 16h4c2.209 0 4-1.791 4-4v-104c0-2.209-1.791-4-4-4ZM256 127.47c-.371-4.265-3.969-7.523-8.25-7.47h-7.75v-32c0-8.837-7.163-16-16-16h-4c-2.209 0-4 1.791-4 4v104c0 2.209 1.791 4 4 4h4c8.837 0 16-7.163 16-16v-32h8c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
