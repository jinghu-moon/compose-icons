package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorDuotoneIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 208.000 208.000 L 152.000 208.000 L 152.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 200.000 L 216.000 200.000 L 216.000 40.000 C 216.000 35.582 212.418 32.000 208.000 32.000 L 152.000 32.000 C 147.582 32.000 144.000 35.582 144.000 40.000 L 144.000 80.000 L 96.000 80.000 C 91.582 80.000 88.000 83.582 88.000 88.000 L 88.000 128.000 L 48.000 128.000 C 43.582 128.000 40.000 131.582 40.000 136.000 L 40.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 203.582 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 C 232.000 203.582 228.418 200.000 224.000 200.000 ZM 160.000 48.000 L 200.000 48.000 L 200.000 200.000 L 160.000 200.000 ZM 104.000 96.000 L 144.000 96.000 L 144.000 200.000 L 104.000 200.000 ZM 56.000 144.000 L 88.000 144.000 L 88.000 200.000 L 56.000 200.000 Z"),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
