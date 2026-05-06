package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorLightIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 192c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C210 111.5 144.5 46 64 46c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 87.12 0 158 70.88 158 158ZM64 106c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 40.849 .05 73.95 33.151 74 74 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6-.055-47.474-38.526-85.945-86-86ZM68 178c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
