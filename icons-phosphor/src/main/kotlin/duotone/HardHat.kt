package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorDuotoneIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 104.000 51.310 L 104.000 160.000 L 40.000 160.000 L 40.000 136.000 C 39.988 96.632 66.125 62.047 104.000 51.310 ZM 152.000 51.310 L 152.000 160.000 L 216.000 160.000 L 216.000 136.000 C 216.012 96.632 189.875 62.047 152.000 51.310 Z"),
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
                pathData = parseSvgPathData("M 224.000 152.000 L 224.000 136.000 C 223.890 95.352 198.287 59.143 160.000 45.490 L 160.000 40.000 C 160.000 31.163 152.837 24.000 144.000 24.000 L 112.000 24.000 C 103.163 24.000 96.000 31.163 96.000 40.000 L 96.000 45.490 C 57.713 59.143 32.110 95.352 32.000 136.000 L 32.000 152.000 C 23.163 152.000 16.000 159.163 16.000 168.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 168.000 C 240.000 159.163 232.837 152.000 224.000 152.000 ZM 208.000 136.000 L 208.000 152.000 L 160.000 152.000 L 160.000 62.670 C 189.094 75.469 207.910 104.215 208.000 136.000 ZM 144.000 40.000 L 144.000 152.000 L 112.000 152.000 L 112.000 40.000 ZM 48.000 136.000 C 48.090 104.215 66.906 75.469 96.000 62.670 L 96.000 152.000 L 48.000 152.000 ZM 224.000 192.000 L 32.000 192.000 L 32.000 168.000 L 224.000 168.000 L 224.000 192.000 Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
