package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorDuotoneIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 176.000 L 216.000 200.000 C 216.000 204.418 212.418 208.000 208.000 208.000 L 48.000 208.000 C 43.582 208.000 40.000 204.418 40.000 200.000 L 40.000 176.000 C 40.000 171.582 43.582 168.000 48.000 168.000 L 208.000 168.000 C 212.418 168.000 216.000 171.582 216.000 176.000 ZM 208.000 96.000 L 48.000 96.000 C 43.582 96.000 40.000 99.582 40.000 104.000 L 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 L 208.000 136.000 C 212.418 136.000 216.000 132.418 216.000 128.000 L 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 160.000 L 48.000 160.000 C 39.163 160.000 32.000 167.163 32.000 176.000 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 L 224.000 176.000 C 224.000 167.163 216.837 160.000 208.000 160.000 ZM 208.000 200.000 L 48.000 200.000 L 48.000 176.000 L 208.000 176.000 L 208.000 200.000 ZM 208.000 88.000 L 48.000 88.000 C 39.163 88.000 32.000 95.163 32.000 104.000 L 32.000 128.000 C 32.000 136.837 39.163 144.000 48.000 144.000 L 208.000 144.000 C 216.837 144.000 224.000 136.837 224.000 128.000 L 224.000 104.000 C 224.000 95.163 216.837 88.000 208.000 88.000 ZM 208.000 128.000 L 48.000 128.000 L 48.000 104.000 L 208.000 104.000 L 208.000 128.000 ZM 96.000 40.000 C 96.000 35.582 99.582 32.000 104.000 32.000 L 120.000 32.000 L 120.000 16.000 C 120.000 11.582 123.582 8.000 128.000 8.000 C 132.418 8.000 136.000 11.582 136.000 16.000 L 136.000 32.000 L 152.000 32.000 C 156.418 32.000 160.000 35.582 160.000 40.000 C 160.000 44.418 156.418 48.000 152.000 48.000 L 136.000 48.000 L 136.000 64.000 C 136.000 68.418 132.418 72.000 128.000 72.000 C 123.582 72.000 120.000 68.418 120.000 64.000 L 120.000 48.000 L 104.000 48.000 C 99.582 48.000 96.000 44.418 96.000 40.000 Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
