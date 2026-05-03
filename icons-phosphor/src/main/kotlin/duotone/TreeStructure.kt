package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorDuotoneIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 64.000 112.000 L 64.000 144.000 C 64.000 148.418 60.418 152.000 56.000 152.000 L 24.000 152.000 C 19.582 152.000 16.000 148.418 16.000 144.000 L 16.000 112.000 C 16.000 107.582 19.582 104.000 24.000 104.000 L 56.000 104.000 C 60.418 104.000 64.000 107.582 64.000 112.000 ZM 208.000 40.000 L 160.000 40.000 C 155.582 40.000 152.000 43.582 152.000 48.000 L 152.000 96.000 C 152.000 100.418 155.582 104.000 160.000 104.000 L 208.000 104.000 C 212.418 104.000 216.000 100.418 216.000 96.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 208.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 155.582 152.000 160.000 L 152.000 208.000 C 152.000 212.418 155.582 216.000 160.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 160.000 C 216.000 155.582 212.418 152.000 208.000 152.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 160.000 112.000 L 208.000 112.000 C 216.837 112.000 224.000 104.837 224.000 96.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 L 160.000 32.000 C 151.163 32.000 144.000 39.163 144.000 48.000 L 144.000 64.000 L 128.000 64.000 C 114.745 64.000 104.000 74.745 104.000 88.000 L 104.000 120.000 L 72.000 120.000 L 72.000 112.000 C 72.000 103.163 64.837 96.000 56.000 96.000 L 24.000 96.000 C 15.163 96.000 8.000 103.163 8.000 112.000 L 8.000 144.000 C 8.000 152.837 15.163 160.000 24.000 160.000 L 56.000 160.000 C 64.837 160.000 72.000 152.837 72.000 144.000 L 72.000 136.000 L 104.000 136.000 L 104.000 168.000 C 104.000 181.255 114.745 192.000 128.000 192.000 L 144.000 192.000 L 144.000 208.000 C 144.000 216.837 151.163 224.000 160.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 160.000 C 224.000 151.163 216.837 144.000 208.000 144.000 L 160.000 144.000 C 151.163 144.000 144.000 151.163 144.000 160.000 L 144.000 176.000 L 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 L 144.000 80.000 L 144.000 96.000 C 144.000 104.837 151.163 112.000 160.000 112.000 ZM 56.000 144.000 L 24.000 144.000 L 24.000 112.000 L 56.000 112.000 L 56.000 144.000 ZM 160.000 160.000 L 208.000 160.000 L 208.000 208.000 L 160.000 208.000 ZM 160.000 48.000 L 208.000 48.000 L 208.000 96.000 L 160.000 96.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
