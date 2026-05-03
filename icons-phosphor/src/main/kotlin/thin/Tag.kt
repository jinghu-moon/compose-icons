package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorThinIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 138.830 L 141.170 39.510 C 138.924 37.256 135.872 35.992 132.690 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 L 36.000 132.690 C 35.992 135.872 37.256 138.924 39.510 141.170 L 138.830 240.490 C 141.082 242.749 144.140 244.019 147.330 244.019 C 150.520 244.019 153.578 242.749 155.830 240.490 L 240.520 155.800 C 242.779 153.548 244.049 150.490 244.049 147.300 C 244.049 144.110 242.779 141.052 240.520 138.800 ZM 234.830 150.140 L 150.140 234.830 C 148.579 236.388 146.051 236.388 144.490 234.830 L 45.170 135.510 C 44.422 134.762 44.002 133.748 44.000 132.690 L 44.000 44.000 L 132.690 44.000 C 133.748 44.002 134.762 44.422 135.510 45.170 L 234.830 144.490 C 236.388 146.051 236.388 148.579 234.830 150.140 ZM 92.000 84.000 C 92.000 88.418 88.418 92.000 84.000 92.000 C 79.582 92.000 76.000 88.418 76.000 84.000 C 76.000 79.582 79.582 76.000 84.000 76.000 C 88.418 76.000 92.000 79.582 92.000 84.000 Z"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
