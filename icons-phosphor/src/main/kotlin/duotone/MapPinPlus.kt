package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorDuotoneIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 104.000 C 208.000 176.000 128.000 232.000 128.000 232.000 C 128.000 232.000 48.000 176.000 48.000 104.000 C 48.000 59.817 83.817 24.000 128.000 24.000 C 172.183 24.000 208.000 59.817 208.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 16.000 C 79.422 16.055 40.055 55.422 40.000 104.000 C 40.000 135.400 54.510 168.680 82.000 200.250 C 94.352 214.516 108.255 227.361 123.450 238.550 C 126.206 240.480 129.874 240.480 132.630 238.550 C 147.797 227.357 161.673 214.511 174.000 200.250 C 201.450 168.680 216.000 135.400 216.000 104.000 C 215.945 55.422 176.578 16.055 128.000 16.000 ZM 128.000 222.000 C 111.470 209.000 56.000 161.250 56.000 104.000 C 56.000 64.235 88.235 32.000 128.000 32.000 C 167.764 32.000 200.000 64.235 200.000 104.000 C 200.000 161.230 144.530 209.000 128.000 222.000 ZM 168.000 104.000 C 168.000 108.418 164.418 112.000 160.000 112.000 L 136.000 112.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 L 120.000 112.000 L 96.000 112.000 C 91.582 112.000 88.000 108.418 88.000 104.000 C 88.000 99.582 91.582 96.000 96.000 96.000 L 120.000 96.000 L 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 L 136.000 96.000 L 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
