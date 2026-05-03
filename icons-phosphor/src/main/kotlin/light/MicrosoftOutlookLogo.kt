package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorLightIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 118.000 128.000 C 118.000 111.431 104.569 98.000 88.000 98.000 C 71.431 98.000 58.000 111.431 58.000 128.000 C 58.000 144.569 71.431 158.000 88.000 158.000 C 104.569 158.000 118.000 144.569 118.000 128.000 ZM 70.000 128.000 C 70.000 118.059 78.059 110.000 88.000 110.000 C 97.941 110.000 106.000 118.059 106.000 128.000 C 106.000 137.941 97.941 146.000 88.000 146.000 C 78.059 146.000 70.000 137.941 70.000 128.000 ZM 224.000 106.000 L 206.000 106.000 L 206.000 40.000 C 206.000 36.686 203.314 34.000 200.000 34.000 L 104.000 34.000 C 100.686 34.000 98.000 36.686 98.000 40.000 L 98.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 176.000 C 26.000 183.732 32.268 190.000 40.000 190.000 L 74.000 190.000 L 74.000 208.000 C 74.000 215.732 80.268 222.000 88.000 222.000 L 216.000 222.000 C 223.732 222.000 230.000 215.732 230.000 208.000 L 230.000 112.000 C 230.000 108.686 227.314 106.000 224.000 106.000 ZM 162.250 164.000 L 218.000 123.730 L 218.000 204.270 ZM 110.000 46.000 L 194.000 46.000 L 194.000 126.270 L 152.000 156.600 L 150.000 155.150 L 150.000 80.000 C 150.000 72.268 143.732 66.000 136.000 66.000 L 110.000 66.000 ZM 38.000 176.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 136.000 78.000 C 137.105 78.000 138.000 78.895 138.000 80.000 L 138.000 176.000 C 138.000 177.105 137.105 178.000 136.000 178.000 L 40.000 178.000 C 38.895 178.000 38.000 177.105 38.000 176.000 ZM 86.000 208.000 L 86.000 190.000 L 136.000 190.000 C 143.732 190.000 150.000 183.732 150.000 176.000 L 150.000 170.000 L 205.440 210.000 L 88.000 210.000 C 86.895 210.000 86.000 209.105 86.000 208.000 Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
