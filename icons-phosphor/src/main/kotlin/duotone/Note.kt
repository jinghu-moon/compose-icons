package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorDuotoneIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 160.000 L 160.000 216.000 L 160.000 160.000 Z"),
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
                pathData = parseSvgPathData("M 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 L 160.000 88.000 C 164.418 88.000 168.000 91.582 168.000 96.000 C 168.000 100.418 164.418 104.000 160.000 104.000 L 96.000 104.000 C 91.582 104.000 88.000 100.418 88.000 96.000 ZM 96.000 136.000 L 160.000 136.000 C 164.418 136.000 168.000 132.418 168.000 128.000 C 168.000 123.582 164.418 120.000 160.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 123.582 88.000 128.000 C 88.000 132.418 91.582 136.000 96.000 136.000 ZM 128.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 155.582 88.000 160.000 C 88.000 164.418 91.582 168.000 96.000 168.000 L 128.000 168.000 C 132.418 168.000 136.000 164.418 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 ZM 224.000 48.000 L 224.000 156.690 C 224.014 160.936 222.324 165.010 219.310 168.000 L 168.000 219.310 C 165.010 222.324 160.936 224.014 156.690 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 48.000 208.000 L 152.000 208.000 L 152.000 160.000 C 152.000 155.582 155.582 152.000 160.000 152.000 L 208.000 152.000 L 208.000 48.000 L 48.000 48.000 ZM 168.000 168.000 L 168.000 196.700 L 196.690 168.000 Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
