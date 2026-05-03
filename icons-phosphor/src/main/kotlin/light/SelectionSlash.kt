package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorLightIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 106.000 40.000 C 106.000 36.686 108.686 34.000 112.000 34.000 L 144.000 34.000 C 147.314 34.000 150.000 36.686 150.000 40.000 C 150.000 43.314 147.314 46.000 144.000 46.000 L 112.000 46.000 C 108.686 46.000 106.000 43.314 106.000 40.000 ZM 144.000 210.000 L 112.000 210.000 C 108.686 210.000 106.000 212.686 106.000 216.000 C 106.000 219.314 108.686 222.000 112.000 222.000 L 144.000 222.000 C 147.314 222.000 150.000 219.314 150.000 216.000 C 150.000 212.686 147.314 210.000 144.000 210.000 ZM 208.000 34.000 L 184.000 34.000 C 180.686 34.000 178.000 36.686 178.000 40.000 C 178.000 43.314 180.686 46.000 184.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 72.000 C 210.000 75.314 212.686 78.000 216.000 78.000 C 219.314 78.000 222.000 75.314 222.000 72.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 216.000 106.000 C 212.686 106.000 210.000 108.686 210.000 112.000 L 210.000 144.000 C 210.000 147.314 212.686 150.000 216.000 150.000 C 219.314 150.000 222.000 147.314 222.000 144.000 L 222.000 112.000 C 222.000 108.686 219.314 106.000 216.000 106.000 ZM 40.000 150.000 C 43.314 150.000 46.000 147.314 46.000 144.000 L 46.000 112.000 C 46.000 108.686 43.314 106.000 40.000 106.000 C 36.686 106.000 34.000 108.686 34.000 112.000 L 34.000 144.000 C 34.000 147.314 36.686 150.000 40.000 150.000 ZM 72.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 184.000 C 46.000 180.686 43.314 178.000 40.000 178.000 C 36.686 178.000 34.000 180.686 34.000 184.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 72.000 222.000 C 75.314 222.000 78.000 219.314 78.000 216.000 C 78.000 212.686 75.314 210.000 72.000 210.000 ZM 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
