package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorLightIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.450 96.000 C 202.653 86.904 209.161 69.534 204.431 53.344 C 199.702 37.154 184.866 26.019 168.000 26.000 L 96.000 26.000 C 79.134 26.019 64.298 37.154 59.569 53.344 C 54.839 69.534 61.347 86.904 75.550 96.000 C 64.385 103.148 57.752 115.598 58.048 128.852 C 58.344 142.106 65.527 154.248 77.000 160.890 C 60.189 171.892 53.524 193.260 61.100 211.868 C 68.675 230.477 88.368 241.114 108.084 237.247 C 127.800 233.380 142.016 216.091 142.000 196.000 L 142.000 155.680 C 152.488 165.661 167.737 168.815 181.324 163.813 C 194.911 158.811 204.475 146.523 205.988 132.124 C 207.501 117.725 200.700 103.717 188.450 96.000 ZM 194.000 64.000 C 194.000 78.359 182.359 90.000 168.000 90.000 L 142.000 90.000 L 142.000 38.000 L 168.000 38.000 C 182.359 38.000 194.000 49.641 194.000 64.000 ZM 70.000 64.000 C 70.000 49.641 81.641 38.000 96.000 38.000 L 130.000 38.000 L 130.000 90.000 L 96.000 90.000 C 81.641 90.000 70.000 78.359 70.000 64.000 ZM 96.000 154.000 C 81.641 154.000 70.000 142.359 70.000 128.000 C 70.000 113.641 81.641 102.000 96.000 102.000 L 130.000 102.000 L 130.000 154.000 L 96.000 154.000 ZM 130.000 196.000 C 130.000 212.569 116.569 226.000 100.000 226.000 C 83.431 226.000 70.000 212.569 70.000 196.000 C 70.000 179.431 83.431 166.000 100.000 166.000 L 130.000 166.000 ZM 168.000 154.000 C 153.641 154.000 142.000 142.359 142.000 128.000 C 142.000 113.641 153.641 102.000 168.000 102.000 C 182.359 102.000 194.000 113.641 194.000 128.000 C 194.000 142.359 182.359 154.000 168.000 154.000 Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
