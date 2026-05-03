package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorFillIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 ZM 48.000 100.000 C 32.536 100.000 20.000 112.536 20.000 128.000 C 20.000 143.464 32.536 156.000 48.000 156.000 C 63.464 156.000 76.000 143.464 76.000 128.000 C 76.000 112.536 63.464 100.000 48.000 100.000 ZM 208.000 100.000 C 192.536 100.000 180.000 112.536 180.000 128.000 C 180.000 143.464 192.536 156.000 208.000 156.000 C 223.464 156.000 236.000 143.464 236.000 128.000 C 236.000 112.536 223.464 100.000 208.000 100.000 Z"),
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
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
