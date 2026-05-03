package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorRegularIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 ZM 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 ZM 128.000 80.000 C 145.673 80.000 160.000 65.673 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 C 96.000 65.673 110.327 80.000 128.000 80.000 ZM 128.000 32.000 C 136.837 32.000 144.000 39.163 144.000 48.000 C 144.000 56.837 136.837 64.000 128.000 64.000 C 119.163 64.000 112.000 56.837 112.000 48.000 C 112.000 39.163 119.163 32.000 128.000 32.000 ZM 128.000 176.000 C 110.327 176.000 96.000 190.327 96.000 208.000 C 96.000 225.673 110.327 240.000 128.000 240.000 C 145.673 240.000 160.000 225.673 160.000 208.000 C 160.000 190.327 145.673 176.000 128.000 176.000 ZM 128.000 224.000 C 119.163 224.000 112.000 216.837 112.000 208.000 C 112.000 199.163 119.163 192.000 128.000 192.000 C 136.837 192.000 144.000 199.163 144.000 208.000 C 144.000 216.837 136.837 224.000 128.000 224.000 Z"),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
