package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorDuotoneIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 176.000 C 216.000 180.418 212.418 184.000 208.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 L 72.000 48.000 C 72.000 43.582 75.582 40.000 80.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 136.000 L 128.000 200.000 C 128.000 204.418 124.418 208.000 120.000 208.000 C 115.582 208.000 112.000 204.418 112.000 200.000 L 112.000 155.320 L 45.660 221.660 C 42.534 224.786 37.466 224.786 34.340 221.660 C 31.214 218.534 31.214 213.466 34.340 210.340 L 100.680 144.000 L 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 C 48.000 131.582 51.582 128.000 56.000 128.000 L 120.000 128.000 C 124.418 128.000 128.000 131.582 128.000 136.000 ZM 208.000 32.000 L 80.000 32.000 C 71.163 32.000 64.000 39.163 64.000 48.000 L 64.000 96.000 C 64.000 100.418 67.582 104.000 72.000 104.000 C 76.418 104.000 80.000 100.418 80.000 96.000 L 80.000 48.000 L 208.000 48.000 L 208.000 176.000 L 160.000 176.000 C 155.582 176.000 152.000 179.582 152.000 184.000 C 152.000 188.418 155.582 192.000 160.000 192.000 L 208.000 192.000 C 216.837 192.000 224.000 184.837 224.000 176.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
