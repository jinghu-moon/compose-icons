package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorThinIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 100h-36v-4c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v4h-72v-48C60 43.163 67.163 36 76 36c7.689-.004 14.36 5.306 16.08 12.8 .442 2.165 2.555 3.562 4.72 3.12 2.165-.442 3.562-2.555 3.12-4.72C97.496 35.945 87.513 27.931 76 28 62.745 28 52 38.745 52 52v48h-36c-2.209 0-4 1.791-4 4v40c.033 28.705 23.295 51.967 52 52h4v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h104v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h4c28.705-.033 51.967-23.295 52-52v-40c0-2.209-1.791-4-4-4ZM140 100h56v40h-56ZM236 144c-.028 24.289-19.711 43.972-44 44h-128C39.711 187.972 20.028 168.289 20 144v-36h112v36c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-36h32Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
