package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorRegularIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 ZM 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 ZM 48.000 96.000 C 30.327 96.000 16.000 110.327 16.000 128.000 C 16.000 145.673 30.327 160.000 48.000 160.000 C 65.673 160.000 80.000 145.673 80.000 128.000 C 80.000 110.327 65.673 96.000 48.000 96.000 ZM 48.000 144.000 C 39.163 144.000 32.000 136.837 32.000 128.000 C 32.000 119.163 39.163 112.000 48.000 112.000 C 56.837 112.000 64.000 119.163 64.000 128.000 C 64.000 136.837 56.837 144.000 48.000 144.000 ZM 208.000 96.000 C 190.327 96.000 176.000 110.327 176.000 128.000 C 176.000 145.673 190.327 160.000 208.000 160.000 C 225.673 160.000 240.000 145.673 240.000 128.000 C 240.000 110.327 225.673 96.000 208.000 96.000 ZM 208.000 144.000 C 199.163 144.000 192.000 136.837 192.000 128.000 C 192.000 119.163 199.163 112.000 208.000 112.000 C 216.837 112.000 224.000 119.163 224.000 128.000 C 224.000 136.837 216.837 144.000 208.000 144.000 Z"),
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
