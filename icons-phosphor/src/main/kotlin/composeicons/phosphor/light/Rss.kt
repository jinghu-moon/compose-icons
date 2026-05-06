package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorLightIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M105.5 150.5C118.67 163.6 126.052 181.424 126 200c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C114 167.967 88.033 142 56 142c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 18.576-.052 36.4 7.33 49.5 20.5ZM56 82c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 58.542 0 106 47.458 106 106 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C174 134.83 121.17 82 56 82ZM173.38 82.62C142.317 51.388 100.05 33.88 56 34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 40.864-.108 80.074 16.135 108.89 45.11C193.865 119.926 210.108 159.136 210 200c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .12-44.05-17.388-86.317-48.62-117.38ZM60 186c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
