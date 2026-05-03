package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorDuotoneIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 192.000 96.000 C 192.000 124.510 167.530 148.110 136.000 151.560 L 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 164.418 120.000 160.000 L 120.000 144.000 C 120.000 139.582 123.582 136.000 128.000 136.000 C 154.470 136.000 176.000 118.060 176.000 96.000 C 176.000 73.940 154.470 56.000 128.000 56.000 C 101.530 56.000 80.000 73.940 80.000 96.000 C 80.000 100.418 76.418 104.000 72.000 104.000 C 67.582 104.000 64.000 100.418 64.000 96.000 C 64.000 65.120 92.710 40.000 128.000 40.000 C 163.290 40.000 192.000 65.120 192.000 96.000 ZM 128.000 192.000 C 119.163 192.000 112.000 199.163 112.000 208.000 C 112.000 216.837 119.163 224.000 128.000 224.000 C 136.837 224.000 144.000 216.837 144.000 208.000 C 144.000 199.163 136.837 192.000 128.000 192.000 Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
