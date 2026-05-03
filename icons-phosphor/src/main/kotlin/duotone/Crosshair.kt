package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorDuotoneIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 232.000 120.000 L 223.660 120.000 C 219.696 73.327 182.673 36.304 136.000 32.340 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 32.340 C 73.327 36.304 36.304 73.327 32.340 120.000 L 24.000 120.000 C 19.582 120.000 16.000 123.582 16.000 128.000 C 16.000 132.418 19.582 136.000 24.000 136.000 L 32.340 136.000 C 36.304 182.673 73.327 219.696 120.000 223.660 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 223.660 C 182.673 219.696 219.696 182.673 223.660 136.000 L 232.000 136.000 C 236.418 136.000 240.000 132.418 240.000 128.000 C 240.000 123.582 236.418 120.000 232.000 120.000 ZM 136.000 207.600 L 136.000 200.000 C 136.000 195.582 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 195.582 120.000 200.000 L 120.000 207.600 C 82.170 203.740 52.260 173.830 48.400 136.000 L 56.000 136.000 C 60.418 136.000 64.000 132.418 64.000 128.000 C 64.000 123.582 60.418 120.000 56.000 120.000 L 48.400 120.000 C 52.260 82.170 82.170 52.260 120.000 48.400 L 120.000 56.000 C 120.000 60.418 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 60.418 136.000 56.000 L 136.000 48.400 C 173.830 52.260 203.740 82.170 207.600 120.000 L 200.000 120.000 C 195.582 120.000 192.000 123.582 192.000 128.000 C 192.000 132.418 195.582 136.000 200.000 136.000 L 207.600 136.000 C 203.740 173.830 173.830 203.740 136.000 207.600 ZM 128.000 88.000 C 105.909 88.000 88.000 105.909 88.000 128.000 C 88.000 150.091 105.909 168.000 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
