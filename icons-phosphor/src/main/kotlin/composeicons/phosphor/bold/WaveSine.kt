package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorBoldIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.86 133.1c-23 49-43 70.9-64.82 70.9-27.64 0-43.8-34.44-60.9-70.9C110 117.78 102.53 102 94.92 90.73 88.39 81.09 82.53 76 78 76c-3.82 0-18.24 4.12-43.09 57.1-2.817 6.001-9.964 8.582-15.965 5.765-6.001-2.817-8.582-9.964-5.765-15.965C36.18 73.9 56.18 52 78 52c27.64 0 43.8 34.44 60.9 70.9 7.19 15.32 14.61 31.15 22.22 42.37 6.53 9.64 12.39 14.73 17 14.73 3.82 0 18.24-4.12 43.09-57.1 2.817-6.001 9.964-8.582 15.965-5.765 6.001 2.817 8.582 9.964 5.765 15.965Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
