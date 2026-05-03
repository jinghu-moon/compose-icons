package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThreeCircle: ImageVector
    get() {
        if (_dotsThreeCircle != null) return _dotsThreeCircle!!
        _dotsThreeCircle = phosphorBoldIcon(
            name = "DotsThreeCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 112.000 128.000 C 112.000 136.837 104.837 144.000 96.000 144.000 C 87.163 144.000 80.000 136.837 80.000 128.000 C 80.000 119.163 87.163 112.000 96.000 112.000 C 104.837 112.000 112.000 119.163 112.000 128.000 ZM 176.000 128.000 C 176.000 136.837 168.837 144.000 160.000 144.000 C 151.163 144.000 144.000 136.837 144.000 128.000 C 144.000 119.163 151.163 112.000 160.000 112.000 C 168.837 112.000 176.000 119.163 176.000 128.000 Z"),
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
        return _dotsThreeCircle!!
    }

private var _dotsThreeCircle: ImageVector? = null
