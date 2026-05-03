package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorDuotoneIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 72.000 104.000 L 72.000 64.000 C 72.000 59.582 75.582 56.000 80.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 L 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 L 80.000 112.000 C 75.582 112.000 72.000 108.418 72.000 104.000 ZM 216.000 144.000 L 80.000 144.000 C 75.582 144.000 72.000 147.582 72.000 152.000 L 72.000 192.000 C 72.000 196.418 75.582 200.000 80.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 L 224.000 152.000 C 224.000 147.582 220.418 144.000 216.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 136.000 L 80.000 136.000 C 71.163 136.000 64.000 143.163 64.000 152.000 L 64.000 192.000 C 64.000 200.837 71.163 208.000 80.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 152.000 C 232.000 143.163 224.837 136.000 216.000 136.000 ZM 216.000 192.000 L 80.000 192.000 L 80.000 152.000 L 216.000 152.000 L 216.000 192.000 ZM 48.000 40.000 L 48.000 216.000 C 48.000 220.418 44.418 224.000 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 L 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 C 44.418 32.000 48.000 35.582 48.000 40.000 ZM 80.000 120.000 L 176.000 120.000 C 184.837 120.000 192.000 112.837 192.000 104.000 L 192.000 64.000 C 192.000 55.163 184.837 48.000 176.000 48.000 L 80.000 48.000 C 71.163 48.000 64.000 55.163 64.000 64.000 L 64.000 104.000 C 64.000 112.837 71.163 120.000 80.000 120.000 ZM 80.000 64.000 L 176.000 64.000 L 176.000 104.000 L 80.000 104.000 Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
