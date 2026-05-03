package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorDuotoneIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 96.000 L 224.000 224.000 L 184.420 192.000 L 88.000 192.000 C 83.582 192.000 80.000 188.418 80.000 184.000 L 80.000 144.000 L 168.000 144.000 C 172.418 144.000 176.000 140.418 176.000 136.000 L 176.000 88.000 L 216.000 88.000 C 220.418 88.000 224.000 91.582 224.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 80.000 L 184.000 80.000 L 184.000 48.000 C 184.000 39.163 176.837 32.000 168.000 32.000 L 40.000 32.000 C 31.163 32.000 24.000 39.163 24.000 48.000 L 24.000 176.000 C 24.010 179.071 25.777 181.866 28.547 183.192 C 31.318 184.517 34.602 184.140 37.000 182.220 L 72.000 154.000 L 72.000 184.000 C 72.000 192.837 79.163 200.000 88.000 200.000 L 181.590 200.000 L 219.000 230.220 C 220.416 231.365 222.179 231.993 224.000 232.000 C 228.418 232.000 232.000 228.418 232.000 224.000 L 232.000 96.000 C 232.000 87.163 224.837 80.000 216.000 80.000 ZM 66.550 137.780 L 40.000 159.250 L 40.000 48.000 L 168.000 48.000 L 168.000 136.000 L 71.580 136.000 C 69.749 136.000 67.974 136.629 66.550 137.780 ZM 216.000 207.250 L 189.450 185.780 C 188.034 184.635 186.271 184.007 184.450 184.000 L 88.000 184.000 L 88.000 152.000 L 168.000 152.000 C 176.837 152.000 184.000 144.837 184.000 136.000 L 184.000 96.000 L 216.000 96.000 Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
