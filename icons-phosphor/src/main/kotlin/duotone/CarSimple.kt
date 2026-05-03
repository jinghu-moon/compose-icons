package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CarSimple: ImageVector
    get() {
        if (_carSimple != null) return _carSimple!!
        _carSimple = phosphorDuotoneIcon(
            name = "CarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 112.000 L 32.000 112.000 L 61.890 44.750 C 63.174 41.861 66.039 40.000 69.200 40.000 L 186.800 40.000 C 189.961 40.000 192.826 41.861 194.110 44.750 Z"),
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
                pathData = parseSvgPathData("M 240.000 104.000 L 229.200 104.000 L 201.420 41.500 C 198.852 35.723 193.122 32.000 186.800 32.000 L 69.200 32.000 C 62.878 32.000 57.148 35.723 54.580 41.500 L 26.800 104.000 L 16.000 104.000 C 11.582 104.000 8.000 107.582 8.000 112.000 C 8.000 116.418 11.582 120.000 16.000 120.000 L 24.000 120.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 64.000 216.000 C 72.837 216.000 80.000 208.837 80.000 200.000 L 80.000 184.000 L 176.000 184.000 L 176.000 200.000 C 176.000 208.837 183.163 216.000 192.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 116.418 248.000 112.000 C 248.000 107.582 244.418 104.000 240.000 104.000 ZM 69.200 48.000 L 186.800 48.000 L 211.690 104.000 L 44.310 104.000 ZM 216.000 200.000 L 192.000 200.000 L 192.000 176.000 C 192.000 171.582 188.418 168.000 184.000 168.000 L 72.000 168.000 C 67.582 168.000 64.000 171.582 64.000 176.000 L 64.000 200.000 L 40.000 200.000 L 40.000 120.000 L 216.000 120.000 Z"),
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
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
