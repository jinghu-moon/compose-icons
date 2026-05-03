package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorDuotoneIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 152.000 L 160.000 152.000 C 160.000 129.909 177.909 112.000 200.000 112.000 C 222.091 112.000 240.000 129.909 240.000 152.000 ZM 94.000 124.000 L 90.000 124.000 C 106.569 124.000 120.000 110.569 120.000 94.000 C 120.000 77.431 106.569 64.000 90.000 64.000 L 32.000 64.000 L 32.000 192.000 L 94.000 192.000 C 112.778 192.000 128.000 176.778 128.000 158.000 C 128.000 139.222 112.778 124.000 94.000 124.000 Z"),
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
                pathData = parseSvgPathData("M 160.000 80.000 C 160.000 75.582 163.582 72.000 168.000 72.000 L 232.000 72.000 C 236.418 72.000 240.000 75.582 240.000 80.000 C 240.000 84.418 236.418 88.000 232.000 88.000 L 168.000 88.000 C 163.582 88.000 160.000 84.418 160.000 80.000 ZM 136.000 158.000 C 136.000 181.196 117.196 200.000 94.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 L 24.000 64.000 C 24.000 59.582 27.582 56.000 32.000 56.000 L 90.000 56.000 C 105.660 56.017 119.706 65.638 125.379 80.235 C 131.051 94.831 127.189 111.413 115.650 122.000 C 128.280 129.598 136.004 143.261 136.000 158.000 ZM 40.000 116.000 L 90.000 116.000 C 102.150 116.000 112.000 106.150 112.000 94.000 C 112.000 81.850 102.150 72.000 90.000 72.000 L 40.000 72.000 ZM 120.000 158.000 C 120.000 143.641 108.359 132.000 94.000 132.000 L 40.000 132.000 L 40.000 184.000 L 94.000 184.000 C 108.359 184.000 120.000 172.359 120.000 158.000 ZM 248.000 152.000 C 248.000 156.418 244.418 160.000 240.000 160.000 L 169.000 160.000 C 172.073 171.913 181.704 181.009 193.773 183.397 C 205.841 185.786 218.211 181.044 225.590 171.200 C 228.244 167.665 233.260 166.951 236.795 169.605 C 240.330 172.259 241.044 177.275 238.390 180.810 C 224.259 199.638 198.560 205.439 177.711 194.508 C 156.862 183.577 147.018 159.139 154.466 136.808 C 161.915 114.477 184.459 100.844 207.695 104.618 C 230.931 108.392 248.002 128.459 248.000 152.000 ZM 231.000 144.000 C 227.375 129.841 214.616 119.937 200.000 119.937 C 185.384 119.937 172.625 129.841 169.000 144.000 Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
