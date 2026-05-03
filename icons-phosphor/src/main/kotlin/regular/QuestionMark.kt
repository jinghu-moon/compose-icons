package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorRegularIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 96.000 C 192.000 124.510 167.530 148.110 136.000 151.560 L 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 164.418 120.000 160.000 L 120.000 144.000 C 120.000 139.582 123.582 136.000 128.000 136.000 C 154.470 136.000 176.000 118.060 176.000 96.000 C 176.000 73.940 154.470 56.000 128.000 56.000 C 101.530 56.000 80.000 73.940 80.000 96.000 C 80.000 100.418 76.418 104.000 72.000 104.000 C 67.582 104.000 64.000 100.418 64.000 96.000 C 64.000 65.120 92.710 40.000 128.000 40.000 C 163.290 40.000 192.000 65.120 192.000 96.000 ZM 128.000 192.000 C 119.163 192.000 112.000 199.163 112.000 208.000 C 112.000 216.837 119.163 224.000 128.000 224.000 C 136.837 224.000 144.000 216.837 144.000 208.000 C 144.000 199.163 136.837 192.000 128.000 192.000 Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
