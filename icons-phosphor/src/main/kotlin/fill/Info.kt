package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorFillIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 124.000 72.000 C 130.627 72.000 136.000 77.373 136.000 84.000 C 136.000 90.627 130.627 96.000 124.000 96.000 C 117.373 96.000 112.000 90.627 112.000 84.000 C 112.000 77.373 117.373 72.000 124.000 72.000 ZM 136.000 184.000 C 127.163 184.000 120.000 176.837 120.000 168.000 L 120.000 128.000 C 115.582 128.000 112.000 124.418 112.000 120.000 C 112.000 115.582 115.582 112.000 120.000 112.000 C 128.837 112.000 136.000 119.163 136.000 128.000 L 136.000 168.000 C 140.418 168.000 144.000 171.582 144.000 176.000 C 144.000 180.418 140.418 184.000 136.000 184.000 Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
