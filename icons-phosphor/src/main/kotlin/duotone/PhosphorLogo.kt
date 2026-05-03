package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorDuotoneIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 104.000 C 216.000 139.346 187.346 168.000 152.000 168.000 L 144.000 168.000 L 144.000 40.000 L 152.000 40.000 C 187.346 40.000 216.000 68.654 216.000 104.000 ZM 72.000 168.000 L 144.000 168.000 L 72.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 152.000 32.000 L 72.000 32.000 C 67.582 32.000 64.000 35.582 64.000 40.000 L 64.000 168.000 C 64.050 212.162 99.838 247.950 144.000 248.000 C 148.418 248.000 152.000 244.418 152.000 240.000 L 152.000 176.000 C 191.764 176.000 224.000 143.764 224.000 104.000 C 224.000 64.235 191.764 32.000 152.000 32.000 ZM 80.000 70.540 L 130.320 160.000 L 80.000 160.000 ZM 136.000 231.540 C 107.010 227.831 84.192 204.994 80.510 176.000 L 136.000 176.000 ZM 136.000 137.540 L 85.680 48.000 L 136.000 48.000 ZM 152.000 160.000 L 152.000 48.000 C 182.928 48.000 208.000 73.072 208.000 104.000 C 208.000 134.928 182.928 160.000 152.000 160.000 Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
