package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorLightIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 176.000 C 26.000 183.732 32.268 190.000 40.000 190.000 L 58.000 190.000 L 58.000 216.000 C 58.000 223.732 64.268 230.000 72.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 158.000 102.000 L 202.000 102.000 L 202.000 154.000 L 158.000 154.000 ZM 202.000 40.000 L 202.000 90.000 L 158.000 90.000 L 158.000 80.000 C 158.000 72.268 151.732 66.000 144.000 66.000 L 142.000 66.000 L 142.000 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 ZM 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 L 130.000 38.000 L 130.000 66.000 L 70.000 66.000 ZM 38.000 176.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 144.000 78.000 C 145.105 78.000 146.000 78.895 146.000 80.000 L 146.000 176.000 C 146.000 177.105 145.105 178.000 144.000 178.000 L 40.000 178.000 C 38.895 178.000 38.000 177.105 38.000 176.000 ZM 70.000 216.000 L 70.000 190.000 L 130.000 190.000 L 130.000 218.000 L 72.000 218.000 C 70.895 218.000 70.000 217.105 70.000 216.000 ZM 200.000 218.000 L 142.000 218.000 L 142.000 190.000 L 144.000 190.000 C 151.732 190.000 158.000 183.732 158.000 176.000 L 158.000 166.000 L 202.000 166.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 ZM 67.390 148.160 L 84.190 128.000 L 67.390 107.840 C 65.998 106.195 65.594 103.930 66.333 101.906 C 67.072 99.881 68.840 98.409 70.964 98.048 C 73.089 97.687 75.244 98.493 76.610 100.160 L 92.000 118.630 L 107.390 100.160 C 109.519 97.645 113.278 97.318 115.809 99.427 C 118.341 101.536 118.699 105.291 116.610 107.840 L 99.810 128.000 L 116.610 148.160 C 118.002 149.805 118.406 152.070 117.667 154.094 C 116.928 156.119 115.160 157.591 113.036 157.952 C 110.911 158.313 108.756 157.507 107.390 155.840 L 92.000 137.370 L 76.610 155.840 C 74.481 158.355 70.722 158.682 68.191 156.573 C 65.659 154.464 65.301 150.709 67.390 148.160 Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
