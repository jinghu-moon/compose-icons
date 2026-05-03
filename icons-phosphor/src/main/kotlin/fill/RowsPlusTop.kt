package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorFillIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 176.000 L 224.000 200.000 C 224.000 208.837 216.837 216.000 208.000 216.000 L 48.000 216.000 C 39.163 216.000 32.000 208.837 32.000 200.000 L 32.000 176.000 C 32.000 167.163 39.163 160.000 48.000 160.000 L 208.000 160.000 C 216.837 160.000 224.000 167.163 224.000 176.000 ZM 208.000 88.000 L 48.000 88.000 C 39.163 88.000 32.000 95.163 32.000 104.000 L 32.000 128.000 C 32.000 136.837 39.163 144.000 48.000 144.000 L 208.000 144.000 C 216.837 144.000 224.000 136.837 224.000 128.000 L 224.000 104.000 C 224.000 95.163 216.837 88.000 208.000 88.000 ZM 104.000 48.000 L 120.000 48.000 L 120.000 64.000 C 120.000 68.418 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 68.418 136.000 64.000 L 136.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 44.418 160.000 40.000 C 160.000 35.582 156.418 32.000 152.000 32.000 L 136.000 32.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 32.000 L 104.000 32.000 C 99.582 32.000 96.000 35.582 96.000 40.000 C 96.000 44.418 99.582 48.000 104.000 48.000 Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
