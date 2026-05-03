package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorDuotoneIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 80.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 64.000 L 147.310 64.000 L 181.660 29.660 C 184.786 26.534 184.786 21.466 181.660 18.340 C 178.534 15.214 173.466 15.214 170.340 18.340 L 128.000 60.690 L 85.660 18.340 C 82.534 15.214 77.466 15.214 74.340 18.340 C 71.214 21.466 71.214 26.534 74.340 29.660 L 108.690 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 80.000 C 232.000 71.163 224.837 64.000 216.000 64.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 80.000 L 216.000 80.000 L 216.000 200.000 Z"),
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
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
