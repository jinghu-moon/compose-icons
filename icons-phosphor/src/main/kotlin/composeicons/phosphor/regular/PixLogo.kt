package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorRegularIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.34 116.72 139.28 20.66c-6.241-6.204-16.319-6.204-22.56 0L20.66 116.72c-6.204 6.241-6.204 16.319 0 22.56l96.06 96.06c6.241 6.204 16.319 6.204 22.56 0l96.06-96.06c6.204-6.241 6.204-16.319 0-22.56ZM128 32l56 56h-24c-2.122-.002-4.158 .84-5.66 2.34L128 116.68 101.66 90.34C100.158 88.84 98.122 87.998 96 88h-24ZM56 104h36.68l24 24-24 24h-36.68L32 128ZM128 224 72 168h24c2.122 .002 4.158-.84 5.66-2.34L128 139.31l26.34 26.35c1.502 1.5 3.538 2.342 5.66 2.34h24ZM200 152h-36.68l-24-24 24-24h36.68l24 24Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
