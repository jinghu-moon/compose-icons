package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorFillIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 48.000 L 168.000 48.000 L 168.000 32.000 C 168.000 23.163 160.837 16.000 152.000 16.000 L 104.000 16.000 C 95.163 16.000 88.000 23.163 88.000 32.000 L 88.000 48.000 L 72.000 48.000 C 54.327 48.000 40.000 62.327 40.000 80.000 L 40.000 176.000 C 40.014 190.591 49.878 203.332 64.000 207.000 L 64.000 224.000 C 64.000 232.837 71.163 240.000 80.000 240.000 L 176.000 240.000 C 184.837 240.000 192.000 232.837 192.000 224.000 L 192.000 207.000 C 206.122 203.332 215.986 190.591 216.000 176.000 L 216.000 80.000 C 216.000 62.327 201.673 48.000 184.000 48.000 ZM 156.000 100.000 C 162.627 100.000 168.000 105.373 168.000 112.000 C 168.000 118.627 162.627 124.000 156.000 124.000 C 149.373 124.000 144.000 118.627 144.000 112.000 C 144.000 105.373 149.373 100.000 156.000 100.000 ZM 160.270 158.770 C 140.518 171.083 115.482 171.083 95.730 158.770 C 91.991 156.412 90.872 151.469 93.230 147.730 C 95.588 143.991 100.531 142.872 104.270 145.230 C 118.804 154.250 137.196 154.250 151.730 145.230 C 155.469 142.872 160.412 143.991 162.770 147.730 C 165.128 151.469 164.009 156.412 160.270 158.770 ZM 104.000 32.000 L 152.000 32.000 L 152.000 48.000 L 104.000 48.000 ZM 100.000 100.000 C 106.627 100.000 112.000 105.373 112.000 112.000 C 112.000 118.627 106.627 124.000 100.000 124.000 C 93.373 124.000 88.000 118.627 88.000 112.000 C 88.000 105.373 93.373 100.000 100.000 100.000 ZM 176.000 224.000 L 80.000 224.000 L 80.000 208.000 L 176.000 208.000 Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
