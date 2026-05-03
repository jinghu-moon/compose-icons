package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) return _cellSignalMedium!!
        _cellSignalMedium = phosphorLightIcon(
            name = "CellSignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 126.000 112.000 L 126.000 200.000 C 126.000 203.314 123.314 206.000 120.000 206.000 C 116.686 206.000 114.000 203.314 114.000 200.000 L 114.000 112.000 C 114.000 108.686 116.686 106.000 120.000 106.000 C 123.314 106.000 126.000 108.686 126.000 112.000 ZM 80.000 146.000 C 76.686 146.000 74.000 148.686 74.000 152.000 L 74.000 200.000 C 74.000 203.314 76.686 206.000 80.000 206.000 C 83.314 206.000 86.000 203.314 86.000 200.000 L 86.000 152.000 C 86.000 148.686 83.314 146.000 80.000 146.000 ZM 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 L 34.000 200.000 C 34.000 203.314 36.686 206.000 40.000 206.000 C 43.314 206.000 46.000 203.314 46.000 200.000 L 46.000 192.000 C 46.000 188.686 43.314 186.000 40.000 186.000 Z"),
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
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
