package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorFillIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.310 80.230 L 175.770 28.690 C 172.760 25.699 168.693 24.013 164.450 24.000 L 91.550 24.000 C 87.307 24.013 83.240 25.699 80.230 28.690 L 28.690 80.230 C 25.699 83.240 24.013 87.307 24.000 91.550 L 24.000 164.450 C 24.013 168.693 25.699 172.760 28.690 175.770 L 80.230 227.310 C 83.240 230.301 87.307 231.987 91.550 232.000 L 164.450 232.000 C 168.693 231.987 172.760 230.301 175.770 227.310 L 227.310 175.770 C 230.301 172.760 231.987 168.693 232.000 164.450 L 232.000 91.550 C 231.987 87.307 230.301 83.240 227.310 80.230 ZM 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 ZM 128.000 184.000 C 121.373 184.000 116.000 178.627 116.000 172.000 C 116.000 165.373 121.373 160.000 128.000 160.000 C 134.627 160.000 140.000 165.373 140.000 172.000 C 140.000 178.627 134.627 184.000 128.000 184.000 Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
