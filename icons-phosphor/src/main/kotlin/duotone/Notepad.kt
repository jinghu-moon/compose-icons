package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorDuotoneIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 208.000 200.000 C 208.000 213.255 197.255 224.000 184.000 224.000 L 72.000 224.000 C 58.745 224.000 48.000 213.255 48.000 200.000 L 48.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 132.418 88.000 128.000 C 88.000 123.582 91.582 120.000 96.000 120.000 L 160.000 120.000 C 164.418 120.000 168.000 123.582 168.000 128.000 ZM 160.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 155.582 88.000 160.000 C 88.000 164.418 91.582 168.000 96.000 168.000 L 160.000 168.000 C 164.418 168.000 168.000 164.418 168.000 160.000 C 168.000 155.582 164.418 152.000 160.000 152.000 ZM 216.000 40.000 L 216.000 200.000 C 216.000 217.673 201.673 232.000 184.000 232.000 L 72.000 232.000 C 54.327 232.000 40.000 217.673 40.000 200.000 L 40.000 40.000 C 40.000 35.582 43.582 32.000 48.000 32.000 L 72.000 32.000 L 72.000 24.000 C 72.000 19.582 75.582 16.000 80.000 16.000 C 84.418 16.000 88.000 19.582 88.000 24.000 L 88.000 32.000 L 120.000 32.000 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 32.000 L 168.000 32.000 L 168.000 24.000 C 168.000 19.582 171.582 16.000 176.000 16.000 C 180.418 16.000 184.000 19.582 184.000 24.000 L 184.000 32.000 L 208.000 32.000 C 212.418 32.000 216.000 35.582 216.000 40.000 ZM 200.000 48.000 L 184.000 48.000 L 184.000 56.000 C 184.000 60.418 180.418 64.000 176.000 64.000 C 171.582 64.000 168.000 60.418 168.000 56.000 L 168.000 48.000 L 136.000 48.000 L 136.000 56.000 C 136.000 60.418 132.418 64.000 128.000 64.000 C 123.582 64.000 120.000 60.418 120.000 56.000 L 120.000 48.000 L 88.000 48.000 L 88.000 56.000 C 88.000 60.418 84.418 64.000 80.000 64.000 C 75.582 64.000 72.000 60.418 72.000 56.000 L 72.000 48.000 L 56.000 48.000 L 56.000 200.000 C 56.000 208.837 63.163 216.000 72.000 216.000 L 184.000 216.000 C 192.837 216.000 200.000 208.837 200.000 200.000 Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
