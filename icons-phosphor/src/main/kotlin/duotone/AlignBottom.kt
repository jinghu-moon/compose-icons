package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorDuotoneIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 80.000 L 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 L 152.000 184.000 C 147.582 184.000 144.000 180.418 144.000 176.000 L 144.000 80.000 C 144.000 75.582 147.582 72.000 152.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 ZM 104.000 32.000 L 64.000 32.000 C 59.582 32.000 56.000 35.582 56.000 40.000 L 56.000 176.000 C 56.000 180.418 59.582 184.000 64.000 184.000 L 104.000 184.000 C 108.418 184.000 112.000 180.418 112.000 176.000 L 112.000 40.000 C 112.000 35.582 108.418 32.000 104.000 32.000 Z"),
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
                pathData = parseSvgPathData("M 64.000 192.000 L 104.000 192.000 C 112.837 192.000 120.000 184.837 120.000 176.000 L 120.000 40.000 C 120.000 31.163 112.837 24.000 104.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 176.000 C 48.000 184.837 55.163 192.000 64.000 192.000 ZM 64.000 40.000 L 104.000 40.000 L 104.000 176.000 L 64.000 176.000 ZM 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 ZM 152.000 192.000 L 192.000 192.000 C 200.837 192.000 208.000 184.837 208.000 176.000 L 208.000 80.000 C 208.000 71.163 200.837 64.000 192.000 64.000 L 152.000 64.000 C 143.163 64.000 136.000 71.163 136.000 80.000 L 136.000 176.000 C 136.000 184.837 143.163 192.000 152.000 192.000 ZM 152.000 80.000 L 192.000 80.000 L 192.000 176.000 L 152.000 176.000 Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
