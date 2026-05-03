package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorDuotoneIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 136.000 L 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 L 24.000 136.000 C 24.000 131.582 27.582 128.000 32.000 128.000 L 224.000 128.000 C 228.418 128.000 232.000 131.582 232.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 240.000 136.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 136.000 C 16.000 127.163 23.163 120.000 32.000 120.000 L 72.000 120.000 C 76.418 120.000 80.000 123.582 80.000 128.000 C 80.000 132.418 76.418 136.000 72.000 136.000 L 32.000 136.000 L 32.000 200.000 L 224.000 200.000 L 224.000 136.000 L 184.000 136.000 C 179.582 136.000 176.000 132.418 176.000 128.000 C 176.000 123.582 179.582 120.000 184.000 120.000 L 224.000 120.000 C 232.837 120.000 240.000 127.163 240.000 136.000 ZM 122.340 133.660 C 123.841 135.162 125.877 136.006 128.000 136.006 C 130.123 136.006 132.159 135.162 133.660 133.660 L 181.660 85.660 C 184.786 82.534 184.786 77.466 181.660 74.340 C 178.534 71.214 173.466 71.214 170.340 74.340 L 136.000 108.690 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 108.690 L 85.660 74.340 C 82.534 71.214 77.466 71.214 74.340 74.340 C 71.214 77.466 71.214 82.534 74.340 85.660 ZM 200.000 168.000 C 200.000 161.373 194.627 156.000 188.000 156.000 C 181.373 156.000 176.000 161.373 176.000 168.000 C 176.000 174.627 181.373 180.000 188.000 180.000 C 194.627 180.000 200.000 174.627 200.000 168.000 Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
