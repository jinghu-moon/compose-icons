package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorBoldIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M109.74 146.26C124.037 160.483 132.052 179.833 132 200c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C108 171.281 84.719 148 56 148c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 20.167-.054 39.518 7.961 53.74 22.26ZM56 76C49.373 76 44 81.373 44 88c0 6.627 5.373 12 12 12 55.228 0 100 44.772 100 100 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C180 131.517 124.483 76 56 76ZM177.62 78.38C145.437 46.016 101.642 27.874 56 28 49.373 28 44 33.373 44 40c0 6.627 5.373 12 12 12 39.274-.11 76.958 15.501 104.65 43.35C188.499 123.042 204.11 160.726 204 200c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .126-45.642-18.016-89.437-50.38-121.62ZM60 180c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
