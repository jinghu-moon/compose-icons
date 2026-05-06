package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorThinIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168.74 52.86c2.129-.449 3.508-2.516 3.106-4.654-.403-2.138-2.44-3.562-4.586-3.206C150.09 48.21 136.19 57.57 128 71.12 118 54.21 99.46 44 78 44 45.983 44.039 20.039 69.983 20 102c0 28.59 18 58.47 53.4 88.79 16.345 13.909 33.993 26.209 52.7 36.73 .584 .315 1.237 .48 1.9 .48 .661-.005 1.31-.173 1.89-.49h0c14.158-7.944 27.709-16.925 40.54-26.87 1.201-.847 1.841-2.284 1.667-3.744-.174-1.459-1.135-2.706-2.502-3.246-1.367-.54-2.92-.287-4.045 .66-10.725 8.247-21.928 15.854-33.55 22.78v-136.24c6.24-14.59 19.58-24.78 36.74-27.99ZM124 217.08C102.27 204.08 28 155.92 28 102 28.033 74.399 50.399 52.033 78 52c20.83 0 38.39 11 46 28.8ZM232.11 100h-.44c-2.048 .012-3.775-1.524-4-3.56C226.041 81.791 218.017 68.612 205.75 60.44c-1.758-1.256-2.201-3.68-1.002-5.476 1.199-1.796 3.608-2.316 5.442-1.174 14.236 9.487 23.546 24.786 25.43 41.79 .246 2.188-1.323 4.164-3.51 4.42ZM226.88 137.81c-5.5 11-13.55 22.32-23.94 33.56-1.499 1.624-4.031 1.724-5.655 .225-1.624-1.499-1.724-4.031-.225-5.655 9.88-10.68 17.5-21.35 22.66-31.71 .989-1.977 3.393-2.779 5.37-1.79 1.977 .989 2.779 3.393 1.79 5.37Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
