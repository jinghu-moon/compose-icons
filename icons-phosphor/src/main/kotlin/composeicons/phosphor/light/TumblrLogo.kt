package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorLightIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 118c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6h-42v-42c0-3.314-2.686-6-6-6h-32c-3.314 0-6 2.686-6 6C106 47.196 87.196 66 64 66c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h26v58c.039 34.226 27.774 61.961 62 62h40c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6h-32c-5.523 0-10-4.477-10-10v-50ZM160 190h26v36h-34c-27.601-.033-49.967-22.399-50-50v-64c0-3.314-2.686-6-6-6h-26v-28.33C95.055 74.826 114.826 55.055 117.67 30h20.33v42c0 3.314 2.686 6 6 6h42v28h-42c-3.314 0-6 2.686-6 6v56c0 12.15 9.85 22 22 22Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
