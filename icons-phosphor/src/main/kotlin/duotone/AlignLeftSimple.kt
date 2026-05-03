package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorDuotoneIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 96.000 L 232.000 160.000 C 232.000 164.418 228.418 168.000 224.000 168.000 L 72.000 168.000 C 67.582 168.000 64.000 164.418 64.000 160.000 L 64.000 96.000 C 64.000 91.582 67.582 88.000 72.000 88.000 L 224.000 88.000 C 228.418 88.000 232.000 91.582 232.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 40.000 56.000 L 40.000 200.000 C 40.000 204.418 36.418 208.000 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 L 24.000 56.000 C 24.000 51.582 27.582 48.000 32.000 48.000 C 36.418 48.000 40.000 51.582 40.000 56.000 ZM 240.000 96.000 L 240.000 160.000 C 240.000 168.837 232.837 176.000 224.000 176.000 L 72.000 176.000 C 63.163 176.000 56.000 168.837 56.000 160.000 L 56.000 96.000 C 56.000 87.163 63.163 80.000 72.000 80.000 L 224.000 80.000 C 232.837 80.000 240.000 87.163 240.000 96.000 ZM 224.000 160.000 L 224.000 96.000 L 72.000 96.000 L 72.000 160.000 L 224.000 160.000 Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
