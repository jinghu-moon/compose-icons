package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorDuotoneIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 88.000 176.000 C 76.954 176.000 68.000 167.046 68.000 156.000 C 68.000 144.954 76.954 136.000 88.000 136.000 C 99.046 136.000 108.000 144.954 108.000 156.000 C 108.000 167.046 99.046 176.000 88.000 176.000 ZM 152.000 128.000 L 152.000 152.000 C 152.000 187.346 123.346 216.000 88.000 216.000 L 128.000 216.000 C 163.346 216.000 192.000 187.346 192.000 152.000 L 192.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 88.000 128.000 C 72.536 128.000 60.000 140.536 60.000 156.000 C 60.000 171.464 72.536 184.000 88.000 184.000 C 103.464 184.000 116.000 171.464 116.000 156.000 C 116.000 140.536 103.464 128.000 88.000 128.000 ZM 88.000 168.000 C 81.373 168.000 76.000 162.627 76.000 156.000 C 76.000 149.373 81.373 144.000 88.000 144.000 C 94.627 144.000 100.000 149.373 100.000 156.000 C 100.000 162.627 94.627 168.000 88.000 168.000 ZM 248.000 120.000 L 223.700 120.000 C 219.456 64.240 171.877 21.818 115.997 23.970 C 60.117 26.122 15.942 72.078 16.000 128.000 L 16.000 152.000 C 16.044 191.746 48.254 223.956 88.000 224.000 L 128.000 224.000 C 167.746 223.956 199.956 191.746 200.000 152.000 L 200.000 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 184.000 152.000 C 183.969 180.770 162.166 204.846 133.540 207.720 C 150.287 194.068 160.004 173.606 160.000 152.000 L 160.000 136.000 L 184.000 136.000 ZM 152.000 120.000 C 147.582 120.000 144.000 123.582 144.000 128.000 L 144.000 152.000 C 144.000 182.928 118.928 208.000 88.000 208.000 C 57.072 208.000 32.000 182.928 32.000 152.000 L 32.000 128.000 C 31.974 80.937 68.982 42.184 115.996 40.043 C 163.010 37.901 203.387 73.130 207.640 120.000 Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
