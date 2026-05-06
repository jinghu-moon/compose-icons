package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorBoldIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 88v-48C68 33.373 73.373 28 80 28c6.627 0 12 5.373 12 12v48c0 6.627-5.373 12-12 12C73.373 100 68 94.627 68 88ZM220 40v184c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-44h-44c-6.627 0-12-5.373-12-12 .375-19.48 2.832-38.863 7.33-57.82C157.42 68.42 176.76 40.33 203.27 29c3.703-1.588 7.956-1.212 11.323 1.002 3.367 2.214 5.398 5.969 5.407 9.998ZM196 62.92C182.6 77 175 98 170.77 115.38c-3.165 13.35-5.245 26.934-6.22 40.62h31.45ZM128 39c-.552-6.627-6.373-11.552-13-11-6.627 .552-11.552 6.373-11 13l4 47.46c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28L56 41C56.552 34.373 51.627 28.552 45 28 38.373 27.448 32.552 32.373 32 39L28 87c0 .34 0 .67 0 1 .039 24.081 16.577 44.997 40 50.59v85.41c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-85.41C115.423 132.997 131.96 112.081 132 88c0-.33 0-.66 0-1Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
