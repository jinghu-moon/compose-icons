package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorThinIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199.05 57.48C170.482 28.734 127.396 20.057 89.928 35.504 52.46 50.951 28.008 87.472 28 128v56c0 11.046 8.954 20 20 20h16c11.046 0 20-8.954 20-20v-40C84 132.954 75.046 124 64 124h-27.92C38.222 74.789 78.743 35.996 128 36h.7c49.038 .242 89.216 39.003 91.22 88h-27.92c-11.046 0-20 8.954-20 20v40c0 11.046 8.954 20 20 20h28v4c0 15.464-12.536 28-28 28h-56c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h56c19.882 0 36-16.118 36-36v-80c.101-26.419-10.315-51.792-28.95-70.52ZM64 132c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12v-52ZM180 184v-40c0-6.627 5.373-12 12-12h28v64h-28c-6.627 0-12-5.373-12-12Z"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
