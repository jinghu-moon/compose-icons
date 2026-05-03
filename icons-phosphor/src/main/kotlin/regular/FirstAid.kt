package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorRegularIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 88.000 L 168.000 88.000 L 168.000 40.000 C 168.000 31.163 160.837 24.000 152.000 24.000 L 104.000 24.000 C 95.163 24.000 88.000 31.163 88.000 40.000 L 88.000 88.000 L 40.000 88.000 C 31.163 88.000 24.000 95.163 24.000 104.000 L 24.000 152.000 C 24.000 160.837 31.163 168.000 40.000 168.000 L 88.000 168.000 L 88.000 216.000 C 88.000 224.837 95.163 232.000 104.000 232.000 L 152.000 232.000 C 160.837 232.000 168.000 224.837 168.000 216.000 L 168.000 168.000 L 216.000 168.000 C 224.837 168.000 232.000 160.837 232.000 152.000 L 232.000 104.000 C 232.000 95.163 224.837 88.000 216.000 88.000 ZM 216.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 155.582 152.000 160.000 L 152.000 216.000 L 104.000 216.000 L 104.000 160.000 C 104.000 155.582 100.418 152.000 96.000 152.000 L 40.000 152.000 L 40.000 104.000 L 96.000 104.000 C 100.418 104.000 104.000 100.418 104.000 96.000 L 104.000 40.000 L 152.000 40.000 L 152.000 96.000 C 152.000 100.418 155.582 104.000 160.000 104.000 L 216.000 104.000 Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
