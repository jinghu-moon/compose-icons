package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorDuotoneIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 176.000 C 232.000 193.673 217.673 208.000 200.000 208.000 C 182.327 208.000 168.000 193.673 168.000 176.000 C 168.000 158.327 182.327 144.000 200.000 144.000 C 217.673 144.000 232.000 158.327 232.000 176.000 ZM 56.000 144.000 C 38.327 144.000 24.000 158.327 24.000 176.000 C 24.000 193.673 38.327 208.000 56.000 208.000 C 73.673 208.000 88.000 193.673 88.000 176.000 C 88.000 158.327 73.673 144.000 56.000 144.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 164.000 80.000 C 179.464 80.000 192.000 67.464 192.000 52.000 C 192.000 36.536 179.464 24.000 164.000 24.000 C 148.536 24.000 136.000 36.536 136.000 52.000 C 136.000 67.464 148.536 80.000 164.000 80.000 ZM 164.000 40.000 C 170.627 40.000 176.000 45.373 176.000 52.000 C 176.000 58.627 170.627 64.000 164.000 64.000 C 157.373 64.000 152.000 58.627 152.000 52.000 C 152.000 45.373 157.373 40.000 164.000 40.000 ZM 200.000 136.000 C 177.909 136.000 160.000 153.909 160.000 176.000 C 160.000 198.091 177.909 216.000 200.000 216.000 C 222.091 216.000 240.000 198.091 240.000 176.000 C 240.000 153.909 222.091 136.000 200.000 136.000 ZM 200.000 200.000 C 186.745 200.000 176.000 189.255 176.000 176.000 C 176.000 162.745 186.745 152.000 200.000 152.000 C 213.255 152.000 224.000 162.745 224.000 176.000 C 224.000 189.255 213.255 200.000 200.000 200.000 ZM 56.000 136.000 C 33.909 136.000 16.000 153.909 16.000 176.000 C 16.000 198.091 33.909 216.000 56.000 216.000 C 78.091 216.000 96.000 198.091 96.000 176.000 C 96.000 153.909 78.091 136.000 56.000 136.000 ZM 56.000 200.000 C 42.745 200.000 32.000 189.255 32.000 176.000 C 32.000 162.745 42.745 152.000 56.000 152.000 C 69.255 152.000 80.000 162.745 80.000 176.000 C 80.000 189.255 69.255 200.000 56.000 200.000 ZM 192.000 120.000 L 152.000 120.000 C 149.878 120.002 147.842 119.160 146.340 117.660 L 120.000 91.310 L 99.310 112.000 L 133.660 146.340 C 135.160 147.842 136.002 149.878 136.000 152.000 L 136.000 200.000 C 136.000 204.418 132.418 208.000 128.000 208.000 C 123.582 208.000 120.000 204.418 120.000 200.000 L 120.000 155.310 L 82.340 117.660 C 80.838 116.159 79.994 114.123 79.994 112.000 C 79.994 109.877 80.838 107.841 82.340 106.340 L 114.340 74.340 C 115.841 72.838 117.877 71.994 120.000 71.994 C 122.123 71.994 124.159 72.838 125.660 74.340 L 155.310 104.000 L 192.000 104.000 C 196.418 104.000 200.000 107.582 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
