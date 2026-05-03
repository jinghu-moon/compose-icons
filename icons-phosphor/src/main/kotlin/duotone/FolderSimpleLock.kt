package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorDuotoneIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 168.000 L 224.000 208.000 L 152.000 208.000 L 152.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 232.000 88.000 L 232.000 104.000 C 232.000 108.418 228.418 112.000 224.000 112.000 C 219.582 112.000 216.000 108.418 216.000 104.000 L 216.000 88.000 L 130.670 88.000 C 127.209 87.991 123.844 86.869 121.070 84.800 L 93.330 64.000 L 40.000 64.000 L 40.000 200.000 L 112.000 200.000 C 116.418 200.000 120.000 203.582 120.000 208.000 C 120.000 212.418 116.418 216.000 112.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 93.330 48.000 C 96.791 48.009 100.156 49.131 102.930 51.200 L 130.670 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 ZM 232.000 168.000 L 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 152.000 216.000 C 147.582 216.000 144.000 212.418 144.000 208.000 L 144.000 168.000 C 144.000 163.582 147.582 160.000 152.000 160.000 L 160.000 160.000 L 160.000 156.000 C 160.000 140.536 172.536 128.000 188.000 128.000 C 203.464 128.000 216.000 140.536 216.000 156.000 L 216.000 160.000 L 224.000 160.000 C 228.418 160.000 232.000 163.582 232.000 168.000 ZM 176.000 160.000 L 200.000 160.000 L 200.000 156.000 C 200.000 149.373 194.627 144.000 188.000 144.000 C 181.373 144.000 176.000 149.373 176.000 156.000 ZM 216.000 176.000 L 160.000 176.000 L 160.000 200.000 L 216.000 200.000 Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
