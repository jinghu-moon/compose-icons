package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorThinIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.5 119.55 136.45 23.49c-4.678-4.639-12.222-4.639-16.9 0L23.55 119.55c-4.639 4.678-4.639 12.222 0 16.9l96.05 96.06c4.678 4.639 12.222 4.639 16.9 0l96.05-96.06c4.639-4.678 4.639-12.222 0-16.9ZM226.84 130.79l-96.05 96.06c-1.553 1.512-4.027 1.512-5.58 0l-96-96.06c-.741-.739-1.158-1.743-1.158-2.79 0-1.047 .417-2.051 1.158-2.79L125.26 29.15c1.553-1.512 4.027-1.512 5.58 0l96.05 96.06c.741 .739 1.158 1.743 1.158 2.79 0 1.047-.417 2.051-1.158 2.79Z"),
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
