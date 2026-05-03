package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorDuotoneIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 96.000 L 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 96.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 88.000 C 16.000 96.837 23.163 104.000 32.000 104.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 104.000 C 232.837 104.000 240.000 96.837 240.000 88.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 208.000 192.000 L 48.000 192.000 L 48.000 104.000 L 208.000 104.000 ZM 224.000 88.000 L 32.000 88.000 L 32.000 64.000 L 224.000 64.000 L 224.000 88.000 ZM 96.000 136.000 C 96.000 131.582 99.582 128.000 104.000 128.000 L 152.000 128.000 C 156.418 128.000 160.000 131.582 160.000 136.000 C 160.000 140.418 156.418 144.000 152.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
