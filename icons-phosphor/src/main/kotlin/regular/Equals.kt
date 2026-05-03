package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Equals: ImageVector
    get() {
        if (_equals != null) return _equals!!
        _equals = phosphorRegularIcon(
            name = "Equals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 160.000 C 224.000 164.418 220.418 168.000 216.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 C 32.000 155.582 35.582 152.000 40.000 152.000 L 216.000 152.000 C 220.418 152.000 224.000 155.582 224.000 160.000 ZM 40.000 104.000 L 216.000 104.000 C 220.418 104.000 224.000 100.418 224.000 96.000 C 224.000 91.582 220.418 88.000 216.000 88.000 L 40.000 88.000 C 35.582 88.000 32.000 91.582 32.000 96.000 C 32.000 100.418 35.582 104.000 40.000 104.000 Z"),
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
        return _equals!!
    }

private var _equals: ImageVector? = null
