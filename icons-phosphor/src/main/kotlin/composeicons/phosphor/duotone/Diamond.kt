package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorDuotoneIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.67 133.62l-96 96c-1.489 1.492-3.511 2.331-5.62 2.331-2.109 0-4.131-.839-5.62-2.331l-96-96C24.938 132.131 24.099 130.109 24.099 128c0-2.109 .839-4.131 2.331-5.62L122.48 26.38c1.489-1.492 3.511-2.331 5.62-2.331 2.109 0 4.131 .839 5.62 2.331l96 96.05c3.061 3.11 3.039 8.107-.05 11.19Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M235.33 116.72 139.28 20.66c-6.241-6.204-16.319-6.204-22.56 0L20.72 116.72c-6.204 6.241-6.204 16.319 0 22.56l96.05 96.06h0c6.241 6.204 16.319 6.204 22.56 0l96.05-96.06c6.204-6.241 6.204-16.319 0-22.56ZM128 224h0L32 128 128 32l96 96Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
