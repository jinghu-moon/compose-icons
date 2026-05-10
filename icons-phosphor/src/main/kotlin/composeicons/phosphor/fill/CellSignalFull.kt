package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorFillIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40v160c0 8.837-7.163 16-16 16h-160c-6.472-.003-12.304-3.904-14.778-9.885-2.474-5.98-1.101-12.862 3.478-17.435L180.7 28.68c4.578-4.567 11.455-5.929 17.428-3.452 5.973 2.477 9.869 8.306 9.872 14.772Z"),
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
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
