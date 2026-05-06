package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorBoldIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 192c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C204 114.8 141.2 52 64 52 57.373 52 52 46.627 52 40 52 33.373 57.373 28 64 28c90.43 0 164 73.57 164 164ZM64 100c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 37.539 .039 67.961 30.461 68 68 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12-.055-50.787-41.213-91.945-92-92ZM68 172c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
