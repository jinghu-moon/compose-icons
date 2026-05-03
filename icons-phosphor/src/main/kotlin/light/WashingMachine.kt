package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorLightIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 128.000 66.000 C 93.758 66.000 66.000 93.758 66.000 128.000 C 66.000 162.242 93.758 190.000 128.000 190.000 C 162.242 190.000 190.000 162.242 190.000 128.000 C 189.961 93.774 162.226 66.039 128.000 66.000 ZM 128.000 178.000 C 100.386 178.000 78.000 155.614 78.000 128.000 C 78.000 100.386 100.386 78.000 128.000 78.000 C 155.614 78.000 178.000 100.386 178.000 128.000 C 177.967 155.601 155.601 177.967 128.000 178.000 ZM 198.000 68.000 C 198.000 73.523 193.523 78.000 188.000 78.000 C 182.477 78.000 178.000 73.523 178.000 68.000 C 178.000 62.477 182.477 58.000 188.000 58.000 C 193.523 58.000 198.000 62.477 198.000 68.000 ZM 124.240 116.240 L 108.240 132.240 C 105.876 134.443 102.192 134.378 99.907 132.093 C 97.622 129.808 97.557 126.124 99.760 123.760 L 115.760 107.760 C 118.124 105.557 121.808 105.622 124.093 107.907 C 126.378 110.192 126.443 113.876 124.240 116.240 ZM 156.240 115.760 C 158.580 118.103 158.580 121.897 156.240 124.240 L 124.240 156.240 C 121.876 158.443 118.192 158.378 115.907 156.093 C 113.622 153.808 113.557 150.124 115.760 147.760 L 147.760 115.760 C 150.103 113.420 153.897 113.420 156.240 115.760 Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
