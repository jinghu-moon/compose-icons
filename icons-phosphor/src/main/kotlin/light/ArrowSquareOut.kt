package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorLightIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 104.000 C 222.000 107.314 219.314 110.000 216.000 110.000 C 212.686 110.000 210.000 107.314 210.000 104.000 L 210.000 54.490 L 140.250 124.240 C 137.886 126.443 134.202 126.378 131.917 124.093 C 129.632 121.808 129.567 118.124 131.770 115.760 L 201.510 46.000 L 152.000 46.000 C 148.686 46.000 146.000 43.314 146.000 40.000 C 146.000 36.686 148.686 34.000 152.000 34.000 L 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 ZM 184.000 130.000 C 180.686 130.000 178.000 132.686 178.000 136.000 L 178.000 208.000 C 178.000 209.105 177.105 210.000 176.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 80.000 C 46.000 78.895 46.895 78.000 48.000 78.000 L 120.000 78.000 C 123.314 78.000 126.000 75.314 126.000 72.000 C 126.000 68.686 123.314 66.000 120.000 66.000 L 48.000 66.000 C 40.268 66.000 34.000 72.268 34.000 80.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 176.000 222.000 C 183.732 222.000 190.000 215.732 190.000 208.000 L 190.000 136.000 C 190.000 132.686 187.314 130.000 184.000 130.000 Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
