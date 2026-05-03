package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorLightIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.000 96.000 C 190.000 124.000 165.380 147.110 134.000 149.750 L 134.000 160.000 C 134.000 163.314 131.314 166.000 128.000 166.000 C 124.686 166.000 122.000 163.314 122.000 160.000 L 122.000 144.000 C 122.000 140.686 124.686 138.000 128.000 138.000 C 155.570 138.000 178.000 119.160 178.000 96.000 C 178.000 72.840 155.570 54.000 128.000 54.000 C 100.430 54.000 78.000 72.840 78.000 96.000 C 78.000 99.314 75.314 102.000 72.000 102.000 C 68.686 102.000 66.000 99.314 66.000 96.000 C 66.000 66.220 93.810 42.000 128.000 42.000 C 162.190 42.000 190.000 66.220 190.000 96.000 ZM 128.000 194.000 C 120.268 194.000 114.000 200.268 114.000 208.000 C 114.000 215.732 120.268 222.000 128.000 222.000 C 135.732 222.000 142.000 215.732 142.000 208.000 C 142.000 200.268 135.732 194.000 128.000 194.000 Z"),
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
