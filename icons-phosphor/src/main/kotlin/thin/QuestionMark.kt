package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorThinIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 96.000 C 188.000 123.510 163.230 146.090 132.000 147.890 L 132.000 160.000 C 132.000 162.209 130.209 164.000 128.000 164.000 C 125.791 164.000 124.000 162.209 124.000 160.000 L 124.000 144.000 C 124.000 141.791 125.791 140.000 128.000 140.000 C 156.670 140.000 180.000 120.260 180.000 96.000 C 180.000 71.740 156.670 52.000 128.000 52.000 C 99.330 52.000 76.000 71.740 76.000 96.000 C 76.000 98.209 74.209 100.000 72.000 100.000 C 69.791 100.000 68.000 98.209 68.000 96.000 C 68.000 67.330 94.920 44.000 128.000 44.000 C 161.080 44.000 188.000 67.330 188.000 96.000 ZM 128.000 196.000 C 121.373 196.000 116.000 201.373 116.000 208.000 C 116.000 214.627 121.373 220.000 128.000 220.000 C 134.627 220.000 140.000 214.627 140.000 208.000 C 140.000 201.373 134.627 196.000 128.000 196.000 Z"),
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
