package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorBoldIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 ZM 60.000 112.000 C 51.163 112.000 44.000 119.163 44.000 128.000 C 44.000 136.837 51.163 144.000 60.000 144.000 C 68.837 144.000 76.000 136.837 76.000 128.000 C 76.000 119.163 68.837 112.000 60.000 112.000 ZM 196.000 112.000 C 187.163 112.000 180.000 119.163 180.000 128.000 C 180.000 136.837 187.163 144.000 196.000 144.000 C 204.837 144.000 212.000 136.837 212.000 128.000 C 212.000 119.163 204.837 112.000 196.000 112.000 Z"),
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
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
