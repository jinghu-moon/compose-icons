package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorDuotoneIcon(
            name = "Upload",
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
                pathData = parseSvgPathData("M 240.000 136.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 136.000 C 16.000 127.163 23.163 120.000 32.000 120.000 L 80.000 120.000 C 84.418 120.000 88.000 123.582 88.000 128.000 C 88.000 132.418 84.418 136.000 80.000 136.000 L 32.000 136.000 L 32.000 200.000 L 224.000 200.000 L 224.000 136.000 L 176.000 136.000 C 171.582 136.000 168.000 132.418 168.000 128.000 C 168.000 123.582 171.582 120.000 176.000 120.000 L 224.000 120.000 C 232.837 120.000 240.000 127.163 240.000 136.000 ZM 85.660 77.660 L 120.000 43.310 L 120.000 128.000 C 120.000 132.418 123.582 136.000 128.000 136.000 C 132.418 136.000 136.000 132.418 136.000 128.000 L 136.000 43.310 L 170.340 77.660 C 173.466 80.786 178.534 80.786 181.660 77.660 C 184.786 74.534 184.786 69.466 181.660 66.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 74.340 66.340 C 71.214 69.466 71.214 74.534 74.340 77.660 C 77.466 80.786 82.534 80.786 85.660 77.660 ZM 200.000 168.000 C 200.000 161.373 194.627 156.000 188.000 156.000 C 181.373 156.000 176.000 161.373 176.000 168.000 C 176.000 174.627 181.373 180.000 188.000 180.000 C 194.627 180.000 200.000 174.627 200.000 168.000 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
